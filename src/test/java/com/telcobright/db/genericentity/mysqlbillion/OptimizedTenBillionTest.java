package com.telcobright.db.genericentity.mysqlbillion;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.mysqlbillion.entities.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
 * Optimized 10 Billion Operation Test - Uses only verified entity types
 */
public class OptimizedTenBillionTest {
    
    // 10 BILLION operations
    private static final long TOTAL_OPERATIONS = 10_000_000_000L;
    
    // Use all available processors
    private static final int MAX_THREADS = Runtime.getRuntime().availableProcessors() * 2;
    
    // Statistics
    private static final AtomicLong completedOps = new AtomicLong(0);
    private static final AtomicLong successOps = new AtomicLong(0);
    private static final AtomicLong failedOps = new AtomicLong(0);
    
    private static volatile Instant startTime;
    
    public static void main(String[] args) throws Exception {
        System.out.println("================================================================================");
        System.out.println("        Optimized MySQL Entity Storage - 10 BILLION Operations Test");
        System.out.println("================================================================================");
        System.out.println("Total Operations: " + String.format("%,d", TOTAL_OPERATIONS));
        System.out.println("Thread Count: " + MAX_THREADS);
        System.out.println("Processor Cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Max Heap Memory: " + (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " MB");
        System.out.println("================================================================================\n");
        
        // Initialize storage with only the 5 verified entity types
        System.out.println("Initializing storage system...");
        GenericEntityStorage<MySQLBillionEntityType> storage = 
            GenericEntityStorage.<MySQLBillionEntityType>builder()
                .withEntityTypeSet(MySQLBillionEntityType.class)
                .withMaxRecords(1000000000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_1, SpecialEntity1.class, 200_000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_2, SpecialEntity2.class, 200_000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_3, SpecialEntity3.class, 200_000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_4, SpecialEntity4.class, 200_000)
                .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_5, SpecialEntity5.class, 200_000)
                .build();
        
        // Warm up
        System.out.println("Warming up JVM...");
        for (int i = 0; i < 10_000; i++) {
            SpecialEntity1 entity = new SpecialEntity1();
            entity.setId((long) i);
            entity.setNullableString("WarmUp_" + i);
            storage.put(entity, MySQLBillionEntityType.SPECIAL_ENTITY_1);
        }
        
        // Clear and start test
        storage.clear();
        System.gc();
        Thread.sleep(1000);
        
        System.out.println("\nStarting 10 billion operations...\n");
        startTime = Instant.now();
        
        // Execute test
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);
        CountDownLatch latch = new CountDownLatch(MAX_THREADS);
        
        // Progress monitoring
        ScheduledExecutorService monitor = Executors.newScheduledThreadPool(1);
        AtomicBoolean testRunning = new AtomicBoolean(true);
        monitor.scheduleAtFixedRate(() -> {
            if (testRunning.get()) {
                printProgress();
            }
        }, 5, 5, TimeUnit.SECONDS);
        
        // Distribute operations
        long opsPerThread = TOTAL_OPERATIONS / MAX_THREADS;
        
        for (int t = 0; t < MAX_THREADS; t++) {
            final int threadId = t;
            executor.submit(() -> {
                try {
                    runThreadOperations(storage, threadId, opsPerThread);
                } finally {
                    latch.countDown();
                }
            });
        }
        
        // Wait for completion
        latch.await();
        testRunning.set(false);
        monitor.shutdown();
        executor.shutdown();
        
        // Print results
        printFinalResults();
    }
    
    private static void runThreadOperations(GenericEntityStorage<MySQLBillionEntityType> storage,
                                           int threadId, long operations) {
        Random random = new Random(threadId * 1000);
        MySQLBillionEntityType[] types = {
            MySQLBillionEntityType.SPECIAL_ENTITY_1,
            MySQLBillionEntityType.SPECIAL_ENTITY_2,
            MySQLBillionEntityType.SPECIAL_ENTITY_3,
            MySQLBillionEntityType.SPECIAL_ENTITY_4,
            MySQLBillionEntityType.SPECIAL_ENTITY_5
        };
        
        // Each thread owns a unique range to eliminate conflicts
        // Thread 0: 0-39999, Thread 1: 40000-79999, etc.
        long baseId = threadId * 40_000L;
        long maxId = baseId + 40_000;
        
        for (long op = 0; op < operations; op++) {
            try {
                // Simple ID generation: cycle through thread's range
                long id = baseId + (op % 40_000);
                MySQLBillionEntityType type = types[random.nextInt(types.length)];
                
                // Simple operation distribution
                int operation = random.nextInt(100);
                
                if (operation < 35) {
                    // 35% - Put new entity
                    performPut(storage, id, type, random);
                    successOps.incrementAndGet();
                } else if (operation < 70) {
                    // 35% - Update existing
                    performUpdate(storage, id, type, random);
                    successOps.incrementAndGet();
                } else if (operation < 90) {
                    // 20% - Get entity
                    Object entity = storage.get(id, type);
                    if (entity != null) {
                        successOps.incrementAndGet();
                    }
                } else {
                    // 10% - Remove entity
                    storage.remove(id, type);
                    successOps.incrementAndGet();
                }
                
                completedOps.incrementAndGet();
            } catch (Exception e) {
                failedOps.incrementAndGet();
                completedOps.incrementAndGet();
            }
        }
    }
    
    private static void performPut(GenericEntityStorage<MySQLBillionEntityType> storage,
                                   long id, MySQLBillionEntityType type, Random random) {
        switch (type) {
            case SPECIAL_ENTITY_1:
                SpecialEntity1 e1 = new SpecialEntity1();
                e1.setId(id);
                e1.setNullableString("Data_" + random.nextInt(1000));
                e1.setNullableInt(random.nextInt(1000));
                e1.setNullableDecimal(BigDecimal.valueOf(random.nextDouble() * 1000));
                e1.setNullableDateTime(LocalDateTime.now());
                e1.setNullableBoolean(random.nextBoolean());
                storage.put(e1, type);
                break;
                
            case SPECIAL_ENTITY_2:
                SpecialEntity2 e2 = new SpecialEntity2();
                e2.setId(id);
                e2.setMaxDecimal(BigDecimal.valueOf(random.nextDouble() * 999999));
                e2.setLongText("Text_" + random.nextInt(1000));
                byte[] data = new byte[100];
                random.nextBytes(data);
                e2.setLargeBinary(data);
                storage.put(e2, type);
                break;
                
            case SPECIAL_ENTITY_3:
                SpecialEntity3 e3 = new SpecialEntity3();
                e3.setId(id);
                e3.setTinyField((byte) random.nextInt(128));
                e3.setBitField(random.nextBoolean());
                e3.setCharField("" + (char)('A' + random.nextInt(26)));
                storage.put(e3, type);
                break;
                
            case SPECIAL_ENTITY_4:
                SpecialEntity4 e4 = new SpecialEntity4();
                e4.setId(id);
                e4.setUnicodeText("Unicode_" + random.nextInt(1000));
                e4.setEmojiField("✨" + random.nextInt(100));
                e4.setMultiLanguage("Lang_" + random.nextInt(100));
                storage.put(e4, type);
                break;
                
            case SPECIAL_ENTITY_5:
                SpecialEntity5 e5 = new SpecialEntity5();
                e5.setId(id);
                e5.setPrecision2(BigDecimal.valueOf(random.nextDouble() * 100).setScale(2, RoundingMode.HALF_UP));
                e5.setPrecision8(BigDecimal.valueOf(random.nextDouble()).setScale(8, RoundingMode.HALF_UP));
                e5.setPrecision18(BigDecimal.valueOf(random.nextDouble()).setScale(18, RoundingMode.HALF_UP));
                storage.put(e5, type);
                break;
        }
    }
    
    private static void performUpdate(GenericEntityStorage<MySQLBillionEntityType> storage,
                                     long id, MySQLBillionEntityType type, Random random) {
        // Similar to put but with existing ID
        performPut(storage, id, type, random);
    }
    
    private static void printProgress() {
        long completed = completedOps.get();
        if (completed == 0) return;
        
        Duration elapsed = Duration.between(startTime, Instant.now());
        double progressPercent = (completed * 100.0) / TOTAL_OPERATIONS;
        double opsPerSecond = completed / Math.max(1, elapsed.toSeconds());
        
        long remaining = TOTAL_OPERATIONS - completed;
        long etaSeconds = (long) (remaining / Math.max(1, opsPerSecond));
        
        System.out.printf("[%s] Progress: %,d / %,d (%.2f%%) | Rate: %,.0f ops/sec | " +
                         "Success: %,d | Failed: %,d | ETA: %s\n",
            Instant.now().toString().substring(11, 19),
            completed, TOTAL_OPERATIONS, progressPercent, opsPerSecond,
            successOps.get(), failedOps.get(),
            formatDuration(etaSeconds));
    }
    
    private static String formatDuration(long seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
    
    private static void printFinalResults() {
        Duration totalDuration = Duration.between(startTime, Instant.now());
        long totalSeconds = totalDuration.getSeconds();
        
        long totalCompleted = completedOps.get();
        long totalSuccess = successOps.get();
        long totalFailed = failedOps.get();
        
        double successRate = (totalSuccess * 100.0) / Math.max(1, totalCompleted);
        double avgOpsPerSecond = totalCompleted / Math.max(1.0, totalDuration.toMillis() / 1000.0);
        
        System.out.println("\n================================================================================");
        System.out.println("                   10 BILLION OPERATION TEST - FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.printf("Total Operations Completed: %,d\n", totalCompleted);
        System.out.printf("Successful Operations: %,d (%.2f%%)\n", totalSuccess, successRate);
        System.out.printf("Failed Operations: %,d\n", totalFailed);
        System.out.println();
        
        System.out.printf("Total Duration: %s\n", formatDuration(totalSeconds));
        System.out.printf("Average Throughput: %,.0f operations/second\n", avgOpsPerSecond);
        System.out.printf("Operations per Thread: %,d\n", totalCompleted / MAX_THREADS);
        System.out.println();
        
        Runtime runtime = Runtime.getRuntime();
        long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
        System.out.printf("Memory Usage: %,d MB\n", usedMemory);
        System.out.printf("Thread Count: %d\n", MAX_THREADS);
        
        System.out.println("\n================================================================================");
        if (successRate >= 99.9) {
            System.out.println("        ✅ EXCELLENT: " + String.format("%.2f%%", successRate) + " SUCCESS RATE");
        } else if (successRate >= 99.0) {
            System.out.println("        ✓ VERY GOOD: " + String.format("%.2f%%", successRate) + " SUCCESS RATE");
        } else {
            System.out.println("        SUCCESS RATE: " + String.format("%.2f%%", successRate));
        }
        System.out.println("================================================================================");
    }
}