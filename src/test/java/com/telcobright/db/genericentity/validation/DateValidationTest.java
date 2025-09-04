package com.telcobright.db.genericentity.validation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.EntityRegistry;
import com.telcobright.db.genericentity.core.analysis.FieldTypeAnalyzer;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Test demonstrating date type validation and field optimization
 */
public class DateValidationTest {
    
    enum TestEntityTypeSet implements IEntityTypeSet {
        VALID_ENTITY(1),
        INVALID_ENTITY(2),
        OPTIMIZED_ENTITY(3);
        
        private final int typeId;
        TestEntityTypeSet(int typeId) { this.typeId = typeId; }
        
        @Override
        public int getTypeId() { return typeId; }
    }
    
    // Valid entity - only uses LocalDateTime and Timestamp
    public static class ValidEntity {
        private Long id;
        private String name;
        private LocalDateTime createdAt;
        private Timestamp updatedAt;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
        public Timestamp getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
    }
    
    // Invalid entity - uses java.util.Date
    public static class InvalidEntityWithDate {
        private Long id;
        private String name;
        private Date createdDate;  // INVALID - java.util.Date not supported
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public Date getCreatedDate() { return createdDate; }
        public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }
    }
    
    // Invalid entity - uses LocalDate
    public static class InvalidEntityWithLocalDate {
        private Long id;
        private String name;
        private LocalDate birthDate;  // INVALID - LocalDate not supported
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public LocalDate getBirthDate() { return birthDate; }
        public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    }
    
    // Small entity for optimization test
    public static class SmallEntity {
        private Long id;
        private String name;
        private Integer count;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public Integer getCount() { return count; }
        public void setCount(Integer count) { this.count = count; }
    }
    
    // Medium entity for optimization test
    public static class MediumEntity {
        private Long id;
        private String field1, field2, field3, field4, field5;
        private Integer int1, int2, int3;
        private Double double1, double2;
        private BigDecimal amount;
        private LocalDateTime dateTime;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getField1() { return field1; }
        public void setField1(String field1) { this.field1 = field1; }
        public String getField2() { return field2; }
        public void setField2(String field2) { this.field2 = field2; }
        public String getField3() { return field3; }
        public void setField3(String field3) { this.field3 = field3; }
        public String getField4() { return field4; }
        public void setField4(String field4) { this.field4 = field4; }
        public String getField5() { return field5; }
        public void setField5(String field5) { this.field5 = field5; }
        public Integer getInt1() { return int1; }
        public void setInt1(Integer int1) { this.int1 = int1; }
        public Integer getInt2() { return int2; }
        public void setInt2(Integer int2) { this.int2 = int2; }
        public Integer getInt3() { return int3; }
        public void setInt3(Integer int3) { this.int3 = int3; }
        public Double getDouble1() { return double1; }
        public void setDouble1(Double double1) { this.double1 = double1; }
        public Double getDouble2() { return double2; }
        public void setDouble2(Double double2) { this.double2 = double2; }
        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
        public LocalDateTime getDateTime() { return dateTime; }
        public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    DATE TYPE VALIDATION & OPTIMIZATION TEST");
        System.out.println("================================================================================\n");
        
        // Test 1: Valid entity registration
        testValidEntity();
        
        // Test 2: Invalid entity with java.util.Date
        testInvalidDateEntity();
        
        // Test 3: Invalid entity with LocalDate
        testInvalidLocalDateEntity();
        
        // Test 4: Field optimization analysis
        testFieldOptimization();
    }
    
    private static void testValidEntity() {
        System.out.println("TEST 1: Valid Entity with LocalDateTime and Timestamp");
        System.out.println("------------------------------------------------------");
        
        try {
            GenericEntityStorage<TestEntityTypeSet> storage = 
                GenericEntityStorage.<TestEntityTypeSet>builder()
                    .withEntityTypeSet(TestEntityTypeSet.class)
                    .withMaxRecords(1000)
                    .registerType(TestEntityTypeSet.VALID_ENTITY, ValidEntity.class, 1000)
                    .build();
            
            System.out.println("✓ ValidEntity registered successfully");
            System.out.println("  - Uses LocalDateTime: SUPPORTED");
            System.out.println("  - Uses Timestamp: SUPPORTED\n");
            
        } catch (Exception e) {
            System.err.println("✗ Unexpected error: " + e.getMessage());
        }
    }
    
    private static void testInvalidDateEntity() {
        System.out.println("TEST 2: Invalid Entity with java.util.Date");
        System.out.println("-------------------------------------------");
        
        try {
            GenericEntityStorage<TestEntityTypeSet> storage = 
                GenericEntityStorage.<TestEntityTypeSet>builder()
                    .withEntityTypeSet(TestEntityTypeSet.class)
                    .withMaxRecords(1000)
                    .registerType(TestEntityTypeSet.INVALID_ENTITY, InvalidEntityWithDate.class, 1000)
                    .build();
            
            System.err.println("✗ Should have thrown exception for java.util.Date");
            
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Correctly rejected entity with java.util.Date");
            System.out.println("  Error: " + e.getMessage());
            System.out.println();
        }
    }
    
    private static void testInvalidLocalDateEntity() {
        System.out.println("TEST 3: Invalid Entity with LocalDate");
        System.out.println("--------------------------------------");
        
        try {
            GenericEntityStorage<TestEntityTypeSet> storage = 
                GenericEntityStorage.<TestEntityTypeSet>builder()
                    .withEntityTypeSet(TestEntityTypeSet.class)
                    .withMaxRecords(1000)
                    .registerType(TestEntityTypeSet.INVALID_ENTITY, InvalidEntityWithLocalDate.class, 1000)
                    .build();
            
            System.err.println("✗ Should have thrown exception for LocalDate");
            
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Correctly rejected entity with LocalDate");
            System.out.println("  Error: " + e.getMessage());
            System.out.println();
        }
    }
    
    private static void testFieldOptimization() {
        System.out.println("TEST 4: Field Type Optimization Analysis");
        System.out.println("-----------------------------------------");
        
        try {
            // Create registry directly to access field analysis
            EntityRegistry<TestEntityTypeSet> registry = new EntityRegistry<>();
            
            // Register small entity
            registry.register(TestEntityTypeSet.VALID_ENTITY, SmallEntity.class, 1000);
            System.out.println("Registered SmallEntity (3 fields)");
            
            // Register medium entity  
            registry.register(TestEntityTypeSet.OPTIMIZED_ENTITY, MediumEntity.class, 1000);
            System.out.println("Registered MediumEntity (13 fields)\n");
            
            // Get field analysis report
            FieldTypeAnalyzer.AnalysisReport report = registry.getFieldAnalysisReport();
            System.out.println(report.generateReport());
            
            // Show optimal size
            FieldTypeAnalyzer.EntitySize optimalSize = registry.getOptimalEntitySize();
            System.out.println("OPTIMIZATION RESULT:");
            System.out.println("--------------------");
            System.out.println("  Optimal GenericEntity Size: " + optimalSize.name());
            System.out.println("  Maximum capacity: " + optimalSize.getMaxFields() + " fields");
            System.out.println("  Total fields needed: " + report.getTotalFieldsNeeded());
            
            int saved = 200 - report.getTotalFieldsNeeded(); // Default is 200 fields
            if (saved > 0) {
                System.out.println("  Memory saved: " + saved + " fields per entity");
                System.out.println("  Reduction: " + (saved * 100 / 200) + "%");
            }
            
        } catch (Exception e) {
            System.err.println("Error during optimization test: " + e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("\n================================================================================");
        System.out.println("                              TEST COMPLETED");
        System.out.println("================================================================================");
    }
}