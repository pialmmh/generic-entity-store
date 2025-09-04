package com.telcobright.db.genericentity.core;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.impl.ConverterGenerator;
import com.telcobright.db.genericentity.core.validation.DateTypeValidator;
import com.telcobright.db.genericentity.core.analysis.FieldTypeAnalyzer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Registry for entity types and their converters.
 * Manages the mapping between entity types and converter instances.
 * Validates that all field types are supported by the library.
 */
public class EntityRegistry<T extends IEntityTypeSet> {
    
    private final Map<T, EntityConverter> converters = new HashMap<>();
    private final Map<T, Class<?>> entityClasses = new HashMap<>();
    private final Map<T, Integer> maxCounts = new HashMap<>();
    private final ConverterGenerator generator = new ConverterGenerator();
    private final FieldTypeAnalyzer fieldAnalyzer = new FieldTypeAnalyzer();
    
    // Set of supported types by the GenericEntity storage
    private static final Set<Class<?>> SUPPORTED_TYPES = new HashSet<>();
    private static final Set<Class<?>> SUPPORTED_GENERIC_TYPES = new HashSet<>();
    
    static {
        // Primitive types and their wrappers
        SUPPORTED_TYPES.add(byte.class);
        SUPPORTED_TYPES.add(Byte.class);
        SUPPORTED_TYPES.add(short.class);
        SUPPORTED_TYPES.add(Short.class);
        SUPPORTED_TYPES.add(int.class);
        SUPPORTED_TYPES.add(Integer.class);
        SUPPORTED_TYPES.add(long.class);
        SUPPORTED_TYPES.add(Long.class);
        SUPPORTED_TYPES.add(float.class);
        SUPPORTED_TYPES.add(Float.class);
        SUPPORTED_TYPES.add(double.class);
        SUPPORTED_TYPES.add(Double.class);
        SUPPORTED_TYPES.add(boolean.class);
        SUPPORTED_TYPES.add(Boolean.class);
        SUPPORTED_TYPES.add(char.class);
        SUPPORTED_TYPES.add(Character.class);
        
        // Common object types
        SUPPORTED_TYPES.add(String.class);
        SUPPORTED_TYPES.add(BigDecimal.class);
        SUPPORTED_TYPES.add(BigInteger.class);
        SUPPORTED_TYPES.add(byte[].class);
        
        // Date/Time types
        SUPPORTED_TYPES.add(LocalDateTime.class);
        SUPPORTED_TYPES.add(LocalDate.class);
        SUPPORTED_TYPES.add(LocalTime.class);
        SUPPORTED_TYPES.add(Date.class);
        SUPPORTED_TYPES.add(java.sql.Date.class);
        SUPPORTED_TYPES.add(java.sql.Time.class);
        SUPPORTED_TYPES.add(java.sql.Timestamp.class);
        
        // Generic types that are supported with type parameters
        SUPPORTED_GENERIC_TYPES.add(List.class);
        SUPPORTED_GENERIC_TYPES.add(Set.class);
        SUPPORTED_GENERIC_TYPES.add(Map.class);
        SUPPORTED_GENERIC_TYPES.add(Collection.class);
    }
    
    /**
     * Register an entity type with its class
     * Generates converter at registration time
     */
    public void register(T entityType, Class<?> entityClass) {
        register(entityType, entityClass, 1000); // default max count
    }
    
    /**
     * Register an entity type with its class and max count
     * Generates converter at registration time
     * Validates all field types are supported
     */
    public void register(T entityType, Class<?> entityClass, int maxCount) {
        // Validate date types - only LocalDateTime and Timestamp allowed
        DateTypeValidator.validateEntityClass(entityClass);
        
        // Validate all field types before registration
        validateEntityClass(entityClass);
        
        // Analyze field types for optimization
        fieldAnalyzer.analyzeEntity(entityClass, entityType);
        
        EntityConverter converter = generator.generateConverter(entityClass);
        converters.put(entityType, converter);
        entityClasses.put(entityType, entityClass);
        maxCounts.put(entityType, maxCount);
    }
    
    /**
     * Validates that all fields in the entity class have supported types
     * @throws UnsupportedTypeException if any field has an unsupported type
     */
    private void validateEntityClass(Class<?> entityClass) {
        List<String> unsupportedFields = new ArrayList<>();
        
        // Check all fields using reflection
        for (Field field : entityClass.getDeclaredFields()) {
            String fieldInfo = field.getName() + " (" + field.getType().getName() + ")";
            
            // Skip static fields and synthetic fields
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) ||
                field.isSynthetic()) {
                continue;
            }
            
            Class<?> fieldType = field.getType();
            
            // Check if type is directly supported
            if (SUPPORTED_TYPES.contains(fieldType)) {
                continue;
            }
            
            // Check if it's a supported generic type
            boolean isSupported = false;
            for (Class<?> genericType : SUPPORTED_GENERIC_TYPES) {
                if (genericType.isAssignableFrom(fieldType)) {
                    // Check generic type parameters if available
                    Type genericFieldType = field.getGenericType();
                    if (genericFieldType instanceof ParameterizedType) {
                        ParameterizedType pType = (ParameterizedType) genericFieldType;
                        Type[] typeArgs = pType.getActualTypeArguments();
                        
                        boolean allTypeArgsSupported = true;
                        for (Type typeArg : typeArgs) {
                            if (!isTypeArgumentSupported(typeArg)) {
                                allTypeArgsSupported = false;
                                fieldInfo = field.getName() + " (contains unsupported type in generics)";
                                break;
                            }
                        }
                        
                        if (allTypeArgsSupported) {
                            isSupported = true;
                            break;
                        }
                    } else {
                        // Raw type usage - add warning but allow
                        isSupported = true;
                        break;
                    }
                }
            }
            
            // If still not supported, check if it's an array of supported type
            if (!isSupported && fieldType.isArray()) {
                Class<?> componentType = fieldType.getComponentType();
                if (SUPPORTED_TYPES.contains(componentType)) {
                    isSupported = true;
                }
            }
            
            if (!isSupported) {
                unsupportedFields.add(fieldInfo);
            }
        }
        
        // Also validate getter/setter methods for properties
        validateMethodTypes(entityClass, unsupportedFields);
        
        // Throw exception if any unsupported types were found
        if (!unsupportedFields.isEmpty()) {
            throw new UnsupportedTypeException(
                String.format("Entity class %s contains unsupported field types:\n%s\n" +
                             "Supported types are: %s\n" +
                             "Supported generic types are: %s",
                    entityClass.getName(),
                    String.join("\n  - ", unsupportedFields),
                    formatSupportedTypes(),
                    formatSupportedGenericTypes())
            );
        }
    }
    
    /**
     * Validate method return types and parameter types
     */
    private void validateMethodTypes(Class<?> entityClass, List<String> unsupportedFields) {
        for (Method method : entityClass.getMethods()) {
            // Skip methods from Object class
            if (method.getDeclaringClass() == Object.class) {
                continue;
            }
            
            String methodName = method.getName();
            
            // Check getter methods
            if (methodName.startsWith("get") && method.getParameterCount() == 0) {
                Class<?> returnType = method.getReturnType();
                if (!SUPPORTED_TYPES.contains(returnType) && 
                    !isGenericTypeSupported(returnType) &&
                    !returnType.isArray()) {
                    String propertyName = decapitalize(methodName.substring(3));
                    unsupportedFields.add(propertyName + " [getter returns " + returnType.getName() + "]");
                }
            }
            
            // Check setter methods
            if (methodName.startsWith("set") && method.getParameterCount() == 1) {
                Class<?> paramType = method.getParameterTypes()[0];
                if (!SUPPORTED_TYPES.contains(paramType) && 
                    !isGenericTypeSupported(paramType) &&
                    !paramType.isArray()) {
                    String propertyName = decapitalize(methodName.substring(3));
                    unsupportedFields.add(propertyName + " [setter takes " + paramType.getName() + "]");
                }
            }
        }
    }
    
    private boolean isGenericTypeSupported(Class<?> type) {
        for (Class<?> genericType : SUPPORTED_GENERIC_TYPES) {
            if (genericType.isAssignableFrom(type)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Recursively check if a type argument is supported
     * Handles nested generics like List<File> or Map<String, List<Integer>>
     */
    private boolean isTypeArgumentSupported(Type type) {
        if (type instanceof Class) {
            Class<?> clazz = (Class<?>) type;
            // Check if it's a directly supported type
            if (SUPPORTED_TYPES.contains(clazz)) {
                return true;
            }
            // Check if it's a supported generic type (without parameters)
            if (isGenericTypeSupported(clazz)) {
                return true;
            }
            return false;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) type;
            Type rawType = pType.getRawType();
            
            // Check if the raw type is supported
            if (rawType instanceof Class) {
                Class<?> rawClass = (Class<?>) rawType;
                if (!isGenericTypeSupported(rawClass)) {
                    return false;
                }
            }
            
            // Recursively check all type arguments
            Type[] typeArgs = pType.getActualTypeArguments();
            for (Type typeArg : typeArgs) {
                if (!isTypeArgumentSupported(typeArg)) {
                    return false;
                }
            }
            return true;
        }
        // Wildcard types and other complex types are not supported
        return false;
    }
    
    private String decapitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
    
    private String formatSupportedTypes() {
        List<String> types = new ArrayList<>();
        for (Class<?> type : SUPPORTED_TYPES) {
            types.add(type.getSimpleName());
        }
        Collections.sort(types);
        return String.join(", ", types);
    }
    
    private String formatSupportedGenericTypes() {
        List<String> types = new ArrayList<>();
        for (Class<?> type : SUPPORTED_GENERIC_TYPES) {
            types.add(type.getSimpleName() + "<T>");
        }
        Collections.sort(types);
        return String.join(", ", types);
    }
    
    /**
     * Get converter for entity type
     */
    public EntityConverter getConverter(T entityType) {
        return converters.get(entityType);
    }
    
    /**
     * Get entity class for type
     */
    public Class<?> getEntityClass(T entityType) {
        return entityClasses.get(entityType);
    }
    
    /**
     * Get max count for entity type
     */
    public int getMaxCount(T entityType) {
        return maxCounts.getOrDefault(entityType, 1000);
    }
    
    /**
     * Get all registered types with their max counts
     */
    public Map<T, Integer> getAllMaxCounts() {
        return new HashMap<>(maxCounts);
    }
    
    /**
     * Check if type is registered
     */
    public boolean isRegistered(T entityType) {
        return converters.containsKey(entityType);
    }
    
    /**
     * Gets the field type analysis report
     * Shows optimal GenericEntity size based on registered entities
     */
    public FieldTypeAnalyzer.AnalysisReport getFieldAnalysisReport() {
        return fieldAnalyzer.getReport();
    }
    
    /**
     * Gets the optimal entity size based on field analysis
     */
    public FieldTypeAnalyzer.EntitySize getOptimalEntitySize() {
        return fieldAnalyzer.determineOptimalSize();
    }
    
    /**
     * Gets total max count across all registered entities
     */
    public int getTotalMaxCount() {
        return maxCounts.values().stream().mapToInt(Integer::intValue).sum();
    }
    
    /**
     * Custom exception for unsupported types
     */
    public static class UnsupportedTypeException extends RuntimeException {
        public UnsupportedTypeException(String message) {
            super(message);
        }
    }
}