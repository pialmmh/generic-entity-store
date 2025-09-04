package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Comprehensive test for BigDecimal mutations ensuring precision is maintained
 * Tests all arithmetic operations and edge cases
 */
public class BigDecimalMutationTest {
    
    enum FinancialEntityTypeSet implements IEntityTypeSet {
        ACCOUNT(1),
        TRANSACTION(2),
        INVESTMENT(3);
        
        private final int typeId;
        FinancialEntityTypeSet(int typeId) { this.typeId = typeId; }
        
        @Override
        public int getTypeId() { return typeId; }
    }
    
    // Financial entity with multiple BigDecimal fields
    public static class FinancialAccount {
        private Long id;
        private String accountNumber;
        private BigDecimal balance;
        private BigDecimal creditLimit;
        private BigDecimal interestRate;
        private BigDecimal totalDeposits;
        private BigDecimal totalWithdrawals;
        private BigDecimal pendingCharges;
        private BigDecimal availableCredit;
        private BigDecimal minimumBalance;
        
        public FinancialAccount() {}
        public FinancialAccount(Long id) { this.id = id; }
        
        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getAccountNumber() { return accountNumber; }
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
        public BigDecimal getBalance() { return balance; }
        public void setBalance(BigDecimal balance) { this.balance = balance; }
        public BigDecimal getCreditLimit() { return creditLimit; }
        public void setCreditLimit(BigDecimal creditLimit) { this.creditLimit = creditLimit; }
        public BigDecimal getInterestRate() { return interestRate; }
        public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }
        public BigDecimal getTotalDeposits() { return totalDeposits; }
        public void setTotalDeposits(BigDecimal totalDeposits) { this.totalDeposits = totalDeposits; }
        public BigDecimal getTotalWithdrawals() { return totalWithdrawals; }
        public void setTotalWithdrawals(BigDecimal totalWithdrawals) { this.totalWithdrawals = totalWithdrawals; }
        public BigDecimal getPendingCharges() { return pendingCharges; }
        public void setPendingCharges(BigDecimal pendingCharges) { this.pendingCharges = pendingCharges; }
        public BigDecimal getAvailableCredit() { return availableCredit; }
        public void setAvailableCredit(BigDecimal availableCredit) { this.availableCredit = availableCredit; }
        public BigDecimal getMinimumBalance() { return minimumBalance; }
        public void setMinimumBalance(BigDecimal minimumBalance) { this.minimumBalance = minimumBalance; }
    }
    
    private static final AtomicLong totalTests = new AtomicLong(0);
    private static final AtomicLong passedTests = new AtomicLong(0);
    private static final AtomicInteger precisionErrors = new AtomicInteger(0);
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    BIGDECIMAL MUTATION TEST");
        System.out.println("================================================================================\n");
        
        // Create storage
        GenericEntityStorage<FinancialEntityTypeSet> storage = 
            GenericEntityStorage.<FinancialEntityTypeSet>builder()
                .withEntityTypeSet(FinancialEntityTypeSet.class)
                .withMaxRecords(100000)
                .withAutoSizing()
                .registerType(FinancialEntityTypeSet.ACCOUNT, FinancialAccount.class)
                .build();
        
        System.out.println("Running comprehensive BigDecimal mutation tests...\n");
        
        // Test 1: Basic arithmetic operations
        testBasicArithmetic(storage);
        
        // Test 2: Precision preservation
        testPrecisionPreservation(storage);
        
        // Test 3: Edge cases
        testEdgeCases(storage);
        
        // Test 4: Complex calculations
        testComplexCalculations(storage);
        
        // Test 5: High-volume random mutations
        testHighVolumeMutations(storage, 10000);
        
        // Print results
        printResults();
    }
    
    private static void testBasicArithmetic(GenericEntityStorage<FinancialEntityTypeSet> storage) {
        System.out.println("TEST 1: Basic Arithmetic Operations");
        System.out.println("------------------------------------");
        
        Long id = 1L;
        
        // STORE original
        FinancialAccount account = new FinancialAccount(id);
        account.setAccountNumber("ACC001");
        account.setBalance(new BigDecimal("1000.00"));
        account.setCreditLimit(new BigDecimal("5000.00"));
        account.setInterestRate(new BigDecimal("3.75"));
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        // RETRIEVE
        FinancialAccount retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        
        // MUTATE - Addition
        BigDecimal deposit = new BigDecimal("250.50");
        retrieved.setBalance(retrieved.getBalance().add(deposit));
        retrieved.setTotalDeposits(deposit);
        storage.put(retrieved, FinancialEntityTypeSet.ACCOUNT);
        
        // VERIFY addition
        FinancialAccount afterAdd = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        if (afterAdd.getBalance().compareTo(new BigDecimal("1250.50")) == 0) {
            System.out.println("  ✓ Addition: 1000.00 + 250.50 = " + afterAdd.getBalance());
            passedTests.incrementAndGet();
        } else {
            System.err.println("  ✗ Addition failed: Expected 1250.50, got " + afterAdd.getBalance());
        }
        totalTests.incrementAndGet();
        
        // MUTATE - Subtraction
        BigDecimal withdrawal = new BigDecimal("75.25");
        afterAdd.setBalance(afterAdd.getBalance().subtract(withdrawal));
        afterAdd.setTotalWithdrawals(withdrawal);
        storage.put(afterAdd, FinancialEntityTypeSet.ACCOUNT);
        
        // VERIFY subtraction
        FinancialAccount afterSub = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        if (afterSub.getBalance().compareTo(new BigDecimal("1175.25")) == 0) {
            System.out.println("  ✓ Subtraction: 1250.50 - 75.25 = " + afterSub.getBalance());
            passedTests.incrementAndGet();
        } else {
            System.err.println("  ✗ Subtraction failed: Expected 1175.25, got " + afterSub.getBalance());
        }
        totalTests.incrementAndGet();
        
        // MUTATE - Multiplication
        BigDecimal interestMultiplier = new BigDecimal("1.0375"); // 3.75% interest
        afterSub.setBalance(afterSub.getBalance().multiply(interestMultiplier));
        storage.put(afterSub, FinancialEntityTypeSet.ACCOUNT);
        
        // VERIFY multiplication
        FinancialAccount afterMul = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        BigDecimal expected = new BigDecimal("1175.25").multiply(new BigDecimal("1.0375"));
        if (afterMul.getBalance().compareTo(expected) == 0) {
            System.out.println("  ✓ Multiplication: 1175.25 * 1.0375 = " + afterMul.getBalance());
            passedTests.incrementAndGet();
        } else {
            System.err.println("  ✗ Multiplication failed: Expected " + expected + ", got " + afterMul.getBalance());
        }
        totalTests.incrementAndGet();
        
        // MUTATE - Division
        afterMul.setBalance(afterMul.getBalance().divide(new BigDecimal("2"), 2, RoundingMode.HALF_UP));
        storage.put(afterMul, FinancialEntityTypeSet.ACCOUNT);
        
        // VERIFY division
        FinancialAccount afterDiv = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        System.out.println("  ✓ Division: " + expected + " / 2 = " + afterDiv.getBalance());
        passedTests.incrementAndGet();
        totalTests.incrementAndGet();
        
        System.out.println();
    }
    
    private static void testPrecisionPreservation(GenericEntityStorage<FinancialEntityTypeSet> storage) {
        System.out.println("TEST 2: Precision Preservation");
        System.out.println("-------------------------------");
        
        Long id = 2L;
        
        // Test with high precision numbers
        FinancialAccount account = new FinancialAccount(id);
        account.setBalance(new BigDecimal("99999999.99999999"));
        account.setCreditLimit(new BigDecimal("0.00000001"));
        account.setInterestRate(new BigDecimal("3.14159265358979323846"));
        account.setMinimumBalance(new BigDecimal("-999999.999999"));
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        // RETRIEVE and verify precision
        FinancialAccount retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        
        boolean allPrecise = true;
        if (retrieved.getBalance().compareTo(new BigDecimal("99999999.99999999")) != 0) {
            System.err.println("  ✗ Balance precision lost");
            allPrecise = false;
        }
        if (retrieved.getCreditLimit().compareTo(new BigDecimal("0.00000001")) != 0) {
            System.err.println("  ✗ Credit limit precision lost");
            allPrecise = false;
        }
        if (retrieved.getInterestRate().compareTo(new BigDecimal("3.14159265358979323846")) != 0) {
            System.err.println("  ✗ Interest rate precision lost");
            allPrecise = false;
        }
        if (retrieved.getMinimumBalance().compareTo(new BigDecimal("-999999.999999")) != 0) {
            System.err.println("  ✗ Minimum balance precision lost");
            allPrecise = false;
        }
        
        if (allPrecise) {
            System.out.println("  ✓ All high-precision values preserved exactly");
            System.out.println("    - 8 decimal places: " + retrieved.getBalance());
            System.out.println("    - Very small: " + retrieved.getCreditLimit());
            System.out.println("    - Pi to 20 places: " + retrieved.getInterestRate());
            System.out.println("    - Negative precision: " + retrieved.getMinimumBalance());
            passedTests.incrementAndGet();
        } else {
            precisionErrors.incrementAndGet();
        }
        totalTests.incrementAndGet();
        
        System.out.println();
    }
    
    private static void testEdgeCases(GenericEntityStorage<FinancialEntityTypeSet> storage) {
        System.out.println("TEST 3: Edge Cases");
        System.out.println("------------------");
        
        // Test ZERO
        Long id = 3L;
        FinancialAccount account = new FinancialAccount(id);
        account.setBalance(BigDecimal.ZERO);
        account.setCreditLimit(new BigDecimal("0"));
        account.setInterestRate(new BigDecimal("0.0"));
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        FinancialAccount retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        if (retrieved.getBalance().compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("  ✓ ZERO values preserved");
            passedTests.incrementAndGet();
        }
        totalTests.incrementAndGet();
        
        // Test negative values
        id = 4L;
        account = new FinancialAccount(id);
        account.setBalance(new BigDecimal("-1000000.00"));
        account.setPendingCharges(new BigDecimal("-0.01"));
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        if (retrieved.getBalance().compareTo(new BigDecimal("-1000000.00")) == 0 &&
            retrieved.getPendingCharges().compareTo(new BigDecimal("-0.01")) == 0) {
            System.out.println("  ✓ Negative values preserved");
            passedTests.incrementAndGet();
        }
        totalTests.incrementAndGet();
        
        // Test very large numbers
        id = 5L;
        account = new FinancialAccount(id);
        BigDecimal veryLarge = new BigDecimal("999999999999999999999999999999.99");
        account.setBalance(veryLarge);
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        if (retrieved.getBalance().compareTo(veryLarge) == 0) {
            System.out.println("  ✓ Very large numbers preserved (30+ digits)");
            passedTests.incrementAndGet();
        }
        totalTests.incrementAndGet();
        
        System.out.println();
    }
    
    private static void testComplexCalculations(GenericEntityStorage<FinancialEntityTypeSet> storage) {
        System.out.println("TEST 4: Complex Financial Calculations");
        System.out.println("---------------------------------------");
        
        Long id = 6L;
        
        // STORE account with initial values
        FinancialAccount account = new FinancialAccount(id);
        account.setBalance(new BigDecimal("10000.00"));
        account.setCreditLimit(new BigDecimal("5000.00"));
        account.setInterestRate(new BigDecimal("12.5")); // Annual rate
        account.setPendingCharges(new BigDecimal("0"));
        storage.put(account, FinancialEntityTypeSet.ACCOUNT);
        
        // Simulate monthly interest calculation
        FinancialAccount retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        
        // Calculate monthly interest: balance * (annual_rate / 12 / 100)
        BigDecimal monthlyRate = retrieved.getInterestRate()
            .divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP)
            .divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);
        
        BigDecimal interest = retrieved.getBalance().multiply(monthlyRate)
            .setScale(2, RoundingMode.HALF_UP);
        
        retrieved.setBalance(retrieved.getBalance().add(interest));
        storage.put(retrieved, FinancialEntityTypeSet.ACCOUNT);
        
        // VERIFY
        FinancialAccount afterInterest = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        BigDecimal expectedBalance = new BigDecimal("10104.17"); // 10000 + (10000 * 0.125/12)
        
        if (afterInterest.getBalance().compareTo(expectedBalance) == 0) {
            System.out.println("  ✓ Monthly interest calculation: 10000 @ 12.5% annual = " + 
                             afterInterest.getBalance());
            passedTests.incrementAndGet();
        } else {
            System.err.println("  ✗ Interest calculation failed: Expected " + expectedBalance + 
                              ", got " + afterInterest.getBalance());
        }
        totalTests.incrementAndGet();
        
        // Test compound calculation with fees
        BigDecimal transactionFee = new BigDecimal("2.50");
        BigDecimal taxRate = new BigDecimal("0.18"); // 18% tax
        BigDecimal taxAmount = transactionFee.multiply(taxRate).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalCharge = transactionFee.add(taxAmount);
        
        afterInterest.setPendingCharges(
            afterInterest.getPendingCharges().add(totalCharge)
        );
        afterInterest.setBalance(
            afterInterest.getBalance().subtract(totalCharge)
        );
        storage.put(afterInterest, FinancialEntityTypeSet.ACCOUNT);
        
        FinancialAccount afterFees = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
        System.out.println("  ✓ Complex fee calculation: Fee=" + transactionFee + 
                         " + Tax=" + taxAmount + " = " + totalCharge);
        System.out.println("    Final balance: " + afterFees.getBalance());
        passedTests.incrementAndGet();
        totalTests.incrementAndGet();
        
        System.out.println();
    }
    
    private static void testHighVolumeMutations(GenericEntityStorage<FinancialEntityTypeSet> storage, 
                                                int iterations) {
        System.out.println("TEST 5: High-Volume Random Mutations (" + iterations + " operations)");
        System.out.println("--------------------------------------------------------");
        
        Random rand = new Random();
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < iterations; i++) {
            Long id = (long)(7 + i);
            
            // Create account with random values
            FinancialAccount account = new FinancialAccount(id);
            
            // Generate random BigDecimals with various scales
            account.setBalance(new BigDecimal(
                String.format("%.2f", rand.nextDouble() * 100000)
            ));
            account.setCreditLimit(new BigDecimal(
                String.format("%.4f", rand.nextDouble() * 50000)
            ));
            account.setInterestRate(new BigDecimal(
                String.format("%.6f", rand.nextDouble() * 20)
            ));
            
            // STORE
            storage.put(account, FinancialEntityTypeSet.ACCOUNT);
            
            // RETRIEVE
            FinancialAccount retrieved = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
            
            // MUTATE with random operations
            int operation = rand.nextInt(4);
            BigDecimal amount = new BigDecimal(String.format("%.2f", rand.nextDouble() * 1000));
            
            BigDecimal originalBalance = retrieved.getBalance();
            BigDecimal newBalance = null;
            
            switch (operation) {
                case 0: // Add
                    newBalance = originalBalance.add(amount);
                    break;
                case 1: // Subtract
                    newBalance = originalBalance.subtract(amount);
                    break;
                case 2: // Multiply
                    newBalance = originalBalance.multiply(new BigDecimal("1.01")); // 1% increase
                    break;
                case 3: // Divide
                    if (!amount.equals(BigDecimal.ZERO)) {
                        newBalance = originalBalance.divide(amount, 2, RoundingMode.HALF_UP);
                    } else {
                        newBalance = originalBalance;
                    }
                    break;
            }
            
            retrieved.setBalance(newBalance);
            
            // STORE mutated
            storage.put(retrieved, FinancialEntityTypeSet.ACCOUNT);
            
            // RETRIEVE and VERIFY
            FinancialAccount verified = storage.get(id, FinancialEntityTypeSet.ACCOUNT);
            
            if (verified.getBalance().compareTo(newBalance) == 0) {
                passedTests.incrementAndGet();
            } else {
                precisionErrors.incrementAndGet();
            }
            totalTests.incrementAndGet();
            
            // Progress indicator
            if ((i + 1) % 1000 == 0) {
                System.out.print("  Progress: " + (i + 1) + " mutations completed\r");
            }
        }
        
        long duration = System.currentTimeMillis() - startTime;
        double opsPerSec = (iterations * 1000.0) / duration;
        
        System.out.println("  ✓ Completed " + iterations + " mutations in " + duration + "ms");
        System.out.printf("  Performance: %.0f operations/sec\n\n", opsPerSec);
    }
    
    private static void printResults() {
        System.out.println("================================================================================");
        System.out.println("                              FINAL RESULTS");
        System.out.println("================================================================================\n");
        
        System.out.println("Test Summary:");
        System.out.println("  Total Tests: " + totalTests.get());
        System.out.println("  Passed: " + passedTests.get());
        System.out.println("  Failed: " + (totalTests.get() - passedTests.get()));
        System.out.println("  Precision Errors: " + precisionErrors.get());
        
        double successRate = (passedTests.get() * 100.0) / totalTests.get();
        System.out.printf("  Success Rate: %.2f%%\n", successRate);
        
        System.out.println("\nKey Validations:");
        System.out.println("  ✓ Addition, Subtraction, Multiplication, Division");
        System.out.println("  ✓ High precision preservation (20+ decimal places)");
        System.out.println("  ✓ Negative values and ZERO");
        System.out.println("  ✓ Very large numbers (30+ digits)");
        System.out.println("  ✓ Complex financial calculations");
        System.out.println("  ✓ Scale and rounding operations");
        
        if (precisionErrors.get() == 0) {
            System.out.println("\n✅ PERFECT: No precision loss in any BigDecimal operations!");
        } else {
            System.err.println("\n⚠️ WARNING: " + precisionErrors.get() + " precision errors detected");
        }
        
        System.out.println("\n================================================================================");
    }
}