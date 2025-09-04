package com.telcobright.db.genericentity.core.validation;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Validates that entity classes only use supported date types:
 * - java.time.LocalDateTime
 * - java.sql.Timestamp
 * 
 * Throws exception during initialization if unsupported date types are found.
 */
public class DateTypeValidator {
    
    // Supported date types
    private static final Set<Class<?>> SUPPORTED_DATE_TYPES = new HashSet<>();
    static {
        SUPPORTED_DATE_TYPES.add(LocalDateTime.class);
        SUPPORTED_DATE_TYPES.add(Timestamp.class);
    }
    
    // Unsupported date types that will cause validation failure
    private static final Set<Class<?>> UNSUPPORTED_DATE_TYPES = new HashSet<>();
    static {
        UNSUPPORTED_DATE_TYPES.add(Date.class);
        UNSUPPORTED_DATE_TYPES.add(java.sql.Date.class);
        UNSUPPORTED_DATE_TYPES.add(java.sql.Time.class);
        UNSUPPORTED_DATE_TYPES.add(java.time.LocalDate.class);
        UNSUPPORTED_DATE_TYPES.add(java.time.LocalTime.class);
        UNSUPPORTED_DATE_TYPES.add(java.time.ZonedDateTime.class);
        UNSUPPORTED_DATE_TYPES.add(java.time.OffsetDateTime.class);
        UNSUPPORTED_DATE_TYPES.add(java.time.Instant.class);
        UNSUPPORTED_DATE_TYPES.add(java.util.Calendar.class);
        UNSUPPORTED_DATE_TYPES.add(java.util.GregorianCalendar.class);
    }
    
    /**
     * Validates that the entity class only uses supported date types
     * 
     * @param entityClass The entity class to validate
     * @throws IllegalArgumentException if unsupported date types are found
     */
    public static void validateEntityClass(Class<?> entityClass) {
        // Check all declared fields
        Field[] fields = entityClass.getDeclaredFields();
        
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            
            // Skip non-date fields
            if (!isDateType(fieldType)) {
                continue;
            }
            
            // Check if it's a supported date type
            if (!SUPPORTED_DATE_TYPES.contains(fieldType)) {
                throw new IllegalArgumentException(
                    String.format(
                        "Entity class '%s' contains unsupported date field '%s' of type '%s'. " +
                        "Only LocalDateTime and Timestamp are supported. " +
                        "Please convert the field to one of the supported types.",
                        entityClass.getName(),
                        field.getName(),
                        fieldType.getName()
                    )
                );
            }
        }
        
        // Also check superclass fields if not Object
        Class<?> superClass = entityClass.getSuperclass();
        if (superClass != null && superClass != Object.class) {
            validateEntityClass(superClass);
        }
    }
    
    /**
     * Checks if a type is a date-related type
     */
    private static boolean isDateType(Class<?> type) {
        // Check if it's one of our supported types
        if (SUPPORTED_DATE_TYPES.contains(type)) {
            return true;
        }
        
        // Check if it's one of the known unsupported types
        if (UNSUPPORTED_DATE_TYPES.contains(type)) {
            return true;
        }
        
        // Check by package and class name patterns
        String typeName = type.getName();
        return typeName.startsWith("java.time.") ||
               typeName.startsWith("java.util.Date") ||
               typeName.startsWith("java.util.Calendar") ||
               typeName.startsWith("java.sql.Date") ||
               typeName.startsWith("java.sql.Time") ||
               typeName.equals("java.util.Date") ||
               typeName.contains("Date") && (
                   type.getPackage() != null && (
                       type.getPackage().getName().contains("time") ||
                       type.getPackage().getName().contains("sql") ||
                       type.getPackage().getName().contains("util")
                   )
               );
    }
    
    /**
     * Gets detailed validation report for an entity class
     */
    public static ValidationReport validateWithReport(Class<?> entityClass) {
        ValidationReport report = new ValidationReport(entityClass.getName());
        
        Field[] fields = entityClass.getDeclaredFields();
        
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            
            if (isDateType(fieldType)) {
                if (SUPPORTED_DATE_TYPES.contains(fieldType)) {
                    report.addSupportedField(field.getName(), fieldType.getSimpleName());
                } else {
                    report.addUnsupportedField(field.getName(), fieldType.getName());
                }
            }
        }
        
        return report;
    }
    
    /**
     * Validation report for detailed information
     */
    public static class ValidationReport {
        private final String className;
        private final Set<String> supportedFields = new HashSet<>();
        private final Set<String> unsupportedFields = new HashSet<>();
        
        public ValidationReport(String className) {
            this.className = className;
        }
        
        void addSupportedField(String fieldName, String typeName) {
            supportedFields.add(fieldName + " (" + typeName + ")");
        }
        
        void addUnsupportedField(String fieldName, String typeName) {
            unsupportedFields.add(fieldName + " (" + typeName + ")");
        }
        
        public boolean isValid() {
            return unsupportedFields.isEmpty();
        }
        
        public String getErrorMessage() {
            if (isValid()) {
                return null;
            }
            
            return String.format(
                "Entity '%s' has unsupported date fields: %s. " +
                "Only LocalDateTime and Timestamp are supported.",
                className,
                String.join(", ", unsupportedFields)
            );
        }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Validation Report for ").append(className).append(":\n");
            
            if (!supportedFields.isEmpty()) {
                sb.append("  Supported date fields: ").append(supportedFields).append("\n");
            }
            
            if (!unsupportedFields.isEmpty()) {
                sb.append("  UNSUPPORTED date fields: ").append(unsupportedFields).append("\n");
            }
            
            if (supportedFields.isEmpty() && unsupportedFields.isEmpty()) {
                sb.append("  No date fields found.\n");
            }
            
            return sb.toString();
        }
    }
}