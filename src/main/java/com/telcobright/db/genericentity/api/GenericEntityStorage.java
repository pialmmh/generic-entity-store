package com.telcobright.db.genericentity.api;

import com.telcobright.db.genericentity.core.impl.PooledGenericEntityStorageImpl;
import com.telcobright.db.genericentity.core.pool.ObjectPool;
import java.util.List;

/**
 * Main facade for generic entity storage operations.
 * This is the primary interface for client code interaction.
 * 
 * @param <T> Entity type enum implementing IEntityTypeSet
 */
public class GenericEntityStorage<T extends IEntityTypeSet> {
    
    private final PooledGenericEntityStorageImpl<T> impl;
    
    GenericEntityStorage(PooledGenericEntityStorageImpl<T> impl) {
        this.impl = impl;
    }
    
    /**
     * Store an entity
     * @param entity The entity object to store
     * @param entityType The type of the entity
     */
    public void put(Object entity, T entityType) {
        impl.put(entity, entityType);
    }
    
    /**
     * Retrieve an entity by ID
     * @param id Entity ID
     * @param entityType Entity type
     * @return The entity or null if not found
     */
    public <E> E get(Long id, T entityType) {
        return impl.get(id, entityType);
    }
    
    /**
     * Remove an entity
     * @param id Entity ID
     * @param entityType Entity type
     */
    public void remove(Long id, T entityType) {
        impl.remove(id, entityType);
    }
    
    /**
     * Check if entity exists
     * @param id Entity ID
     * @param entityType Entity type
     * @return true if exists
     */
    public boolean exists(Long id, T entityType) {
        return impl.exists(id, entityType);
    }
    
    /**
     * Store multiple entities
     * @param entities List of entities
     * @param entityType Entity type
     */
    public void putAll(List<?> entities, T entityType) {
        impl.putAll(entities, entityType);
    }
    
    /**
     * Get all entities of a type
     * @param entityType Entity type
     * @return List of entities
     */
    public <E> List<E> getAll(T entityType) {
        return impl.getAll(entityType);
    }
    
    /**
     * Remove all entities of a type
     * @param entityType Entity type
     */
    public void removeAll(T entityType) {
        impl.removeAll(entityType);
    }
    
    /**
     * Get storage size
     * @return Total number of entities
     */
    public int size() {
        return impl.size();
    }
    
    /**
     * Get size for specific type
     * @param entityType Entity type
     * @return Number of entities of this type
     */
    public int size(T entityType) {
        return impl.size(entityType);
    }
    
    /**
     * Clear all storage
     */
    public void clear() {
        impl.clear();
    }
    
    /**
     * Create a new storage builder with mandatory maxRecords for optimal performance.
     * This is the only way to create a GenericEntityStorage instance.
     * @return Storage builder with pooling optimizations
     */
    public static <T extends IEntityTypeSet> StorageBuilder<T> builder() {
        return StorageBuilder.create();
    }
    
    /**
     * Get pool statistics for monitoring
     * @return Pool statistics
     */
    public ObjectPool.PoolStatistics getPoolStatistics() {
        return impl.getPoolStatistics();
    }
    
    /**
     * Get capacity information for a specific entity type
     * @param entityType Entity type
     * @return Capacity information
     */
    public PooledGenericEntityStorageImpl.CapacityInfo getCapacityInfo(T entityType) {
        return impl.getCapacityInfo(entityType);
    }
}