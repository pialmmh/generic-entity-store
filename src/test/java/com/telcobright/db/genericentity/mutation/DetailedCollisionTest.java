package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Detailed test showing PackageAccount and PackageAccountReserve
 * with same IDs working correctly without collisions
 */
public class DetailedCollisionTest {
    
    // Entity set combining both types
    enum PackageEntityTypeSet implements IEntityTypeSet {
        PACKAGE_ACCOUNT(1),
        PACKAGE_RESERVE(2);
        
        private final int typeId;
        
        PackageEntityTypeSet(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    // Simplified PackageAccount
    public static class PackageAccount {
        private Long id;
        private String phone;
        private BigDecimal balance;
        private String status;
        
        public PackageAccount() {}
        public PackageAccount(Long id, String phone, BigDecimal balance, String status) {
            this.id = id;
            this.phone = phone;
            this.balance = balance;
            this.status = status;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
        public BigDecimal getBalance() { return balance; }
        public void setBalance(BigDecimal balance) { this.balance = balance; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        
        @Override
        public String toString() {
            return String.format("Account{id=%d, phone='%s', balance=%s, status='%s'}", 
                id, phone, balance, status);
        }
    }
    
    // Simplified PackageAccountReserve
    public static class PackageAccountReserve {
        private Long id;
        private Long packageAccountId;
        private String sessionId;
        private BigDecimal reservedAmount;
        private String status;
        
        public PackageAccountReserve() {}
        public PackageAccountReserve(Long id, Long packageAccountId, String sessionId, 
                                    BigDecimal reservedAmount, String status) {
            this.id = id;
            this.packageAccountId = packageAccountId;
            this.sessionId = sessionId;
            this.reservedAmount = reservedAmount;
            this.status = status;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public Long getPackageAccountId() { return packageAccountId; }
        public void setPackageAccountId(Long packageAccountId) { this.packageAccountId = packageAccountId; }
        public String getSessionId() { return sessionId; }
        public void setSessionId(String sessionId) { this.sessionId = sessionId; }
        public BigDecimal getReservedAmount() { return reservedAmount; }
        public void setReservedAmount(BigDecimal reservedAmount) { this.reservedAmount = reservedAmount; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        
        @Override
        public String toString() {
            return String.format("Reserve{id=%d, accountId=%d, session='%s', amount=%s, status='%s'}", 
                id, packageAccountId, sessionId, reservedAmount, status);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("    DETAILED TEST: PACKAGEACCOUNT & PACKAGEACCOUNTRESERVE WITH SAME IDs");
        System.out.println("================================================================================\n");
        
        // Create storage
        GenericEntityStorage<PackageEntityTypeSet> storage = GenericEntityStorage.<PackageEntityTypeSet>builder()
            .withEntityTypeSet(PackageEntityTypeSet.class)
            .withMaxRecords(100)
            .withAutoSizing()  // Each gets 50 capacity
            .registerType(PackageEntityTypeSet.PACKAGE_ACCOUNT, PackageAccount.class)
            .registerType(PackageEntityTypeSet.PACKAGE_RESERVE, PackageAccountReserve.class)
            .build();
        
        System.out.println("Storage initialized with auto-sizing (50 capacity each)\n");
        
        // Scenario 1: Multiple accounts and reserves with overlapping IDs
        System.out.println("SCENARIO 1: Creating 10 accounts and 10 reserves with SAME IDs (1-10)");
        System.out.println("------------------------------------------------------------------------");
        
        // Create accounts with IDs 1-10
        for (long id = 1; id <= 10; id++) {
            PackageAccount account = new PackageAccount(
                id,
                "+88017" + String.format("%08d", id),
                new BigDecimal(1000 + id * 100),
                "ACTIVE"
            );
            storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            System.out.println("  Created: " + account);
        }
        
        System.out.println();
        
        // Create reserves with SAME IDs 1-10
        for (long id = 1; id <= 10; id++) {
            PackageAccountReserve reserve = new PackageAccountReserve(
                id,  // Same ID as accounts!
                100L + id,
                "SESSION-" + id,
                new BigDecimal(50 + id * 10),
                "RESERVED"
            );
            storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
            System.out.println("  Created: " + reserve);
        }
        
        // Verify all are stored correctly
        System.out.println("\nVERIFYING: All entities maintain their identity despite same IDs");
        System.out.println("------------------------------------------------------------------");
        
        boolean allCorrect = true;
        for (long id = 1; id <= 10; id++) {
            PackageAccount account = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            PackageAccountReserve reserve = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            // Verify account
            String expectedPhone = "+88017" + String.format("%08d", id);
            BigDecimal expectedBalance = new BigDecimal(1000 + id * 100);
            
            if (account != null && account.getPhone().equals(expectedPhone) && 
                account.getBalance().compareTo(expectedBalance) == 0) {
                System.out.printf("  ✓ Account ID=%d: Correct (phone=%s, balance=%s)\n", 
                    id, account.getPhone(), account.getBalance());
            } else {
                System.err.printf("  ✗ Account ID=%d: FAILED\n", id);
                allCorrect = false;
            }
            
            // Verify reserve
            String expectedSession = "SESSION-" + id;
            BigDecimal expectedReserve = new BigDecimal(50 + id * 10);
            
            if (reserve != null && reserve.getSessionId().equals(expectedSession) && 
                reserve.getReservedAmount().compareTo(expectedReserve) == 0) {
                System.out.printf("  ✓ Reserve ID=%d: Correct (session=%s, amount=%s)\n", 
                    id, reserve.getSessionId(), reserve.getReservedAmount());
            } else {
                System.err.printf("  ✗ Reserve ID=%d: FAILED\n", id);
                allCorrect = false;
            }
        }
        
        // Scenario 2: Updates don't affect wrong type
        System.out.println("\nSCENARIO 2: Updating Account ID=5 should NOT affect Reserve ID=5");
        System.out.println("------------------------------------------------------------------");
        
        PackageAccount accountToUpdate = storage.get(5L, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        PackageAccountReserve reserveBefore = storage.get(5L, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        System.out.println("Before update:");
        System.out.println("  Account: " + accountToUpdate);
        System.out.println("  Reserve: " + reserveBefore);
        
        // Update account
        accountToUpdate.setBalance(new BigDecimal("99999.99"));
        accountToUpdate.setStatus("PREMIUM");
        storage.put(accountToUpdate, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        
        // Check both after update
        PackageAccount accountAfter = storage.get(5L, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        PackageAccountReserve reserveAfter = storage.get(5L, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        System.out.println("\nAfter updating account:");
        System.out.println("  Account: " + accountAfter);
        System.out.println("  Reserve: " + reserveAfter);
        
        if (accountAfter.getBalance().compareTo(new BigDecimal("99999.99")) == 0 &&
            reserveAfter.getReservedAmount().compareTo(new BigDecimal(100)) == 0) {
            System.out.println("\n  ✓ Update successful: Account changed, Reserve unchanged");
        } else {
            System.err.println("\n  ✗ Update failed: Unexpected changes");
            allCorrect = false;
        }
        
        // Scenario 3: Removal is type-specific
        System.out.println("\nSCENARIO 3: Removing Reserve ID=7 should NOT affect Account ID=7");
        System.out.println("------------------------------------------------------------------");
        
        PackageAccount accountBefore = storage.get(7L, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        System.out.println("Before removal:");
        System.out.println("  Account ID=7: " + accountBefore);
        System.out.println("  Reserve ID=7: " + storage.get(7L, PackageEntityTypeSet.PACKAGE_RESERVE));
        
        // Remove only the reserve
        storage.remove(7L, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        PackageAccount accountAfterRemoval = storage.get(7L, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        PackageAccountReserve reserveAfterRemoval = storage.get(7L, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        System.out.println("\nAfter removing reserve:");
        System.out.println("  Account ID=7: " + accountAfterRemoval);
        System.out.println("  Reserve ID=7: " + reserveAfterRemoval);
        
        if (accountAfterRemoval != null && reserveAfterRemoval == null) {
            System.out.println("\n  ✓ Removal successful: Reserve removed, Account intact");
        } else {
            System.err.println("\n  ✗ Removal failed: Unexpected state");
            allCorrect = false;
        }
        
        // Final statistics
        System.out.println("\n================================================================================");
        System.out.println("                              STORAGE STATISTICS");
        System.out.println("================================================================================");
        
        System.out.println("Total entities: " + storage.size());
        System.out.println("PackageAccounts: " + storage.size(PackageEntityTypeSet.PACKAGE_ACCOUNT));
        System.out.println("PackageReserves: " + storage.size(PackageEntityTypeSet.PACKAGE_RESERVE));
        
        System.out.println("\n" + storage.getCapacityInfo(PackageEntityTypeSet.PACKAGE_ACCOUNT));
        System.out.println(storage.getCapacityInfo(PackageEntityTypeSet.PACKAGE_RESERVE));
        
        System.out.println("\n================================================================================");
        if (allCorrect) {
            System.out.println("✅ SUCCESS: PackageAccount and PackageAccountReserve coexist perfectly!");
            System.out.println("   - Same IDs cause no collisions");
            System.out.println("   - Updates are type-specific");
            System.out.println("   - Removals don't affect other types");
            System.out.println("   - Proxy ID system working flawlessly");
        } else {
            System.err.println("❌ FAILURE: Some tests failed!");
        }
        System.out.println("================================================================================");
    }
}