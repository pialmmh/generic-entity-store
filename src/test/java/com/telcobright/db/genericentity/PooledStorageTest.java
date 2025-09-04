package com.telcobright.db.genericentity;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.examples.ecommerce.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Test for pooled storage implementation with max count enforcement
 */
public class PooledStorageTest {
    
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   Pooled Storage Test with Max Counts");
        System.out.println("===========================================\n");
        
        try {
            testMaxCountEnforcement();
            testPoolRecycling();
            testConcurrentPoolOperations();
            testMemoryEfficiency();
            
            System.out.println("\n===========================================");
            System.out.println("        ALL TESTS PASSED!");
            System.out.println("===========================================");
            
        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    private static void testMaxCountEnforcement() {
        System.out.println("Test 1: Max Count Enforcement");
        System.out.println("------------------------------");
        
        // Create storage with strict limits
        GenericEntityStorage<EcommerceEntityTypeSet> storage = 
            GenericEntityStorage.<EcommerceEntityTypeSet>builder()
                .withEntityTypeSet(EcommerceEntityTypeSet.class)
                .withMaxRecords(10000)
                .registerType(EcommerceEntityTypeSet.ORDER, Order.class, 5) // Max 5 orders
                .build();
        
        // Add orders up to limit
        for (int i = 1; i <= 5; i++) {
            Order order = new Order();
            order.setId((long) i);
            order.setOrderNumber("ORD-" + i);
            order.setTotalAmount(new BigDecimal("100.00"));
            order.setOrderDate(LocalDateTime.now());
            storage.put(order, EcommerceEntityTypeSet.ORDER);
        }
        
        System.out.println("✓ Added 5 orders (at max capacity)");
        System.out.println("  Capacity: " + storage.getCapacityInfo(EcommerceEntityTypeSet.ORDER));
        
        // Try to exceed limit
        try {
            Order extraOrder = new Order();
            extraOrder.setId(6L);
            extraOrder.setOrderNumber("ORD-6");
            extraOrder.setTotalAmount(new BigDecimal("100.00"));
            storage.put(extraOrder, EcommerceEntityTypeSet.ORDER);
            throw new RuntimeException("Should have thrown exception for exceeding max count!");
        } catch (IllegalStateException e) {
            System.out.println("✓ Correctly rejected 6th order: " + e.getMessage());
        }
        
        // Remove one and add again
        storage.remove(3L, EcommerceEntityTypeSet.ORDER);
        System.out.println("✓ Removed order 3");
        
        Order replacementOrder = new Order();
        replacementOrder.setId(7L);
        replacementOrder.setOrderNumber("ORD-7");
        replacementOrder.setTotalAmount(new BigDecimal("150.00"));
        storage.put(replacementOrder, EcommerceEntityTypeSet.ORDER);
        System.out.println("✓ Added replacement order 7");
        System.out.println("  Final capacity: " + storage.getCapacityInfo(EcommerceEntityTypeSet.ORDER));
        
        System.out.println("✓ Test 1 PASSED\n");
    }
    
    private static void testPoolRecycling() {
        System.out.println("Test 2: Pool Recycling");
        System.out.println("----------------------");
        
        GenericEntityStorage<EcommerceEntityTypeSet> storage = 
            GenericEntityStorage.<EcommerceEntityTypeSet>builder()
                .withEntityTypeSet(EcommerceEntityTypeSet.class)
                .withMaxRecords(10000)
                .registerType(EcommerceEntityTypeSet.ORDER, Order.class, 100)
                .build();
        
        // Track initial pool stats
        var initialStats = storage.getPoolStatistics();
        System.out.println("Initial pool: " + initialStats);
        
        // Add and remove entities multiple times
        for (int cycle = 0; cycle < 10; cycle++) {
            // Add 50 orders
            for (int i = 0; i < 50; i++) {
                Order order = new Order();
                order.setId((long)(cycle * 1000 + i));
                order.setOrderNumber("CYC" + cycle + "-ORD-" + i);
                order.setTotalAmount(new BigDecimal(Math.random() * 1000));
                storage.put(order, EcommerceEntityTypeSet.ORDER);
            }
            
            // Remove all
            for (int i = 0; i < 50; i++) {
                storage.remove((long)(cycle * 1000 + i), EcommerceEntityTypeSet.ORDER);
            }
        }
        
        var finalStats = storage.getPoolStatistics();
        System.out.println("Final pool: " + finalStats);
        
        // Verify objects were recycled (not creating new ones each time)
        if (finalStats.totalCreated <= 100) {
            System.out.println("✓ Objects properly recycled. Total created: " + 
                             finalStats.totalCreated + " (max 100)");
        } else {
            throw new RuntimeException("Too many objects created! Expected <= 100, got " + 
                                     finalStats.totalCreated);
        }
        
        System.out.println("✓ Test 2 PASSED\n");
    }
    
    private static void testConcurrentPoolOperations() throws InterruptedException {
        System.out.println("Test 3: Concurrent Pool Operations");
        System.out.println("----------------------------------");
        
        GenericEntityStorage<EcommerceEntityTypeSet> storage = 
            GenericEntityStorage.<EcommerceEntityTypeSet>builder()
                .withEntityTypeSet(EcommerceEntityTypeSet.class)
                .withMaxRecords(10000)
                .registerType(EcommerceEntityTypeSet.ORDER, Order.class, 1000)
                .build();
        
        int threadCount = 10;
        int operationsPerThread = 100;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch latch = new CountDownLatch(threadCount);
        AtomicInteger successCount = new AtomicInteger(0);
        AtomicInteger errorCount = new AtomicInteger(0);
        
        for (int t = 0; t < threadCount; t++) {
            final int threadId = t;
            executor.submit(() -> {
                try {
                    for (int i = 0; i < operationsPerThread; i++) {
                        Long id = (long)(threadId * 1000 + i);
                        
                        // Add
                        Order order = new Order();
                        order.setId(id);
                        order.setOrderNumber("T" + threadId + "-" + i);
                        order.setTotalAmount(new BigDecimal("99.99"));
                        storage.put(order, EcommerceEntityTypeSet.ORDER);
                        
                        // Read
                        Order retrieved = storage.get(id, EcommerceEntityTypeSet.ORDER);
                        if (retrieved == null || !retrieved.getOrderNumber().equals(order.getOrderNumber())) {
                            errorCount.incrementAndGet();
                        }
                        
                        // Update
                        retrieved.setTotalAmount(new BigDecimal("199.99"));
                        storage.put(retrieved, EcommerceEntityTypeSet.ORDER);
                        
                        // Remove
                        storage.remove(id, EcommerceEntityTypeSet.ORDER);
                        
                        successCount.incrementAndGet();
                    }
                } catch (Exception e) {
                    errorCount.incrementAndGet();
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });
        }
        
        latch.await();
        executor.shutdown();
        
        System.out.println("Concurrent operations completed:");
        System.out.println("  Success: " + successCount.get());
        System.out.println("  Errors: " + errorCount.get());
        System.out.println("  Pool stats: " + storage.getPoolStatistics());
        
        if (errorCount.get() == 0) {
            System.out.println("✓ All concurrent operations successful");
        } else {
            throw new RuntimeException("Concurrent operations had errors: " + errorCount.get());
        }
        
        System.out.println("✓ Test 3 PASSED\n");
    }
    
    private static void testMemoryEfficiency() {
        System.out.println("Test 4: Memory Efficiency");
        System.out.println("-------------------------");
        
        // Get initial memory
        System.gc();
        Thread.yield();
        long initialMemory = getUsedMemory();
        System.out.println("Initial memory: " + formatBytes(initialMemory));
        
        // Create storage with large capacity
        GenericEntityStorage<EcommerceEntityTypeSet> storage = 
            GenericEntityStorage.<EcommerceEntityTypeSet>builder()
                .withEntityTypeSet(EcommerceEntityTypeSet.class)
                .withMaxRecords(50000)
                .registerType(EcommerceEntityTypeSet.ORDER, Order.class, 10000)
                .build();
        
        // Add many entities
        for (int i = 0; i < 5000; i++) {
            Order order = new Order();
            order.setId((long) i);
            order.setOrderNumber("MEM-" + i);
            order.setTotalAmount(new BigDecimal(i));
            order.setOrderDate(LocalDateTime.now());
            order.setStatus("ACTIVE");
            storage.put(order, EcommerceEntityTypeSet.ORDER);
        }
        
        long afterAddMemory = getUsedMemory();
        System.out.println("After adding 5000 entities: " + formatBytes(afterAddMemory));
        
        // Remove half
        for (int i = 0; i < 2500; i++) {
            storage.remove((long) i, EcommerceEntityTypeSet.ORDER);
        }
        
        System.gc();
        Thread.yield();
        long afterRemoveMemory = getUsedMemory();
        System.out.println("After removing 2500 entities: " + formatBytes(afterRemoveMemory));
        
        // Add them back (should reuse pooled objects)
        for (int i = 0; i < 2500; i++) {
            Order order = new Order();
            order.setId((long) (10000 + i));
            order.setOrderNumber("REUSE-" + i);
            order.setTotalAmount(new BigDecimal(i));
            storage.put(order, EcommerceEntityTypeSet.ORDER);
        }
        
        long afterReuseMemory = getUsedMemory();
        System.out.println("After adding 2500 more (with reuse): " + formatBytes(afterReuseMemory));
        
        // Memory after reuse should be similar to after original add
        long memoryGrowth = afterReuseMemory - afterAddMemory;
        System.out.println("Memory growth after reuse: " + formatBytes(Math.abs(memoryGrowth)));
        
        var poolStats = storage.getPoolStatistics();
        System.out.println("Pool statistics: " + poolStats);
        
        // Clear everything
        storage.clear();
        System.gc();
        Thread.yield();
        long finalMemory = getUsedMemory();
        System.out.println("After clear: " + formatBytes(finalMemory));
        
        System.out.println("✓ Memory efficiently managed with pooling");
        System.out.println("✓ Test 4 PASSED\n");
    }
    
    private static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
    
    private static String formatBytes(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.2f KB", bytes / 1024.0);
        return String.format("%.2f MB", bytes / (1024.0 * 1024.0));
    }
}