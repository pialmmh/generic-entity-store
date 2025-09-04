package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareAccountV1 implements Serializable {
    private static final long serialVersionUID = 105L;

    private Long id;
    private Byte tinyIntField42;
    private Short smallIntField94;
    private Integer intField20;
    private Long bigIntField65;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField98;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcareAccountV1() {}

    public HealthcareAccountV1(Long id, String code, String name) {
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

    public Short getSmallIntField94() {
        return smallIntField94;
    }

    public void setSmallIntField94(Short smallIntField94) {
        this.smallIntField94 = smallIntField94;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField65() {
        return bigIntField65;
    }

    public void setBigIntField65(Long bigIntField65) {
        this.bigIntField65 = bigIntField65;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField18() {
        return floatField18;
    }

    public void setFloatField18(Float floatField18) {
        this.floatField18 = floatField18;
    }

    public Double getDoubleField98() {
        return doubleField98;
    }

    public void setDoubleField98(Double doubleField98) {
        this.doubleField98 = doubleField98;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
