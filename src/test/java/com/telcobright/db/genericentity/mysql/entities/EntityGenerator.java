package com.telcobright.db.genericentity.mysql.entities;

import java.io.*;
import java.nio.file.*;

/**
 * Generator for creating multiple entity classes programmatically
 */
public class EntityGenerator {
    
    private static final String PACKAGE = "package com.telcobright.db.genericentity.mysql.entities;\n\n";
    private static final String IMPORTS = 
        "import java.time.LocalDateTime;\n" +
        "import java.math.BigDecimal;\n" +
        "import java.time.LocalDate;\n" +
        "import java.time.LocalTime;\n\n";
    
    public static void generateEntities() throws IOException {
        String basePath = "src/test/java/com/telcobright/db/genericentity/mysql/entities/";
        
        // Generate E-Commerce entities
        generateEntity(basePath, "Product", new String[][] {
            {"Long", "id"}, {"String", "name"}, {"String", "description"}, 
            {"BigDecimal", "price"}, {"Integer", "quantity"}, {"String", "sku"},
            {"String", "category"}, {"Boolean", "isAvailable"}, {"Double", "weight"},
            {"LocalDateTime", "createdAt"}, {"byte[]", "thumbnail"}
        });
        
        generateEntity(basePath, "Order", new String[][] {
            {"Long", "id"}, {"String", "orderNumber"}, {"Long", "customerId"},
            {"BigDecimal", "totalAmount"}, {"BigDecimal", "taxAmount"}, {"BigDecimal", "shippingCost"},
            {"String", "status"}, {"String", "shippingAddress"}, {"String", "billingAddress"},
            {"LocalDateTime", "orderDate"}, {"LocalDateTime", "shipDate"}, {"String", "trackingNumber"}
        });
        
        // Financial entities
        generateEntity(basePath, "Transaction", new String[][] {
            {"Long", "id"}, {"String", "transactionId"}, {"Long", "accountId"},
            {"BigDecimal", "amount"}, {"String", "type"}, {"String", "currency"},
            {"LocalDateTime", "timestamp"}, {"String", "description"}, {"String", "status"},
            {"BigDecimal", "fee"}, {"String", "referenceNumber"}
        });
        
        generateEntity(basePath, "Account", new String[][] {
            {"Long", "id"}, {"String", "accountNumber"}, {"String", "accountType"},
            {"BigDecimal", "balance"}, {"BigDecimal", "creditLimit"}, {"Double", "interestRate"},
            {"LocalDateTime", "openedDate"}, {"LocalDateTime", "lastActivityDate"},
            {"Boolean", "isActive"}, {"String", "currency"}
        });
        
        // Healthcare entities
        generateEntity(basePath, "Patient", new String[][] {
            {"Long", "id"}, {"String", "patientId"}, {"String", "firstName"},
            {"String", "lastName"}, {"LocalDate", "birthDate"}, {"String", "gender"},
            {"String", "bloodType"}, {"String", "allergies"}, {"String", "medicalHistory"},
            {"String", "insurance"}, {"String", "emergencyContact"}
        });
        
        generateEntity(basePath, "Appointment", new String[][] {
            {"Long", "id"}, {"Long", "patientId"}, {"Long", "doctorId"},
            {"LocalDateTime", "appointmentTime"}, {"Integer", "duration"},
            {"String", "reason"}, {"String", "status"}, {"String", "notes"},
            {"BigDecimal", "fee"}, {"Boolean", "isPaid"}
        });
        
        // IoT entities
        generateEntity(basePath, "SensorReading", new String[][] {
            {"Long", "id"}, {"String", "sensorId"}, {"Double", "value"},
            {"String", "unit"}, {"LocalDateTime", "timestamp"}, {"String", "location"},
            {"Double", "latitude"}, {"Double", "longitude"}, {"Integer", "accuracy"},
            {"String", "status"}, {"byte[]", "rawData"}
        });
        
        // Social Media entities
        generateEntity(basePath, "Post", new String[][] {
            {"Long", "id"}, {"Long", "userId"}, {"String", "content"},
            {"Integer", "likes"}, {"Integer", "shares"}, {"Integer", "comments"},
            {"LocalDateTime", "createdAt"}, {"LocalDateTime", "updatedAt"},
            {"Boolean", "isPublic"}, {"String", "hashtags"}, {"byte[]", "media"}
        });
        
        // Generate 90+ more entities with varied field combinations
        generateBulkEntities(basePath);
    }
    
    private static void generateEntity(String basePath, String className, String[][] fields) 
            throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(PACKAGE).append(IMPORTS);
        sb.append("public class ").append(className).append(" {\n");
        
        // Fields
        for (String[] field : fields) {
            sb.append("    private ").append(field[0]).append(" ").append(field[1]).append(";\n");
        }
        
        // Default constructor
        sb.append("\n    public ").append(className).append("() {}\n");
        
        // Constructor with id and first two string fields
        sb.append("\n    public ").append(className).append("(");
        int paramCount = 0;
        for (String[] field : fields) {
            if (paramCount < 3 && (field[0].equals("Long") || field[0].equals("String"))) {
                if (paramCount > 0) sb.append(", ");
                sb.append(field[0]).append(" ").append(field[1]);
                paramCount++;
            }
        }
        sb.append(") {\n");
        paramCount = 0;
        for (String[] field : fields) {
            if (paramCount < 3 && (field[0].equals("Long") || field[0].equals("String"))) {
                sb.append("        this.").append(field[1]).append(" = ").append(field[1]).append(";\n");
                paramCount++;
            }
        }
        sb.append("    }\n");
        
        // Getters and setters
        for (String[] field : fields) {
            String capitalizedName = field[1].substring(0, 1).toUpperCase() + field[1].substring(1);
            sb.append("\n    public ").append(field[0]).append(" get").append(capitalizedName)
              .append("() { return ").append(field[1]).append("; }\n");
            sb.append("    public void set").append(capitalizedName)
              .append("(").append(field[0]).append(" ").append(field[1])
              .append(") { this.").append(field[1]).append(" = ").append(field[1]).append("; }\n");
        }
        
        sb.append("}\n");
        
        Path path = Paths.get(basePath + className + ".java");
        Files.write(path, sb.toString().getBytes());
    }
    
    private static void generateBulkEntities(String basePath) throws IOException {
        // Generate entities with different field combinations to reach 100+ total
        String[] prefixes = {"UserSession", "UserRole", "UserPermission", "UserToken", 
            "UserProfile", "UserPreference", "UserActivity", "UserNotification", "UserDevice",
            "ProductCategory", "ProductVariant", "ShoppingCart", "CartItem", "OrderItem",
            "Payment", "Invoice", "Shipment", "Inventory", "Warehouse", "Supplier",
            "Discount", "Coupon", "Balance", "LedgerEntry", "CreditCard", "Loan",
            "Investment", "Portfolio", "StockTrade", "CurrencyExchange", "TaxRecord",
            "Expense", "Budget", "FinancialReport", "AuditLog", "Doctor", "MedicalRecord",
            "Prescription", "LabTest", "LabResult", "Diagnosis", "Treatment", "Medication",
            "InsuranceClaim", "HospitalBed", "SurgerySchedule", "VitalSigns", "Allergy",
            "Student", "Teacher", "Course", "Enrollment", "Assignment", "Grade",
            "Attendance", "Schedule", "Classroom", "Exam", "Question", "Answer",
            "Certificate", "Transcript", "LibraryBook", "Comment", "Like", "Share",
            "Follow", "Message", "Group", "Event", "Story", "Hashtag", "Mention",
            "NotificationSocial", "Report", "Block", "MediaUpload", "Sensor", "DeviceStatus",
            "Alert", "Metric", "LogEntry", "Configuration", "Firmware", "Telemetry",
            "Geolocation", "NetworkPacket", "SystemMetric", "ErrorLog", "PerformanceMetric",
            "BackupRecord", "Company", "Department", "Employee", "Project", "Task",
            "Milestone", "Timesheet", "ExpenseReport", "Contract", "Vendor", "PurchaseOrder",
            "InvoiceItem", "Receipt", "Refund", "Warranty", "ServiceTicket", "Asset",
            "MaintenanceLog", "Facility", "Location"};
        
        for (String prefix : prefixes) {
            String[][] fields = generateFieldsForEntity(prefix);
            generateEntity(basePath, prefix, fields);
        }
    }
    
    private static String[][] generateFieldsForEntity(String entityName) {
        // Create varied field combinations based on entity name
        int hash = entityName.hashCode();
        java.util.List<String[]> fields = new java.util.ArrayList<>();
        
        // Always have id
        fields.add(new String[]{"Long", "id"});
        
        // Add fields based on hash to create variety
        if ((hash & 1) != 0) fields.add(new String[]{"String", "name"});
        if ((hash & 2) != 0) fields.add(new String[]{"String", "description"});
        if ((hash & 4) != 0) fields.add(new String[]{"BigDecimal", "amount"});
        if ((hash & 8) != 0) fields.add(new String[]{"Integer", "count"});
        if ((hash & 16) != 0) fields.add(new String[]{"Boolean", "isActive"});
        if ((hash & 32) != 0) fields.add(new String[]{"LocalDateTime", "createdAt"});
        if ((hash & 64) != 0) fields.add(new String[]{"Double", "value"});
        if ((hash & 128) != 0) fields.add(new String[]{"String", "status"});
        if ((hash & 256) != 0) fields.add(new String[]{"byte[]", "data"});
        if ((hash & 512) != 0) fields.add(new String[]{"Long", "parentId"});
        if ((hash & 1024) != 0) fields.add(new String[]{"String", "type"});
        if ((hash & 2048) != 0) fields.add(new String[]{"LocalDate", "date"});
        if ((hash & 4096) != 0) fields.add(new String[]{"Integer", "priority"});
        if ((hash & 8192) != 0) fields.add(new String[]{"String", "code"});
        
        // Ensure minimum 3 fields
        if (fields.size() < 3) {
            fields.add(new String[]{"String", "defaultField1"});
            fields.add(new String[]{"Integer", "defaultField2"});
        }
        
        return fields.toArray(new String[0][]);
    }
    
    public static void main(String[] args) throws IOException {
        generateEntities();
        System.out.println("Generated all entity classes");
    }
}