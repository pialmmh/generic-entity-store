package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: RetailBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailBalanceV1 implements Serializable {
    private static final long serialVersionUID = 195L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField45;
    private Integer intField47;
    private Long bigIntField45;
    private BigDecimal decimalField28;
    private BigDecimal priceField;
    private Float floatField63;
    private Double doubleField32;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RetailBalanceV1() {}

    public RetailBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField99() {
        return tinyIntField99;
    }

    public void setTinyIntField99(Byte tinyIntField99) {
        this.tinyIntField99 = tinyIntField99;
    }

    public Short getSmallIntField45() {
        return smallIntField45;
    }

    public void setSmallIntField45(Short smallIntField45) {
        this.smallIntField45 = smallIntField45;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField45() {
        return bigIntField45;
    }

    public void setBigIntField45(Long bigIntField45) {
        this.bigIntField45 = bigIntField45;
    }

    public BigDecimal getDecimalField28() {
        return decimalField28;
    }

    public void setDecimalField28(BigDecimal decimalField28) {
        this.decimalField28 = decimalField28;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField63() {
        return floatField63;
    }

    public void setFloatField63(Float floatField63) {
        this.floatField63 = floatField63;
    }

    public Double getDoubleField32() {
        return doubleField32;
    }

    public void setDoubleField32(Double doubleField32) {
        this.doubleField32 = doubleField32;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
