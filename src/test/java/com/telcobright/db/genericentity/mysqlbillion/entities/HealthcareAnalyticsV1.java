package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 99L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField58;
    private Integer intField29;
    private Long bigIntField11;
    private BigDecimal decimalField0;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField74;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HealthcareAnalyticsV1() {}

    public HealthcareAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField58() {
        return smallIntField58;
    }

    public void setSmallIntField58(Short smallIntField58) {
        this.smallIntField58 = smallIntField58;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField11() {
        return bigIntField11;
    }

    public void setBigIntField11(Long bigIntField11) {
        this.bigIntField11 = bigIntField11;
    }

    public BigDecimal getDecimalField0() {
        return decimalField0;
    }

    public void setDecimalField0(BigDecimal decimalField0) {
        this.decimalField0 = decimalField0;
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

    public Double getDoubleField74() {
        return doubleField74;
    }

    public void setDoubleField74(Double doubleField74) {
        this.doubleField74 = doubleField74;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
