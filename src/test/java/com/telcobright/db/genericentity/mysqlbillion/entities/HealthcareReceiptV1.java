package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareReceiptV1 implements Serializable {
    private static final long serialVersionUID = 123L;

    private Long id;
    private Byte tinyIntField82;
    private Short smallIntField50;
    private Integer intField76;
    private Long bigIntField89;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField34;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HealthcareReceiptV1() {}

    public HealthcareReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField82() {
        return tinyIntField82;
    }

    public void setTinyIntField82(Byte tinyIntField82) {
        this.tinyIntField82 = tinyIntField82;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField89() {
        return bigIntField89;
    }

    public void setBigIntField89(Long bigIntField89) {
        this.bigIntField89 = bigIntField89;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField57() {
        return floatField57;
    }

    public void setFloatField57(Float floatField57) {
        this.floatField57 = floatField57;
    }

    public Double getDoubleField34() {
        return doubleField34;
    }

    public void setDoubleField34(Double doubleField34) {
        this.doubleField34 = doubleField34;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
