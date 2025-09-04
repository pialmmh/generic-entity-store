package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 1302L;

    private Long id;
    private Byte tinyIntField24;
    private Short smallIntField41;
    private Integer intField21;
    private Long bigIntField71;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField99;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SportsInvoiceV1() {}

    public SportsInvoiceV1(Long id, String code, String name) {
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

    public Short getSmallIntField41() {
        return smallIntField41;
    }

    public void setSmallIntField41(Short smallIntField41) {
        this.smallIntField41 = smallIntField41;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField71() {
        return bigIntField71;
    }

    public void setBigIntField71(Long bigIntField71) {
        this.bigIntField71 = bigIntField71;
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

    public Float getFloatField24() {
        return floatField24;
    }

    public void setFloatField24(Float floatField24) {
        this.floatField24 = floatField24;
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
