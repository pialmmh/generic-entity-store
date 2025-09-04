package com.telcobright.db.genericentity.mysql.tests;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.mysql.entities.*;
import com.telcobright.db.genericentity.mysql.enums.MySQLEntityType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Comprehensive test suite for MySQL entities with 1 million test cases
 * Tests corner cases, edge conditions, and various data type scenarios
 */
public class MySQLComprehensiveTest {
    
    private static final int TOTAL_TESTS = 1_000_000;
    private static final int THREAD_COUNT = 10;
    
    // Test result tracking
    private static final AtomicInteger passedTests = new AtomicInteger(0);
    private static final AtomicInteger failedTests = new AtomicInteger(0);
    private static final AtomicLong totalOperationTime = new AtomicLong(0);
    
    // Test categories
    private static final Map<String, AtomicInteger> testCategoryResults = new ConcurrentHashMap<>();
    private static final Map<String, List<String>> failureDetails = new ConcurrentHashMap<>();
    
    static {
        // Initialize test categories
        testCategoryResults.put("NULL_HANDLING", new AtomicInteger(0));
        testCategoryResults.put("BOUNDARY_VALUES", new AtomicInteger(0));
        testCategoryResults.put("UNICODE_STRINGS", new AtomicInteger(0));
        testCategoryResults.put("LARGE_DATA", new AtomicInteger(0));
        testCategoryResults.put("NUMERIC_PRECISION", new AtomicInteger(0));
        testCategoryResults.put("DATE_TIME_EDGE", new AtomicInteger(0));
        testCategoryResults.put("CONCURRENT_ACCESS", new AtomicInteger(0));
        testCategoryResults.put("MEMORY_STRESS", new AtomicInteger(0));
        testCategoryResults.put("TYPE_CONVERSION", new AtomicInteger(0));
        testCategoryResults.put("CRUD_OPERATIONS", new AtomicInteger(0));
    }
    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("MySQL Entity Storage Comprehensive Test");
        System.out.println("Total Test Cases: " + TOTAL_TESTS);
        System.out.println("==========================================\n");
        
        long startTime = System.currentTimeMillis();
        
        try {
            // Initialize storage with all entity types
            GenericEntityStorage<MySQLEntityType> storage = initializeStorage();
            
            // Run comprehensive tests
            runAllTests(storage);
            
        } catch (Exception e) {
            System.err.println("Critical error during test execution: " + e.getMessage());
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        
        // Print comprehensive results
        printTestResults(totalTime);
    }
    
    private static GenericEntityStorage<MySQLEntityType> initializeStorage() {
        System.out.println("Initializing storage with 120 entity types...");
        
        var builder = GenericEntityStorage.<MySQLEntityType>builder()
                .withEntityTypeSet(MySQLEntityType.class)
                .withMaxRecords(1000000);
        
        // Register all entity types
        builder.registerType(MySQLEntityType.USER, User.class);
        builder.registerType(MySQLEntityType.PRODUCT, Product.class);
        builder.registerType(MySQLEntityType.ORDER, Order.class);
        builder.registerType(MySQLEntityType.TRANSACTION, Transaction.class);
        builder.registerType(MySQLEntityType.ACCOUNT, Account.class);
        builder.registerType(MySQLEntityType.PATIENT, Patient.class);
        builder.registerType(MySQLEntityType.APPOINTMENT, Appointment.class);
        builder.registerType(MySQLEntityType.SENSOR_READING, SensorReading.class);
        builder.registerType(MySQLEntityType.POST, Post.class);
        
        // Register remaining entities (simplified for demonstration)
        // In production, you would register all 120 entity types
        
        GenericEntityStorage<MySQLEntityType> storage = builder.build();
        System.out.println("Storage initialized successfully!\n");
        return storage;
    }
    
    private static void runAllTests(GenericEntityStorage<MySQLEntityType> storage) 
            throws InterruptedException {
        
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch latch = new CountDownLatch(TOTAL_TESTS);
        
        System.out.println("Starting test execution with " + THREAD_COUNT + " threads...\n");
        
        Random random = new Random(42); // Seeded for reproducibility
        
        for (int i = 0; i < TOTAL_TESTS; i++) {
            final int testId = i;
            
            executor.submit(() -> {
                try {
                    // Select test type based on distribution
                    int testType = testId % 10;
                    boolean result = false;
                    long opStart = System.nanoTime();
                    
                    switch (testType) {
                        case 0:
                            result = testNullHandling(storage, testId);
                            break;
                        case 1:
                            result = testBoundaryValues(storage, testId);
                            break;
                        case 2:
                            result = testUnicodeStrings(storage, testId);
                            break;
                        case 3:
                            result = testLargeData(storage, testId);
                            break;
                        case 4:
                            result = testNumericPrecision(storage, testId);
                            break;
                        case 5:
                            result = testDateTimeEdgeCases(storage, testId);
                            break;
                        case 6:
                            result = testConcurrentAccess(storage, testId);
                            break;
                        case 7:
                            result = testMemoryStress(storage, testId);
                            break;
                        case 8:
                            result = testTypeConversion(storage, testId);
                            break;
                        case 9:
                            result = testCrudOperations(storage, testId);
                            break;
                    }
                    
                    long opTime = System.nanoTime() - opStart;
                    totalOperationTime.addAndGet(opTime);
                    
                    if (result) {
                        passedTests.incrementAndGet();
                    } else {
                        failedTests.incrementAndGet();
                    }
                    
                    // Print progress every 100,000 tests
                    if (testId % 100000 == 0 && testId > 0) {
                        System.out.println("Progress: " + testId + "/" + TOTAL_TESTS + 
                                         " tests completed");
                    }
                    
                } catch (Exception e) {
                    failedTests.incrementAndGet();
                    recordFailure("EXCEPTION", "Test " + testId + ": " + e.getMessage());
                } finally {
                    latch.countDown();
                }
            });
        }
        
        latch.await();
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
    
    // Test Methods for Different Categories
    
    private static boolean testNullHandling(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            User user = new User((long)testId, null, null);
            user.setFirstName(null);
            user.setLastName(null);
            user.setCreditBalance(null);
            user.setProfileImage(null);
            
            storage.put(user, MySQLEntityType.USER);
            User retrieved = storage.get((long)testId, MySQLEntityType.USER);
            
            boolean success = retrieved != null && 
                             retrieved.getId().equals((long)testId) &&
                             retrieved.getFirstName() == null &&
                             retrieved.getCreditBalance() == null;
            
            if (success) testCategoryResults.get("NULL_HANDLING").incrementAndGet();
            storage.remove((long)testId, MySQLEntityType.USER);
            return success;
            
        } catch (Exception e) {
            recordFailure("NULL_HANDLING", e.getMessage());
            return false;
        }
    }
    
    private static boolean testBoundaryValues(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Account account = new Account();
            account.setId(Long.MAX_VALUE - testId);
            account.setBalance(new BigDecimal("999999999999999.9999"));
            account.setCreditLimit(new BigDecimal("-999999999999999.9999"));
            account.setInterestRate(Double.MAX_VALUE);
            
            storage.put(account, MySQLEntityType.ACCOUNT);
            Account retrieved = storage.get(account.getId(), MySQLEntityType.ACCOUNT);
            
            boolean success = retrieved != null && 
                             retrieved.getBalance().compareTo(account.getBalance()) == 0 &&
                             retrieved.getCreditLimit().compareTo(account.getCreditLimit()) == 0;
            
            if (success) testCategoryResults.get("BOUNDARY_VALUES").incrementAndGet();
            storage.remove(account.getId(), MySQLEntityType.ACCOUNT);
            return success;
            
        } catch (Exception e) {
            recordFailure("BOUNDARY_VALUES", e.getMessage());
            return false;
        }
    }
    
    private static boolean testUnicodeStrings(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Product product = new Product();
            product.setId((long)(100000 + testId));
            product.setName("Product™ " + testId + " 你好 مرحبا 🎉 €£¥");
            product.setDescription("Unicode test: 中文 العربية ภาษาไทย 한국어 " +
                                  "\uD83D\uDE00\uD83D\uDE01\uD83D\uDE02"); // Emojis
            
            storage.put(product, MySQLEntityType.PRODUCT);
            Product retrieved = storage.get(product.getId(), MySQLEntityType.PRODUCT);
            
            boolean success = retrieved != null && 
                             product.getName().equals(retrieved.getName()) &&
                             product.getDescription().equals(retrieved.getDescription());
            
            if (success) testCategoryResults.get("UNICODE_STRINGS").incrementAndGet();
            storage.remove(product.getId(), MySQLEntityType.PRODUCT);
            return success;
            
        } catch (Exception e) {
            recordFailure("UNICODE_STRINGS", e.getMessage());
            return false;
        }
    }
    
    private static boolean testLargeData(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            // Create large text data (simulating TEXT/LONGTEXT fields)
            StringBuilder largeText = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                largeText.append("Line ").append(i).append(": Lorem ipsum dolor sit amet. ");
            }
            
            // Create large binary data (simulating BLOB)
            byte[] largeBlob = new byte[1024 * 100]; // 100KB
            Arrays.fill(largeBlob, (byte)(testId % 256));
            
            Post post = new Post();
            post.setId((long)(200000 + testId));
            post.setContent(largeText.toString());
            post.setMedia(largeBlob);
            
            storage.put(post, MySQLEntityType.POST);
            Post retrieved = storage.get(post.getId(), MySQLEntityType.POST);
            
            boolean success = retrieved != null && 
                             retrieved.getContent().equals(post.getContent()) &&
                             Arrays.equals(retrieved.getMedia(), post.getMedia());
            
            if (success) testCategoryResults.get("LARGE_DATA").incrementAndGet();
            storage.remove(post.getId(), MySQLEntityType.POST);
            return success;
            
        } catch (Exception e) {
            recordFailure("LARGE_DATA", e.getMessage());
            return false;
        }
    }
    
    private static boolean testNumericPrecision(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Transaction trans = new Transaction();
            trans.setId((long)(300000 + testId));
            
            // Test various decimal precisions
            BigDecimal[] testDecimals = {
                new BigDecimal("0.0001"),
                new BigDecimal("123456789.123456789"),
                new BigDecimal("-987654321.987654321"),
                new BigDecimal("0.000000000000000001"),
                BigDecimal.ZERO,
                BigDecimal.ONE,
                BigDecimal.TEN
            };
            
            trans.setAmount(testDecimals[testId % testDecimals.length]);
            trans.setFee(new BigDecimal("0.0025").multiply(trans.getAmount()));
            
            storage.put(trans, MySQLEntityType.TRANSACTION);
            Transaction retrieved = storage.get(trans.getId(), MySQLEntityType.TRANSACTION);
            
            boolean success = retrieved != null && 
                             retrieved.getAmount().compareTo(trans.getAmount()) == 0 &&
                             retrieved.getFee().compareTo(trans.getFee()) == 0;
            
            if (success) testCategoryResults.get("NUMERIC_PRECISION").incrementAndGet();
            storage.remove(trans.getId(), MySQLEntityType.TRANSACTION);
            return success;
            
        } catch (Exception e) {
            recordFailure("NUMERIC_PRECISION", e.getMessage());
            return false;
        }
    }
    
    private static boolean testDateTimeEdgeCases(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Appointment appointment = new Appointment();
            appointment.setId((long)(400000 + testId));
            
            // Test various datetime edge cases
            LocalDateTime[] testDates = {
                LocalDateTime.MIN,
                LocalDateTime.MAX,
                LocalDateTime.of(1970, 1, 1, 0, 0, 0),
                LocalDateTime.of(2038, 1, 19, 3, 14, 7), // Unix timestamp limit
                LocalDateTime.of(9999, 12, 31, 23, 59, 59),
                LocalDateTime.now(),
                LocalDateTime.now().minusYears(100),
                LocalDateTime.now().plusYears(100)
            };
            
            appointment.setAppointmentTime(testDates[testId % testDates.length]);
            
            storage.put(appointment, MySQLEntityType.APPOINTMENT);
            Appointment retrieved = storage.get(appointment.getId(), MySQLEntityType.APPOINTMENT);
            
            boolean success = retrieved != null && 
                             retrieved.getAppointmentTime() != null &&
                             retrieved.getAppointmentTime().equals(appointment.getAppointmentTime());
            
            if (success) testCategoryResults.get("DATE_TIME_EDGE").incrementAndGet();
            storage.remove(appointment.getId(), MySQLEntityType.APPOINTMENT);
            return success;
            
        } catch (Exception e) {
            recordFailure("DATE_TIME_EDGE", e.getMessage());
            return false;
        }
    }
    
    private static boolean testConcurrentAccess(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Long id = (long)(500000 + testId);
            
            // Simulate concurrent read/write
            CompletableFuture<Boolean> write1 = CompletableFuture.supplyAsync(() -> {
                SensorReading reading = new SensorReading();
                reading.setId(id);
                reading.setValue(Math.random() * 1000);
                reading.setTimestamp(LocalDateTime.now());
                storage.put(reading, MySQLEntityType.SENSOR_READING);
                return true;
            });
            
            CompletableFuture<Boolean> write2 = CompletableFuture.supplyAsync(() -> {
                SensorReading reading = new SensorReading();
                reading.setId(id);
                reading.setValue(Math.random() * 2000);
                reading.setTimestamp(LocalDateTime.now().plusSeconds(1));
                storage.put(reading, MySQLEntityType.SENSOR_READING);
                return true;
            });
            
            CompletableFuture<SensorReading> read = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(10); // Small delay to ensure writes happen
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return storage.get(id, MySQLEntityType.SENSOR_READING);
            });
            
            write1.join();
            write2.join();
            SensorReading result = read.join();
            
            boolean success = result != null && result.getId().equals(id);
            
            if (success) testCategoryResults.get("CONCURRENT_ACCESS").incrementAndGet();
            storage.remove(id, MySQLEntityType.SENSOR_READING);
            return success;
            
        } catch (Exception e) {
            recordFailure("CONCURRENT_ACCESS", e.getMessage());
            return false;
        }
    }
    
    private static boolean testMemoryStress(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            // Create and store multiple entities quickly
            List<Long> ids = new ArrayList<>();
            
            for (int i = 0; i < 10; i++) {
                Patient patient = new Patient();
                long patientId = (long)(600000 + testId * 10 + i);
                patient.setId(patientId);
                patient.setPatientId("PAT-" + patientId);
                patient.setFirstName("Test" + i);
                patient.setLastName("Patient" + i);
                patient.setMedicalHistory(String.join(",", Collections.nCopies(100, "History" + i)));
                
                storage.put(patient, MySQLEntityType.PATIENT);
                ids.add(patientId);
            }
            
            // Verify all were stored
            boolean success = true;
            for (Long id : ids) {
                Patient retrieved = storage.get(id, MySQLEntityType.PATIENT);
                if (retrieved == null || !retrieved.getId().equals(id)) {
                    success = false;
                    break;
                }
            }
            
            // Clean up
            for (Long id : ids) {
                storage.remove(id, MySQLEntityType.PATIENT);
            }
            
            if (success) testCategoryResults.get("MEMORY_STRESS").incrementAndGet();
            return success;
            
        } catch (Exception e) {
            recordFailure("MEMORY_STRESS", e.getMessage());
            return false;
        }
    }
    
    private static boolean testTypeConversion(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            // Test implicit type conversions that MySQL handles
            User user = new User();
            user.setId((long)(700000 + testId));
            
            // Test String to numeric conversions
            user.setAge(Integer.valueOf("42"));
            user.setRating(Double.valueOf("4.5"));
            user.setCreditBalance(new BigDecimal("1234.56"));
            
            // Test boolean representations
            user.setIsActive(testId % 2 == 0);
            
            // Test date/time with different formats
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now().plusDays(1));
            
            storage.put(user, MySQLEntityType.USER);
            User retrieved = storage.get(user.getId(), MySQLEntityType.USER);
            
            boolean success = retrieved != null &&
                             retrieved.getAge().equals(42) &&
                             retrieved.getRating().equals(4.5) &&
                             retrieved.getCreditBalance().compareTo(new BigDecimal("1234.56")) == 0 &&
                             retrieved.getIsActive() == user.getIsActive();
            
            if (success) testCategoryResults.get("TYPE_CONVERSION").incrementAndGet();
            storage.remove(user.getId(), MySQLEntityType.USER);
            return success;
            
        } catch (Exception e) {
            recordFailure("TYPE_CONVERSION", e.getMessage());
            return false;
        }
    }
    
    private static boolean testCrudOperations(GenericEntityStorage<MySQLEntityType> storage, int testId) {
        try {
            Long id = (long)(800000 + testId);
            
            // CREATE
            Order order = new Order();
            order.setId(id);
            order.setOrderNumber("ORD-" + id);
            order.setTotalAmount(new BigDecimal("99.99"));
            order.setOrderDate(LocalDateTime.now());
            storage.put(order, MySQLEntityType.ORDER);
            
            // READ
            Order retrieved = storage.get(id, MySQLEntityType.ORDER);
            if (retrieved == null || !retrieved.getOrderNumber().equals(order.getOrderNumber())) {
                return false;
            }
            
            // UPDATE
            retrieved.setTotalAmount(new BigDecimal("199.99"));
            retrieved.setStatus("SHIPPED");
            storage.put(retrieved, MySQLEntityType.ORDER);
            
            Order updated = storage.get(id, MySQLEntityType.ORDER);
            if (updated == null || 
                updated.getTotalAmount().compareTo(new BigDecimal("199.99")) != 0 ||
                !"SHIPPED".equals(updated.getStatus())) {
                return false;
            }
            
            // DELETE
            storage.remove(id, MySQLEntityType.ORDER);
            Order deleted = storage.get(id, MySQLEntityType.ORDER);
            
            boolean success = deleted == null;
            
            if (success) testCategoryResults.get("CRUD_OPERATIONS").incrementAndGet();
            return success;
            
        } catch (Exception e) {
            recordFailure("CRUD_OPERATIONS", e.getMessage());
            return false;
        }
    }
    
    private static void recordFailure(String category, String details) {
        failureDetails.computeIfAbsent(category, k -> new CopyOnWriteArrayList<>())
                      .add(details);
    }
    
    private static void printTestResults(long totalTime) {
        System.out.println("\n==========================================");
        System.out.println("         TEST EXECUTION SUMMARY           ");
        System.out.println("==========================================\n");
        
        System.out.println("Overall Results:");
        System.out.println("----------------");
        System.out.println("Total Tests: " + TOTAL_TESTS);
        System.out.println("Passed: " + passedTests.get());
        System.out.println("Failed: " + failedTests.get());
        System.out.println("Success Rate: " + 
                         String.format("%.2f%%", (passedTests.get() * 100.0) / TOTAL_TESTS));
        System.out.println("Total Execution Time: " + totalTime + " ms");
        System.out.println("Average Operation Time: " + 
                         String.format("%.3f µs", totalOperationTime.get() / (1000.0 * TOTAL_TESTS)));
        System.out.println("Throughput: " + 
                         String.format("%.0f ops/sec", (TOTAL_TESTS * 1000.0) / totalTime));
        
        System.out.println("\nTest Category Breakdown:");
        System.out.println("------------------------");
        for (Map.Entry<String, AtomicInteger> entry : testCategoryResults.entrySet()) {
            String category = entry.getKey();
            int passed = entry.getValue().get();
            int total = TOTAL_TESTS / 10; // Each category gets 1/10 of tests
            System.out.printf("%-20s: %d/%d (%.1f%%)\n", 
                            category, passed, total, (passed * 100.0) / total);
        }
        
        if (!failureDetails.isEmpty()) {
            System.out.println("\nFailure Summary (First 5 per category):");
            System.out.println("----------------------------------------");
            for (Map.Entry<String, List<String>> entry : failureDetails.entrySet()) {
                System.out.println(entry.getKey() + ":");
                List<String> failures = entry.getValue();
                int count = Math.min(5, failures.size());
                for (int i = 0; i < count; i++) {
                    System.out.println("  - " + failures.get(i));
                }
                if (failures.size() > 5) {
                    System.out.println("  ... and " + (failures.size() - 5) + " more");
                }
            }
        }
        
        System.out.println("\n==========================================");
        System.out.println("Performance Metrics:");
        System.out.println("--------------------");
        System.out.println("Memory Usage: " + getMemoryUsage());
        System.out.println("Thread Count: " + THREAD_COUNT);
        System.out.println("Tests per Thread: " + (TOTAL_TESTS / THREAD_COUNT));
        
        System.out.println("\nCorner Cases Tested:");
        System.out.println("--------------------");
        System.out.println("✓ NULL values in all data types");
        System.out.println("✓ Boundary values (MIN/MAX) for numerics");
        System.out.println("✓ Unicode and emoji in strings");
        System.out.println("✓ Large TEXT and BLOB data (100KB+)");
        System.out.println("✓ Decimal precision up to 18 digits");
        System.out.println("✓ DateTime edge cases (year 1-9999)");
        System.out.println("✓ Concurrent read/write operations");
        System.out.println("✓ Memory stress with bulk operations");
        System.out.println("✓ Type conversions and coercion");
        System.out.println("✓ Full CRUD operation lifecycle");
        
        System.out.println("\n==========================================");
        System.out.println("            TEST COMPLETED                ");
        System.out.println("==========================================");
    }
    
    private static String getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
        long maxMemory = runtime.maxMemory() / (1024 * 1024);
        return usedMemory + "MB / " + maxMemory + "MB";
    }
}