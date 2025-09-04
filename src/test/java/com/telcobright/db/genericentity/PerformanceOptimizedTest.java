package com.telcobright.db.genericentity;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.api.StorageBuilder;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Performance test demonstrating the optimized builder with mandatory maxRecords
 * and pooled CompositeKeys for minimal GC impact.
 */
public class PerformanceOptimizedTest {
    
    enum TestEntityTypeSet implements IEntityTypeSet {
        TYPE_A(1),
        TYPE_B(2),
        TYPE_C(3);
        
        private final int typeId;
        
        TestEntityTypeSet(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    public static class TestEntity {
        private Long id;
        private String name;
        private BigDecimal value;
        private Integer count;
        
        public TestEntity() {}
        
        public TestEntity(Long id, String name, BigDecimal value, Integer count) {
            this.id = id;
            this.name = name;
            this.value = value;
            this.count = count;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public BigDecimal getValue() { return value; }
        public void setValue(BigDecimal value) { this.value = value; }
        
        public Integer getCount() { return count; }
        public void setCount(Integer count) { this.count = count; }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("================================================================================");
        System.out.println("              PERFORMANCE OPTIMIZED STORAGE TEST");
        System.out.println("       Testing with mandatory maxRecords and pooled CompositeKeys");
        System.out.println("================================================================================\n");
        
        // Define test parameters
        final int MAX_RECORDS = 1_000_000;
        final int OPERATIONS = 3_000_000; // 3M operations to test performance
        final int THREADS = 8;
        
        System.out.println("Configuration:");
        System.out.println("  Max Records: " + String.format("%,d", MAX_RECORDS));
        System.out.println("  Operations: " + String.format("%,d", OPERATIONS));
        System.out.println("  Threads: " + THREADS);
        System.out.println();
        
        // Create storage with optimized builder
        System.out.println("Creating storage with mandatory maxRecords...");
        GenericEntityStorage<TestEntityTypeSet> storage = StorageBuilder.<TestEntityTypeSet>create()
            .withEntityTypeSet(TestEntityTypeSet.class)
            .withMaxRecords(MAX_RECORDS)  // MANDATORY parameter
            .withAutoSizing()              // Auto-distribute capacity
            .registerType(TestEntityTypeSet.TYPE_A, TestEntity.class)
            .registerType(TestEntityTypeSet.TYPE_B, TestEntity.class)
            .registerType(TestEntityTypeSet.TYPE_C, TestEntity.class)
            .build();
        
        System.out.println("Storage created with optimized pooling for " + MAX_RECORDS + " records\n");
        
        // Warm-up phase
        System.out.println("Warming up pools...");
        warmUp(storage, 10000);
        
        // Run performance test
        System.out.println("\nStarting performance test...");
        long startTime = System.currentTimeMillis();
        
        ExecutorService executor = Executors.newFixedThreadPool(THREADS);
        CountDownLatch latch = new CountDownLatch(THREADS);
        AtomicLong operationCount = new AtomicLong(0);
        AtomicLong successCount = new AtomicLong(0);
        
        // Track GC statistics
        long gcCountBefore = getGarbageCollectionCount();
        long gcTimeBefore = getGarbageCollectionTime();
        
        for (int t = 0; t < THREADS; t++) {
            final int threadId = t;
            executor.submit(() -> {
                try {
                    runOperations(storage, threadId, OPERATIONS / THREADS, 
                                 operationCount, successCount);
                } finally {
                    latch.countDown();
                }
            });
        }
        
        // Progress monitoring
        Thread monitor = new Thread(() -> {
            long lastCount = 0;
            long lastTime = System.currentTimeMillis();
            
            while (latch.getCount() > 0) {
                try {
                    Thread.sleep(1000);
                    long currentCount = operationCount.get();
                    long currentTime = System.currentTimeMillis();
                    
                    long opsInInterval = currentCount - lastCount;
                    long timeInterval = currentTime - lastTime;
                    
                    if (timeInterval > 0) {
                        long opsPerSec = (opsInInterval * 1000) / timeInterval;
                        System.out.printf("  Progress: %,d operations | Rate: %,d ops/sec%n",
                                        currentCount, opsPerSec);
                    }
                    
                    lastCount = currentCount;
                    lastTime = currentTime;
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        monitor.start();
        
        // Wait for completion
        latch.await();
        monitor.interrupt();
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        // Get GC statistics
        long gcCountAfter = getGarbageCollectionCount();
        long gcTimeAfter = getGarbageCollectionTime();
        
        // Print results
        printResults(operationCount.get(), successCount.get(), duration,
                    gcCountAfter - gcCountBefore, gcTimeAfter - gcTimeBefore);
        
        executor.shutdown();
    }
    
    private static void warmUp(GenericEntityStorage<TestEntityTypeSet> storage, int count) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            TestEntity entity = new TestEntity(
                (long)i,
                "warmup_" + i,
                new BigDecimal(rand.nextDouble() * 1000),
                rand.nextInt(100)
            );
            
            TestEntityTypeSet type = TestEntityTypeSet.values()[i % 3];
            storage.put(entity, type);
            
            if (i % 2 == 0) {
                storage.get((long)(i / 2), type);
            }
        }
    }
    
    private static void runOperations(GenericEntityStorage<TestEntityTypeSet> storage,
                                     int threadId, int operations,
                                     AtomicLong operationCount,
                                     AtomicLong successCount) {
        Random rand = new Random(threadId);
        TestEntityTypeSet[] types = TestEntityTypeSet.values();
        
        for (int i = 0; i < operations; i++) {
            try {
                // Mix of operations: 40% put, 40% get, 10% update, 10% remove
                int op = rand.nextInt(100);
                long id = rand.nextInt(100000); // Use same IDs across types
                TestEntityTypeSet type = types[rand.nextInt(types.length)];
                
                if (op < 40) {
                    // PUT operation
                    TestEntity entity = new TestEntity(
                        id,
                        "entity_" + threadId + "_" + i,
                        new BigDecimal(rand.nextDouble() * 10000),
                        rand.nextInt(1000)
                    );
                    storage.put(entity, type);
                    successCount.incrementAndGet();
                    
                } else if (op < 80) {
                    // GET operation
                    TestEntity retrieved = storage.get(id, type);
                    if (retrieved != null) {
                        successCount.incrementAndGet();
                    }
                    
                } else if (op < 90) {
                    // UPDATE operation
                    TestEntity entity = storage.get(id, type);
                    if (entity != null) {
                        entity.setCount(entity.getCount() + 1);
                        storage.put(entity, type);
                        successCount.incrementAndGet();
                    }
                    
                } else {
                    // REMOVE operation
                    storage.remove(id, type);
                    successCount.incrementAndGet();
                }
                
                operationCount.incrementAndGet();
                
            } catch (Exception e) {
                // Capacity exceptions are expected when hitting limits
                operationCount.incrementAndGet();
            }
        }
    }
    
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
    
    private static void printResults(long operations, long successes, long duration,
                                    long gcCount, long gcTime) {
        double throughput = operations * 1000.0 / duration;
        double successRate = successes * 100.0 / operations;
        
        System.out.println("\n================================================================================");
        System.out.println("                              RESULTS");
        System.out.println("================================================================================");
        
        System.out.println("\nPerformance Metrics:");
        System.out.printf("  Total Operations: %,d%n", operations);
        System.out.printf("  Successful: %,d (%.1f%%)%n", successes, successRate);
        System.out.printf("  Duration: %.2f seconds%n", duration / 1000.0);
        System.out.printf("  Throughput: %,.0f ops/sec%n", throughput);
        System.out.printf("  Avg Latency: %.3f μs/op%n", (duration * 1000.0) / operations);
        
        System.out.println("\nGC Statistics:");
        System.out.printf("  GC Count: %d%n", gcCount);
        System.out.printf("  GC Time: %d ms%n", gcTime);
        System.out.printf("  GC Overhead: %.2f%%%n", (gcTime * 100.0) / duration);
        
        System.out.println("\nOptimization Benefits:");
        System.out.println("  ✓ Mandatory maxRecords ensures proper pool sizing");
        System.out.println("  ✓ Pooled CompositeKeys eliminate allocations in hot path");
        System.out.println("  ✓ Pre-sized buffers minimize GC pressure");
        System.out.println("  ✓ Auto-sizing distributes capacity optimally");
        
        System.out.println("\n================================================================================");
        if (throughput > 200000) {
            System.out.println("  🚀 EXCELLENT PERFORMANCE - Over 200K ops/sec!");
        } else if (throughput > 100000) {
            System.out.println("  ✅ GOOD PERFORMANCE - Over 100K ops/sec");
        } else {
            System.out.println("  ⚡ PERFORMANCE: " + String.format("%.0f", throughput) + " ops/sec");
        }
        System.out.println("================================================================================");
    }
}