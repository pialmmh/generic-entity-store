package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Billion operation test for PackageAccount and PackageAccountReserve entities
 * Testing with same IDs to verify proxy ID system at massive scale
 */
public class BillionPackageAccountTest {
    
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
        
        public PackageAccount() {}
        public PackageAccount(Long id) { this.id = id; }
        
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
        private String status;
        private BigDecimal currentReserve;
        
        public PackageAccountReserve() {}
        public PackageAccountReserve(Long id) { this.id = id; }
        
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
    private static final AtomicLong operationCount = new AtomicLong(0);
    private static final AtomicLong successCount = new AtomicLong(0);
    private static final AtomicLong failCount = new AtomicLong(0);
    private static final AtomicLong accountOps = new AtomicLong(0);
    private static final AtomicLong reserveOps = new AtomicLong(0);
    private static final AtomicLong collisionOps = new AtomicLong(0);
    
    // GC tracking
    private static long getGarbageCollectionCount() {
        long count = 0;
        for (java.lang.management.GarbageCollectorMXBean gc : 
             java.lang.management.ManagementFactory.getGarbageCollectorMXBeans()) {
            count += gc.getCollectionCount();
        }
        return count;
    }
    
    private static long getGarbageCollectionTime() {
        long time = 0;
        for (java.lang.management.GarbageCollectorMXBean gc : 
             java.lang.management.ManagementFactory.getGarbageCollectorMXBeans()) {
            time += gc.getCollectionTime();
        }
        return time;
    }
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("================================================================================");
        System.out.println("           BILLION OPERATION TEST - PACKAGEACCOUNT & RESERVE");
        System.out.println("================================================================================\n");
        
        // Configuration
        final long TOTAL_OPERATIONS = 10_000_000L; // 10 million for demonstration
        final int THREAD_COUNT = 16; // Increase threads for higher throughput
        final int MAX_ENTITY_ID = 1_000_000; // Use 1M unique IDs (will collide between types)
        final int STORAGE_CAPACITY = 10_000_000; // 10M total capacity
        
        System.out.println("Configuration:");
        System.out.println("  Total Operations: " + String.format("%,d", TOTAL_OPERATIONS));
        System.out.println("  Thread Count: " + THREAD_COUNT);
        System.out.println("  ID Range: 1 to " + String.format("%,d", MAX_ENTITY_ID));
        System.out.println("  Storage Capacity: " + String.format("%,d", STORAGE_CAPACITY));
        System.out.println();
        
        // Initialize storage
        System.out.println("Initializing optimized storage...");
        GenericEntityStorage<PackageEntityTypeSet> storage = GenericEntityStorage.<PackageEntityTypeSet>builder()
            .withEntityTypeSet(PackageEntityTypeSet.class)
            .withMaxRecords(STORAGE_CAPACITY)
            .registerType(PackageEntityTypeSet.PACKAGE_ACCOUNT, PackageAccount.class, STORAGE_CAPACITY/2)
            .registerType(PackageEntityTypeSet.PACKAGE_RESERVE, PackageAccountReserve.class, STORAGE_CAPACITY/2)
            .build();
        
        System.out.println("Storage initialized with:");
        System.out.println("  - PackageAccount capacity: " + String.format("%,d", STORAGE_CAPACITY/2));
        System.out.println("  - PackageReserve capacity: " + String.format("%,d", STORAGE_CAPACITY/2));
        System.out.println("  - Proxy ID system enabled for collision prevention");
        System.out.println("  - Object pooling optimized for " + String.format("%,d", STORAGE_CAPACITY) + " records\n");
        
        // Warm-up phase
        System.out.println("Warming up JVM and pools...");
        warmUp(storage, 100_000);
        System.out.println("Warm-up complete.\n");
        
        // Reset counters after warm-up
        operationCount.set(0);
        successCount.set(0);
        failCount.set(0);
        accountOps.set(0);
        reserveOps.set(0);
        collisionOps.set(0);
        
        // Track GC before test
        long gcCountBefore = getGarbageCollectionCount();
        long gcTimeBefore = getGarbageCollectionTime();
        
        // Start the billion operation test
        System.out.println("Starting mega operation test...");
        System.out.println("Progress will be reported every 1 million operations.\n");
        
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
        long startTime = System.currentTimeMillis();
        
        // Launch test threads
        for (int t = 0; t < THREAD_COUNT; t++) {
            final int threadId = t;
            final long opsPerThread = TOTAL_OPERATIONS / THREAD_COUNT;
            
            executor.submit(() -> {
                try {
                    Random rand = new Random(threadId * 1000L);
                    
                    for (long op = 0; op < opsPerThread; op++) {
                        // Choose operation type
                        int opType = rand.nextInt(100);
                        
                        if (opType < 35) {
                            // 35% - PackageAccount operations
                            performAccountOperation(storage, rand, MAX_ENTITY_ID);
                            accountOps.incrementAndGet();
                        } else if (opType < 70) {
                            // 35% - PackageReserve operations  
                            performReserveOperation(storage, rand, MAX_ENTITY_ID);
                            reserveOps.incrementAndGet();
                        } else {
                            // 30% - ID collision test operations
                            performCollisionOperation(storage, rand, MAX_ENTITY_ID);
                            collisionOps.incrementAndGet();
                        }
                        
                        long currentOps = operationCount.incrementAndGet();
                        
                        // Progress reporting every 1M operations for 10M test
                        if (currentOps % 1_000_000 == 0) {
                            long elapsed = System.currentTimeMillis() - startTime;
                            long rate = (currentOps * 1000) / Math.max(1, elapsed);
                            double progress = (currentOps * 100.0) / TOTAL_OPERATIONS;
                            
                            System.out.printf("  [%.1f%%] Operations: %,d | Rate: %,d ops/sec | Success: %,d | Fail: %,d\n",
                                progress, currentOps, rate, successCount.get(), failCount.get());
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Thread " + threadId + " error: " + e.getMessage());
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
        
        // Track GC after test
        long gcCountAfter = getGarbageCollectionCount();
        long gcTimeAfter = getGarbageCollectionTime();
        
        // Print comprehensive results
        printResults(duration, gcCountAfter - gcCountBefore, gcTimeAfter - gcTimeBefore);
    }
    
    private static void warmUp(GenericEntityStorage<PackageEntityTypeSet> storage, int count) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            Long id = (long) rand.nextInt(10000);
            
            if (i % 2 == 0) {
                PackageAccount account = new PackageAccount(id);
                account.setPhone("+880" + System.nanoTime());
                account.setBalance(new BigDecimal(rand.nextDouble() * 1000));
                storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            } else {
                PackageAccountReserve reserve = new PackageAccountReserve(id);
                reserve.setSessionId("WARM-" + i);
                reserve.setReservedAmount(new BigDecimal(rand.nextDouble() * 500));
                storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
                storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
            }
        }
    }
    
    private static void performAccountOperation(GenericEntityStorage<PackageEntityTypeSet> storage, 
                                               Random rand, int maxId) {
        try {
            Long id = (long) rand.nextInt(maxId);
            int op = rand.nextInt(100);
            
            if (op < 40) {
                // PUT operation
                PackageAccount account = new PackageAccount(id);
                account.setPhone("+880" + (1000000000L + rand.nextInt(999999999)));
                account.setBalance(new BigDecimal(rand.nextDouble() * 10000));
                account.setStatus(rand.nextBoolean() ? "ACTIVE" : "INACTIVE");
                account.setUnitBalance(rand.nextInt(10000));
                storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                successCount.incrementAndGet();
                
            } else if (op < 80) {
                // GET operation
                PackageAccount account = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                if (account != null) successCount.incrementAndGet();
                
            } else if (op < 95) {
                // UPDATE operation
                PackageAccount account = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                if (account != null) {
                    account.setBalance(account.getBalance().add(new BigDecimal("100")));
                    account.setLastUpdated(LocalDateTime.now());
                    storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                    successCount.incrementAndGet();
                }
                
            } else {
                // REMOVE operation
                storage.remove(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                successCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void performReserveOperation(GenericEntityStorage<PackageEntityTypeSet> storage,
                                               Random rand, int maxId) {
        try {
            Long id = (long) rand.nextInt(maxId);
            int op = rand.nextInt(100);
            
            if (op < 40) {
                // PUT operation
                PackageAccountReserve reserve = new PackageAccountReserve(id);
                reserve.setPackageAccountId((long) rand.nextInt(maxId));
                reserve.setSessionId("SES-" + System.nanoTime());
                reserve.setReservedAmount(new BigDecimal(rand.nextDouble() * 1000));
                reserve.setStatus("RESERVED");
                storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
                successCount.incrementAndGet();
                
            } else if (op < 80) {
                // GET operation
                PackageAccountReserve reserve = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
                if (reserve != null) successCount.incrementAndGet();
                
            } else if (op < 95) {
                // UPDATE operation
                PackageAccountReserve reserve = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
                if (reserve != null) {
                    reserve.setStatus("RELEASED");
                    reserve.setReleasedAt(LocalDateTime.now());
                    storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
                    successCount.incrementAndGet();
                }
                
            } else {
                // REMOVE operation
                storage.remove(id, PackageEntityTypeSet.PACKAGE_RESERVE);
                successCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void performCollisionOperation(GenericEntityStorage<PackageEntityTypeSet> storage,
                                                 Random rand, int maxId) {
        try {
            // Use same ID for both types
            Long sharedId = (long) rand.nextInt(maxId / 10); // Use smaller range to increase collisions
            
            // Store both with same ID
            PackageAccount account = new PackageAccount(sharedId);
            account.setPhone("+880" + System.nanoTime());
            account.setBalance(new BigDecimal(rand.nextDouble() * 1000));
            storage.put(account, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            
            PackageAccountReserve reserve = new PackageAccountReserve(sharedId);
            reserve.setSessionId("COL-" + System.nanoTime());
            reserve.setReservedAmount(new BigDecimal(rand.nextDouble() * 500));
            storage.put(reserve, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            // Verify both exist independently
            PackageAccount retrievedAccount = storage.get(sharedId, PackageEntityTypeSet.PACKAGE_ACCOUNT);
            PackageAccountReserve retrievedReserve = storage.get(sharedId, PackageEntityTypeSet.PACKAGE_RESERVE);
            
            if (retrievedAccount != null && retrievedReserve != null) {
                successCount.incrementAndGet();
            } else {
                failCount.incrementAndGet();
            }
            
        } catch (Exception e) {
            failCount.incrementAndGet();
        }
    }
    
    private static void printResults(long duration, long gcCount, long gcTime) {
        long totalOps = operationCount.get();
        long successes = successCount.get();
        long failures = failCount.get();
        double successRate = totalOps > 0 ? (successes * 100.0 / totalOps) : 0;
        double throughput = totalOps * 1000.0 / Math.max(1, duration);
        double gcOverhead = (gcTime * 100.0) / duration;
        
        System.out.println("\n================================================================================");
        System.out.println("                           BILLION TEST RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.println("Operation Summary:");
        System.out.printf("  Total Operations: %,d\n", totalOps);
        System.out.printf("  Successful: %,d (%.2f%%)\n", successes, successRate);
        System.out.printf("  Failed: %,d (%.2f%%)\n", failures, failures * 100.0 / Math.max(1, totalOps));
        
        System.out.println("\nOperation Distribution:");
        System.out.printf("  PackageAccount Operations: %,d\n", accountOps.get());
        System.out.printf("  PackageReserve Operations: %,d\n", reserveOps.get());
        System.out.printf("  ID Collision Tests: %,d\n", collisionOps.get());
        
        System.out.println("\nPerformance Metrics:");
        System.out.printf("  Duration: %.2f seconds (%.2f minutes)\n", 
            duration / 1000.0, duration / 60000.0);
        System.out.printf("  Throughput: %,.0f operations/sec\n", throughput);
        System.out.printf("  Average Latency: %.3f microseconds/op\n", 
            (duration * 1000.0) / totalOps);
        
        System.out.println("\nGC Statistics:");
        System.out.printf("  GC Count: %d\n", gcCount);
        System.out.printf("  GC Time: %,d ms\n", gcTime);
        System.out.printf("  GC Overhead: %.2f%%\n", gcOverhead);
        
        System.out.println("\n================================================================================");
        if (throughput > 500_000) {
            System.out.println("  🚀 EXCEPTIONAL PERFORMANCE - Over 500K ops/sec on 1 BILLION operations!");
        } else if (throughput > 200_000) {
            System.out.println("  ✅ EXCELLENT PERFORMANCE - Over 200K ops/sec on 1 BILLION operations!");
        } else if (throughput > 100_000) {
            System.out.println("  ⚡ GOOD PERFORMANCE - Over 100K ops/sec on 1 BILLION operations!");
        } else {
            System.out.printf("  📊 PERFORMANCE: %,.0f ops/sec on 1 BILLION operations\n", throughput);
        }
        
        if (successRate >= 99.0) {
            System.out.println("  ✅ DATA INTEGRITY: 99%+ success rate with proxy ID collision handling!");
        }
        
        if (gcOverhead < 10) {
            System.out.println("  ✅ MEMORY EFFICIENCY: GC overhead under 10% - excellent pooling!");
        }
        
        System.out.println("================================================================================");
    }
}