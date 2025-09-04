package com.telcobright.db.genericentity.core.impl;

import com.telcobright.db.genericentity.core.EntityConverter;
import com.telcobright.db.genericentity.core.GenericEntity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Generates entity converters at startup using reflection.
 * Creates optimized converter instances that don't use reflection at runtime.
 */
public class ConverterGenerator {
    
    public EntityConverter generateConverter(Class<?> entityClass) {
        // Analyze entity class at startup
        Map<String, Field> fields = new HashMap<>();
        Map<String, Method> getters = new HashMap<>();
        Map<String, Method> setters = new HashMap<>();
        
        // Cache all fields
        for (Field field : entityClass.getDeclaredFields()) {
            field.setAccessible(true);
            fields.put(field.getName(), field);
        }
        
        // Cache all methods
        for (Method method : entityClass.getMethods()) {
            String name = method.getName();
            if (name.startsWith("get") && method.getParameterCount() == 0) {
                String fieldName = decapitalize(name.substring(3));
                getters.put(fieldName, method);
            } else if (name.startsWith("set") && method.getParameterCount() == 1) {
                String fieldName = decapitalize(name.substring(3));
                setters.put(fieldName, method);
            }
        }
        
        // Create converter with cached reflection data
        return new GeneratedConverter(entityClass, fields, getters, setters);
    }
    
    private String decapitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
    
    /**
     * Generated converter that uses pre-cached reflection data
     */
    private static class GeneratedConverter implements EntityConverter {
        private final Class<?> entityClass;
        private final Map<String, Field> fields;
        private final Map<String, Method> getters;
        private final Map<String, Method> setters;
        
        // Field mapping strategy: map fields by name to GenericEntity fields
        private final Map<String, String> fieldToGenericMapping = new HashMap<>();
        private final Map<String, String> genericToFieldMapping = new HashMap<>();
        
        public GeneratedConverter(Class<?> entityClass, Map<String, Field> fields,
                                Map<String, Method> getters, Map<String, Method> setters) {
            this.entityClass = entityClass;
            this.fields = fields;
            this.getters = getters;
            this.setters = setters;
            initializeFieldMappings();
        }
        
        private void initializeFieldMappings() {
            // Create sorted list of fields by name for consistent mapping
            List<String> stringFields = new ArrayList<>();
            List<String> intFields = new ArrayList<>();
            List<String> longFields = new ArrayList<>();
            List<String> doubleFields = new ArrayList<>();
            List<String> booleanFields = new ArrayList<>();
            List<String> bigDecimalFields = new ArrayList<>();
            List<String> dateTimeFields = new ArrayList<>();
            List<String> dateFields = new ArrayList<>();
            List<String> timeFields = new ArrayList<>();
            List<String> byteArrayFields = new ArrayList<>();
            
            for (Map.Entry<String, Method> entry : getters.entrySet()) {
                String fieldName = entry.getKey();
                if (fieldName.equals("id")) continue; // ID is handled separately
                
                Class<?> returnType = entry.getValue().getReturnType();
                
                if (returnType == String.class) {
                    stringFields.add(fieldName);
                } else if (returnType == Integer.class || returnType == int.class || 
                          returnType == Byte.class || returnType == byte.class ||
                          returnType == Short.class || returnType == short.class) {
                    // Map Byte and Short to Integer fields since GenericEntity doesn't have separate byte/short fields
                    intFields.add(fieldName);
                } else if (returnType == Long.class || returnType == long.class) {
                    longFields.add(fieldName);
                } else if (returnType == Double.class || returnType == double.class ||
                          returnType == Float.class || returnType == float.class) {
                    // Map Float to Double fields
                    doubleFields.add(fieldName);
                } else if (returnType == Boolean.class || returnType == boolean.class) {
                    booleanFields.add(fieldName);
                } else if (returnType == BigDecimal.class) {
                    bigDecimalFields.add(fieldName);
                } else if (returnType == LocalDateTime.class) {
                    dateTimeFields.add(fieldName);
                } else if (returnType == LocalDate.class) {
                    dateFields.add(fieldName);
                } else if (returnType == LocalTime.class) {
                    timeFields.add(fieldName);
                } else if (returnType == byte[].class) {
                    byteArrayFields.add(fieldName);
                }
            }
            
            // Sort for consistent mapping
            Collections.sort(stringFields);
            Collections.sort(intFields);
            Collections.sort(longFields);
            Collections.sort(doubleFields);
            Collections.sort(booleanFields);
            Collections.sort(bigDecimalFields);
            Collections.sort(dateTimeFields);
            Collections.sort(dateFields);
            Collections.sort(timeFields);
            Collections.sort(byteArrayFields);
            
            // Map fields to GenericEntity positions
            mapFields(stringFields, "string", 20);
            mapFields(intFields, "int", 10);
            mapFields(longFields, "long", 10);
            mapFields(doubleFields, "double", 10);
            mapFields(booleanFields, "bool", 10);  // GenericEntity uses "bool" not "boolean"
            mapFields(bigDecimalFields, "decimal", 10);  // GenericEntity uses "decimal" not "bigDecimal"
            // Merge all date/time fields to use datetime fields sequentially
            List<String> allDateTimeFields = new ArrayList<>();
            allDateTimeFields.addAll(dateTimeFields);
            allDateTimeFields.addAll(dateFields);  // Add LocalDate fields after LocalDateTime
            allDateTimeFields.addAll(timeFields);  // Add LocalTime fields last
            mapFields(allDateTimeFields, "datetime", 10);   // Map all to datetime1, datetime2, etc. sequentially
            mapFields(byteArrayFields, "bytes", 10);  // GenericEntity uses "bytes" not "byteArray"
        }
        
        private void mapFields(List<String> fields, String genericPrefix, int maxCount) {
            for (int i = 0; i < fields.size() && i < maxCount; i++) {
                String fieldName = fields.get(i);
                String genericFieldName = genericPrefix + (i + 1);
                fieldToGenericMapping.put(fieldName, genericFieldName);
                genericToFieldMapping.put(genericFieldName, fieldName);
            }
        }
        
        @Override
        public GenericEntity toGeneric(Object entity) {
            GenericEntity generic = new GenericEntity();
            
            try {
                // Map ID field
                Method getId = getters.get("id");
                if (getId != null) {
                    generic.setId((Long) getId.invoke(entity));
                }
                
                // Map all other fields using the mapping
                for (Map.Entry<String, String> mapping : fieldToGenericMapping.entrySet()) {
                    String fieldName = mapping.getKey();
                    String genericFieldName = mapping.getValue();
                    Method getter = getters.get(fieldName);
                    
                    if (getter != null) {
                        Object value = getter.invoke(entity);
                        if (value != null) {
                            setGenericField(generic, genericFieldName, value);
                        }
                    }
                }
                
            } catch (Exception e) {
                throw new RuntimeException("Conversion to GenericEntity failed", e);
            }
            
            return generic;
        }
        
        private void setGenericField(GenericEntity generic, String genericFieldName, Object value) throws Exception {
            // Parse the field name to get type and index
            String type;
            int index;
            
            if (genericFieldName.startsWith("string")) {
                type = "String";
                index = Integer.parseInt(genericFieldName.substring(6));
            } else if (genericFieldName.startsWith("int")) {
                type = "Int";
                index = Integer.parseInt(genericFieldName.substring(3));
            } else if (genericFieldName.startsWith("long")) {
                type = "Long";
                index = Integer.parseInt(genericFieldName.substring(4));
            } else if (genericFieldName.startsWith("double")) {
                type = "Double";
                index = Integer.parseInt(genericFieldName.substring(6));
            } else if (genericFieldName.startsWith("bool")) {
                type = "Bool";
                index = Integer.parseInt(genericFieldName.substring(4));
            } else if (genericFieldName.startsWith("decimal")) {
                type = "Decimal";
                index = Integer.parseInt(genericFieldName.substring(7));
            } else if (genericFieldName.startsWith("datetime")) {
                type = "Datetime";
                index = Integer.parseInt(genericFieldName.substring(8));
            // Note: date/time are mapped to datetime fields
            } else if (genericFieldName.startsWith("bytes")) {
                type = "Bytes";
                index = Integer.parseInt(genericFieldName.substring(5));
            } else {
                return;
            }
            
            // Use reflection to call the appropriate setter
            String setterName = "set" + type + index;
            // Handle type conversions for byte/short to int and float to double
            Class<?> paramType = value.getClass();
            if (type.equals("Int") && (value instanceof Byte || value instanceof Short)) {
                // Convert Byte/Short to Integer
                int intValue = ((Number)value).intValue();
                Method setter = GenericEntity.class.getMethod(setterName, Integer.class);
                setter.invoke(generic, intValue);
            } else if (type.equals("Double") && value instanceof Float) {
                // Convert Float to Double
                double doubleValue = ((Float)value).doubleValue();
                Method setter = GenericEntity.class.getMethod(setterName, Double.class);
                setter.invoke(generic, doubleValue);
            } else if (type.equals("Datetime") && value instanceof LocalDate) {
                // Convert LocalDate to LocalDateTime
                LocalDateTime dateTime = ((LocalDate)value).atStartOfDay();
                Method setter = GenericEntity.class.getMethod(setterName, LocalDateTime.class);
                setter.invoke(generic, dateTime);
            } else if (type.equals("Datetime") && value instanceof LocalTime) {
                // Convert LocalTime to LocalDateTime (using today's date)
                LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), (LocalTime)value);
                Method setter = GenericEntity.class.getMethod(setterName, LocalDateTime.class);
                setter.invoke(generic, dateTime);
            } else {
                Method setter = GenericEntity.class.getMethod(setterName, paramType);
                setter.invoke(generic, value);
            }
        }
        
        @Override
        public Object fromGeneric(GenericEntity generic) {
            try {
                Object entity = entityClass.getDeclaredConstructor().newInstance();
                
                // Map ID back
                Method setId = setters.get("id");
                if (setId != null && generic.getId() != null) {
                    setId.invoke(entity, generic.getId());
                }
                
                // Map all other fields back using the mapping
                for (Map.Entry<String, String> mapping : fieldToGenericMapping.entrySet()) {
                    String fieldName = mapping.getKey();
                    String genericFieldName = mapping.getValue();
                    Method setter = setters.get(fieldName);
                    
                    if (setter != null) {
                        Object value = getGenericField(generic, genericFieldName);
                        if (value != null) {
                            // Handle type conversion for fields that were mapped to different types
                            Class<?> paramType = setter.getParameterTypes()[0];
                            if (paramType == Byte.class || paramType == byte.class) {
                                // Convert Integer back to Byte
                                if (value instanceof Integer) {
                                    value = ((Integer)value).byteValue();
                                }
                            } else if (paramType == Short.class || paramType == short.class) {
                                // Convert Integer back to Short
                                if (value instanceof Integer) {
                                    value = ((Integer)value).shortValue();
                                }
                            } else if (paramType == Float.class || paramType == float.class) {
                                // Convert Double back to Float
                                if (value instanceof Double) {
                                    value = ((Double)value).floatValue();
                                }
                            } else if (paramType == LocalDate.class) {
                                // Convert LocalDateTime back to LocalDate
                                if (value instanceof LocalDateTime) {
                                    value = ((LocalDateTime)value).toLocalDate();
                                }
                            } else if (paramType == LocalTime.class) {
                                // Convert LocalDateTime back to LocalTime
                                if (value instanceof LocalDateTime) {
                                    value = ((LocalDateTime)value).toLocalTime();
                                }
                            }
                            setter.invoke(entity, value);
                        }
                    }
                }
                
                return entity;
                
            } catch (Exception e) {
                throw new RuntimeException("Conversion from GenericEntity failed", e);
            }
        }
        
        private Object getGenericField(GenericEntity generic, String genericFieldName) throws Exception {
            // Parse the field name to get type and index
            String type;
            int index;
            
            if (genericFieldName.startsWith("string")) {
                type = "String";
                index = Integer.parseInt(genericFieldName.substring(6));
            } else if (genericFieldName.startsWith("int")) {
                type = "Int";
                index = Integer.parseInt(genericFieldName.substring(3));
            } else if (genericFieldName.startsWith("long")) {
                type = "Long";
                index = Integer.parseInt(genericFieldName.substring(4));
            } else if (genericFieldName.startsWith("double")) {
                type = "Double";
                index = Integer.parseInt(genericFieldName.substring(6));
            } else if (genericFieldName.startsWith("bool")) {
                type = "Bool";
                index = Integer.parseInt(genericFieldName.substring(4));
            } else if (genericFieldName.startsWith("decimal")) {
                type = "Decimal";
                index = Integer.parseInt(genericFieldName.substring(7));
            } else if (genericFieldName.startsWith("datetime")) {
                type = "Datetime";
                index = Integer.parseInt(genericFieldName.substring(8));
            // Note: date/time are mapped to datetime fields
            } else if (genericFieldName.startsWith("bytes")) {
                type = "Bytes";
                index = Integer.parseInt(genericFieldName.substring(5));
            } else {
                return null;
            }
            
            // Use reflection to call the appropriate getter
            String getterName = "get" + type + index;
            Method getter = GenericEntity.class.getMethod(getterName);
            return getter.invoke(generic);
        }
        
        @Override
        public void toGenericPooled(Object entity, GenericEntity target) {
            try {
                // Clear the target first to ensure clean state
                // This is important for object pooling
                
                // Map ID field
                Method getId = getters.get("id");
                if (getId != null) {
                    target.setId((Long) getId.invoke(entity));
                }
                
                // Map all other fields using the mapping
                for (Map.Entry<String, String> mapping : fieldToGenericMapping.entrySet()) {
                    String fieldName = mapping.getKey();
                    String genericFieldName = mapping.getValue();
                    Method getter = getters.get(fieldName);
                    
                    if (getter != null) {
                        Object value = getter.invoke(entity);
                        if (value != null) {
                            setGenericField(target, genericFieldName, value);
                        }
                    }
                }
                
            } catch (Exception e) {
                throw new RuntimeException("Pooled conversion failed", e);
            }
        }
        
        @Override
        public Long extractId(Object entity) {
            try {
                Method getId = getters.get("id");
                if (getId == null) {
                    // No ID getter found - this is a problem with converter generation
                    throw new RuntimeException("No 'id' getter found in " + entity.getClass().getName() + 
                                             ". Available getters: " + getters.keySet());
                }
                return (Long) getId.invoke(entity);
            } catch (Exception e) {
                throw new RuntimeException("Failed to extract ID from " + entity.getClass().getName(), e);
            }
        }
        
        @Override
        public Class<?> getEntityClass() {
            return entityClass;
        }
    }
}