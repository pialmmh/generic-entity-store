package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareDetailV1 implements Serializable {
    private static final long serialVersionUID = 78L;

    private Long id;
    private Byte tinyIntField50;
    private Short smallIntField98;
    private Integer intField30;
    private Long bigIntField37;
    private BigDecimal decimalField46;
    private BigDecimal priceField;
    private Float floatField99;
    private Double doubleField33;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HealthcareDetailV1() {}

    public HealthcareDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField50() {
        return tinyIntField50;
    }

    public void setTinyIntField50(Byte tinyIntField50) {
        this.tinyIntField50 = tinyIntField50;
    }

    public Short getSmallIntField98() {
        return smallIntField98;
    }

    public void setSmallIntField98(Short smallIntField98) {
        this.smallIntField98 = smallIntField98;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField46() {
        return decimalField46;
    }

    public void setDecimalField46(BigDecimal decimalField46) {
        this.decimalField46 = decimalField46;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField99() {
        return floatField99;
    }

    public void setFloatField99(Float floatField99) {
        this.floatField99 = floatField99;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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
