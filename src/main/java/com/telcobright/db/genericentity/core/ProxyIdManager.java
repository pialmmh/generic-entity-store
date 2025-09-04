package com.telcobright.db.genericentity.core;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.pool.CompositeKeyPool;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Manages proxy ID generation and mapping to avoid ID collisions
 * between different entity types in the same storage.
 * 
 * Each entity type + original ID combination gets a unique proxy ID
 * that's used as the actual storage key.
 * 
 * Uses object pooling for CompositeKey instances to minimize GC.
 */
public class ProxyIdManager<T extends IEntityTypeSet> {
    
    // Proxy ID generator - ensures uniqueness across all entities
    private final AtomicLong proxyIdGenerator = new AtomicLong(1);
    
    // Composite key (entityType + originalId) -> proxyId mapping
    private final Map<CompositeKey<T>, Long> originalToProxy = new ConcurrentHashMap<>();
    
    // Reverse mapping: proxyId -> composite key
    private final Map<Long, CompositeKey<T>> proxyToOriginal = new ConcurrentHashMap<>();
    
    // Optional key pool for high-performance scenarios
    private final CompositeKeyPool<T> keyPool;
    
    /**
     * Create ProxyIdManager without pooling (backward compatible)
     */
    public ProxyIdManager() {
        this.keyPool = null;
    }
    
    /**
     * Create ProxyIdManager with key pooling for minimal GC
     * @param maxRecords Maximum expected records for pool sizing
     */
    public ProxyIdManager(int maxRecords) {
        this.keyPool = new CompositeKeyPool<>(maxRecords);
    }
    
    /**
     * Composite key combining entity type and original ID.
     * Designed for object pooling - mutable with init/clear methods.
     */
    public static class CompositeKey<T extends IEntityTypeSet> {
        private T entityType;
        private Long originalId;
        
        // Default constructor for pooling
        public CompositeKey() {
        }
        
        // Constructor for non-pooled usage (backward compatibility)
        public CompositeKey(T entityType, Long originalId) {
            this.entityType = entityType;
            this.originalId = originalId;
        }
        
        /**
         * Initialize a pooled key with values
         */
        public void init(T entityType, Long originalId) {
            this.entityType = entityType;
            this.originalId = originalId;
        }
        
        /**
         * Clear values before returning to pool
         */
        public void clear() {
            this.entityType = null;
            this.originalId = null;
        }
        
        public T getEntityType() {
            return entityType;
        }
        
        public Long getOriginalId() {
            return originalId;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompositeKey<?> that = (CompositeKey<?>) o;
            return entityType.equals(that.entityType) && originalId.equals(that.originalId);
        }
        
        @Override
        public int hashCode() {
            return 31 * entityType.hashCode() + originalId.hashCode();
        }
        
        @Override
        public String toString() {
            return "CompositeKey{type=" + entityType + ", id=" + originalId + "}";
        }
    }
    
    /**
     * Get or create a proxy ID for the given entity type and original ID.
     * 
     * @param entityType The entity type
     * @param originalId The original entity ID
     * @return The proxy ID to use for storage
     */
    public Long getOrCreateProxyId(T entityType, Long originalId) {
        // Use pooled key if available, otherwise create new
        CompositeKey<T> key = (keyPool != null) 
            ? keyPool.borrow(entityType, originalId)
            : new CompositeKey<>(entityType, originalId);
        
        return originalToProxy.computeIfAbsent(key, k -> {
            Long proxyId = proxyIdGenerator.getAndIncrement();
            proxyToOriginal.put(proxyId, k);
            return proxyId;
        });
    }
    
    /**
     * Get proxy ID if it exists (for lookups).
     * 
     * @param entityType The entity type
     * @param originalId The original entity ID
     * @return The proxy ID or null if not mapped
     */
    public Long getProxyId(T entityType, Long originalId) {
        // For lookups, we can use a temporary key
        CompositeKey<T> key = (keyPool != null)
            ? keyPool.borrow(entityType, originalId)
            : new CompositeKey<>(entityType, originalId);
        
        try {
            return originalToProxy.get(key);
        } finally {
            // Return temporary key to pool if using pooling
            if (keyPool != null) {
                keyPool.release(key);
            }
        }
    }
    
    /**
     * Get the original composite key for a proxy ID.
     * 
     * @param proxyId The proxy ID
     * @return The composite key or null if not found
     */
    public CompositeKey<T> getOriginalKey(Long proxyId) {
        return proxyToOriginal.get(proxyId);
    }
    
    /**
     * Remove mapping for the given entity type and original ID.
     * 
     * @param entityType The entity type
     * @param originalId The original entity ID
     * @return The proxy ID that was removed, or null if not found
     */
    public Long removeMapping(T entityType, Long originalId) {
        CompositeKey<T> key = (keyPool != null)
            ? keyPool.borrow(entityType, originalId)
            : new CompositeKey<>(entityType, originalId);
        
        try {
            Long proxyId = originalToProxy.remove(key);
            if (proxyId != null) {
                CompositeKey<T> removedKey = proxyToOriginal.remove(proxyId);
                // Release the removed key back to pool
                if (keyPool != null && removedKey != null) {
                    keyPool.release(removedKey);
                }
            }
            return proxyId;
        } finally {
            // Release the lookup key
            if (keyPool != null) {
                keyPool.release(key);
            }
        }
    }
    
    /**
     * Remove all mappings for a specific entity type.
     * 
     * @param entityType The entity type
     */
    public void removeAllForType(T entityType) {
        // Find all keys for this entity type
        originalToProxy.entrySet().removeIf(entry -> {
            if (entry.getKey().getEntityType().equals(entityType)) {
                proxyToOriginal.remove(entry.getValue());
                return true;
            }
            return false;
        });
    }
    
    /**
     * Clear all mappings.
     */
    public void clear() {
        originalToProxy.clear();
        proxyToOriginal.clear();
        proxyIdGenerator.set(1);
    }
    
    /**
     * Get the number of mapped entities.
     * 
     * @return The total number of mappings
     */
    public int size() {
        return originalToProxy.size();
    }
    
    /**
     * Get the number of mapped entities for a specific type.
     * 
     * @param entityType The entity type
     * @return The number of mappings for this type
     */
    public int sizeForType(T entityType) {
        return (int) originalToProxy.keySet().stream()
            .filter(key -> key.getEntityType().equals(entityType))
            .count();
    }
}