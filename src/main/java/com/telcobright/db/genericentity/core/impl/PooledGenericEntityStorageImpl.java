package com.telcobright.db.genericentity.core.impl;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.EntityConverter;
import com.telcobright.db.genericentity.core.EntityRegistry;
import com.telcobright.db.genericentity.core.GenericEntity;
import com.telcobright.db.genericentity.core.ProxyIdManager;
import com.telcobright.db.genericentity.core.pool.GenericEntityPool;
import com.telcobright.db.genericentity.core.pool.ObjectPool;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Pooled implementation with proxy ID management to handle ID collisions.
 * Multiple entity types can have the same original ID without conflicts.
 */
public class PooledGenericEntityStorageImpl<T extends IEntityTypeSet> {
    
    // Primary storage - uses proxy IDs as keys
    private final Map<Long, GenericEntity> storage = new ConcurrentHashMap<>();
    
    // Proxy ID manager handles original ID -> proxy ID mapping (with pooling)
    private final ProxyIdManager<T> proxyIdManager;
    
    // Entity registry for converters
    private final EntityRegistry<T> entityRegistry;
    
    // Object pool for GenericEntity instances
    private final GenericEntityPool entityPool;
    
    // Per-type counters to enforce max limits
    private final Map<T, AtomicInteger> typeCounts = new ConcurrentHashMap<>();
    
    // Track borrowed entities for proper cleanup (using proxy IDs)
    private final Map<Long, GenericEntity> borrowedEntities = new ConcurrentHashMap<>();
    
    public PooledGenericEntityStorageImpl(EntityRegistry<T> entityRegistry, int totalPoolSize) {
        this.entityRegistry = entityRegistry;
        
        // Initialize pools with proper sizing based on totalPoolSize
        // Add 20% buffer for temporary objects during operations
        int adjustedPoolSize = (int)(totalPoolSize * 1.2);
        this.entityPool = new GenericEntityPool(adjustedPoolSize);
        
        // Initialize ProxyIdManager with pooling for high performance
        this.proxyIdManager = new ProxyIdManager<>(totalPoolSize);
        
        // Initialize counters for each registered type
        for (Map.Entry<T, Integer> entry : entityRegistry.getAllMaxCounts().entrySet()) {
            typeCounts.put(entry.getKey(), new AtomicInteger(0));
        }
    }
    
    /**
     * Store an entity using proxy ID mapping
     */
    public void put(Object entity, T entityType) {
        EntityConverter converter = entityRegistry.getConverter(entityType);
        if (converter == null) {
            throw new IllegalArgumentException("Entity type not registered: " + entityType);
        }
        
        // Extract original ID from entity
        Long originalId = converter.extractId(entity);
        if (originalId == null) {
            throw new IllegalArgumentException("Entity must have a non-null ID");
        }
        
        // Get or create proxy ID for this entityType + originalId combination
        Long proxyId = proxyIdManager.getOrCreateProxyId(entityType, originalId);
        
        // Check if this is an update or new insertion
        GenericEntity existing = storage.get(proxyId);
        
        GenericEntity generic;
        boolean isNew = (existing == null);
        
        if (isNew) {
            // Check max count for this type
            int maxCount = entityRegistry.getMaxCount(entityType);
            int currentCount = typeCounts.get(entityType).get();
            
            if (currentCount >= maxCount) {
                throw new IllegalStateException(
                    String.format("Maximum capacity reached for type %s: %d/%d",
                        entityType, currentCount, maxCount));
            }
            
            // Borrow new entity from pool
            generic = entityPool.borrow();
            if (generic == null) {
                throw new IllegalStateException("Entity pool exhausted. Total pool size exceeded.");
            }
            
            // Track borrowed entity with proxy ID
            borrowedEntities.put(proxyId, generic);
            
            // Increment type counter
            typeCounts.get(entityType).incrementAndGet();
        } else {
            // Reuse existing pooled entity for update
            generic = existing;
        }
        
        // Convert and populate the pooled entity
        converter.toGenericPooled(entity, generic);
        generic.setEntityTypeId(entityType.getTypeId());
        
        // Store with proxy ID, but keep original ID in GenericEntity
        generic.setId(originalId);
        storage.put(proxyId, generic);
    }
    
    /**
     * Retrieve an entity using original ID
     */
    @SuppressWarnings("unchecked")
    public <E> E get(Long originalId, T entityType) {
        // Get proxy ID for this combination
        Long proxyId = proxyIdManager.getProxyId(entityType, originalId);
        if (proxyId == null) {
            return null; // No mapping exists
        }
        
        GenericEntity generic = storage.get(proxyId);
        if (generic == null) {
            return null;
        }
        
        EntityConverter converter = entityRegistry.getConverter(entityType);
        return (E) converter.fromGeneric(generic);
    }
    
    /**
     * Remove an entity and return it to the pool
     */
    public void remove(Long originalId, T entityType) {
        // Get and remove proxy ID mapping
        Long proxyId = proxyIdManager.removeMapping(entityType, originalId);
        if (proxyId == null) {
            return; // Entity doesn't exist
        }
        
        GenericEntity generic = storage.remove(proxyId);
        if (generic != null) {
            // Return entity to pool
            entityPool.release(generic);
            borrowedEntities.remove(proxyId);
            
            // Decrement type counter
            typeCounts.get(entityType).decrementAndGet();
        }
    }
    
    /**
     * Check if an entity exists
     */
    public boolean exists(Long originalId, T entityType) {
        Long proxyId = proxyIdManager.getProxyId(entityType, originalId);
        return proxyId != null && storage.containsKey(proxyId);
    }
    
    /**
     * Store multiple entities
     */
    public void putAll(List<?> entities, T entityType) {
        for (Object entity : entities) {
            put(entity, entityType);
        }
    }
    
    /**
     * Get all entities of a specific type
     */
    @SuppressWarnings("unchecked")
    public <E> List<E> getAll(T entityType) {
        EntityConverter converter = entityRegistry.getConverter(entityType);
        List<E> result = new ArrayList<>();
        
        // Iterate through all proxy IDs and filter by entity type
        for (Map.Entry<Long, GenericEntity> entry : storage.entrySet()) {
            Long proxyId = entry.getKey();
            ProxyIdManager.CompositeKey<T> key = proxyIdManager.getOriginalKey(proxyId);
            
            if (key != null && key.getEntityType().equals(entityType)) {
                GenericEntity generic = entry.getValue();
                result.add((E) converter.fromGeneric(generic));
            }
        }
        
        return result;
    }
    
    /**
     * Remove all entities of a specific type
     */
    public void removeAll(T entityType) {
        // Collect all proxy IDs for this entity type
        List<Long> proxyIdsToRemove = new ArrayList<>();
        
        for (Map.Entry<Long, GenericEntity> entry : storage.entrySet()) {
            Long proxyId = entry.getKey();
            ProxyIdManager.CompositeKey<T> key = proxyIdManager.getOriginalKey(proxyId);
            
            if (key != null && key.getEntityType().equals(entityType)) {
                proxyIdsToRemove.add(proxyId);
            }
        }
        
        // Remove entities and clean up
        for (Long proxyId : proxyIdsToRemove) {
            GenericEntity generic = storage.remove(proxyId);
            if (generic != null) {
                entityPool.release(generic);
                borrowedEntities.remove(proxyId);
            }
        }
        
        // Remove all proxy mappings for this type
        proxyIdManager.removeAllForType(entityType);
        
        // Reset counter for this type
        typeCounts.get(entityType).set(0);
    }
    
    /**
     * Get total size of storage
     */
    public int size() {
        return storage.size();
    }
    
    /**
     * Get size for a specific entity type
     */
    public int size(T entityType) {
        return proxyIdManager.sizeForType(entityType);
    }
    
    /**
     * Clear all storage
     */
    public void clear() {
        // Return all entities to pool
        for (GenericEntity entity : borrowedEntities.values()) {
            entityPool.release(entity);
        }
        
        storage.clear();
        borrowedEntities.clear();
        proxyIdManager.clear();
        
        // Reset all counters
        for (AtomicInteger counter : typeCounts.values()) {
            counter.set(0);
        }
    }
    
    /**
     * Get pool statistics for monitoring
     */
    public ObjectPool.PoolStatistics getPoolStatistics() {
        return entityPool.getStatistics();
    }
    
    /**
     * Get capacity information for a specific entity type
     */
    public CapacityInfo getCapacityInfo(T entityType) {
        int maxCount = entityRegistry.getMaxCount(entityType);
        int currentCount = typeCounts.get(entityType).get();
        
        return new CapacityInfo(entityType, currentCount, maxCount);
    }
    
    /**
     * Capacity information for an entity type
     */
    public static class CapacityInfo {
        private final Object entityType;
        private final int currentCount;
        private final int maxCount;
        
        public CapacityInfo(Object entityType, int currentCount, int maxCount) {
            this.entityType = entityType;
            this.currentCount = currentCount;
            this.maxCount = maxCount;
        }
        
        public int getCurrentCount() { return currentCount; }
        public int getMaxCount() { return maxCount; }
        public int getAvailable() { return maxCount - currentCount; }
        public double getUtilizationPercent() { 
            return maxCount > 0 ? (currentCount * 100.0 / maxCount) : 0;
        }
        
        @Override
        public String toString() {
            return String.format("CapacityInfo{type=%s, current=%d, max=%d, available=%d, utilization=%.1f%%}",
                entityType, currentCount, maxCount, getAvailable(), getUtilizationPercent());
        }
    }
}