package com.telcobright.db.genericentity.mysql.enums;

import com.telcobright.db.genericentity.api.IEntityTypeSet;

/**
 * Comprehensive MySQL entity types for testing
 * Covers 100+ different entity types across multiple domains
 */
public enum MySQLEntityType implements IEntityTypeSet {
    // User & Authentication (1-10)
    USER(1),
    USER_SESSION(2),
    USER_ROLE(3),
    USER_PERMISSION(4),
    USER_TOKEN(5),
    USER_PROFILE(6),
    USER_PREFERENCE(7),
    USER_ACTIVITY(8),
    USER_NOTIFICATION(9),
    USER_DEVICE(10),
    
    // E-Commerce (11-25)
    PRODUCT(11),
    PRODUCT_CATEGORY(12),
    PRODUCT_VARIANT(13),
    SHOPPING_CART(14),
    CART_ITEM(15),
    ORDER(16),
    ORDER_ITEM(17),
    PAYMENT(18),
    INVOICE(19),
    SHIPMENT(20),
    INVENTORY(21),
    WAREHOUSE(22),
    SUPPLIER(23),
    DISCOUNT(24),
    COUPON(25),
    
    // Financial (26-40)
    ACCOUNT(26),
    TRANSACTION(27),
    BALANCE(28),
    LEDGER_ENTRY(29),
    CREDIT_CARD(30),
    LOAN(31),
    INVESTMENT(32),
    PORTFOLIO(33),
    STOCK_TRADE(34),
    CURRENCY_EXCHANGE(35),
    TAX_RECORD(36),
    EXPENSE(37),
    BUDGET(38),
    FINANCIAL_REPORT(39),
    AUDIT_LOG(40),
    
    // Healthcare (41-55)
    PATIENT(41),
    DOCTOR(42),
    APPOINTMENT(43),
    MEDICAL_RECORD(44),
    PRESCRIPTION(45),
    LAB_TEST(46),
    LAB_RESULT(47),
    DIAGNOSIS(48),
    TREATMENT(49),
    MEDICATION(50),
    INSURANCE_CLAIM(51),
    HOSPITAL_BED(52),
    SURGERY_SCHEDULE(53),
    VITAL_SIGNS(54),
    ALLERGY(55),
    
    // Education (56-70)
    STUDENT(56),
    TEACHER(57),
    COURSE(58),
    ENROLLMENT(59),
    ASSIGNMENT(60),
    GRADE(61),
    ATTENDANCE(62),
    SCHEDULE(63),
    CLASSROOM(64),
    EXAM(65),
    QUESTION(66),
    ANSWER(67),
    CERTIFICATE(68),
    TRANSCRIPT(69),
    LIBRARY_BOOK(70),
    
    // Social Media (71-85)
    POST(71),
    COMMENT(72),
    LIKE(73),
    SHARE(74),
    FOLLOW(75),
    MESSAGE(76),
    GROUP(77),
    EVENT(78),
    STORY(79),
    HASHTAG(80),
    MENTION(81),
    NOTIFICATION_SOCIAL(82),
    REPORT(83),
    BLOCK(84),
    MEDIA_UPLOAD(85),
    
    // IoT & Telemetry (86-100)
    SENSOR(86),
    SENSOR_READING(87),
    DEVICE_STATUS(88),
    ALERT(89),
    METRIC(90),
    LOG_ENTRY(91),
    CONFIGURATION(92),
    FIRMWARE(93),
    TELEMETRY(94),
    GEOLOCATION(95),
    NETWORK_PACKET(96),
    SYSTEM_METRIC(97),
    ERROR_LOG(98),
    PERFORMANCE_METRIC(99),
    BACKUP_RECORD(100),
    
    // Additional Business Entities (101-120)
    COMPANY(101),
    DEPARTMENT(102),
    EMPLOYEE(103),
    PROJECT(104),
    TASK(105),
    MILESTONE(106),
    TIMESHEET(107),
    EXPENSE_REPORT(108),
    CONTRACT(109),
    VENDOR(110),
    PURCHASE_ORDER(111),
    INVOICE_ITEM(112),
    RECEIPT(113),
    REFUND(114),
    WARRANTY(115),
    SERVICE_TICKET(116),
    ASSET(117),
    MAINTENANCE_LOG(118),
    FACILITY(119),
    LOCATION(120);
    
    private final int typeId;
    
    MySQLEntityType(int typeId) {
        this.typeId = typeId;
    }
    
    @Override
    public int getTypeId() {
        return typeId;
    }
}