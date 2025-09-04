package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationEntryV1 implements Serializable {
    private static final long serialVersionUID = 930L;

    private Long id;
    private Byte tinyIntField96;
    private Short smallIntField85;
    private Integer intField74;
    private Long bigIntField33;
    private BigDecimal decimalField60;
    private BigDecimal priceField;
    private Float floatField2;
    private Double doubleField99;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public TransportationEntryV1() {}

    public TransportationEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField96() {
        return tinyIntField96;
    }

    public void setTinyIntField96(Byte tinyIntField96) {
        this.tinyIntField96 = tinyIntField96;
    }

    public Short getSmallIntField85() {
        return smallIntField85;
    }

    public void setSmallIntField85(Short smallIntField85) {
        this.smallIntField85 = smallIntField85;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField33() {
        return bigIntField33;
    }

    public void setBigIntField33(Long bigIntField33) {
        this.bigIntField33 = bigIntField33;
    }

    public BigDecimal getDecimalField60() {
        return decimalField60;
    }

    public void setDecimalField60(BigDecimal decimalField60) {
        this.decimalField60 = decimalField60;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField2() {
        return floatField2;
    }

    public void setFloatField2(Float floatField2) {
        this.floatField2 = floatField2;
    }

    public Double getDoubleField99() {
        return doubleField99;
    }

    public void setDoubleField99(Double doubleField99) {
        this.doubleField99 = doubleField99;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
