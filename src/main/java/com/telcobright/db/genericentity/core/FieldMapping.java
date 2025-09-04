package com.telcobright.db.genericentity.core;

/**
 * Represents a field mapping between entity field and generic field.
 */
public class FieldMapping {
    
    public enum FieldType {
        ID, STRING, INT, LONG, DOUBLE, DECIMAL, DATETIME, BOOLEAN, BYTES, LIST, MAP, OBJECT
    }
    
    private final String entityFieldName;
    private final String genericFieldName;
    private final FieldType fieldType;
    private final int fieldIndex;
    
    public FieldMapping(String entityFieldName, String genericFieldName, 
                        FieldType fieldType, int fieldIndex) {
        this.entityFieldName = entityFieldName;
        this.genericFieldName = genericFieldName;
        this.fieldType = fieldType;
        this.fieldIndex = fieldIndex;
    }
    
    public String getEntityFieldName() { return entityFieldName; }
    public String getGenericFieldName() { return genericFieldName; }
    public FieldType getFieldType() { return fieldType; }
    public int getFieldIndex() { return fieldIndex; }
}