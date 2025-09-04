package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationEntryV1 implements Serializable {
    private static final long serialVersionUID = 336L;

    private Long id;
    private Byte tinyIntField45;
    private Short smallIntField36;
    private Integer intField85;
    private Long bigIntField89;
    private BigDecimal decimalField57;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField11;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EducationEntryV1() {}

    public EducationEntryV1(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getTinyIntField45() {
        return tinyIntField45;
    }

    public void setTinyIntField45(Byte tinyIntField45) {
        this.tinyIntField45 = tinyIntField45;
    }

    public Short getSmallIntField36() {
        return smallIntField36;
    }

    public void setSmallIntField36(Short smallIntField36) {
        this.smallIntField36 = smallIntField36;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField89() {
        return bigIntField89;
    }

    public void setBigIntField89(Long bigIntField89) {
        this.bigIntField89 = bigIntField89;
    }

    public BigDecimal getDecimalField57() {
        return decimalField57;
    }

    public void setDecimalField57(BigDecimal decimalField57) {
        this.decimalField57 = decimalField57;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField11() {
        return doubleField11;
    }

    public void setDoubleField11(Double doubleField11) {
        this.doubleField11 = doubleField11;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
