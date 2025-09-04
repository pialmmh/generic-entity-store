package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
 * Mutation test to verify data integrity through multiple update cycles
 * Tests: store → retrieve → mutate → store → retrieve → verify
 */
public class MutationTest {
    
    enum MutationEntityTypeSet implements IEntityTypeSet {
        NUMERIC_ENTITY(1),
        DATE_ENTITY(2),
        MIXED_ENTITY(3);
        
        private final int typeId;
        
        MutationEntityTypeSet(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    /**
     * Entity with various numeric fields for mutation testing
     */
    public static class NumericMutationEntity {
        private Long id;
        private Integer intValue;
        private Long longValue;
        private Double doubleValue;
        private Float floatValue;
        private BigDecimal decimalValue;
        private Byte byteValue;
        private Short shortValue;
        
        // Track mutation count for verification
        private Integer mutationCount;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Integer getIntValue() { return intValue; }
        public void setIntValue(Integer intValue) { this.intValue = intValue; }
        
        public Long getLongValue() { return longValue; }
        public void setLongValue(Long longValue) { this.longValue = longValue; }
        
        public Double getDoubleValue() { return doubleValue; }
        public void setDoubleValue(Double doubleValue) { this.doubleValue = doubleValue; }
        
        public Float getFloatValue() { return floatValue; }
        public void setFloatValue(Float floatValue) { this.floatValue = floatValue; }
        
        public BigDecimal getDecimalValue() { return decimalValue; }
        public void setDecimalValue(BigDecimal decimalValue) { this.decimalValue = decimalValue; }
        
        public Byte getByteValue() { return byteValue; }
        public void setByteValue(Byte byteValue) { this.byteValue = byteValue; }
        
        public Short getShortValue() { return shortValue; }
        public void setShortValue(Short shortValue) { this.shortValue = shortValue; }
        
        public Integer getMutationCount() { return mutationCount; }
        public void setMutationCount(Integer mutationCount) { this.mutationCount = mutationCount; }
        
        // Apply delta mutations
        public void applyNumericDelta(int delta) {
            this.intValue += delta;
            this.longValue += delta;
            this.doubleValue += delta * 0.1;
            this.floatValue += delta * 0.01f;
            this.decimalValue = this.decimalValue.add(new BigDecimal(delta).multiply(new BigDecimal("0.001")));
            this.byteValue = (byte)(this.byteValue + (delta % 10));
            this.shortValue = (short)(this.shortValue + delta);
            this.mutationCount++;
        }
    }
    
    /**
     * Entity with various date/time fields for mutation testing
     */
    public static class DateMutationEntity {
        private Long id;
        private LocalDate dateValue;
        private LocalTime timeValue;
        private LocalDateTime dateTimeValue;
        private java.sql.Date sqlDateValue;
        private java.sql.Time sqlTimeValue;
        private java.sql.Timestamp timestampValue;
        private Integer daysDelta;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public LocalDate getDateValue() { return dateValue; }
        public void setDateValue(LocalDate dateValue) { this.dateValue = dateValue; }
        
        public LocalTime getTimeValue() { return timeValue; }
        public void setTimeValue(LocalTime timeValue) { this.timeValue = timeValue; }
        
        public LocalDateTime getDateTimeValue() { return dateTimeValue; }
        public void setDateTimeValue(LocalDateTime dateTimeValue) { this.dateTimeValue = dateTimeValue; }
        
        public java.sql.Date getSqlDateValue() { return sqlDateValue; }
        public void setSqlDateValue(java.sql.Date sqlDateValue) { this.sqlDateValue = sqlDateValue; }
        
        public java.sql.Time getSqlTimeValue() { return sqlTimeValue; }
        public void setSqlTimeValue(java.sql.Time sqlTimeValue) { this.sqlTimeValue = sqlTimeValue; }
        
        public java.sql.Timestamp getTimestampValue() { return timestampValue; }
        public void setTimestampValue(java.sql.Timestamp timestampValue) { this.timestampValue = timestampValue; }
        
        public Integer getDaysDelta() { return daysDelta; }
        public void setDaysDelta(Integer daysDelta) { this.daysDelta = daysDelta; }
        
        // Apply time delta mutations
        public void applyTimeDelta(int days, int hours, int minutes) {
            if (this.dateValue != null) {
                this.dateValue = this.dateValue.plusDays(days);
            }
            if (this.timeValue != null) {
                this.timeValue = this.timeValue.plusHours(hours).plusMinutes(minutes);
            }
            if (this.dateTimeValue != null) {
                this.dateTimeValue = this.dateTimeValue.plusDays(days).plusHours(hours).plusMinutes(minutes);
            }
            
            // SQL dates - handle null values
            if (this.sqlDateValue != null) {
                long millis = days * 24L * 60 * 60 * 1000;
                this.sqlDateValue = new java.sql.Date(this.sqlDateValue.getTime() + millis);
            }
            if (this.sqlTimeValue != null) {
                this.sqlTimeValue = new java.sql.Time(this.sqlTimeValue.getTime() + hours * 3600000L + minutes * 60000L);
            }
            if (this.timestampValue != null) {
                long millis = days * 24L * 60 * 60 * 1000;
                this.timestampValue = new java.sql.Timestamp(this.timestampValue.getTime() + millis + hours * 3600000L);
            }
            
            this.daysDelta += days;
        }
    }
    
    /**
     * Mixed entity with both numeric and date fields
     */
    public static class MixedMutationEntity {
        private Long id;
        private String name;
        private Integer counter;
        private BigDecimal balance;
        private LocalDateTime lastModified;
        private Double score;
        private Boolean active;
        private Integer version;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public Integer getCounter() { return counter; }
        public void setCounter(Integer counter) { this.counter = counter; }
        
        public BigDecimal getBalance() { return balance; }
        public void setBalance(BigDecimal balance) { this.balance = balance; }
        
        public LocalDateTime getLastModified() { return lastModified; }
        public void setLastModified(LocalDateTime lastModified) { this.lastModified = lastModified; }
        
        public Double getScore() { return score; }
        public void setScore(Double score) { this.score = score; }
        
        public Boolean getActive() { return active; }
        public void setActive(Boolean active) { this.active = active; }
        
        public Integer getVersion() { return version; }
        public void setVersion(Integer version) { this.version = version; }
        
        public void applyMutation(int delta) {
            this.counter += delta;
            this.balance = this.balance.add(new BigDecimal(delta));
            this.lastModified = this.lastModified.plusMinutes(delta);
            this.score += delta * 0.5;
            this.active = (delta % 2 == 0);
            this.version++;
        }
    }
    
    // Test state tracking
    static class MutationTestState {
        final Long id;
        final Map<String, Object> initialValues = new HashMap<>();
        final Map<String, Object> expectedValues = new HashMap<>();
        int mutationCount = 0;
        boolean passed = true;
        String failureReason = null;
        
        MutationTestState(Long id) {
            this.id = id;
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("================================================================================");
        System.out.println("                    MUTATION TEST - 1 MILLION ITERATIONS");
        System.out.println("================================================================================\n");
        
        GenericEntityStorage<MutationEntityTypeSet> storage = 
            GenericEntityStorage.<MutationEntityTypeSet>builder()
                .withEntityTypeSet(MutationEntityTypeSet.class)
                .withMaxRecords(1000000)
                // Default max count per type auto-configured with withMaxRecords
                .registerType(MutationEntityTypeSet.NUMERIC_ENTITY, NumericMutationEntity.class, 400_000)
                .registerType(MutationEntityTypeSet.DATE_ENTITY, DateMutationEntity.class, 300_000)
                .registerType(MutationEntityTypeSet.MIXED_ENTITY, MixedMutationEntity.class, 300_000)
                .build();
        
        System.out.println("Storage initialized. Starting mutation tests...\n");
        
        int totalIterations = 1_000_000;
        int threads = 8;
        int iterationsPerThread = totalIterations / threads;
        
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        CountDownLatch latch = new CountDownLatch(threads);
        
        // Counters
        AtomicLong totalOperations = new AtomicLong(0);
        AtomicLong passedTests = new AtomicLong(0);
        AtomicLong failedTests = new AtomicLong(0);
        AtomicLong numericTests = new AtomicLong(0);
        AtomicLong dateTests = new AtomicLong(0);
        AtomicLong mixedTests = new AtomicLong(0);
        
        // Track some test states for detailed reporting
        ConcurrentHashMap<Long, MutationTestState> testStates = new ConcurrentHashMap<>();
        
        long startTime = System.currentTimeMillis();
        
        for (int t = 0; t < threads; t++) {
            final int threadId = t;
            executor.submit(() -> {
                Random random = new Random(threadId * 1000);
                
                for (int i = 0; i < iterationsPerThread; i++) {
                    long id = threadId * iterationsPerThread + i;
                    int testType = random.nextInt(3);
                    
                    try {
                        boolean testPassed = false;
                        
                        switch (testType) {
                            case 0:
                                testPassed = performNumericMutationTest(storage, id, random);
                                numericTests.incrementAndGet();
                                break;
                            case 1:
                                testPassed = performDateMutationTest(storage, id, random);
                                dateTests.incrementAndGet();
                                break;
                            case 2:
                                testPassed = performMixedMutationTest(storage, id, random);
                                mixedTests.incrementAndGet();
                                break;
                        }
                        
                        if (testPassed) {
                            passedTests.incrementAndGet();
                        } else {
                            failedTests.incrementAndGet();
                        }
                        
                        totalOperations.incrementAndGet();
                        
                        // Progress reporting
                        if (totalOperations.get() % 100_000 == 0) {
                            long elapsed = System.currentTimeMillis() - startTime;
                            double rate = totalOperations.get() / (elapsed / 1000.0);
                            System.out.printf("  Progress: %,d operations | Rate: %,.0f ops/sec | Pass: %,d | Fail: %,d\n",
                                totalOperations.get(), rate, passedTests.get(), failedTests.get());
                        }
                        
                    } catch (Exception e) {
                        failedTests.incrementAndGet();
                        if (failedTests.get() <= 10) {
                            System.err.println("Test failed with exception: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                }
                latch.countDown();
            });
        }
        
        latch.await();
        executor.shutdown();
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        // Final results
        System.out.println("\n================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.printf("Total Iterations: %,d\n", totalOperations.get());
        System.out.printf("Tests Passed: %,d (%.2f%%)\n", 
            passedTests.get(), (passedTests.get() * 100.0 / totalOperations.get()));
        System.out.printf("Tests Failed: %,d (%.2f%%)\n", 
            failedTests.get(), (failedTests.get() * 100.0 / totalOperations.get()));
        
        System.out.println("\nTest Distribution:");
        System.out.printf("  Numeric Mutations: %,d\n", numericTests.get());
        System.out.printf("  Date/Time Mutations: %,d\n", dateTests.get());
        System.out.printf("  Mixed Mutations: %,d\n", mixedTests.get());
        
        System.out.println("\nPerformance:");
        System.out.printf("  Total Time: %.2f seconds\n", totalTime / 1000.0);
        System.out.printf("  Throughput: %,.0f operations/sec\n", 
            totalOperations.get() / (totalTime / 1000.0));
        
        double successRate = passedTests.get() * 100.0 / totalOperations.get();
        
        System.out.println("\n================================================================================");
        if (successRate >= 99.9) {
            System.out.println("                    ✅ TEST PASSED - MUTATIONS PRESERVED!");
        } else if (successRate >= 95.0) {
            System.out.println("                    ⚠️ TEST MOSTLY PASSED - MINOR ISSUES");
        } else {
            System.out.println("                    ❌ TEST FAILED - MUTATION INTEGRITY ISSUES");
        }
        System.out.println("================================================================================");
    }
    
    private static boolean performNumericMutationTest(GenericEntityStorage<MutationEntityTypeSet> storage, 
                                                      long id, Random random) {
        // Create initial entity
        NumericMutationEntity entity = new NumericMutationEntity();
        entity.setId(id);
        entity.setIntValue(random.nextInt(1000));
        entity.setLongValue(random.nextLong() % 100000);
        entity.setDoubleValue(random.nextDouble() * 1000);
        entity.setFloatValue(random.nextFloat() * 100);
        entity.setDecimalValue(new BigDecimal(random.nextDouble() * 10000).setScale(4, RoundingMode.HALF_UP));
        entity.setByteValue((byte)random.nextInt(128));
        entity.setShortValue((short)random.nextInt(10000));
        entity.setMutationCount(0);
        
        // Store initial
        storage.put(entity, MutationEntityTypeSet.NUMERIC_ENTITY);
        
        // Retrieve and verify initial values
        NumericMutationEntity retrieved1 = storage.get(id, MutationEntityTypeSet.NUMERIC_ENTITY);
        if (retrieved1 == null || !entity.getIntValue().equals(retrieved1.getIntValue())) {
            return false;
        }
        
        // Apply mutations (3-5 rounds)
        int rounds = 3 + random.nextInt(3);
        int totalDelta = 0;
        
        for (int r = 0; r < rounds; r++) {
            int delta = random.nextInt(100) - 50; // -50 to 49
            totalDelta += delta;
            
            retrieved1.applyNumericDelta(delta);
            storage.put(retrieved1, MutationEntityTypeSet.NUMERIC_ENTITY);
            
            // Retrieve and verify
            NumericMutationEntity retrieved2 = storage.get(id, MutationEntityTypeSet.NUMERIC_ENTITY);
            if (retrieved2 == null) {
                return false;
            }
            
            // Update reference
            retrieved1 = retrieved2;
        }
        
        // Final verification
        NumericMutationEntity finalEntity = storage.get(id, MutationEntityTypeSet.NUMERIC_ENTITY);
        if (finalEntity == null) {
            return false;
        }
        
        // Verify mutations were applied correctly
        int expectedInt = entity.getIntValue() + totalDelta;
        long expectedLong = entity.getLongValue() + totalDelta;
        int expectedMutationCount = rounds;
        
        return finalEntity.getIntValue().equals(expectedInt) &&
               finalEntity.getLongValue().equals(expectedLong) &&
               finalEntity.getMutationCount().equals(expectedMutationCount);
    }
    
    private static boolean performDateMutationTest(GenericEntityStorage<MutationEntityTypeSet> storage,
                                                   long id, Random random) {
        // Create initial entity
        DateMutationEntity entity = new DateMutationEntity();
        entity.setId(id);
        entity.setDateValue(LocalDate.now().minusDays(random.nextInt(365)));
        entity.setTimeValue(LocalTime.now().minusHours(random.nextInt(24)));
        entity.setDateTimeValue(LocalDateTime.now().minusDays(random.nextInt(30)));
        entity.setSqlDateValue(new java.sql.Date(System.currentTimeMillis() - random.nextInt(86400000)));
        entity.setSqlTimeValue(new java.sql.Time(System.currentTimeMillis()));
        entity.setTimestampValue(new java.sql.Timestamp(System.currentTimeMillis()));
        entity.setDaysDelta(0);
        
        // Store initial
        storage.put(entity, MutationEntityTypeSet.DATE_ENTITY);
        
        // Retrieve and verify
        DateMutationEntity retrieved1 = storage.get(id, MutationEntityTypeSet.DATE_ENTITY);
        if (retrieved1 == null || !entity.getDateValue().equals(retrieved1.getDateValue())) {
            return false;
        }
        
        // Track original values
        LocalDate originalDate = entity.getDateValue();
        LocalTime originalTime = entity.getTimeValue();
        LocalDateTime originalDateTime = entity.getDateTimeValue();
        
        // Apply mutations
        int rounds = 2 + random.nextInt(3);
        int totalDays = 0;
        int totalHours = 0;
        int totalMinutes = 0;
        
        for (int r = 0; r < rounds; r++) {
            int days = random.nextInt(10) - 5;
            int hours = random.nextInt(24) - 12;
            int minutes = random.nextInt(60) - 30;
            
            totalDays += days;
            totalHours += hours;
            totalMinutes += minutes;
            
            retrieved1.applyTimeDelta(days, hours, minutes);
            storage.put(retrieved1, MutationEntityTypeSet.DATE_ENTITY);
            
            // Retrieve and verify
            DateMutationEntity retrieved2 = storage.get(id, MutationEntityTypeSet.DATE_ENTITY);
            if (retrieved2 == null) {
                return false;
            }
            retrieved1 = retrieved2;
        }
        
        // Final verification
        DateMutationEntity finalEntity = storage.get(id, MutationEntityTypeSet.DATE_ENTITY);
        if (finalEntity == null) {
            return false;
        }
        
        // Verify date mutations
        LocalDate expectedDate = originalDate.plusDays(totalDays);
        LocalTime expectedTime = originalTime.plusHours(totalHours).plusMinutes(totalMinutes);
        
        return finalEntity.getDateValue().equals(expectedDate) &&
               finalEntity.getDaysDelta().equals(totalDays);
    }
    
    private static boolean performMixedMutationTest(GenericEntityStorage<MutationEntityTypeSet> storage,
                                                    long id, Random random) {
        // Create initial entity
        MixedMutationEntity entity = new MixedMutationEntity();
        entity.setId(id);
        entity.setName("Entity_" + id);
        entity.setCounter(random.nextInt(1000));
        entity.setBalance(new BigDecimal(random.nextDouble() * 10000).setScale(2, RoundingMode.HALF_UP));
        entity.setLastModified(LocalDateTime.now());
        entity.setScore(random.nextDouble() * 100);
        entity.setActive(random.nextBoolean());
        entity.setVersion(0);
        
        // Store initial
        storage.put(entity, MutationEntityTypeSet.MIXED_ENTITY);
        
        // Track initial values
        int initialCounter = entity.getCounter();
        BigDecimal initialBalance = entity.getBalance();
        LocalDateTime initialModified = entity.getLastModified();
        double initialScore = entity.getScore();
        
        // Retrieve and verify
        MixedMutationEntity retrieved1 = storage.get(id, MutationEntityTypeSet.MIXED_ENTITY);
        if (retrieved1 == null || !entity.getName().equals(retrieved1.getName())) {
            return false;
        }
        
        // Apply mutations
        int rounds = 3 + random.nextInt(4);
        int totalDelta = 0;
        
        for (int r = 0; r < rounds; r++) {
            int delta = random.nextInt(20) - 10;
            totalDelta += delta;
            
            retrieved1.applyMutation(delta);
            storage.put(retrieved1, MutationEntityTypeSet.MIXED_ENTITY);
            
            // Retrieve for next round
            MixedMutationEntity retrieved2 = storage.get(id, MutationEntityTypeSet.MIXED_ENTITY);
            if (retrieved2 == null) {
                return false;
            }
            retrieved1 = retrieved2;
        }
        
        // Final verification
        MixedMutationEntity finalEntity = storage.get(id, MutationEntityTypeSet.MIXED_ENTITY);
        if (finalEntity == null) {
            return false;
        }
        
        // Verify mutations
        int expectedCounter = initialCounter + totalDelta;
        BigDecimal expectedBalance = initialBalance.add(new BigDecimal(totalDelta));
        int expectedVersion = rounds;
        
        return finalEntity.getCounter().equals(expectedCounter) &&
               finalEntity.getBalance().compareTo(expectedBalance) == 0 &&
               finalEntity.getVersion().equals(expectedVersion) &&
               finalEntity.getName().equals("Entity_" + id);
    }
}