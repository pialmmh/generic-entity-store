package com.telcobright.db.genericentity.core.impl;

import com.telcobright.db.genericentity.core.FieldMapping;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Processes entity classes using reflection at startup.
 * Generates field mappings for converter generation.
 */
public class ReflectionProcessor {
    
    /**
     * Analyze entity class and generate field mappings
     */
    public List<FieldMapping> analyzeEntity(Class<?> entityClass) {
        List<FieldMapping> mappings = new ArrayList<>();
        
        int stringIndex = 1;
        int intIndex = 1;
        int longIndex = 1;
        int doubleIndex = 1;
        int datetimeIndex = 1;
        int boolIndex = 1;
        
        for (Field field : entityClass.getDeclaredFields()) {
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
            
            if (fieldName.equalsIgnoreCase("id")) {
                mappings.add(new FieldMapping(fieldName, "id", 
                    FieldMapping.FieldType.ID, 0));
            } else if (fieldType == String.class && stringIndex <= 20) {
                mappings.add(new FieldMapping(fieldName, "string" + stringIndex,
                    FieldMapping.FieldType.STRING, stringIndex));
                stringIndex++;
            } else if ((fieldType == Integer.class || fieldType == int.class) && intIndex <= 10) {
                mappings.add(new FieldMapping(fieldName, "int" + intIndex,
                    FieldMapping.FieldType.INT, intIndex));
                intIndex++;
            } else if ((fieldType == Long.class || fieldType == long.class) && longIndex <= 10) {
                mappings.add(new FieldMapping(fieldName, "long" + longIndex,
                    FieldMapping.FieldType.LONG, longIndex));
                longIndex++;
            }
            // ... handle other types
        }
        
        return mappings;
    }
}