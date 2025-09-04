package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 231L;

    private Long id;
    private Byte tinyIntField19;
    private Short smallIntField32;
    private Integer intField29;
    private Long bigIntField50;
    private BigDecimal decimalField56;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField60;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public ManufacturingAnalyticsV1() {}

    public ManufacturingAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField19() {
        return tinyIntField19;
    }

    public void setTinyIntField19(Byte tinyIntField19) {
        this.tinyIntField19 = tinyIntField19;
    }

    public Short getSmallIntField32() {
        return smallIntField32;
    }

    public void setSmallIntField32(Short smallIntField32) {
        this.smallIntField32 = smallIntField32;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField50() {
        return bigIntField50;
    }

    public void setBigIntField50(Long bigIntField50) {
        this.bigIntField50 = bigIntField50;
    }

    public BigDecimal getDecimalField56() {
        return decimalField56;
    }

    public void setDecimalField56(BigDecimal decimalField56) {
        this.decimalField56 = decimalField56;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField60() {
        return doubleField60;
    }

    public void setDoubleField60(Double doubleField60) {
        this.doubleField60 = doubleField60;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
