package com.telcobright.db.genericentity.examples.telecom;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Example usage of GenericEntityStorage for telecom domain
 */
public class TelecomExample {
    
    public static void main(String[] args) {
        // Initialize storage at startup
        GenericEntityStorage<TelecomEntityTypeSet> storage = GenericEntityStorage.<TelecomEntityTypeSet>builder()
            .withEntityTypeSet(TelecomEntityTypeSet.class)
            .withMaxRecords(10000)
            .registerType(TelecomEntityTypeSet.PHONE_CALL_LOG, PhoneCallLog.class)
            .build();
        
        // Create and store phone call logs
        PhoneCallLog call1 = new PhoneCallLog(
            1L, 
            "+1-555-0100", 
            "+1-555-0200",
            LocalDateTime.now(),
            180
        );
        call1.setCallType("outgoing");
        
        PhoneCallLog call2 = new PhoneCallLog(
            2L,
            "+1-555-0300",
            "+1-555-0100",
            LocalDateTime.now().minusHours(1),
            240
        );
        call2.setCallType("incoming");
        
        // Store entities
        storage.put(call1, TelecomEntityTypeSet.PHONE_CALL_LOG);
        storage.put(call2, TelecomEntityTypeSet.PHONE_CALL_LOG);
        
        // Retrieve entity
        PhoneCallLog retrieved = storage.get(1L, TelecomEntityTypeSet.PHONE_CALL_LOG);
        System.out.println("Retrieved call from: " + retrieved.getCallerNumber());
        
        // Get all calls
        List<PhoneCallLog> allCalls = storage.getAll(TelecomEntityTypeSet.PHONE_CALL_LOG);
        System.out.println("Total calls: " + allCalls.size());
        
        // Check existence
        boolean exists = storage.exists(1L, TelecomEntityTypeSet.PHONE_CALL_LOG);
        System.out.println("Call 1 exists: " + exists);
        
        // Remove a call
        storage.remove(2L, TelecomEntityTypeSet.PHONE_CALL_LOG);
        
        // Get storage stats
        System.out.println("Storage size: " + storage.size());
        System.out.println("Phone calls count: " + storage.size(TelecomEntityTypeSet.PHONE_CALL_LOG));
    }
}