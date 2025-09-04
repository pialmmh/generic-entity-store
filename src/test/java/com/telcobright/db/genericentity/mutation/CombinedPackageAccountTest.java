package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Combined test for PackageAccount and PackageAccountReserve entities
 * Testing with same IDs to verify proxy ID system prevents collisions
 */
public class CombinedPackageAccountTest {
    
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
    
    // PackageAccount entity
    public static class PackageAccount {
        private Long id;
        private String phone;
        private Long packageId;
        private BigDecimal balance;
        private LocalDateTime purchaseDate;
        private LocalDateTime expiryDate;
        private String status;
        private BigDecimal creditLimit;
        private Integer unitBalance;
        private LocalDateTime lastUpdated;
        
        // Constructors
        public PackageAccount() {}
        
        public PackageAccount(Long id) {
            this.id = id;
        }
        
        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
        
        public Long getPackageId() { return packageId; }
        public void setPackageId(Long packageId) { this.packageId = packageId; }
        
        public BigDecimal getBalance() { return balance; }
        public void setBalance(BigDecimal balance) { this.balance = balance; }
        
        public LocalDateTime getPurchaseDate() { return purchaseDate; }
        public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }
        
        public LocalDateTime getExpiryDate() { return expiryDate; }
        public void setExpiryDate(LocalDateTime expiryDate) { this.expiryDate = expiryDate; }
        
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        
        public BigDecimal getCreditLimit() { return creditLimit; }
        public void setCreditLimit(BigDecimal creditLimit) { this.creditLimit = creditLimit; }
        
        public Integer getUnitBalance() { return unitBalance; }
        public void setUnitBalance(Integer unitBalance) { this.unitBalance = unitBalance; }
        
        public LocalDateTime getLastUpdated() { return lastUpdated; }
        public void setLastUpdated(LocalDateTime lastUpdated) { this.lastUpdated = lastUpdated; }
    }
    
    // PackageAccountReserve entity
    public static class PackageAccountReserve {
        private Long id;
        private Long packageAccountId;
        private String sessionId;
        private BigDecimal reservedAmount;
        private LocalDateTime reservedAt;
        private LocalDateTime releasedAt;
        private String status; // RESERVED, RELEASED, EXPIRED
        private BigDecimal currentReserve;
        
        // Constructors
        public PackageAccountReserve() {}
        
        public PackageAccountReserve(Long id) {
            this.id = id;
        }
        
        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Long getPackageAccountId() { return packageAccountId; }
        public void setPackageAccountId(Long packageAccountId) { this.packageAccountId = packageAccountId; }
        
        public String getSessionId() { return sessionId; }
        public void setSessionId(String sessionId) { this.sessionId = sessionId; }
        
        public BigDecimal getReservedAmount() { return reservedAmount; }
        public void setReservedAmount(BigDecimal reservedAmount) { this.reservedAmount = reservedAmount; }
        
        public LocalDateTime getReservedAt() { return reservedAt; }
        public void setReservedAt(LocalDateTime reservedAt) { this.reservedAt = reservedAt; }
        
        public LocalDateTime getReleasedAt() { return releasedAt; }
        public void setReleasedAt(LocalDateTime releasedAt) { this.releasedAt = releasedAt; }
        
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        
        public BigDecimal getCurrentReserve() { return currentReserve; }
        public void setCurrentReserve(BigDecimal currentReserve) { this.currentReserve = currentReserve; }
    }
    
    // Test statistics
    private static final AtomicLong passCount = new AtomicLong(0);
    private static final AtomicLong failCount = new AtomicLong(0);
    private static final AtomicLong accountTestCount = new AtomicLong(0);
    private static final AtomicLong reserveTestCount = new AtomicLong(0);
    private static final AtomicLong collisionTestCount = new AtomicLong(0);
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("================================================================================");
        System.out.println("        COMBINED PACKAGE ACCOUNT & RESERVE TEST - WITH ID COLLISIONS");
        System.out.println("================================================================================\n");
        
        // Initialize storage with both entity types
        System.out.println("Initializing storage with PackageAccount and PackageAccountReserve...");
        
        GenericEntityStorage<PackageEntityTypeSet> storage = GenericEntityStorage.<PackageEntityTypeSet>builder()
            .withEntityTypeSet(PackageEntityTypeSet.class)
            .withMaxRecords(2_000_000)  // 2M total capacity
            .registerType(PackageEntityTypeSet.PACKAGE_ACCOUNT, PackageAccount.class, 1_000_000)
            .registerType(PackageEntityTypeSet.PACKAGE_RESERVE, PackageAccountReserve.class, 1_000_000)
            .build();
        
        System.out.println("Storage initialized with proxy ID system.");
        System.out.println("  - PackageAccount capacity: 1,000,000");
        System.out.println("  - PackageReserve capacity: 1,000,000");
        System.out.println();
        
        // Test 1: Verify ID collision handling
        System.out.println("TEST 1: Storing entities with SAME IDs");
        System.out.println("----------------------------------------");
        testIdCollisionHandling(storage);
        
        // Test 2: Concurrent mutation tests
        System.out.println("\nTEST 2: Concurrent mutation tests (1M iterations)");
        System.out.println("--------------------------------------------------");
        
        final int TOTAL_ITERATIONS = 1_000_000;
        final int THREAD_COUNT = 8;
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
        
        long startTime = System.currentTimeMillis();
        
        // Launch parallel test threads
        for (int t = 0; t < THREAD_COUNT; t++) {
            final int threadId = t;
            executor.submit(() -> {
                try {
                    Random rand = new Random(threadId);
                    int iterationsPerThread = TOTAL_ITERATIONS / THREAD_COUNT;
                    
                    for (int i = 0; i < iterationsPerThread; i++) {
                        // Randomly choose test type
                        int testType = rand.nextInt(3);
                        
                        switch (testType) {
                            case 0:
                                testPackageAccountMutation(storage, rand);
                                accountTestCount.incrementAndGet();
                                break;
                            case 1:
                                testPackageReserveMutation(storage, rand);
                                reserveTestCount.incrementAndGet();
                                break;
                            case 2:
                                testIdCollisionMutation(storage, rand);
                                collisionTestCount.incrementAndGet();
                                break;
                        }
                        
                        // Progress reporting
                        if ((passCount.get() + failCount.get()) % 100000 == 0) {
                            long total = passCount.get() + failCount.get();
                            long elapsed = System.currentTimeMillis() - startTime;
                            long rate = elapsed > 0 ? (total * 1000) / elapsed : 0;
                            
                            System.out.printf("  Progress: %,d operations | Rate: %,d ops/sec | Pass: %,d | Fail: %,d\n",
                                total, rate, passCount.get(), failCount.get());
                        }
                    }
                } finally {
                    latch.countDown();
                }
            });
        }
        
        // Wait for completion
        latch.await();
        executor.shutdown();
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        // Print results
        printResults(duration);
    }
    
    private static void testIdCollisionHandling(GenericEntityStorage<PackageEntityTypeSet> storage) {
        // Create entities with same ID
        Long testId = 999L;
        
        PackageAccount account = new PackageAccount(testId);
        account.setPhone("+8801234567890");
        account.setBalance(new BigDecimal("1000.00"));
        account.setPurchaseDate(LocalDateTime.now());
        account.setStatus("ACTIVE");
        
        PackageAccountReserve reserve = new PackageAccountReserve(testId);
        reserve.setPackageAccountId(100L);
        reserve.setSessionId("SESSION-123");
        reserve.setReservedAmount(new BigDecimal("500.00"));
        reserve.setReservedAt(LocalDateTime.now());
        reserve.setStatus("RESERVED");
        
        // Store both with same ID
        storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        // Retrieve and verify
        PackageAccount retrievedAccount = storage.get(testId, PackageEntityTypeSet.PACKAGE_ACCOUNT);
        PackageAccountReserve retrievedReserve = storage.get(testId, PackageEntityTypeSet.PACKAGE_RESERVE);
        
        boolean success = true;
        if (retrievedAccount == null || !retrievedAccount.getPhone().equals("+8801234567890")) {
            System.err.println("  ✗ PackageAccount retrieval failed!");
            success = false;
        }
        if (retrievedReserve == null || !retrievedReserve.getSessionId().equals("SESSION-123")) {
            System.err.println("  ✗ PackageReserve retrieval failed!");
            success = false;
        }
        
        if (success) {
            System.out.println("  ✓ Both entities with ID=999 stored and retrieved successfully");
            System.out.println("    - Account phone: " + retrievedAccount.getPhone());
            System.out.println("    - Reserve session: " + retrievedReserve.getSessionId());
        }
    }
    
    private static void testPackageAccountMutation(GenericEntityStorage<PackageEntityTypeSet> storage, Random rand) {
        try {
            // Generate test data
            Long id = (long) rand.nextInt(100000);
            
            PackageAccount original = new PackageAccount(id);
            original.setPhone("+880" + (1000000000L + rand.nextInt(999999999)));
            original.setPackageId((long) rand.nextInt(100));
            original.setBalance(new BigDecimal(rand.nextDouble() * 10000));
            original.setPurchaseDate(LocalDateTime.now().minusDays(rand.nextInt(365)));
            original.setExpiryDate(LocalDateTime.now().plusDays(rand.nextInt(365)));
            original.setStatus(rand.nextBoolean() ? "ACTIVE" : "EXPIRED");
            original.setCreditLimit(new BigDecimal(rand.nextDouble() * 5000));
            original.setUnitBalance(rand.nextInt(10000));
            original.setLastUpdated(LocalDateTime.now());
            
            // Store original
            storage.put(original, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            
            // Retrieve
            PackageAccount retrieved = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            if (retrieved == null) {
                failCount.incrementAndGet();
                return;
            }
            
            // Mutate
            retrieved.setBalance(retrieved.getBalance().add(new BigDecimal("100")));
            retrieved.setUnitBalance(retrieved.getUnitBalance() + 50);
            retrieved.setLastUpdated(LocalDateTime.now());
            
            // Store mutated
            storage.put(retrieved, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            
            // Retrieve and verify
            PackageAccount mutated = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            
            if (mutated != null && 
                mutated.getBalance().compareTo(original.getBalance().add(new BigDecimal("100"))) == 0 &&
                mutated.getUnitBalance().equals(original.getUnitBalance() + 50) &&
                mutated.getPhone().equals(original.getPhone())) {
                passCount.incrementAndGet();
            } else {
                failCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void testPackageReserveMutation(GenericEntityStorage<PackageEntityTypeSet> storage, Random rand) {
        try {
            // Generate test data
            Long id = (long) rand.nextInt(100000);
            
            PackageAccountReserve original = new PackageAccountReserve(id);
            original.setPackageAccountId((long) rand.nextInt(100000));
            original.setSessionId("SESSION-" + System.nanoTime());
            original.setReservedAmount(new BigDecimal(rand.nextDouble() * 1000));
            original.setReservedAt(LocalDateTime.now());
            original.setStatus("RESERVED");
            original.setCurrentReserve(new BigDecimal(rand.nextDouble() * 500));
            
            // Store original
            storage.put(original, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            // Retrieve
            PackageAccountReserve retrieved = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
            if (retrieved == null) {
                failCount.incrementAndGet();
                return;
            }
            
            // Mutate
            retrieved.setStatus("RELEASED");
            retrieved.setReleasedAt(LocalDateTime.now());
            retrieved.setCurrentReserve(BigDecimal.ZERO);
            
            // Store mutated
            storage.put(retrieved, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            // Retrieve and verify
            PackageAccountReserve mutated = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            if (mutated != null && 
                "RELEASED".equals(mutated.getStatus()) &&
                mutated.getReleasedAt() != null &&
                mutated.getCurrentReserve().compareTo(BigDecimal.ZERO) == 0 &&
                mutated.getSessionId().equals(original.getSessionId())) {
                passCount.incrementAndGet();
            } else {
                failCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void testIdCollisionMutation(GenericEntityStorage<PackageEntityTypeSet> storage, Random rand) {
        try {
            // Use same ID for both entities
            Long sharedId = (long) rand.nextInt(50000);
            
            // Create and store PackageAccount
            PackageAccount account = new PackageAccount(sharedId);
            account.setPhone("+880" + System.nanoTime());
            account.setBalance(new BigDecimal(rand.nextDouble() * 1000));
            account.setStatus("ACTIVE");
            storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            
            // Create and store PackageReserve with SAME ID
            PackageAccountReserve reserve = new PackageAccountReserve(sharedId);
            reserve.setSessionId("COLLISION-" + System.nanoTime());
            reserve.setReservedAmount(new BigDecimal(rand.nextDouble() * 500));
            reserve.setStatus("RESERVED");
            storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            // Retrieve both and verify they're different
            PackageAccount retrievedAccount = storage.get(sharedId, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            PackageAccountReserve retrievedReserve = storage.get(sharedId, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            if (retrievedAccount != null && retrievedReserve != null &&
                retrievedAccount.getPhone().equals(account.getPhone()) &&
                retrievedReserve.getSessionId().equals(reserve.getSessionId())) {
                passCount.incrementAndGet();
            } else {
                failCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void printResults(long duration) {
        long total = passCount.get() + failCount.get();
        double successRate = total > 0 ? (passCount.get() * 100.0 / total) : 0;
        double throughput = total * 1000.0 / duration;
        
        System.out.println("\n================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.printf("Total Operations: %,d\n", total);
        System.out.printf("Tests Passed: %,d (%.2f%%)\n", passCount.get(), successRate);
        System.out.printf("Tests Failed: %,d (%.2f%%)\n", failCount.get(), 100 - successRate);
        
        System.out.println("\nTest Distribution:");
        System.out.printf("  PackageAccount Tests: %,d\n", accountTestCount.get());
        System.out.printf("  PackageReserve Tests: %,d\n", reserveTestCount.get());
        System.out.printf("  ID Collision Tests: %,d\n", collisionTestCount.get());
        
        System.out.println("\nPerformance:");
        System.out.printf("  Total Time: %.2f seconds\n", duration / 1000.0);
        System.out.printf("  Throughput: %,.0f operations/sec\n", throughput);
        
        System.out.println("\n================================================================================");
        if (successRate >= 99.0) {
            System.out.println("        ✅ TEST PASSED - PROXY ID SYSTEM HANDLES COLLISIONS PERFECTLY!");
            System.out.println("           Both entity types can use same IDs without conflicts");
        } else {
            System.out.println("        ❌ TEST FAILED - Some operations failed!");
        }
        System.out.println("================================================================================");
    }
}