package com.telcobright.db.genericentity.core;

/**
 * Interface for entity converters.
 * Implementations are generated at startup for each registered entity type.
 */
public interface EntityConverter {
    
    /**
     * Convert entity to generic form
     * @param entity Source entity
     * @return Generic entity
     */
    GenericEntity toGeneric(Object entity);
    
    /**
     * Convert entity to generic form using a pre-allocated GenericEntity
     * @param entity Source entity
     * @param target Pre-allocated GenericEntity to populate
     */
    void toGenericPooled(Object entity, GenericEntity target);
    
    /**
     * Convert generic entity back to specific type
     * @param generic Generic entity
     * @return Specific entity instance
     */
    Object fromGeneric(GenericEntity generic);
    
    /**
     * Extract ID from entity
     * @param entity Source entity
     * @return Entity ID
     */
    Long extractId(Object entity);
    
    /**
     * Get the entity class this converter handles
     * @return Entity class
     */
    Class<?> getEntityClass();
}