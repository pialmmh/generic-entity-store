package com.telcobright.db.genericentity.core.impl;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.EntityConverter;
import com.telcobright.db.genericentity.core.EntityRegistry;
import com.telcobright.db.genericentity.core.GenericEntity;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Core implementation of generic entity storage.
 * Uses HashMap for storage and pre-generated converters for transformations.
 */
public class GenericEntityStorageImpl<T extends IEntityTypeSet> {
    
    private final Map<Long, GenericEntity> storage = new ConcurrentHashMap<>();
    private final Map<Long, T> typeRegistry = new ConcurrentHashMap<>();
    private final EntityRegistry<T> entityRegistry;
    
    public GenericEntityStorageImpl(EntityRegistry<T> entityRegistry) {
        this.entityRegistry = entityRegistry;
    }
    
    public GenericEntityStorageImpl(EntityRegistry<T> entityRegistry, int totalPoolSize) {
        this.entityRegistry = entityRegistry;
        // Constructor for compatibility - pool size ignored in non-pooled version
    }
    
    public void put(Object entity, T entityType) {
        EntityConverter converter = entityRegistry.getConverter(entityType);
        if (converter == null) {
            throw new IllegalArgumentException("Entity type not registered: " + entityType);
        }
        
        GenericEntity generic = converter.toGeneric(entity);
        storage.put(generic.getId(), generic);
        typeRegistry.put(generic.getId(), entityType);
    }
    
    @SuppressWarnings("unchecked")
    public <E> E get(Long id, T entityType) {
        GenericEntity generic = storage.get(id);
        if (generic == null) {
            return null;
        }
        
        T storedType = typeRegistry.get(id);
        if (!entityType.equals(storedType)) {
            return null;
        }
        
        EntityConverter converter = entityRegistry.getConverter(entityType);
        return (E) converter.fromGeneric(generic);
    }
    
    public void remove(Long id, T entityType) {
        T storedType = typeRegistry.get(id);
        if (entityType.equals(storedType)) {
            storage.remove(id);
            typeRegistry.remove(id);
        }
    }
    
    public boolean exists(Long id, T entityType) {
        return entityType.equals(typeRegistry.get(id));
    }
    
    public void putAll(List<?> entities, T entityType) {
        for (Object entity : entities) {
            put(entity, entityType);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <E> List<E> getAll(T entityType) {
        EntityConverter converter = entityRegistry.getConverter(entityType);
        return typeRegistry.entrySet().stream()
            .filter(entry -> entry.getValue().equals(entityType))
            .map(entry -> storage.get(entry.getKey()))
            .filter(Objects::nonNull)
            .map(generic -> (E) converter.fromGeneric(generic))
            .collect(Collectors.toList());
    }
    
    public void removeAll(T entityType) {
        List<Long> idsToRemove = typeRegistry.entrySet().stream()
            .filter(entry -> entry.getValue().equals(entityType))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        
        for (Long id : idsToRemove) {
            storage.remove(id);
            typeRegistry.remove(id);
        }
    }
    
    public int size() {
        return storage.size();
    }
    
    public int size(T entityType) {
        return (int) typeRegistry.values().stream()
            .filter(type -> type.equals(entityType))
            .count();
    }
    
    public void clear() {
        storage.clear();
        typeRegistry.clear();
    }
}