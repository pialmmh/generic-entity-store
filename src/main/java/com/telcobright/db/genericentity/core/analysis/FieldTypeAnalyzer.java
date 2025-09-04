package com.telcobright.db.genericentity.core.analysis;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Analyzes registered entity classes to determine the optimal GenericEntity size.
 * Counts fields by type across all registered entities to minimize memory usage.
 */
public class FieldTypeAnalyzer {
    
    // Field counts across all entity types
    private int maxStringFields = 0;
    private int maxIntFields = 0;
    private int maxLongFields = 0;
    private int maxDoubleFields = 0;
    private int maxBigDecimalFields = 0;
    private int maxDateTimeFields = 0;
    private int maxBooleanFields = 0;
    private int maxByteFields = 0;
    private int maxByteArrayFields = 0;
    
    // Track per-entity requirements for validation
    private final Map<String, EntityFieldCount> entityFieldCounts = new HashMap<>();
    
    /**
     * Analyzes an entity class and updates field counts
     */
    public void analyzeEntity(Class<?> entityClass, IEntityTypeSet entityType) {
        EntityFieldCount count = new EntityFieldCount(entityClass.getSimpleName());
        
        // Analyze all declared fields
        Field[] fields = entityClass.getDeclaredFields();
        
        for (Field field : fields) {
            // Skip static and transient fields
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) ||
                java.lang.reflect.Modifier.isTransient(field.getModifiers())) {
                continue;
            }
            
            Class<?> fieldType = field.getType();
            
            // Categorize by type
            if (fieldType == String.class) {
                count.stringFields++;
            } else if (fieldType == Integer.class || fieldType == int.class) {
                count.intFields++;
            } else if (fieldType == Long.class || fieldType == long.class || 
                      field.getName().toLowerCase().contains("id")) {
                count.longFields++;
            } else if (fieldType == Double.class || fieldType == double.class || 
                      fieldType == Float.class || fieldType == float.class) {
                count.doubleFields++;
            } else if (fieldType == BigDecimal.class) {
                count.bigDecimalFields++;
            } else if (fieldType == LocalDateTime.class || fieldType == Timestamp.class) {
                count.dateTimeFields++;
            } else if (fieldType == Boolean.class || fieldType == boolean.class) {
                count.booleanFields++;
            } else if (fieldType == Byte.class || fieldType == byte.class) {
                count.byteFields++;
            } else if (fieldType == byte[].class) {
                count.byteArrayFields++;
            } else {
                // For other types, map to most appropriate field
                if (fieldType.isEnum()) {
                    count.stringFields++; // Store enums as strings
                } else if (Number.class.isAssignableFrom(fieldType)) {
                    count.doubleFields++; // Store other numbers as doubles
                } else {
                    count.stringFields++; // Default to string representation
                }
            }
        }
        
        // Update maximums
        maxStringFields = Math.max(maxStringFields, count.stringFields);
        maxIntFields = Math.max(maxIntFields, count.intFields);
        maxLongFields = Math.max(maxLongFields, count.longFields);
        maxDoubleFields = Math.max(maxDoubleFields, count.doubleFields);
        maxBigDecimalFields = Math.max(maxBigDecimalFields, count.bigDecimalFields);
        maxDateTimeFields = Math.max(maxDateTimeFields, count.dateTimeFields);
        maxBooleanFields = Math.max(maxBooleanFields, count.booleanFields);
        maxByteFields = Math.max(maxByteFields, count.byteFields);
        maxByteArrayFields = Math.max(maxByteArrayFields, count.byteArrayFields);
        
        // Store for reporting
        entityFieldCounts.put(entityClass.getName(), count);
    }
    
    /**
     * Determines the optimal GenericEntity size based on field analysis
     */
    public EntitySize determineOptimalSize() {
        // Calculate total fields needed (considering GenericEntity structure)
        int totalFieldsNeeded = calculateTotalFieldsNeeded();
        
        // Select appropriate size
        if (totalFieldsNeeded <= 20) {
            return EntitySize.SMALL;
        } else if (totalFieldsNeeded <= 50) {
            return EntitySize.MEDIUM;
        } else if (totalFieldsNeeded <= 100) {
            return EntitySize.BIG;
        } else if (totalFieldsNeeded <= 200) {
            return EntitySize.HUGE;
        } else if (totalFieldsNeeded <= 400) {
            return EntitySize.COLOSSAL;
        } else {
            return EntitySize.MONSTER;
        }
    }
    
    /**
     * Calculates total fields needed in GenericEntity
     */
    private int calculateTotalFieldsNeeded() {
        // GenericEntity has arrays of each type
        // We need the maximum count for each type across all entities
        int total = 0;
        total += maxStringFields;      // string1, string2, ..., stringN
        total += maxIntFields;          // int1, int2, ..., intN
        total += maxLongFields;         // long1, long2, ..., longN
        total += maxDoubleFields;       // double1, double2, ..., doubleN
        total += maxBigDecimalFields;   // decimal1, decimal2, ..., decimalN
        total += maxDateTimeFields;     // dateTime1, dateTime2, ..., dateTimeN
        total += maxBooleanFields;      // boolean1, boolean2, ..., booleanN
        total += maxByteFields;         // byte1, byte2, ..., byteN
        total += maxByteArrayFields;    // byteArray1, byteArray2, ..., byteArrayN
        
        return total;
    }
    
    /**
     * Gets a detailed analysis report
     */
    public AnalysisReport getReport() {
        return new AnalysisReport(this);
    }
    
    /**
     * Entity size categories
     */
    public enum EntitySize {
        SMALL(20, "GenericEntitySmall"),
        MEDIUM(50, "GenericEntityMedium"),
        BIG(100, "GenericEntityBig"),
        HUGE(200, "GenericEntityHuge"),
        COLOSSAL(400, "GenericEntityColossal"),
        MONSTER(1000, "GenericEntityMonster");
        
        private final int maxFields;
        private final String className;
        
        EntitySize(int maxFields, String className) {
            this.maxFields = maxFields;
            this.className = className;
        }
        
        public int getMaxFields() {
            return maxFields;
        }
        
        public String getClassName() {
            return className;
        }
    }
    
    /**
     * Individual entity field count
     */
    private static class EntityFieldCount {
        final String entityName;
        int stringFields = 0;
        int intFields = 0;
        int longFields = 0;
        int doubleFields = 0;
        int bigDecimalFields = 0;
        int dateTimeFields = 0;
        int booleanFields = 0;
        int byteFields = 0;
        int byteArrayFields = 0;
        
        EntityFieldCount(String entityName) {
            this.entityName = entityName;
        }
        
        int getTotalFields() {
            return stringFields + intFields + longFields + doubleFields +
                   bigDecimalFields + dateTimeFields + booleanFields + 
                   byteFields + byteArrayFields;
        }
    }
    
    /**
     * Detailed analysis report
     */
    public static class AnalysisReport {
        private final FieldTypeAnalyzer analyzer;
        
        AnalysisReport(FieldTypeAnalyzer analyzer) {
            this.analyzer = analyzer;
        }
        
        public String generateReport() {
            StringBuilder sb = new StringBuilder();
            sb.append("================================================================================\n");
            sb.append("                        FIELD TYPE ANALYSIS REPORT\n");
            sb.append("================================================================================\n\n");
            
            sb.append("Maximum Field Counts Across All Entities:\n");
            sb.append("------------------------------------------\n");
            sb.append(String.format("  String fields:     %d\n", analyzer.maxStringFields));
            sb.append(String.format("  Integer fields:    %d\n", analyzer.maxIntFields));
            sb.append(String.format("  Long fields:       %d\n", analyzer.maxLongFields));
            sb.append(String.format("  Double fields:     %d\n", analyzer.maxDoubleFields));
            sb.append(String.format("  BigDecimal fields: %d\n", analyzer.maxBigDecimalFields));
            sb.append(String.format("  DateTime fields:   %d\n", analyzer.maxDateTimeFields));
            sb.append(String.format("  Boolean fields:    %d\n", analyzer.maxBooleanFields));
            sb.append(String.format("  Byte fields:       %d\n", analyzer.maxByteFields));
            sb.append(String.format("  ByteArray fields:  %d\n", analyzer.maxByteArrayFields));
            sb.append("\n");
            
            int totalFields = analyzer.calculateTotalFieldsNeeded();
            sb.append(String.format("Total Fields Needed: %d\n", totalFields));
            
            EntitySize optimalSize = analyzer.determineOptimalSize();
            sb.append(String.format("Optimal Entity Size: %s (%d fields capacity)\n", 
                optimalSize.name(), optimalSize.getMaxFields()));
            
            // Memory savings calculation
            int standardSize = 200; // Default GenericEntity size
            int savedFields = standardSize - totalFields;
            if (savedFields > 0) {
                double savingsPercent = (savedFields * 100.0) / standardSize;
                sb.append(String.format("\nMemory Optimization: Saving %d fields (%.1f%% reduction)\n", 
                    savedFields, savingsPercent));
            }
            
            sb.append("\nPer-Entity Field Analysis:\n");
            sb.append("--------------------------\n");
            for (Map.Entry<String, EntityFieldCount> entry : analyzer.entityFieldCounts.entrySet()) {
                EntityFieldCount count = entry.getValue();
                sb.append(String.format("  %s: %d total fields\n", 
                    count.entityName, count.getTotalFields()));
                if (count.stringFields > 0) 
                    sb.append(String.format("    - Strings: %d\n", count.stringFields));
                if (count.intFields > 0) 
                    sb.append(String.format("    - Integers: %d\n", count.intFields));
                if (count.longFields > 0) 
                    sb.append(String.format("    - Longs: %d\n", count.longFields));
                if (count.doubleFields > 0) 
                    sb.append(String.format("    - Doubles: %d\n", count.doubleFields));
                if (count.bigDecimalFields > 0) 
                    sb.append(String.format("    - BigDecimals: %d\n", count.bigDecimalFields));
                if (count.dateTimeFields > 0) 
                    sb.append(String.format("    - DateTimes: %d\n", count.dateTimeFields));
                if (count.booleanFields > 0) 
                    sb.append(String.format("    - Booleans: %d\n", count.booleanFields));
            }
            
            sb.append("\n================================================================================\n");
            return sb.toString();
        }
        
        public EntitySize getOptimalSize() {
            return analyzer.determineOptimalSize();
        }
        
        public int getTotalFieldsNeeded() {
            return analyzer.calculateTotalFieldsNeeded();
        }
    }
}