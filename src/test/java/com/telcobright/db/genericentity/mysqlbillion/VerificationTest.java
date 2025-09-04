package com.telcobright.db.genericentity.mysqlbillion;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.mysqlbillion.entities.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Verification Test - Ensures PUT and GET operations work correctly
 */
public class VerificationTest {
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    Entity Storage Verification Test");
        System.out.println("================================================================================\n");
        
        // Initialize storage
        GenericEntityStorage<MySQLBillionEntityType> storage = 
            GenericEntityStorage.<MySQLBillionEntityType>builder()
                .withEntityTypeSet(MySQLBillionEntityType.class)
                .withMaxRecords(50000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_1, SpecialEntity1.class, 10000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_2, SpecialEntity2.class, 10000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_3, SpecialEntity3.class, 10000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_4, SpecialEntity4.class, 10000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_5, SpecialEntity5.class, 10000)
                .build();
        
        int totalTests = 0;
        int passed = 0;
        int failed = 0;
        
        // Test 1: SpecialEntity1 - NULL handling
        System.out.println("Test 1: SpecialEntity1 - NULL handling and basic types");
        for (int i = 0; i < 100; i++) {
            SpecialEntity1 entity = new SpecialEntity1();
            entity.setId((long) i);
            entity.setNullableString("Test_String_" + i);
            entity.setNullableInt(i * 100);
            entity.setNullableDecimal(new BigDecimal(i + ".99"));
            entity.setNullableDateTime(LocalDateTime.now().plusDays(i));
            entity.setNullableBoolean(i % 2 == 0);
            
            // PUT
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            
            // GET and verify
            SpecialEntity1 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            
            totalTests++;
            if (retrieved != null && 
                retrieved.getId().equals(entity.getId()) &&
                ("Test_String_" + i).equals(retrieved.getNullableString()) &&
                retrieved.getNullableInt().equals(i * 100) &&
                retrieved.getNullableDecimal().compareTo(new BigDecimal(i + ".99")) == 0 &&
                retrieved.getNullableBoolean().equals(i % 2 == 0)) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - data mismatch");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test 2: SpecialEntity2 - Large data
        System.out.println("Test 2: SpecialEntity2 - Large data and boundaries");
        passed = failed = 0;
        for (int i = 0; i < 100; i++) {
            SpecialEntity2 entity = new SpecialEntity2();
            entity.setId((long) i);
            entity.setMaxDecimal(new BigDecimal("999999." + i));
            entity.setLongText("LongText_" + i + "_" + "X".repeat(100));
            byte[] binaryData = new byte[100];
            Arrays.fill(binaryData, (byte) i);
            entity.setLargeBinary(binaryData);
            
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_2);
            SpecialEntity2 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_2);
            
            totalTests++;
            if (retrieved != null && 
                retrieved.getId().equals(entity.getId()) &&
                retrieved.getMaxDecimal().compareTo(new BigDecimal("999999." + i)) == 0 &&
                retrieved.getLongText().startsWith("LongText_" + i) &&
                Arrays.equals(retrieved.getLargeBinary(), binaryData)) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - data mismatch");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test 3: SpecialEntity3 - Minimal fields
        System.out.println("Test 3: SpecialEntity3 - Minimal size fields");
        passed = failed = 0;
        for (int i = 0; i < 100; i++) {
            SpecialEntity3 entity = new SpecialEntity3();
            entity.setId((long) i);
            entity.setTinyField((byte)(i % 128));
            entity.setBitField(i % 3 == 0);
            entity.setCharField(String.valueOf((char)('A' + (i % 26))));
            
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_3);
            SpecialEntity3 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_3);
            
            totalTests++;
            if (retrieved != null && 
                retrieved.getId().equals(entity.getId()) &&
                retrieved.getTinyField().equals((byte)(i % 128)) &&
                retrieved.getBitField().equals(i % 3 == 0) &&
                retrieved.getCharField().equals(String.valueOf((char)('A' + (i % 26))))) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - data mismatch");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test 4: SpecialEntity4 - Unicode
        System.out.println("Test 4: SpecialEntity4 - Unicode and special characters");
        passed = failed = 0;
        for (int i = 0; i < 100; i++) {
            SpecialEntity4 entity = new SpecialEntity4();
            entity.setId((long) i);
            entity.setUnicodeText("Hello世界" + i);
            entity.setEmojiField("🔥" + i + "💯");
            entity.setMultiLanguage("مرحبا_" + i);
            
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_4);
            SpecialEntity4 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_4);
            
            totalTests++;
            if (retrieved != null && 
                retrieved.getId().equals(entity.getId()) &&
                ("Hello世界" + i).equals(retrieved.getUnicodeText()) &&
                ("🔥" + i + "💯").equals(retrieved.getEmojiField()) &&
                ("مرحبا_" + i).equals(retrieved.getMultiLanguage())) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - data mismatch");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test 5: SpecialEntity5 - Precision decimals
        System.out.println("Test 5: SpecialEntity5 - High precision decimals");
        passed = failed = 0;
        for (int i = 0; i < 100; i++) {
            SpecialEntity5 entity = new SpecialEntity5();
            entity.setId((long) i);
            entity.setPrecision2(new BigDecimal(i + ".25"));
            entity.setPrecision8(new BigDecimal("0.1234567" + (i % 10)));
            entity.setPrecision18(new BigDecimal("0.123456789012345" + String.format("%03d", i)));
            
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_5);
            SpecialEntity5 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_5);
            
            totalTests++;
            if (retrieved != null && 
                retrieved.getId().equals(entity.getId()) &&
                retrieved.getPrecision2().compareTo(entity.getPrecision2()) == 0 &&
                retrieved.getPrecision8().compareTo(entity.getPrecision8()) == 0 &&
                retrieved.getPrecision18().compareTo(entity.getPrecision18()) == 0) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - data mismatch");
                if (retrieved != null) {
                    System.out.println("    Expected P2: " + entity.getPrecision2() + ", Got: " + retrieved.getPrecision2());
                    System.out.println("    Expected P8: " + entity.getPrecision8() + ", Got: " + retrieved.getPrecision8());
                    System.out.println("    Expected P18: " + entity.getPrecision18() + ", Got: " + retrieved.getPrecision18());
                }
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test updates
        System.out.println("Test 6: Update operations");
        passed = failed = 0;
        for (int i = 0; i < 100; i++) {
            // Update existing entity
            SpecialEntity1 updated = new SpecialEntity1();
            updated.setId((long) i);
            updated.setNullableString("UPDATED_" + i);
            updated.setNullableInt(i * 1000);
            updated.setNullableDecimal(new BigDecimal(i + ".999"));
            updated.setNullableBoolean(true);
            
            storage.put(updated, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            SpecialEntity1 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            
            totalTests++;
            if (retrieved != null && 
                ("UPDATED_" + i).equals(retrieved.getNullableString()) &&
                retrieved.getNullableInt().equals(i * 1000)) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - update not reflected");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Test removes
        System.out.println("Test 7: Remove operations");
        passed = failed = 0;
        for (int i = 0; i < 50; i++) {
            storage.remove((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            SpecialEntity1 retrieved = storage.get((long) i, MySQLBillionEntityType.SPECIAL_ENTITY_1);
            
            totalTests++;
            if (retrieved == null) {
                passed++;
            } else {
                failed++;
                System.out.println("  FAILED: ID " + i + " - entity still exists after remove");
            }
        }
        System.out.println("  Result: " + passed + " passed, " + failed + " failed\n");
        
        // Final summary
        System.out.println("================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        double successRate = (passed * 100.0) / totalTests;
        System.out.println("Success Rate: " + String.format("%.2f%%", successRate));
        
        if (successRate == 100.0) {
            System.out.println("\n✅ ALL TESTS PASSED - Storage system working correctly!");
        } else if (successRate >= 95.0) {
            System.out.println("\n⚠️ MOSTLY WORKING - Some issues need attention");
        } else {
            System.out.println("\n❌ SIGNIFICANT ISSUES - Storage system has problems");
        }
        System.out.println("================================================================================");
    }
}