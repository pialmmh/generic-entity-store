package com.telcobright.db.genericentity.core;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Generator for the GenericEntity class with all fields and methods
 */
public class GenericEntityGenerator {
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        
        sb.append("package com.telcobright.db.genericentity.core;\n\n");
        sb.append("import java.math.BigDecimal;\n");
        sb.append("import java.time.LocalDateTime;\n");
        sb.append("import java.util.List;\n");
        sb.append("import java.util.Map;\n");
        sb.append("import java.util.Set;\n\n");
        
        sb.append("/**\n");
        sb.append(" * Generic entity structure with 200+ fields to accommodate any entity type.\n");
        sb.append(" * This is the actual structure stored in the HashMap.\n");
        sb.append(" */\n");
        sb.append("public class GenericEntity {\n\n");
        
        // Primary fields
        sb.append("    private Long id;\n");
        sb.append("    private int entityTypeId;\n\n");
        
        // Generate string fields
        sb.append("    // String fields (20)\n");
        for (int i = 1; i <= 20; i++) {
            sb.append("    private String string").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate integer fields
        sb.append("    // Integer fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private Integer int").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate long fields
        sb.append("    // Long fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private Long long").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate double fields
        sb.append("    // Double fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private Double double").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate BigDecimal fields
        sb.append("    // BigDecimal fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private BigDecimal decimal").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate LocalDateTime fields
        sb.append("    // LocalDateTime fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private LocalDateTime datetime").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate boolean fields
        sb.append("    // Boolean fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private Boolean bool").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate byte array fields
        sb.append("    // Byte array fields (10)\n");
        for (int i = 1; i <= 10; i++) {
            sb.append("    private byte[] bytes").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Collection fields
        sb.append("    // List fields (5)\n");
        for (int i = 1; i <= 5; i++) {
            sb.append("    private List<Object> listField").append(i).append(";\n");
        }
        sb.append("\n");
        
        sb.append("    // Map fields (5)\n");
        for (int i = 1; i <= 5; i++) {
            sb.append("    private Map<String, Object> mapField").append(i).append(";\n");
        }
        sb.append("\n");
        
        sb.append("    // Set fields (5)\n");
        for (int i = 1; i <= 5; i++) {
            sb.append("    private Set<Object> setField").append(i).append(";\n");
        }
        sb.append("\n");
        
        // Generate getters and setters
        sb.append("    // Getters and Setters\n\n");
        
        // ID and entityTypeId
        sb.append("    public Long getId() { return id; }\n");
        sb.append("    public void setId(Long id) { this.id = id; }\n\n");
        
        sb.append("    public int getEntityTypeId() { return entityTypeId; }\n");
        sb.append("    public void setEntityTypeId(int entityTypeId) { this.entityTypeId = entityTypeId; }\n\n");
        
        // String getters/setters
        for (int i = 1; i <= 20; i++) {
            sb.append("    public String getString").append(i).append("() { return string").append(i).append("; }\n");
            sb.append("    public void setString").append(i).append("(String string").append(i).append(") { this.string").append(i).append(" = string").append(i).append("; }\n\n");
        }
        
        // Integer getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public Integer getInt").append(i).append("() { return int").append(i).append("; }\n");
            sb.append("    public void setInt").append(i).append("(Integer int").append(i).append(") { this.int").append(i).append(" = int").append(i).append("; }\n\n");
        }
        
        // Long getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public Long getLong").append(i).append("() { return long").append(i).append("; }\n");
            sb.append("    public void setLong").append(i).append("(Long long").append(i).append(") { this.long").append(i).append(" = long").append(i).append("; }\n\n");
        }
        
        // Double getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public Double getDouble").append(i).append("() { return double").append(i).append("; }\n");
            sb.append("    public void setDouble").append(i).append("(Double double").append(i).append(") { this.double").append(i).append(" = double").append(i).append("; }\n\n");
        }
        
        // BigDecimal getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public BigDecimal getDecimal").append(i).append("() { return decimal").append(i).append("; }\n");
            sb.append("    public void setDecimal").append(i).append("(BigDecimal decimal").append(i).append(") { this.decimal").append(i).append(" = decimal").append(i).append("; }\n\n");
        }
        
        // LocalDateTime getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public LocalDateTime getDatetime").append(i).append("() { return datetime").append(i).append("; }\n");
            sb.append("    public void setDatetime").append(i).append("(LocalDateTime datetime").append(i).append(") { this.datetime").append(i).append(" = datetime").append(i).append("; }\n\n");
        }
        
        // Boolean getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public Boolean getBool").append(i).append("() { return bool").append(i).append("; }\n");
            sb.append("    public void setBool").append(i).append("(Boolean bool").append(i).append(") { this.bool").append(i).append(" = bool").append(i).append("; }\n\n");
        }
        
        // Byte array getters/setters
        for (int i = 1; i <= 10; i++) {
            sb.append("    public byte[] getBytes").append(i).append("() { return bytes").append(i).append("; }\n");
            sb.append("    public void setBytes").append(i).append("(byte[] bytes").append(i).append(") { this.bytes").append(i).append(" = bytes").append(i).append("; }\n\n");
        }
        
        // List getters/setters
        for (int i = 1; i <= 5; i++) {
            sb.append("    public List<Object> getListField").append(i).append("() { return listField").append(i).append("; }\n");
            sb.append("    public void setListField").append(i).append("(List<Object> listField").append(i).append(") { this.listField").append(i).append(" = listField").append(i).append("; }\n\n");
        }
        
        // Map getters/setters
        for (int i = 1; i <= 5; i++) {
            sb.append("    public Map<String, Object> getMapField").append(i).append("() { return mapField").append(i).append("; }\n");
            sb.append("    public void setMapField").append(i).append("(Map<String, Object> mapField").append(i).append(") { this.mapField").append(i).append(" = mapField").append(i).append("; }\n\n");
        }
        
        // Set getters/setters
        for (int i = 1; i <= 5; i++) {
            sb.append("    public Set<Object> getSetField").append(i).append("() { return setField").append(i).append("; }\n");
            sb.append("    public void setSetField").append(i).append("(Set<Object> setField").append(i).append(") { this.setField").append(i).append(" = setField").append(i).append("; }\n\n");
        }
        
        sb.append("}\n");
        
        // Write to file
        try (FileWriter writer = new FileWriter("src/main/java/com/telcobright/db/genericentity/core/GenericEntity.java")) {
            writer.write(sb.toString());
        }
        
        System.out.println("GenericEntity.java generated successfully!");
    }
}