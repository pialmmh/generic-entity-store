package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailMetricV1 implements Serializable {
    private static final long serialVersionUID = 162L;

    private Long id;
    private Byte tinyIntField56;
    private Short smallIntField74;
    private Integer intField21;
    private Long bigIntField37;
    private BigDecimal decimalField65;
    private BigDecimal priceField;
    private Float floatField42;
    private Double doubleField81;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RetailMetricV1() {}

    public RetailMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField56() {
        return tinyIntField56;
    }

    public void setTinyIntField56(Byte tinyIntField56) {
        this.tinyIntField56 = tinyIntField56;
    }

    public Short getSmallIntField74() {
        return smallIntField74;
    }

    public void setSmallIntField74(Short smallIntField74) {
        this.smallIntField74 = smallIntField74;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField65() {
        return decimalField65;
    }

    public void setDecimalField65(BigDecimal decimalField65) {
        this.decimalField65 = decimalField65;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField42() {
        return floatField42;
    }

    public void setFloatField42(Float floatField42) {
        this.floatField42 = floatField42;
    }

    public Double getDoubleField81() {
        return doubleField81;
    }

    public void setDoubleField81(Double doubleField81) {
        this.doubleField81 = doubleField81;
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
