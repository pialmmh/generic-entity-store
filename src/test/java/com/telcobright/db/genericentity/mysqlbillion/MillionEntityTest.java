package com.telcobright.db.genericentity.mysqlbillion;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.examples.ecommerce.EcommerceEntityTypeSet;
import com.telcobright.db.genericentity.examples.ecommerce.Order;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
 * Million Entity Test - Tests data integrity with 1 million entities
 */
public class MillionEntityTest {
    
    public static void main(String[] args) throws Exception {
        System.out.println("================================================================================");
        System.out.println("                   1 MILLION ENTITY DATA INTEGRITY TEST");
        System.out.println("================================================================================\n");
        
        // Using the ecommerce examples which have working converters
        GenericEntityStorage<EcommerceEntityTypeSet> storage = 
            GenericEntityStorage.<EcommerceEntityTypeSet>builder()
                .withEntityTypeSet(EcommerceEntityTypeSet.class)
                .withMaxRecords(1000000)
                // Auto-sizing distributes capacity
                .registerType(EcommerceEntityTypeSet.ORDER, Order.class, 1_000_000)
                .build();
        
        System.out.println("Storage initialized. Starting test...\n");
        
        // Step 1: Generate and store 1 million random entities
        System.out.println("PHASE 1: INSERTING 1,000,000 ENTITIES");
        System.out.println("-------------------------------------");
        
        Map<Long, TestData> testDataMap = new ConcurrentHashMap<>();
        AtomicLong insertCount = new AtomicLong(0);
        AtomicLong insertErrors = new AtomicLong(0);
        
        int threads = 8;
        int entitiesPerThread = 1_000_000 / threads;
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        CountDownLatch insertLatch = new CountDownLatch(threads);
        
        long startInsert = System.currentTimeMillis();
        
        for (int t = 0; t < threads; t++) {
            final int threadId = t;
            executor.submit(() -> {
                Random random = new Random(threadId * 1000);
                long baseId = threadId * entitiesPerThread;
                
                for (int i = 0; i < entitiesPerThread; i++) {
                    long id = baseId + i;
                    
                    try {
                        // Create Order
                        Order order = new Order();
                        order.setId(id);
                        order.setOrderNumber("ORD-" + id);
                        order.setCustomerName("Customer-" + random.nextInt(10000));
                        BigDecimal amount = new BigDecimal(random.nextDouble() * 10000).setScale(2, BigDecimal.ROUND_HALF_UP);
                        order.setTotalAmount(amount);
                        order.setOrderDate(LocalDateTime.now().minusDays(random.nextInt(365)));
                        order.setItemCount(1 + random.nextInt(20));
                        order.setStatus(random.nextBoolean() ? "COMPLETED" : "PENDING");
                        
                        storage.put(order, EcommerceEntityTypeSet.ORDER);
                        
                        // Store test data for verification
                        TestData data = new TestData();
                        data.id = id;
                        data.type = EcommerceEntityTypeSet.ORDER;
                        data.orderNumber = order.getOrderNumber();
                        data.customerName = order.getCustomerName();
                        data.totalAmount = amount;
                        data.orderDate = order.getOrderDate();
                        data.itemCount = order.getItemCount();
                        data.status = order.getStatus();
                        testDataMap.put(id, data);
                        
                        insertCount.incrementAndGet();
                        
                        if (insertCount.get() % 100_000 == 0) {
                            System.out.printf("  Inserted: %,d entities\n", insertCount.get());
                        }
                        
                    } catch (Exception e) {
                        insertErrors.incrementAndGet();
                        if (insertErrors.get() <= 5) {
                            System.out.printf("  INSERT ERROR at ID %d: %s\n", id, e.getMessage());
                            e.printStackTrace();
                        }
                    }
                }
                insertLatch.countDown();
            });
        }
        
        insertLatch.await();
        long insertTime = System.currentTimeMillis() - startInsert;
        
        System.out.printf("\nInsert complete: %,d entities in %.2f seconds\n", 
            insertCount.get(), insertTime / 1000.0);
        System.out.printf("Insert rate: %,.0f entities/sec\n", 
            insertCount.get() / (insertTime / 1000.0));
        System.out.printf("Insert errors: %d\n\n", insertErrors.get());
        
        // Step 2: Retrieve all entities and verify data integrity
        System.out.println("PHASE 2: RETRIEVING AND VERIFYING 1,000,000 ENTITIES");
        System.out.println("----------------------------------------------------");
        System.out.println("TestDataMap size: " + testDataMap.size());
        
        AtomicLong retrieveCount = new AtomicLong(0);
        AtomicLong verifySuccess = new AtomicLong(0);
        AtomicLong verifyFailed = new AtomicLong(0);
        AtomicLong notFound = new AtomicLong(0);
        AtomicLong nullTestData = new AtomicLong(0);
        
        CountDownLatch verifyLatch = new CountDownLatch(threads);
        long startVerify = System.currentTimeMillis();
        
        for (int t = 0; t < threads; t++) {
            final int threadId = t;
            executor.submit(() -> {
                long baseId = threadId * entitiesPerThread;
                
                for (int i = 0; i < entitiesPerThread; i++) {
                    long id = baseId + i;
                    TestData expected = testDataMap.get(id);
                    
                    if (expected == null) {
                        nullTestData.incrementAndGet();
                        if (nullTestData.get() == 1) {
                            System.out.printf("  First null TestData at id %d\n", id);
                        }
                        continue;
                    }
                    
                    try {
                        Order retrieved = storage.get(id, EcommerceEntityTypeSet.ORDER);
                        
                        if (retrieved == null) {
                            notFound.incrementAndGet();
                            if (notFound.get() <= 10) {
                                System.out.printf("  NOT FOUND: ID %d\n", id);
                            }
                        } else if (verifyOrder(expected, retrieved)) {
                            verifySuccess.incrementAndGet();
                            if (verifySuccess.get() == 1) {
                                System.out.printf("  First successful verification at ID %d\n", id);
                            }
                        } else {
                            verifyFailed.incrementAndGet();
                            if (verifyFailed.get() <= 10) {
                                System.out.printf("  MISMATCH: ID %d - Expected order %s, got %s\n",
                                    id, expected.orderNumber, retrieved.getOrderNumber());
                            }
                        }
                        
                        retrieveCount.incrementAndGet();
                        
                        if (retrieveCount.get() % 100_000 == 0) {
                            System.out.printf("  Verified: %,d entities\n", retrieveCount.get());
                        }
                        
                    } catch (Exception e) {
                        verifyFailed.incrementAndGet();
                        if (verifyFailed.get() <= 5) {
                            System.out.printf("  EXCEPTION at ID %d: %s\n", id, e.getMessage());
                            e.printStackTrace();
                        }
                    }
                }
                verifyLatch.countDown();
            });
        }
        
        verifyLatch.await();
        executor.shutdown();
        
        long verifyTime = System.currentTimeMillis() - startVerify;
        
        System.out.printf("\nVerification complete: %,d entities in %.2f seconds\n", 
            retrieveCount.get(), verifyTime / 1000.0);
        System.out.printf("Verification rate: %,.0f entities/sec\n", 
            retrieveCount.get() / (verifyTime / 1000.0));
        
        // Step 3: Print final results
        System.out.println("\n================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        long totalProcessed = insertCount.get();
        long totalVerified = verifySuccess.get();
        double successRate = (totalVerified * 100.0) / totalProcessed;
        
        System.out.printf("Total Entities Inserted: %,d\n", insertCount.get());
        System.out.printf("Total Entities Retrieved: %,d\n", retrieveCount.get());
        System.out.printf("Successfully Verified: %,d\n", verifySuccess.get());
        System.out.printf("Verification Failed: %,d\n", verifyFailed.get());
        System.out.printf("Not Found: %,d\n", notFound.get());
        System.out.printf("Null TestData: %,d\n", nullTestData.get());
        System.out.printf("Success Rate: %.2f%%\n", successRate);
        
        System.out.println("\nPERFORMANCE METRICS:");
        System.out.printf("Total Time: %.2f seconds\n", (insertTime + verifyTime) / 1000.0);
        System.out.printf("Insert Performance: %,.0f ops/sec\n", insertCount.get() / (insertTime / 1000.0));
        System.out.printf("Retrieve Performance: %,.0f ops/sec\n", retrieveCount.get() / (verifyTime / 1000.0));
        
        System.out.println("\n================================================================================");
        if (successRate >= 99.9) {
            System.out.println("                    ✅ TEST PASSED - DATA INTEGRITY VERIFIED!");
        } else if (successRate >= 95.0) {
            System.out.println("                    ⚠️ TEST MOSTLY PASSED - SOME ISSUES DETECTED");
        } else {
            System.out.println("                    ❌ TEST FAILED - SIGNIFICANT DATA CORRUPTION");
        }
        System.out.println("================================================================================");
    }
    
    private static boolean verifyOrder(TestData expected, Order actual) {
        return expected.id.equals(actual.getId()) &&
               expected.orderNumber.equals(actual.getOrderNumber()) &&
               expected.customerName.equals(actual.getCustomerName()) &&
               expected.totalAmount.compareTo(actual.getTotalAmount()) == 0 &&
               expected.orderDate.equals(actual.getOrderDate()) &&
               expected.itemCount.equals(actual.getItemCount()) &&
               expected.status.equals(actual.getStatus());
    }
    
    static class TestData {
        Long id;
        EcommerceEntityTypeSet type;
        
        // Order fields
        String orderNumber;
        String customerName;
        BigDecimal totalAmount;
        LocalDateTime orderDate;
        Integer itemCount;
        String status;
    }
}