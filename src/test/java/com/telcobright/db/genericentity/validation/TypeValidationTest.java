package com.telcobright.db.genericentity.validation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.EntityRegistry;
import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;

/**
 * Test to verify that type validation works during entity registration
 */
public class TypeValidationTest {
    
    // Test entity types enum
    enum TestEntityType implements IEntityTypeSet {
        VALID_ENTITY(1),
        INVALID_ENTITY_FILE(2),
        INVALID_ENTITY_PATH(3),
        INVALID_ENTITY_ATOMIC(4),
        INVALID_ENTITY_JFRAME(5),
        INVALID_ENTITY_NESTED(6);
        
        private final int typeId;
        
        TestEntityType(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    // Valid entity with all supported types
    static class ValidEntity {
        private Long id;
        private String name;
        private Integer count;
        private Double amount;
        private Boolean active;
        private byte[] data;
        private List<String> tags;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public Integer getCount() { return count; }
        public void setCount(Integer count) { this.count = count; }
        
        public Double getAmount() { return amount; }
        public void setAmount(Double amount) { this.amount = amount; }
        
        public Boolean getActive() { return active; }
        public void setActive(Boolean active) { this.active = active; }
        
        public byte[] getData() { return data; }
        public void setData(byte[] data) { this.data = data; }
        
        public List<String> getTags() { return tags; }
        public void setTags(List<String> tags) { this.tags = tags; }
    }
    
    // Invalid entity with File field
    static class InvalidEntityWithFile {
        private Long id;
        private String name;
        private File file; // Unsupported type
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public File getFile() { return file; }
        public void setFile(File file) { this.file = file; }
    }
    
    // Invalid entity with Path field
    static class InvalidEntityWithPath {
        private Long id;
        private Path path; // Unsupported type
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Path getPath() { return path; }
        public void setPath(Path path) { this.path = path; }
    }
    
    // Invalid entity with AtomicInteger
    static class InvalidEntityWithAtomic {
        private Long id;
        private AtomicInteger counter; // Unsupported type
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public AtomicInteger getCounter() { return counter; }
        public void setCounter(AtomicInteger counter) { this.counter = counter; }
    }
    
    // Invalid entity with Swing component
    static class InvalidEntityWithSwing {
        private Long id;
        private JFrame frame; // Definitely unsupported!
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public JFrame getFrame() { return frame; }
        public void setFrame(JFrame frame) { this.frame = frame; }
    }
    
    // Invalid entity with unsupported nested generics
    static class InvalidEntityWithNestedGenerics {
        private Long id;
        private Map<String, List<File>> fileMap; // Unsupported nested type
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Map<String, List<File>> getFileMap() { return fileMap; }
        public void setFileMap(Map<String, List<File>> fileMap) { this.fileMap = fileMap; }
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                         TYPE VALIDATION TEST");
        System.out.println("================================================================================\n");
        
        int passedTests = 0;
        int failedTests = 0;
        
        // Test 1: Valid entity should be accepted
        System.out.println("Test 1: Registering valid entity with supported types...");
        try {
            GenericEntityStorage<TestEntityType> storage1 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.VALID_ENTITY, ValidEntity.class, 100)
                    .build();
            System.out.println("  ✅ PASSED: Valid entity was accepted");
            passedTests++;
        } catch (Exception e) {
            System.out.println("  ❌ FAILED: Valid entity was rejected: " + e.getMessage());
            failedTests++;
        }
        
        // Test 2: Invalid entity with File should be rejected
        System.out.println("\nTest 2: Registering invalid entity with File field...");
        try {
            GenericEntityStorage<TestEntityType> storage2 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.INVALID_ENTITY_FILE, InvalidEntityWithFile.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Invalid entity with File was accepted");
            failedTests++;
        } catch (EntityRegistry.UnsupportedTypeException e) {
            System.out.println("  ✅ PASSED: Invalid entity was rejected");
            System.out.println("  Exception message: " + e.getMessage().split("\n")[0]);
            passedTests++;
        }
        
        // Test 3: Invalid entity with Path should be rejected
        System.out.println("\nTest 3: Registering invalid entity with Path field...");
        try {
            GenericEntityStorage<TestEntityType> storage3 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.INVALID_ENTITY_PATH, InvalidEntityWithPath.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Invalid entity with Path was accepted");
            failedTests++;
        } catch (EntityRegistry.UnsupportedTypeException e) {
            System.out.println("  ✅ PASSED: Invalid entity was rejected");
            System.out.println("  Exception message: " + e.getMessage().split("\n")[0]);
            passedTests++;
        }
        
        // Test 4: Invalid entity with AtomicInteger should be rejected
        System.out.println("\nTest 4: Registering invalid entity with AtomicInteger field...");
        try {
            GenericEntityStorage<TestEntityType> storage4 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.INVALID_ENTITY_ATOMIC, InvalidEntityWithAtomic.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Invalid entity with AtomicInteger was accepted");
            failedTests++;
        } catch (EntityRegistry.UnsupportedTypeException e) {
            System.out.println("  ✅ PASSED: Invalid entity was rejected");
            System.out.println("  Exception message: " + e.getMessage().split("\n")[0]);
            passedTests++;
        }
        
        // Test 5: Invalid entity with JFrame should be rejected
        System.out.println("\nTest 5: Registering invalid entity with JFrame field...");
        try {
            GenericEntityStorage<TestEntityType> storage5 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.INVALID_ENTITY_JFRAME, InvalidEntityWithSwing.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Invalid entity with JFrame was accepted");
            failedTests++;
        } catch (EntityRegistry.UnsupportedTypeException e) {
            System.out.println("  ✅ PASSED: Invalid entity was rejected");
            System.out.println("  Exception message: " + e.getMessage().split("\n")[0]);
            passedTests++;
        }
        
        // Test 6: Invalid entity with nested generics containing unsupported type
        System.out.println("\nTest 6: Registering invalid entity with Map<String, List<File>> field...");
        try {
            GenericEntityStorage<TestEntityType> storage6 = 
                GenericEntityStorage.<TestEntityType>builder()
                    .withEntityTypeSet(TestEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(TestEntityType.INVALID_ENTITY_NESTED, InvalidEntityWithNestedGenerics.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Invalid entity with nested unsupported generics was accepted");
            failedTests++;
        } catch (EntityRegistry.UnsupportedTypeException e) {
            System.out.println("  ✅ PASSED: Invalid entity was rejected");
            System.out.println("  Exception message: " + e.getMessage().split("\n")[0]);
            passedTests++;
        }
        
        // Print summary
        System.out.println("\n================================================================================");
        System.out.println("                              TEST SUMMARY");
        System.out.println("================================================================================");
        System.out.printf("Tests Passed: %d\n", passedTests);
        System.out.printf("Tests Failed: %d\n", failedTests);
        System.out.printf("Total Tests: %d\n", passedTests + failedTests);
        
        if (failedTests == 0) {
            System.out.println("\n✅ ALL TESTS PASSED - Type validation is working correctly!");
        } else {
            System.out.println("\n❌ SOME TESTS FAILED - Type validation has issues!");
        }
        
        System.out.println("================================================================================");
    }
}