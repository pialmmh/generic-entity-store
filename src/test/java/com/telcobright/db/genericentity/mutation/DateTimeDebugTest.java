package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.mutation.MutationTest.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeDebugTest {
    public static void main(String[] args) {
        System.out.println("Testing LocalDate/LocalTime conversion through GenericEntity storage\n");
        
        GenericEntityStorage<MutationEntityTypeSet> storage = 
            GenericEntityStorage.<MutationEntityTypeSet>builder()
                .withEntityTypeSet(MutationEntityTypeSet.class)
                .withMaxRecords(10000)
                .registerType(MutationEntityTypeSet.DATE_ENTITY, DateMutationEntity.class, 100)
                .build();
        
        // Test 1: Store and retrieve LocalDate
        DateMutationEntity entity1 = new DateMutationEntity();
        entity1.setId(1L);
        LocalDate originalDate = LocalDate.of(2024, 3, 15);
        LocalTime originalTime = LocalTime.of(14, 30, 45);
        LocalDateTime originalDateTime = LocalDateTime.of(2024, 3, 15, 10, 20, 30);
        
        entity1.setDateValue(originalDate);
        entity1.setTimeValue(originalTime);
        entity1.setDateTimeValue(originalDateTime);
        entity1.setSqlDateValue(new java.sql.Date(System.currentTimeMillis()));
        entity1.setSqlTimeValue(new java.sql.Time(System.currentTimeMillis()));
        entity1.setTimestampValue(new java.sql.Timestamp(System.currentTimeMillis()));
        entity1.setDaysDelta(0);
        
        System.out.println("Original values:");
        System.out.println("  LocalDate: " + originalDate);
        System.out.println("  LocalTime: " + originalTime);
        System.out.println("  LocalDateTime: " + originalDateTime);
        
        // Store
        storage.put(entity1, MutationEntityTypeSet.DATE_ENTITY);
        
        // Retrieve
        DateMutationEntity retrieved = storage.get(1L, MutationEntityTypeSet.DATE_ENTITY);
        
        System.out.println("\nRetrieved values:");
        System.out.println("  LocalDate: " + retrieved.getDateValue());
        System.out.println("  LocalTime: " + retrieved.getTimeValue());
        System.out.println("  LocalDateTime: " + retrieved.getDateTimeValue());
        
        System.out.println("\nComparison:");
        System.out.println("  LocalDate match: " + originalDate.equals(retrieved.getDateValue()));
        System.out.println("  LocalTime match: " + originalTime.equals(retrieved.getTimeValue()));
        System.out.println("  LocalDateTime match: " + originalDateTime.equals(retrieved.getDateTimeValue()));
        
        // Test 2: Apply mutations
        System.out.println("\n--- Testing mutations ---");
        retrieved.applyTimeDelta(5, 3, 30);  // Add 5 days, 3 hours, 30 minutes
        storage.put(retrieved, MutationEntityTypeSet.DATE_ENTITY);
        
        DateMutationEntity retrieved2 = storage.get(1L, MutationEntityTypeSet.DATE_ENTITY);
        System.out.println("\nAfter mutation (+5 days, +3 hours, +30 minutes):");
        System.out.println("  LocalDate: " + retrieved2.getDateValue());
        System.out.println("  LocalTime: " + retrieved2.getTimeValue());
        System.out.println("  LocalDateTime: " + retrieved2.getDateTimeValue());
        
        LocalDate expectedDate = originalDate.plusDays(5);
        LocalTime expectedTime = originalTime.plusHours(3).plusMinutes(30);
        LocalDateTime expectedDateTime = originalDateTime.plusDays(5).plusHours(3).plusMinutes(30);
        
        System.out.println("\nExpected values:");
        System.out.println("  LocalDate: " + expectedDate);
        System.out.println("  LocalTime: " + expectedTime);
        System.out.println("  LocalDateTime: " + expectedDateTime);
        
        System.out.println("\nFinal comparison:");
        System.out.println("  LocalDate match: " + expectedDate.equals(retrieved2.getDateValue()));
        System.out.println("  LocalTime match: " + expectedTime.equals(retrieved2.getTimeValue()));
        System.out.println("  LocalDateTime match: " + expectedDateTime.equals(retrieved2.getDateTimeValue()));
    }
}