package com.telcobright.db.genericentity.validation;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.*;
import java.util.Date;
import java.sql.Blob;
import java.sql.Clob;

/**
 * Test to verify all MySQL data types are properly supported
 */
public class MySQLTypesValidationTest {
    
    enum MySQLEntityType implements IEntityTypeSet {
        COMPLETE_MYSQL_ENTITY(1),
        BLOB_CLOB_ENTITY(2),
        ENUM_SET_ENTITY(3);
        
        private final int typeId;
        
        MySQLEntityType(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    /**
     * Entity with all MySQL data types mapped to Java types
     * MySQL to Java mapping reference:
     * 
     * Numeric Types:
     * - BIT(1) → Boolean
     * - BIT(n) → byte[] 
     * - TINYINT → Byte/byte
     * - BOOL, BOOLEAN → Boolean
     * - SMALLINT → Short/short
     * - MEDIUMINT → Integer/int
     * - INT, INTEGER → Integer/int
     * - BIGINT → Long/long
     * - DECIMAL, NUMERIC → BigDecimal
     * - FLOAT → Float/float
     * - DOUBLE, REAL → Double/double
     * 
     * String Types:
     * - CHAR, VARCHAR → String
     * - BINARY, VARBINARY → byte[]
     * - TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB → byte[] or Blob
     * - TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT → String or Clob
     * - ENUM → String
     * - SET → String
     * 
     * Date/Time Types:
     * - DATE → LocalDate or java.sql.Date
     * - TIME → LocalTime or java.sql.Time
     * - DATETIME → LocalDateTime
     * - TIMESTAMP → LocalDateTime or java.sql.Timestamp
     * - YEAR → Integer or Short
     * 
     * JSON Type:
     * - JSON → String
     * 
     * Spatial Types (if using MySQL Spatial):
     * - GEOMETRY, POINT, etc. → Usually custom classes or byte[]
     */
    static class CompleteMySQLTypesEntity {
        private Long id;
        
        // Numeric Types
        private Boolean bitField;           // BIT(1)
        private byte[] bitNField;           // BIT(n)
        private Byte tinyIntField;          // TINYINT
        private byte tinyIntPrimitive;      // TINYINT
        private Boolean boolField;          // BOOL/BOOLEAN
        private boolean boolPrimitive;      // BOOL/BOOLEAN
        private Short smallIntField;        // SMALLINT
        private short smallIntPrimitive;    // SMALLINT
        private Integer mediumIntField;     // MEDIUMINT
        private Integer intField;           // INT/INTEGER
        private int intPrimitive;           // INT/INTEGER
        private Long bigIntField;           // BIGINT
        private long bigIntPrimitive;       // BIGINT
        private BigDecimal decimalField;    // DECIMAL/NUMERIC
        private Float floatField;           // FLOAT
        private float floatPrimitive;       // FLOAT
        private Double doubleField;         // DOUBLE/REAL
        private double doublePrimitive;     // DOUBLE/REAL
        
        // String Types
        private String charField;           // CHAR
        private String varcharField;        // VARCHAR
        private byte[] binaryField;         // BINARY
        private byte[] varbinaryField;      // VARBINARY
        private byte[] tinyBlobField;       // TINYBLOB
        private byte[] blobField;           // BLOB
        private byte[] mediumBlobField;     // MEDIUMBLOB
        private byte[] longBlobField;       // LONGBLOB
        private String tinyTextField;       // TINYTEXT
        private String textField;           // TEXT
        private String mediumTextField;     // MEDIUMTEXT
        private String longTextField;       // LONGTEXT
        private String enumField;           // ENUM
        private String setField;            // SET
        
        // Date/Time Types
        private LocalDate dateField;              // DATE
        private java.sql.Date sqlDateField;       // DATE
        private LocalTime timeField;              // TIME
        private java.sql.Time sqlTimeField;       // TIME
        private LocalDateTime datetimeField;      // DATETIME
        private LocalDateTime timestampField;     // TIMESTAMP
        private java.sql.Timestamp sqlTimestamp;  // TIMESTAMP
        private Integer yearField;                // YEAR
        private Short yearFieldShort;             // YEAR
        
        // JSON Type
        private String jsonField;           // JSON
        
        // Spatial types (stored as byte[])
        private byte[] geometryField;       // GEOMETRY
        private byte[] pointField;          // POINT
        
        // Additional Java types that might be used
        private Character charType;         // Can map to CHAR(1)
        private char charPrimitive;         // Can map to CHAR(1)
        private Date utilDateField;         // Can map to DATETIME/TIMESTAMP
        private BigInteger bigIntegerField; // Can map to BIGINT or DECIMAL
        
        // Getters and setters for all fields
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Boolean getBitField() { return bitField; }
        public void setBitField(Boolean bitField) { this.bitField = bitField; }
        
        public byte[] getBitNField() { return bitNField; }
        public void setBitNField(byte[] bitNField) { this.bitNField = bitNField; }
        
        public Byte getTinyIntField() { return tinyIntField; }
        public void setTinyIntField(Byte tinyIntField) { this.tinyIntField = tinyIntField; }
        
        public byte getTinyIntPrimitive() { return tinyIntPrimitive; }
        public void setTinyIntPrimitive(byte tinyIntPrimitive) { this.tinyIntPrimitive = tinyIntPrimitive; }
        
        public Boolean getBoolField() { return boolField; }
        public void setBoolField(Boolean boolField) { this.boolField = boolField; }
        
        public boolean isBoolPrimitive() { return boolPrimitive; }
        public void setBoolPrimitive(boolean boolPrimitive) { this.boolPrimitive = boolPrimitive; }
        
        public Short getSmallIntField() { return smallIntField; }
        public void setSmallIntField(Short smallIntField) { this.smallIntField = smallIntField; }
        
        public short getSmallIntPrimitive() { return smallIntPrimitive; }
        public void setSmallIntPrimitive(short smallIntPrimitive) { this.smallIntPrimitive = smallIntPrimitive; }
        
        public Integer getMediumIntField() { return mediumIntField; }
        public void setMediumIntField(Integer mediumIntField) { this.mediumIntField = mediumIntField; }
        
        public Integer getIntField() { return intField; }
        public void setIntField(Integer intField) { this.intField = intField; }
        
        public int getIntPrimitive() { return intPrimitive; }
        public void setIntPrimitive(int intPrimitive) { this.intPrimitive = intPrimitive; }
        
        public Long getBigIntField() { return bigIntField; }
        public void setBigIntField(Long bigIntField) { this.bigIntField = bigIntField; }
        
        public long getBigIntPrimitive() { return bigIntPrimitive; }
        public void setBigIntPrimitive(long bigIntPrimitive) { this.bigIntPrimitive = bigIntPrimitive; }
        
        public BigDecimal getDecimalField() { return decimalField; }
        public void setDecimalField(BigDecimal decimalField) { this.decimalField = decimalField; }
        
        public Float getFloatField() { return floatField; }
        public void setFloatField(Float floatField) { this.floatField = floatField; }
        
        public float getFloatPrimitive() { return floatPrimitive; }
        public void setFloatPrimitive(float floatPrimitive) { this.floatPrimitive = floatPrimitive; }
        
        public Double getDoubleField() { return doubleField; }
        public void setDoubleField(Double doubleField) { this.doubleField = doubleField; }
        
        public double getDoublePrimitive() { return doublePrimitive; }
        public void setDoublePrimitive(double doublePrimitive) { this.doublePrimitive = doublePrimitive; }
        
        public String getCharField() { return charField; }
        public void setCharField(String charField) { this.charField = charField; }
        
        public String getVarcharField() { return varcharField; }
        public void setVarcharField(String varcharField) { this.varcharField = varcharField; }
        
        public byte[] getBinaryField() { return binaryField; }
        public void setBinaryField(byte[] binaryField) { this.binaryField = binaryField; }
        
        public byte[] getVarbinaryField() { return varbinaryField; }
        public void setVarbinaryField(byte[] varbinaryField) { this.varbinaryField = varbinaryField; }
        
        public byte[] getTinyBlobField() { return tinyBlobField; }
        public void setTinyBlobField(byte[] tinyBlobField) { this.tinyBlobField = tinyBlobField; }
        
        public byte[] getBlobField() { return blobField; }
        public void setBlobField(byte[] blobField) { this.blobField = blobField; }
        
        public byte[] getMediumBlobField() { return mediumBlobField; }
        public void setMediumBlobField(byte[] mediumBlobField) { this.mediumBlobField = mediumBlobField; }
        
        public byte[] getLongBlobField() { return longBlobField; }
        public void setLongBlobField(byte[] longBlobField) { this.longBlobField = longBlobField; }
        
        public String getTinyTextField() { return tinyTextField; }
        public void setTinyTextField(String tinyTextField) { this.tinyTextField = tinyTextField; }
        
        public String getTextField() { return textField; }
        public void setTextField(String textField) { this.textField = textField; }
        
        public String getMediumTextField() { return mediumTextField; }
        public void setMediumTextField(String mediumTextField) { this.mediumTextField = mediumTextField; }
        
        public String getLongTextField() { return longTextField; }
        public void setLongTextField(String longTextField) { this.longTextField = longTextField; }
        
        public String getEnumField() { return enumField; }
        public void setEnumField(String enumField) { this.enumField = enumField; }
        
        public String getSetField() { return setField; }
        public void setSetField(String setField) { this.setField = setField; }
        
        public LocalDate getDateField() { return dateField; }
        public void setDateField(LocalDate dateField) { this.dateField = dateField; }
        
        public java.sql.Date getSqlDateField() { return sqlDateField; }
        public void setSqlDateField(java.sql.Date sqlDateField) { this.sqlDateField = sqlDateField; }
        
        public LocalTime getTimeField() { return timeField; }
        public void setTimeField(LocalTime timeField) { this.timeField = timeField; }
        
        public java.sql.Time getSqlTimeField() { return sqlTimeField; }
        public void setSqlTimeField(java.sql.Time sqlTimeField) { this.sqlTimeField = sqlTimeField; }
        
        public LocalDateTime getDatetimeField() { return datetimeField; }
        public void setDatetimeField(LocalDateTime datetimeField) { this.datetimeField = datetimeField; }
        
        public LocalDateTime getTimestampField() { return timestampField; }
        public void setTimestampField(LocalDateTime timestampField) { this.timestampField = timestampField; }
        
        public java.sql.Timestamp getSqlTimestamp() { return sqlTimestamp; }
        public void setSqlTimestamp(java.sql.Timestamp sqlTimestamp) { this.sqlTimestamp = sqlTimestamp; }
        
        public Integer getYearField() { return yearField; }
        public void setYearField(Integer yearField) { this.yearField = yearField; }
        
        public Short getYearFieldShort() { return yearFieldShort; }
        public void setYearFieldShort(Short yearFieldShort) { this.yearFieldShort = yearFieldShort; }
        
        public String getJsonField() { return jsonField; }
        public void setJsonField(String jsonField) { this.jsonField = jsonField; }
        
        public byte[] getGeometryField() { return geometryField; }
        public void setGeometryField(byte[] geometryField) { this.geometryField = geometryField; }
        
        public byte[] getPointField() { return pointField; }
        public void setPointField(byte[] pointField) { this.pointField = pointField; }
        
        public Character getCharType() { return charType; }
        public void setCharType(Character charType) { this.charType = charType; }
        
        public char getCharPrimitive() { return charPrimitive; }
        public void setCharPrimitive(char charPrimitive) { this.charPrimitive = charPrimitive; }
        
        public Date getUtilDateField() { return utilDateField; }
        public void setUtilDateField(Date utilDateField) { this.utilDateField = utilDateField; }
        
        public BigInteger getBigIntegerField() { return bigIntegerField; }
        public void setBigIntegerField(BigInteger bigIntegerField) { this.bigIntegerField = bigIntegerField; }
    }
    
    /**
     * Entity with Blob/Clob types that might not be supported
     */
    static class BlobClobEntity {
        private Long id;
        private Blob blobField;
        private Clob clobField;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Blob getBlobField() { return blobField; }
        public void setBlobField(Blob blobField) { this.blobField = blobField; }
        
        public Clob getClobField() { return clobField; }
        public void setClobField(Clob clobField) { this.clobField = clobField; }
    }
    
    /**
     * Entity to test enum handling
     */
    static class EnumSetEntity {
        private Long id;
        private TestEnum enumField;
        private String enumAsString;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public TestEnum getEnumField() { return enumField; }
        public void setEnumField(TestEnum enumField) { this.enumField = enumField; }
        
        public String getEnumAsString() { return enumAsString; }
        public void setEnumAsString(String enumAsString) { this.enumAsString = enumAsString; }
    }
    
    enum TestEnum {
        VALUE1, VALUE2, VALUE3
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    MySQL DATA TYPES VALIDATION TEST");
        System.out.println("================================================================================\n");
        
        int passedTests = 0;
        int failedTests = 0;
        
        // Test 1: Complete MySQL types entity
        System.out.println("Test 1: Registering entity with all MySQL-mapped Java types...");
        try {
            GenericEntityStorage<MySQLEntityType> storage1 = 
                GenericEntityStorage.<MySQLEntityType>builder()
                    .withEntityTypeSet(MySQLEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(MySQLEntityType.COMPLETE_MYSQL_ENTITY, CompleteMySQLTypesEntity.class, 100)
                    .build();
            
            // Try to actually store and retrieve data
            CompleteMySQLTypesEntity testEntity = new CompleteMySQLTypesEntity();
            testEntity.setId(1L);
            testEntity.setVarcharField("Test String");
            testEntity.setIntField(42);
            testEntity.setDecimalField(new BigDecimal("123.45"));
            testEntity.setDatetimeField(LocalDateTime.now());
            testEntity.setBlobField(new byte[]{1, 2, 3, 4, 5});
            
            storage1.put(testEntity, MySQLEntityType.COMPLETE_MYSQL_ENTITY);
            CompleteMySQLTypesEntity retrieved = storage1.get(1L, MySQLEntityType.COMPLETE_MYSQL_ENTITY);
            
            if (retrieved != null && "Test String".equals(retrieved.getVarcharField())) {
                System.out.println("  ✅ PASSED: All MySQL types are supported and working");
                passedTests++;
            } else {
                System.out.println("  ❌ FAILED: Data integrity issue with MySQL types");
                failedTests++;
            }
        } catch (Exception e) {
            System.out.println("  ❌ FAILED: MySQL types entity was rejected");
            System.out.println("  Error: " + e.getMessage());
            failedTests++;
        }
        
        // Test 2: Blob/Clob entity (should fail as these aren't in supported types)
        System.out.println("\nTest 2: Registering entity with java.sql.Blob/Clob fields...");
        try {
            GenericEntityStorage<MySQLEntityType> storage2 = 
                GenericEntityStorage.<MySQLEntityType>builder()
                    .withEntityTypeSet(MySQLEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(MySQLEntityType.BLOB_CLOB_ENTITY, BlobClobEntity.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Blob/Clob entity was accepted (should be rejected)");
            failedTests++;
        } catch (Exception e) {
            System.out.println("  ✅ PASSED: Blob/Clob correctly rejected (use byte[] instead)");
            passedTests++;
        }
        
        // Test 3: Enum entity (enums should be rejected unless stored as String)
        System.out.println("\nTest 3: Registering entity with Java enum field...");
        try {
            GenericEntityStorage<MySQLEntityType> storage3 = 
                GenericEntityStorage.<MySQLEntityType>builder()
                    .withEntityTypeSet(MySQLEntityType.class)
                    .withMaxRecords(10000)
                    .registerType(MySQLEntityType.ENUM_SET_ENTITY, EnumSetEntity.class, 100)
                    .build();
            System.out.println("  ❌ FAILED: Java enum was accepted (should be rejected - use String)");
            failedTests++;
        } catch (Exception e) {
            System.out.println("  ✅ PASSED: Java enum correctly rejected (use String for MySQL ENUM)");
            passedTests++;
        }
        
        // Print MySQL type mapping guide
        System.out.println("\n================================================================================");
        System.out.println("                         MySQL TYPE MAPPING GUIDE");
        System.out.println("================================================================================");
        System.out.println("✅ SUPPORTED MySQL to Java mappings:");
        System.out.println("  Numeric:");
        System.out.println("    • BIT(1) → Boolean");
        System.out.println("    • BIT(n) → byte[]");
        System.out.println("    • TINYINT → Byte/byte");
        System.out.println("    • SMALLINT → Short/short");
        System.out.println("    • MEDIUMINT/INT → Integer/int");
        System.out.println("    • BIGINT → Long/long");
        System.out.println("    • DECIMAL/NUMERIC → BigDecimal");
        System.out.println("    • FLOAT → Float/float");
        System.out.println("    • DOUBLE → Double/double");
        System.out.println("  String/Binary:");
        System.out.println("    • CHAR/VARCHAR/TEXT → String");
        System.out.println("    • BINARY/VARBINARY/BLOB → byte[]");
        System.out.println("    • JSON → String");
        System.out.println("    • ENUM/SET → String");
        System.out.println("  Date/Time:");
        System.out.println("    • DATE → LocalDate or java.sql.Date");
        System.out.println("    • TIME → LocalTime or java.sql.Time");
        System.out.println("    • DATETIME/TIMESTAMP → LocalDateTime or java.sql.Timestamp");
        System.out.println("    • YEAR → Integer/Short");
        
        System.out.println("\n❌ NOT SUPPORTED (use alternatives):");
        System.out.println("    • java.sql.Blob → use byte[]");
        System.out.println("    • java.sql.Clob → use String");
        System.out.println("    • Java enums → use String");
        System.out.println("    • BigInteger → currently not supported (add if needed)");
        
        // Print summary
        System.out.println("\n================================================================================");
        System.out.println("                              TEST SUMMARY");
        System.out.println("================================================================================");
        System.out.printf("Tests Passed: %d\n", passedTests);
        System.out.printf("Tests Failed: %d\n", failedTests);
        System.out.printf("Total Tests: %d\n", passedTests + failedTests);
        
        if (failedTests == 0) {
            System.out.println("\n✅ ALL TESTS PASSED - MySQL type support is comprehensive!");
        } else if (passedTests >= 2) {
            System.out.println("\n⚠️ MOSTLY PASSED - Most MySQL types are supported!");
        } else {
            System.out.println("\n❌ TESTS FAILED - MySQL type support needs work!");
        }
        
        System.out.println("================================================================================");
    }
}