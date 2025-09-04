package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Mutation Test for PackageAccount and PackageAccountReserve entities
 * 
 * Test Pattern (1 million iterations):
 * 1. PUT - Store original entity
 * 2. GET - Retrieve stored entity 
 * 3. MUTATE - Apply mutations to retrieved entity
 * 4. PUT - Store mutated entity
 * 5. GET - Retrieve mutated entity
 * 6. COMPARE - Verify mutations against original pre-mutation values
 * 7. PASS/FAIL - Record result
 * 
 * This ensures data integrity through the complete storage lifecycle.
 */
public class PackageAccountMutationTest {
    
    // Simplified PackageAccount class
    public static class PackageAccount {
        private Long id;
        private Long packagePurchaseId;
        private String name;
        private BigDecimal lastAmount;
        private BigDecimal balanceBefore;
        private BigDecimal balanceAfter;
        private String uom;
        private Boolean isSelected;

        public PackageAccount() {}

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Long getPackagePurchaseId() { return packagePurchaseId; }
        public void setPackagePurchaseId(Long packagePurchaseId) { this.packagePurchaseId = packagePurchaseId; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public BigDecimal getLastAmount() { return lastAmount; }
        public void setLastAmount(BigDecimal lastAmount) { this.lastAmount = lastAmount; }
        
        public BigDecimal getBalanceBefore() { return balanceBefore; }
        public void setBalanceBefore(BigDecimal balanceBefore) { this.balanceBefore = balanceBefore; }
        
        public BigDecimal getBalanceAfter() { return balanceAfter; }
        public void setBalanceAfter(BigDecimal balanceAfter) { this.balanceAfter = balanceAfter; }
        
        public String getUom() { return uom; }
        public void setUom(String uom) { this.uom = uom; }
        
        public Boolean getIsSelected() { return isSelected; }
        public void setIsSelected(Boolean isSelected) { this.isSelected = isSelected; }
        
        public void applyMutation(BigDecimal delta, String suffix) {
            if (lastAmount != null) {
                this.lastAmount = this.lastAmount.add(delta);
            }
            if (balanceBefore != null) {
                this.balanceBefore = this.balanceBefore.add(delta.multiply(new BigDecimal("2")));
            }
            if (balanceAfter != null) {
                this.balanceAfter = this.balanceAfter.add(delta.multiply(new BigDecimal("3")));
            }
            if (name != null) {
                this.name = this.name + suffix;
            }
            if (uom != null) {
                this.uom = this.uom + suffix;
            }
            this.isSelected = !this.isSelected;
            this.packagePurchaseId = this.packagePurchaseId + 1;
        }
        
        public boolean verifyMutation(PackageAccount original, BigDecimal delta, String suffix) {
            boolean valid = true;
            
            if (original.lastAmount != null) {
                BigDecimal expected = original.lastAmount.add(delta);
                if (this.lastAmount.compareTo(expected) != 0) {
                    System.err.println("lastAmount mismatch: expected " + expected + ", got " + this.lastAmount);
                    valid = false;
                }
            }
            
            if (original.balanceBefore != null) {
                BigDecimal expected = original.balanceBefore.add(delta.multiply(new BigDecimal("2")));
                if (this.balanceBefore.compareTo(expected) != 0) {
                    System.err.println("balanceBefore mismatch: expected " + expected + ", got " + this.balanceBefore);
                    valid = false;
                }
            }
            
            if (original.balanceAfter != null) {
                BigDecimal expected = original.balanceAfter.add(delta.multiply(new BigDecimal("3")));
                if (this.balanceAfter.compareTo(expected) != 0) {
                    System.err.println("balanceAfter mismatch: expected " + expected + ", got " + this.balanceAfter);
                    valid = false;
                }
            }
            
            if (original.name != null) {
                String expected = original.name + suffix;
                if (!this.name.equals(expected)) {
                    System.err.println("name mismatch: expected " + expected + ", got " + this.name);
                    valid = false;
                }
            }
            
            if (original.uom != null) {
                String expected = original.uom + suffix;
                if (!this.uom.equals(expected)) {
                    System.err.println("uom mismatch: expected " + expected + ", got " + this.uom);
                    valid = false;
                }
            }
            
            if (this.isSelected == original.isSelected) {
                System.err.println("isSelected not toggled: expected " + !original.isSelected + ", got " + this.isSelected);
                valid = false;
            }
            
            if (this.packagePurchaseId != original.packagePurchaseId + 1) {
                System.err.println("packagePurchaseId mismatch: expected " + (original.packagePurchaseId + 1) + ", got " + this.packagePurchaseId);
                valid = false;
            }
            
            return valid;
        }
        
        public PackageAccount copy() {
            PackageAccount copy = new PackageAccount();
            copy.id = this.id;
            copy.packagePurchaseId = this.packagePurchaseId;
            copy.name = this.name;
            copy.lastAmount = this.lastAmount;
            copy.balanceBefore = this.balanceBefore;
            copy.balanceAfter = this.balanceAfter;
            copy.uom = this.uom;
            copy.isSelected = this.isSelected;
            return copy;
        }
    }
    
    // Simplified PackageAccountReserve class
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
        
        public void applyMutation(BigDecimal delta, int hours, String suffix) {
            if (reservedAmount != null) {
                this.reservedAmount = this.reservedAmount.add(delta);
            }
            if (currentReserve != null) {
                this.currentReserve = this.currentReserve.add(delta.multiply(new BigDecimal("2")));
            }
            if (reservedAt != null) {
                this.reservedAt = this.reservedAt.plusHours(hours);
            }
            if (releasedAt != null) {
                this.releasedAt = this.releasedAt.plusHours(hours * 2);
            }
            if (sessionId != null) {
                this.sessionId = this.sessionId + suffix;
            }
            if (status != null) {
                this.status = this.status + suffix;
            }
            this.packageAccountId = this.packageAccountId + 1;
        }
        
        public boolean verifyMutation(PackageAccountReserve original, BigDecimal delta, int hours, String suffix) {
            boolean valid = true;
            
            if (original.reservedAmount != null) {
                BigDecimal expected = original.reservedAmount.add(delta);
                if (this.reservedAmount.compareTo(expected) != 0) {
                    System.err.println("reservedAmount mismatch: expected " + expected + ", got " + this.reservedAmount);
                    valid = false;
                }
            }
            
            if (original.currentReserve != null) {
                BigDecimal expected = original.currentReserve.add(delta.multiply(new BigDecimal("2")));
                if (this.currentReserve.compareTo(expected) != 0) {
                    System.err.println("currentReserve mismatch: expected " + expected + ", got " + this.currentReserve);
                    valid = false;
                }
            }
            
            if (original.reservedAt != null) {
                LocalDateTime expected = original.reservedAt.plusHours(hours);
                if (!this.reservedAt.equals(expected)) {
                    System.err.println("reservedAt mismatch: expected " + expected + ", got " + this.reservedAt);
                    valid = false;
                }
            }
            
            if (original.releasedAt != null) {
                LocalDateTime expected = original.releasedAt.plusHours(hours * 2);
                if (!this.releasedAt.equals(expected)) {
                    System.err.println("releasedAt mismatch: expected " + expected + ", got " + this.releasedAt);
                    valid = false;
                }
            }
            
            if (original.sessionId != null) {
                String expected = original.sessionId + suffix;
                if (!this.sessionId.equals(expected)) {
                    System.err.println("sessionId mismatch: expected " + expected + ", got " + this.sessionId);
                    valid = false;
                }
            }
            
            if (original.status != null) {
                String expected = original.status + suffix;
                if (!this.status.equals(expected)) {
                    System.err.println("status mismatch: expected " + expected + ", got " + this.status);
                    valid = false;
                }
            }
            
            if (this.packageAccountId != original.packageAccountId + 1) {
                System.err.println("packageAccountId mismatch: expected " + (original.packageAccountId + 1) + ", got " + this.packageAccountId);
                valid = false;
            }
            
            return valid;
        }
        
        public PackageAccountReserve copy() {
            PackageAccountReserve copy = new PackageAccountReserve();
            copy.id = this.id;
            copy.packageAccountId = this.packageAccountId;
            copy.sessionId = this.sessionId;
            copy.reservedAmount = this.reservedAmount;
            copy.reservedAt = this.reservedAt;
            copy.releasedAt = this.releasedAt;
            copy.status = this.status;
            copy.currentReserve = this.currentReserve;
            return copy;
        }
    }
    
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
    
    private static final int ITERATIONS = 1_000_000;
    private static final int MAX_ENTITIES = 500_000;
    private static final int NUM_THREADS = 4;
    
    private static final AtomicLong idGenerator = new AtomicLong(1);
    private static final AtomicInteger successCount = new AtomicInteger(0);
    private static final AtomicInteger failCount = new AtomicInteger(0);
    
    private static GenericEntityStorage<PackageEntityTypeSet> storage;
    private static Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("           PACKAGE ACCOUNT MUTATION TEST - 1 MILLION ITERATIONS");
        System.out.println("================================================================================\n");
        
        initializeStorage();
        
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        CountDownLatch latch = new CountDownLatch(NUM_THREADS);
        
        long startTime = System.currentTimeMillis();
        
        // Launch parallel test threads
        for (int t = 0; t < NUM_THREADS; t++) {
            final int threadId = t;
            executor.submit(() -> {
                try {
                    if (threadId < 2) {
                        performPackageAccountTest(threadId);
                    } else {
                        performPackageReserveTest(threadId);
                    }
                } catch (Exception e) {
                    System.err.println("Thread " + threadId + " failed: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });
        }
        
        // Progress monitoring
        new Thread(() -> {
            while (latch.getCount() > 0) {
                int total = successCount.get() + failCount.get();
                if (total > 0 && total % 100000 == 0) {
                    long elapsed = System.currentTimeMillis() - startTime;
                    double rate = total * 1000.0 / elapsed;
                    System.out.printf("  Progress: %,d operations | Rate: %,.0f ops/sec | Pass: %,d | Fail: %,d%n",
                            total, rate, successCount.get(), failCount.get());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }).start();
        
        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        executor.shutdown();
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        printResults(duration);
    }
    
    private static void initializeStorage() {
        System.out.println("Initializing storage with object pooling...\n");
        storage = GenericEntityStorage.<PackageEntityTypeSet>builder()
                .withEntityTypeSet(PackageEntityTypeSet.class)
                .withMaxRecords(1000000)
                .registerType(PackageEntityTypeSet.PACKAGE_ACCOUNT, PackageAccount.class, MAX_ENTITIES)
                .registerType(PackageEntityTypeSet.PACKAGE_RESERVE, PackageAccountReserve.class, MAX_ENTITIES)
                .build();
        System.out.println("Storage initialized. Starting mutation tests...\n");
    }
    
    private static void performPackageAccountTest(int threadId) {
        Random rand = new Random(threadId);
        int iterations = ITERATIONS / NUM_THREADS;
        
        for (int i = 0; i < iterations; i++) {
            try {
                // Step 1: Create initial entity
                PackageAccount original = new PackageAccount();
                long id = idGenerator.getAndIncrement();
                original.setId(id);
                original.setPackagePurchaseId(rand.nextLong(1000000));
                original.setName("Account_" + id);
                original.setLastAmount(new BigDecimal(rand.nextDouble() * 10000).setScale(2, RoundingMode.HALF_UP));
                original.setBalanceBefore(new BigDecimal(rand.nextDouble() * 50000).setScale(2, RoundingMode.HALF_UP));
                original.setBalanceAfter(new BigDecimal(rand.nextDouble() * 50000).setScale(2, RoundingMode.HALF_UP));
                original.setUom(rand.nextBoolean() ? "MB" : "MIN");
                original.setIsSelected(rand.nextBoolean());
                
                // Step 2: PUT - Store original
                storage.put(original, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                
                // Step 3: GET - Retrieve stored entity
                PackageAccount retrieved1 = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                if (retrieved1 == null) {
                    failCount.incrementAndGet();
                    continue;
                }
                
                // Save original values before mutation
                PackageAccount origCopy = retrieved1.copy();
                
                // Step 4: MUTATE - Apply mutations to retrieved entity
                BigDecimal delta = new BigDecimal(rand.nextDouble() * 100).setScale(2, RoundingMode.HALF_UP);
                String suffix = "_M" + i;
                retrieved1.applyMutation(delta, suffix);
                
                // Step 5: PUT - Store mutated version
                storage.put(retrieved1, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                
                // Step 6: GET - Retrieve mutated entity
                PackageAccount retrieved2 = storage.get(id, PackageEntityTypeSet.PACKAGE_ACCOUNT);
                
                // Step 7: COMPARE - Verify mutations were preserved
                if (retrieved2 != null && retrieved2.verifyMutation(origCopy, delta, suffix)) {
                    successCount.incrementAndGet();
                } else {
                    failCount.incrementAndGet();
                    if (failCount.get() < 5) {
                        System.err.println("Verification failed for ID: " + id);
                    }
                }
                
            } catch (Exception e) {
                failCount.incrementAndGet();
                if (failCount.get() < 10) {
                    System.err.println("PackageAccount test failed: " + e.getMessage());
                }
            }
        }
    }
    
    private static void performPackageReserveTest(int threadId) {
        Random rand = new Random(threadId * 1000);
        int iterations = ITERATIONS / NUM_THREADS;
        
        for (int i = 0; i < iterations; i++) {
            try {
                // Step 1: Create initial entity
                PackageAccountReserve original = new PackageAccountReserve();
                long id = idGenerator.getAndIncrement();
                original.setId(id);
                original.setPackageAccountId(rand.nextLong(1000000));
                original.setSessionId("Session_" + id);
                original.setReservedAmount(new BigDecimal(rand.nextDouble() * 5000).setScale(2, RoundingMode.HALF_UP));
                original.setReservedAt(LocalDateTime.now().plusDays(rand.nextInt(30)));
                original.setReleasedAt(LocalDateTime.now().plusDays(rand.nextInt(60)));
                original.setStatus(rand.nextBoolean() ? "RESERVED" : "RELEASED");
                original.setCurrentReserve(new BigDecimal(rand.nextDouble() * 3000).setScale(2, RoundingMode.HALF_UP));
                
                // Step 2: PUT - Store original
                storage.put(original, PackageEntityTypeSet.PACKAGE_RESERVE);
                
                // Step 3: GET - Retrieve stored entity
                PackageAccountReserve retrieved1 = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
                if (retrieved1 == null) {
                    failCount.incrementAndGet();
                    continue;
                }
                
                // Save original values before mutation
                PackageAccountReserve origCopy = retrieved1.copy();
                
                // Step 4: MUTATE - Apply mutations to retrieved entity
                BigDecimal delta = new BigDecimal(rand.nextDouble() * 100).setScale(2, RoundingMode.HALF_UP);
                int hours = rand.nextInt(24) + 1;
                String suffix = "_M" + i;
                retrieved1.applyMutation(delta, hours, suffix);
                
                // Step 5: PUT - Store mutated version
                storage.put(retrieved1, PackageEntityTypeSet.PACKAGE_RESERVE);
                
                // Step 6: GET - Retrieve mutated entity
                PackageAccountReserve retrieved2 = storage.get(id, PackageEntityTypeSet.PACKAGE_RESERVE);
                
                // Step 7: COMPARE - Verify mutations were preserved
                if (retrieved2 != null && retrieved2.verifyMutation(origCopy, delta, hours, suffix)) {
                    successCount.incrementAndGet();
                } else {
                    failCount.incrementAndGet();
                    if (failCount.get() < 5) {
                        System.err.println("Verification failed for ID: " + id);
                    }
                }
                
            } catch (Exception e) {
                failCount.incrementAndGet();
                if (failCount.get() < 10) {
                    System.err.println("PackageReserve test failed: " + e.getMessage());
                }
            }
        }
    }
    
    private static void printResults(long duration) {
        int total = successCount.get() + failCount.get();
        double successRate = total > 0 ? (successCount.get() * 100.0 / total) : 0;
        double throughput = total * 1000.0 / duration;
        
        System.out.println("\n================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.printf("Total Iterations: %,d%n", total);
        System.out.printf("Tests Passed: %,d (%.2f%%)%n", successCount.get(), successRate);
        System.out.printf("Tests Failed: %,d (%.2f%%)%n", failCount.get(), 100 - successRate);
        
        System.out.println("\nTest Distribution:");
        System.out.println("  PackageAccount Tests: ~" + (ITERATIONS / 2));
        System.out.println("  PackageReserve Tests: ~" + (ITERATIONS / 2));
        
        System.out.println("\nPerformance:");
        System.out.printf("  Total Time: %.2f seconds%n", duration / 1000.0);
        System.out.printf("  Throughput: %,.0f operations/sec%n", throughput);
        
        System.out.println("\n================================================================================");
        if (successRate >= 99.9) {
            System.out.println("                    ✅ TEST PASSED - MUTATIONS PRESERVED!");
        } else {
            System.out.println("                    ❌ TEST FAILED - DATA INTEGRITY ISSUES!");
        }
        System.out.println("================================================================================");
    }
}