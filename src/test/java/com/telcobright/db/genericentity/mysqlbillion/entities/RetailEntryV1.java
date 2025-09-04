package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RetailEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailEntryV1 implements Serializable {
    private static final long serialVersionUID = 138L;

    private Long id;
    private Byte tinyIntField42;
    private Short smallIntField50;
    private Integer intField66;
    private Long bigIntField65;
    private BigDecimal decimalField98;
    private BigDecimal priceField;
    private Float floatField26;
    private Double doubleField64;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RetailEntryV1() {}

    public RetailEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField42() {
        return tinyIntField42;
    }

    public void setTinyIntField42(Byte tinyIntField42) {
        this.tinyIntField42 = tinyIntField42;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField66() {
        return intField66;
    }

    public void setIntField66(Integer intField66) {
        this.intField66 = intField66;
    }

    public Long getBigIntField65() {
        return bigIntField65;
    }

    public void setBigIntField65(Long bigIntField65) {
        this.bigIntField65 = bigIntField65;
    }

    public BigDecimal getDecimalField98() {
        return decimalField98;
    }

    public void setDecimalField98(BigDecimal decimalField98) {
        this.decimalField98 = decimalField98;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField26() {
        return floatField26;
    }

    public void setFloatField26(Float floatField26) {
        this.floatField26 = floatField26;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
