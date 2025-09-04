package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareBalanceV1 implements Serializable {
    private static final long serialVersionUID = 129L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField6;
    private Integer intField21;
    private Long bigIntField88;
    private BigDecimal decimalField6;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField1;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HealthcareBalanceV1() {}

    public HealthcareBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField15() {
        return tinyIntField15;
    }

    public void setTinyIntField15(Byte tinyIntField15) {
        this.tinyIntField15 = tinyIntField15;
    }

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField6() {
        return decimalField6;
    }

    public void setDecimalField6(BigDecimal decimalField6) {
        this.decimalField6 = decimalField6;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField22() {
        return floatField22;
    }

    public void setFloatField22(Float floatField22) {
        this.floatField22 = floatField22;
    }

    public Double getDoubleField1() {
        return doubleField1;
    }

    public void setDoubleField1(Double doubleField1) {
        this.doubleField1 = doubleField1;
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
