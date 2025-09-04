package com.telcobright.db.genericentity.mysqlbillion.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Generates 1000+ MySQL-focused entity classes with diverse data type combinations
 * Covers all common MySQL data types and their edge cases
 */
public class MySQLEntityGenerator {
    
    // MySQL Data Type Categories
    private static final String[] NUMERIC_TYPES = {
        "Byte", "Short", "Integer", "Long", "Float", "Double", "BigDecimal"
    };
    
    private static final String[] STRING_TYPES = {
        "String" // Covers CHAR, VARCHAR, TEXT, MEDIUMTEXT, LONGTEXT
    };
    
    private static final String[] DATE_TIME_TYPES = {
        "LocalDate", "LocalTime", "LocalDateTime", "Instant", "java.sql.Timestamp"
    };
    
    private static final String[] BINARY_TYPES = {
        "byte[]" // Covers BINARY, VARBINARY, BLOB, MEDIUMBLOB, LONGBLOB
    };
    
    private static final String[] BOOLEAN_TYPES = {
        "Boolean" // MySQL BOOLEAN/TINYINT(1)
    };
    
    // Domain categories for realistic entity generation
    private static final String[] DOMAINS = {
        "Finance", "Healthcare", "Retail", "Manufacturing", "Logistics",
        "Education", "Government", "Telecom", "Insurance", "Banking",
        "Ecommerce", "Social", "Gaming", "Media", "Transportation",
        "RealEstate", "Energy", "Agriculture", "Hospitality", "Sports"
    };
    
    private static final String[] ENTITY_SUFFIXES = {
        "Transaction", "Record", "Entry", "Log", "Detail", "Summary",
        "History", "Archive", "Audit", "Report", "Metric", "Analytics",
        "Profile", "Account", "Document", "Certificate", "Invoice",
        "Order", "Payment", "Receipt", "Statement", "Balance"
    };
    
    public static void main(String[] args) throws IOException {
        System.out.println("Generating 1000+ MySQL-focused entities...");
        
        String basePackage = "com.telcobright.db.genericentity.mysqlbillion.entities";
        String basePath = "src/test/java/com/telcobright/db/genericentity/mysqlbillion/entities/";
        
        // Create directory
        new File(basePath).mkdirs();
        
        // Generate enum for all entity types
        generateEntityTypeEnum(basePath, basePackage);
        
        // Generate 1000+ entity classes
        int entityCount = 0;
        for (String domain : DOMAINS) {
            for (String suffix : ENTITY_SUFFIXES) {
                for (int variant = 1; variant <= 3; variant++) {
                    String className = domain + suffix + "V" + variant;
                    generateEntityClass(basePath, basePackage, className, entityCount++, variant);
                }
            }
        }
        
        // Generate additional specialized entities for edge cases
        generateSpecializedEntities(basePath, basePackage, entityCount);
        
        System.out.println("Generated " + (entityCount + 100) + " entity classes successfully!");
    }
    
    private static void generateEntityTypeEnum(String basePath, String basePackage) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("import com.telcobright.db.genericentity.api.IEntityTypeSet;\n\n");
        sb.append("/**\n * Enum for 1000+ MySQL entity types\n */\n");
        sb.append("public enum MySQLBillionEntityType implements IEntityTypeSet {\n");
        
        int id = 1;
        for (String domain : DOMAINS) {
            for (String suffix : ENTITY_SUFFIXES) {
                for (int variant = 1; variant <= 3; variant++) {
                    String enumName = (domain + "_" + suffix + "_V" + variant).toUpperCase();
                    sb.append("    ").append(enumName).append("(").append(id++).append("),\n");
                }
            }
        }
        
        // Add specialized entity types
        for (int i = 1; i <= 100; i++) {
            sb.append("    SPECIAL_ENTITY_").append(i).append("(").append(id++).append(")");
            if (i < 100) sb.append(",");
            sb.append("\n");
        }
        
        sb.append(";\n\n");
        sb.append("    private final int typeId;\n\n");
        sb.append("    MySQLBillionEntityType(int typeId) {\n");
        sb.append("        this.typeId = typeId;\n");
        sb.append("    }\n\n");
        sb.append("    @Override\n");
        sb.append("    public int getTypeId() {\n");
        sb.append("        return typeId;\n");
        sb.append("    }\n");
        sb.append("}\n");
        
        writeToFile(basePath + "MySQLBillionEntityType.java", sb.toString());
    }
    
    private static void generateEntityClass(String basePath, String basePackage, 
                                           String className, int entityId, int variant) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        
        // Add imports based on variant
        Set<String> imports = new HashSet<>();
        imports.add("java.io.Serializable");
        
        List<Field> fields = generateFieldsForVariant(variant, entityId, imports);
        
        // Write imports
        for (String imp : imports) {
            if (!imp.startsWith("java.lang.")) {
                sb.append("import ").append(imp).append(";\n");
            }
        }
        
        sb.append("\n/**\n * MySQL Entity: ").append(className).append("\n");
        sb.append(" * Variant ").append(variant).append(" with specific MySQL data type combinations\n");
        sb.append(" */\n");
        sb.append("public class ").append(className).append(" implements Serializable {\n");
        sb.append("    private static final long serialVersionUID = ").append(entityId).append("L;\n\n");
        
        // Generate fields
        for (Field field : fields) {
            sb.append("    private ").append(field.type).append(" ").append(field.name).append(";\n");
        }
        
        // Generate constructors
        sb.append("\n    public ").append(className).append("() {}\n\n");
        
        // Constructor with key fields
        sb.append("    public ").append(className).append("(");
        int paramCount = 0;
        for (Field field : fields) {
            if (paramCount < 3 && (field.name.equals("id") || field.type.equals("String"))) {
                if (paramCount > 0) sb.append(", ");
                sb.append(field.type).append(" ").append(field.name);
                paramCount++;
            }
        }
        sb.append(") {\n");
        paramCount = 0;
        for (Field field : fields) {
            if (paramCount < 3 && (field.name.equals("id") || field.type.equals("String"))) {
                sb.append("        this.").append(field.name).append(" = ").append(field.name).append(";\n");
                paramCount++;
            }
        }
        sb.append("    }\n\n");
        
        // Generate getters and setters
        for (Field field : fields) {
            String capName = capitalize(field.name);
            sb.append("    public ").append(field.type).append(" get").append(capName).append("() {\n");
            sb.append("        return ").append(field.name).append(";\n");
            sb.append("    }\n\n");
            
            sb.append("    public void set").append(capName).append("(").append(field.type).append(" ").append(field.name).append(") {\n");
            sb.append("        this.").append(field.name).append(" = ").append(field.name).append(";\n");
            sb.append("    }\n\n");
        }
        
        sb.append("}\n");
        
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static List<Field> generateFieldsForVariant(int variant, int entityId, Set<String> imports) {
        List<Field> fields = new ArrayList<>();
        Random random = new Random(entityId);
        
        // Always have ID
        fields.add(new Field("Long", "id"));
        
        // Variant-specific field combinations
        switch (variant) {
            case 1: // Numeric-heavy variant
                generateNumericFields(fields, imports, random);
                generateStringFields(fields, imports, random, 3);
                generateDateTimeFields(fields, imports, random, 2);
                generateBooleanFields(fields, random, 1);
                break;
                
            case 2: // String and DateTime-heavy variant
                generateStringFields(fields, imports, random, 8);
                generateDateTimeFields(fields, imports, random, 5);
                generateNumericFields(fields, imports, random, 3);
                generateBinaryField(fields, imports, random);
                break;
                
            case 3: // Mixed with binary and special types
                generateMixedFields(fields, imports, random);
                generateBinaryField(fields, imports, random);
                generateJsonFields(fields, imports, random);
                generateEnumField(fields, imports, random);
                break;
        }
        
        return fields;
    }
    
    private static void generateNumericFields(List<Field> fields, Set<String> imports, Random random) {
        // TINYINT
        fields.add(new Field("Byte", "tinyIntField" + random.nextInt(100)));
        
        // SMALLINT
        fields.add(new Field("Short", "smallIntField" + random.nextInt(100)));
        
        // INT/INTEGER
        fields.add(new Field("Integer", "intField" + random.nextInt(100)));
        
        // BIGINT
        fields.add(new Field("Long", "bigIntField" + random.nextInt(100)));
        
        // DECIMAL/NUMERIC
        imports.add("java.math.BigDecimal");
        fields.add(new Field("BigDecimal", "decimalField" + random.nextInt(100)));
        fields.add(new Field("BigDecimal", "priceField"));
        
        // FLOAT/DOUBLE
        fields.add(new Field("Float", "floatField" + random.nextInt(100)));
        fields.add(new Field("Double", "doubleField" + random.nextInt(100)));
        
        // Additional numeric fields for calculations
        if (random.nextBoolean()) {
            fields.add(new Field("Integer", "quantity"));
            fields.add(new Field("BigDecimal", "totalAmount"));
            imports.add("java.math.BigDecimal");
        }
    }
    
    private static void generateNumericFields(List<Field> fields, Set<String> imports, Random random, int count) {
        for (int i = 0; i < count; i++) {
            String type = NUMERIC_TYPES[random.nextInt(NUMERIC_TYPES.length)];
            if (type.equals("BigDecimal")) {
                imports.add("java.math.BigDecimal");
            }
            fields.add(new Field(type, "numericField" + i));
        }
    }
    
    private static void generateStringFields(List<Field> fields, Set<String> imports, Random random, int count) {
        String[] fieldNames = {
            "code", "name", "description", "status", "type", "category",
            "reference", "identifier", "label", "title", "content", "notes",
            "address", "email", "phone", "url", "path", "query"
        };
        
        for (int i = 0; i < count && i < fieldNames.length; i++) {
            fields.add(new Field("String", fieldNames[i]));
        }
        
        // Add TEXT field equivalent
        if (random.nextBoolean()) {
            fields.add(new Field("String", "largeText"));
        }
    }
    
    private static void generateDateTimeFields(List<Field> fields, Set<String> imports, Random random, int count) {
        String[] dateFieldNames = {
            "createdAt", "updatedAt", "deletedAt", "startDate", "endDate",
            "effectiveDate", "expiryDate", "processedAt", "scheduledAt"
        };
        
        for (int i = 0; i < count && i < dateFieldNames.length; i++) {
            int typeChoice = random.nextInt(5);
            switch (typeChoice) {
                case 0:
                    imports.add("java.time.LocalDate");
                    fields.add(new Field("LocalDate", dateFieldNames[i]));
                    break;
                case 1:
                    imports.add("java.time.LocalTime");
                    fields.add(new Field("LocalTime", dateFieldNames[i]));
                    break;
                case 2:
                    imports.add("java.time.LocalDateTime");
                    fields.add(new Field("LocalDateTime", dateFieldNames[i]));
                    break;
                case 3:
                    imports.add("java.time.Instant");
                    fields.add(new Field("Instant", dateFieldNames[i]));
                    break;
                case 4:
                    imports.add("java.sql.Timestamp");
                    fields.add(new Field("Timestamp", dateFieldNames[i]));
                    break;
            }
        }
    }
    
    private static void generateBooleanFields(List<Field> fields, Random random, int count) {
        String[] boolFieldNames = {
            "isActive", "isDeleted", "isProcessed", "isValid", "isEnabled",
            "hasErrors", "requiresReview", "autoProcess"
        };
        
        for (int i = 0; i < count && i < boolFieldNames.length; i++) {
            fields.add(new Field("Boolean", boolFieldNames[i]));
        }
    }
    
    private static void generateBinaryField(List<Field> fields, Set<String> imports, Random random) {
        String[] binaryFieldNames = {
            "binaryData", "fileContent", "image", "document", "attachment",
            "serializedObject", "compressedData", "encryptedData"
        };
        
        String fieldName = binaryFieldNames[random.nextInt(binaryFieldNames.length)];
        fields.add(new Field("byte[]", fieldName));
    }
    
    private static void generateJsonFields(List<Field> fields, Set<String> imports, Random random) {
        // MySQL JSON type - stored as String in Java
        fields.add(new Field("String", "jsonData"));
        
        if (random.nextBoolean()) {
            fields.add(new Field("String", "metadata"));
        }
    }
    
    private static void generateEnumField(List<Field> fields, Set<String> imports, Random random) {
        // MySQL ENUM type - stored as String in Java
        fields.add(new Field("String", "enumField"));
    }
    
    private static void generateMixedFields(List<Field> fields, Set<String> imports, Random random) {
        // Mix of all types
        generateNumericFields(fields, imports, random, 2);
        generateStringFields(fields, imports, random, 4);
        generateDateTimeFields(fields, imports, random, 2);
        generateBooleanFields(fields, random, 2);
        
        // Special MySQL types
        if (random.nextBoolean()) {
            // YEAR type
            fields.add(new Field("Integer", "yearField"));
            
            // SET type (stored as String)
            fields.add(new Field("String", "setField"));
        }
    }
    
    private static void generateSpecializedEntities(String basePath, String basePackage, int startId) throws IOException {
        // Generate entities for specific corner cases
        
        // 1. Entity with all NULL-able fields
        generateNullableEntity(basePath, basePackage, startId++);
        
        // 2. Entity with maximum field sizes
        generateMaxSizeEntity(basePath, basePackage, startId++);
        
        // 3. Entity with minimum field sizes
        generateMinSizeEntity(basePath, basePackage, startId++);
        
        // 4. Entity with Unicode/special characters
        generateUnicodeEntity(basePath, basePackage, startId++);
        
        // 5. Entity with precision decimals
        generatePrecisionEntity(basePath, basePackage, startId++);
        
        // Continue generating specialized entities...
        for (int i = 6; i <= 100; i++) {
            generateSpecialEntity(basePath, basePackage, startId++, i);
        }
    }
    
    private static void generateNullableEntity(String basePath, String basePackage, int entityId) throws IOException {
        String className = "SpecialEntity1";
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("import java.math.BigDecimal;\n");
        sb.append("import java.time.LocalDateTime;\n\n");
        sb.append("/**\n * Special Entity 1: All nullable fields for NULL testing\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        sb.append("    private Long id;\n");
        sb.append("    private String nullableString;\n");
        sb.append("    private Integer nullableInt;\n");
        sb.append("    private BigDecimal nullableDecimal;\n");
        sb.append("    private LocalDateTime nullableDateTime;\n");
        sb.append("    private Boolean nullableBoolean;\n");
        sb.append("    private byte[] nullableBytes;\n\n");
        
        // Generate standard getters/setters
        generateGettersSetters(sb, Arrays.asList(
            new Field("Long", "id"),
            new Field("String", "nullableString"),
            new Field("Integer", "nullableInt"),
            new Field("BigDecimal", "nullableDecimal"),
            new Field("LocalDateTime", "nullableDateTime"),
            new Field("Boolean", "nullableBoolean"),
            new Field("byte[]", "nullableBytes")
        ));
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generateMaxSizeEntity(String basePath, String basePackage, int entityId) throws IOException {
        String className = "SpecialEntity2";
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("import java.math.BigDecimal;\n\n");
        sb.append("/**\n * Special Entity 2: Maximum size fields\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        sb.append("    private Long id;\n");
        sb.append("    private String longText; // LONGTEXT equivalent\n");
        sb.append("    private byte[] largeBinary; // LONGBLOB equivalent\n");
        sb.append("    private BigDecimal maxDecimal; // DECIMAL(65,30)\n\n");
        
        generateGettersSetters(sb, Arrays.asList(
            new Field("Long", "id"),
            new Field("String", "longText"),
            new Field("byte[]", "largeBinary"),
            new Field("BigDecimal", "maxDecimal")
        ));
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generateMinSizeEntity(String basePath, String basePackage, int entityId) throws IOException {
        String className = "SpecialEntity3";
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("/**\n * Special Entity 3: Minimum size fields\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        sb.append("    private Long id;\n");
        sb.append("    private Byte tinyField;\n");
        sb.append("    private Boolean bitField;\n");
        sb.append("    private String charField; // CHAR(1)\n\n");
        
        generateGettersSetters(sb, Arrays.asList(
            new Field("Long", "id"),
            new Field("Byte", "tinyField"),
            new Field("Boolean", "bitField"),
            new Field("String", "charField")
        ));
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generateUnicodeEntity(String basePath, String basePackage, int entityId) throws IOException {
        String className = "SpecialEntity4";
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("/**\n * Special Entity 4: Unicode and special characters\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        sb.append("    private Long id;\n");
        sb.append("    private String unicodeText; // UTF8MB4\n");
        sb.append("    private String emojiField;\n");
        sb.append("    private String multiLanguage;\n\n");
        
        generateGettersSetters(sb, Arrays.asList(
            new Field("Long", "id"),
            new Field("String", "unicodeText"),
            new Field("String", "emojiField"),
            new Field("String", "multiLanguage")
        ));
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generatePrecisionEntity(String basePath, String basePackage, int entityId) throws IOException {
        String className = "SpecialEntity5";
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        sb.append("import java.math.BigDecimal;\n\n");
        sb.append("/**\n * Special Entity 5: High precision decimals\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        sb.append("    private Long id;\n");
        sb.append("    private BigDecimal precision2; // DECIMAL(10,2)\n");
        sb.append("    private BigDecimal precision8; // DECIMAL(20,8)\n");
        sb.append("    private BigDecimal precision18; // DECIMAL(38,18)\n\n");
        
        generateGettersSetters(sb, Arrays.asList(
            new Field("Long", "id"),
            new Field("BigDecimal", "precision2"),
            new Field("BigDecimal", "precision8"),
            new Field("BigDecimal", "precision18")
        ));
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generateSpecialEntity(String basePath, String basePackage, int entityId, int number) throws IOException {
        String className = "SpecialEntity" + number;
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(basePackage).append(";\n\n");
        
        Random random = new Random(entityId);
        Set<String> imports = new HashSet<>();
        List<Field> fields = new ArrayList<>();
        
        // Always have ID
        fields.add(new Field("Long", "id"));
        
        // Random combination of fields
        int fieldCount = 5 + random.nextInt(15);
        for (int i = 0; i < fieldCount; i++) {
            int typeChoice = random.nextInt(10);
            switch (typeChoice) {
                case 0:
                case 1:
                case 2:
                    fields.add(new Field("String", "field" + i));
                    break;
                case 3:
                case 4:
                    fields.add(new Field("Integer", "field" + i));
                    break;
                case 5:
                    fields.add(new Field("Long", "field" + i));
                    break;
                case 6:
                    imports.add("java.math.BigDecimal");
                    fields.add(new Field("BigDecimal", "field" + i));
                    break;
                case 7:
                    imports.add("java.time.LocalDateTime");
                    fields.add(new Field("LocalDateTime", "field" + i));
                    break;
                case 8:
                    fields.add(new Field("Boolean", "field" + i));
                    break;
                case 9:
                    fields.add(new Field("byte[]", "field" + i));
                    break;
            }
        }
        
        // Write imports
        for (String imp : imports) {
            sb.append("import ").append(imp).append(";\n");
        }
        if (!imports.isEmpty()) sb.append("\n");
        
        sb.append("/**\n * Special Entity ").append(number).append("\n */\n");
        sb.append("public class ").append(className).append(" {\n");
        
        for (Field field : fields) {
            sb.append("    private ").append(field.type).append(" ").append(field.name).append(";\n");
        }
        sb.append("\n");
        
        generateGettersSetters(sb, fields);
        
        sb.append("}\n");
        writeToFile(basePath + className + ".java", sb.toString());
    }
    
    private static void generateGettersSetters(StringBuilder sb, List<Field> fields) {
        for (Field field : fields) {
            String capName = capitalize(field.name);
            sb.append("    public ").append(field.type).append(" get").append(capName).append("() {\n");
            sb.append("        return ").append(field.name).append(";\n");
            sb.append("    }\n\n");
            
            sb.append("    public void set").append(capName).append("(").append(field.type).append(" ").append(field.name).append(") {\n");
            sb.append("        this.").append(field.name).append(" = ").append(field.name).append(";\n");
            sb.append("    }\n\n");
        }
    }
    
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    private static void writeToFile(String path, String content) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        }
    }
    
    private static class Field {
        final String type;
        final String name;
        
        Field(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}