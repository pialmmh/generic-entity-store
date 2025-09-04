package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareProfileV1 implements Serializable {
    private static final long serialVersionUID = 102L;

    private Long id;
    private Byte tinyIntField63;
    private Short smallIntField74;
    private Integer intField85;
    private Long bigIntField9;
    private BigDecimal decimalField65;
    private BigDecimal priceField;
    private Float floatField64;
    private Double doubleField2;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcareProfileV1() {}

    public HealthcareProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField63() {
        return tinyIntField63;
    }

    public void setTinyIntField63(Byte tinyIntField63) {
        this.tinyIntField63 = tinyIntField63;
    }

    public Short getSmallIntField74() {
        return smallIntField74;
    }

    public void setSmallIntField74(Short smallIntField74) {
        this.smallIntField74 = smallIntField74;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField9() {
        return bigIntField9;
    }

    public void setBigIntField9(Long bigIntField9) {
        this.bigIntField9 = bigIntField9;
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

    public Float getFloatField64() {
        return floatField64;
    }

    public void setFloatField64(Float floatField64) {
        this.floatField64 = floatField64;
    }

    public Double getDoubleField2() {
        return doubleField2;
    }

    public void setDoubleField2(Double doubleField2) {
        this.doubleField2 = doubleField2;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
