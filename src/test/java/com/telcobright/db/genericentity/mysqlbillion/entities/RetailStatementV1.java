package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailStatementV1 implements Serializable {
    private static final long serialVersionUID = 192L;

    private Long id;
    private Byte tinyIntField24;
    private Short smallIntField33;
    private Integer intField65;
    private Long bigIntField11;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField75;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RetailStatementV1() {}

    public RetailStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField24() {
        return tinyIntField24;
    }

    public void setTinyIntField24(Byte tinyIntField24) {
        this.tinyIntField24 = tinyIntField24;
    }

    public Short getSmallIntField33() {
        return smallIntField33;
    }

    public void setSmallIntField33(Short smallIntField33) {
        this.smallIntField33 = smallIntField33;
    }

    public Integer getIntField65() {
        return intField65;
    }

    public void setIntField65(Integer intField65) {
        this.intField65 = intField65;
    }

    public Long getBigIntField11() {
        return bigIntField11;
    }

    public void setBigIntField11(Long bigIntField11) {
        this.bigIntField11 = bigIntField11;
    }

    public BigDecimal getDecimalField67() {
        return decimalField67;
    }

    public void setDecimalField67(BigDecimal decimalField67) {
        this.decimalField67 = decimalField67;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField62() {
        return floatField62;
    }

    public void setFloatField62(Float floatField62) {
        this.floatField62 = floatField62;
    }

    public Double getDoubleField75() {
        return doubleField75;
    }

    public void setDoubleField75(Double doubleField75) {
        this.doubleField75 = doubleField75;
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
