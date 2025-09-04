package com.telcobright.db.genericentity.api;

/**
 * Marker interface for entity type set enums.
 * Each enum represents a set of related entity types that can be stored.
 * The "Set" suffix indicates this enum defines a collection of entity types.
 */
public interface IEntityTypeSet {
    /**
     * Get unique type identifier within this set
     * @return type ID
     */
    int getTypeId();
    
    /**
     * Get type name
     * @return enum name
     */
    String name();
}