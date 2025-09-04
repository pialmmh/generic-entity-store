package com.telcobright.db.genericentity.api;

import com.telcobright.db.genericentity.core.impl.PooledGenericEntityStorageImpl;
import com.telcobright.db.genericentity.core.EntityRegistry;
import java.util.HashMap;
import java.util.Map;

/**
 * Storage builder with mandatory maxRecords parameter for optimal pooling.
 * Properly sizes internal buffers and pools based on expected capacity.
 * This is the only way to create GenericEntityStorage instances.
 */
public class StorageBuilder<T extends IEntityTypeSet> {
    
    private Class<T> entityTypeClass;
    private final Map<T, Class<?>> typeRegistrations = new HashMap<>();
    private final Map<T, Integer> typeMaxCounts = new HashMap<>();
    private Integer totalMaxRecords = null; // Made mandatory
    private boolean autoSizePerType = false;
    
    /**
     * Set the entity type enum class (mandatory)
     */
    public StorageBuilder<T> withEntityTypeSet(Class<T> entityTypeClass) {
        this.entityTypeClass = entityTypeClass;
        return this;
    }
    
    /**
     * Set the total maximum number of records across all types (mandatory)
     * This is used to properly size internal pools and buffers.
     * 
     * @param maxRecords Total maximum records expected
     */
    public StorageBuilder<T> withMaxRecords(int maxRecords) {
        if (maxRecords <= 0) {
            throw new IllegalArgumentException("Max records must be positive: " + maxRecords);
        }
        this.totalMaxRecords = maxRecords;
        return this;
    }
    
    /**
     * Enable automatic sizing of per-type limits based on total maxRecords
     * Divides maxRecords evenly among registered types
     */
    public StorageBuilder<T> withAutoSizing() {
        this.autoSizePerType = true;
        return this;
    }
    
    /**
     * Register an entity type with automatic max count
     * (only works if withAutoSizing() is enabled)
     */
    public StorageBuilder<T> registerType(T entityType, Class<?> entityClass) {
        if (!autoSizePerType) {
            throw new IllegalStateException(
                "Must call withAutoSizing() to use registerType without maxCount, " +
                "or provide explicit maxCount with registerType(type, class, maxCount)"
            );
        }
        typeRegistrations.put(entityType, entityClass);
        // Max count will be calculated in build()
        return this;
    }
    
    /**
     * Register an entity type with specific max count
     * @param entityType the entity type enum value
     * @param entityClass the entity class
     * @param maxCount maximum number of entities allowed for this type
     */
    public StorageBuilder<T> registerType(T entityType, Class<?> entityClass, int maxCount) {
        if (maxCount <= 0) {
            throw new IllegalArgumentException("Max count must be positive: " + maxCount);
        }
        typeRegistrations.put(entityType, entityClass);
        typeMaxCounts.put(entityType, maxCount);
        return this;
    }
    
    /**
     * Build the storage instance with optimized pooling based on maxRecords
     */
    public GenericEntityStorage<T> build() {
        // Validate mandatory parameters
        if (entityTypeClass == null) {
            throw new IllegalStateException("Entity type class not set. Call withEntityTypeSet()");
        }
        
        if (totalMaxRecords == null) {
            throw new IllegalStateException(
                "Max records not set. Call withMaxRecords() to specify total capacity"
            );
        }
        
        if (typeRegistrations.isEmpty()) {
            throw new IllegalStateException("No entity types registered");
        }
        
        // Calculate per-type max counts if auto-sizing
        if (autoSizePerType) {
            int perTypeMax = totalMaxRecords / typeRegistrations.size();
            // Add any remainder to ensure we don't exceed totalMaxRecords
            int remainder = totalMaxRecords % typeRegistrations.size();
            
            int index = 0;
            for (T entityType : typeRegistrations.keySet()) {
                if (!typeMaxCounts.containsKey(entityType)) {
                    int maxForType = perTypeMax;
                    if (index < remainder) {
                        maxForType++; // Distribute remainder
                    }
                    typeMaxCounts.put(entityType, maxForType);
                    index++;
                }
            }
        }
        
        // Validate total doesn't exceed maxRecords
        int actualTotal = 0;
        for (Integer maxCount : typeMaxCounts.values()) {
            actualTotal += maxCount;
        }
        
        if (actualTotal > totalMaxRecords) {
            throw new IllegalStateException(
                String.format("Sum of per-type max counts (%d) exceeds total maxRecords (%d)",
                    actualTotal, totalMaxRecords)
            );
        }
        
        // Create registry and register all types
        EntityRegistry<T> registry = new EntityRegistry<>();
        for (Map.Entry<T, Class<?>> entry : typeRegistrations.entrySet()) {
            T entityType = entry.getKey();
            Class<?> entityClass = entry.getValue();
            Integer maxCount = typeMaxCounts.get(entityType);
            
            if (maxCount == null) {
                throw new IllegalStateException(
                    "No max count specified for type: " + entityType
                );
            }
            
            registry.register(entityType, entityClass, maxCount);
        }
        
        // Create pooled implementation with properly sized pools
        // Pool size is based on totalMaxRecords for optimal memory usage
        PooledGenericEntityStorageImpl<T> impl = 
            new PooledGenericEntityStorageImpl<>(registry, totalMaxRecords);
        
        return new GenericEntityStorage<>(impl);
    }
    
    /**
     * Create a new builder instance
     */
    public static <T extends IEntityTypeSet> StorageBuilder<T> create() {
        return new StorageBuilder<>();
    }
}