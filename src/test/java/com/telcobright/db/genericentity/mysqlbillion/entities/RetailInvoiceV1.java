package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 180L;

    private Long id;
    private Byte tinyIntField0;
    private Short smallIntField38;
    private Integer intField30;
    private Long bigIntField83;
    private BigDecimal decimalField33;
    private BigDecimal priceField;
    private Float floatField34;
    private Double doubleField8;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RetailInvoiceV1() {}

    public RetailInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField0() {
        return tinyIntField0;
    }

    public void setTinyIntField0(Byte tinyIntField0) {
        this.tinyIntField0 = tinyIntField0;
    }

    public Short getSmallIntField38() {
        return smallIntField38;
    }

    public void setSmallIntField38(Short smallIntField38) {
        this.smallIntField38 = smallIntField38;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField33() {
        return decimalField33;
    }

    public void setDecimalField33(BigDecimal decimalField33) {
        this.decimalField33 = decimalField33;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField34() {
        return floatField34;
    }

    public void setFloatField34(Float floatField34) {
        this.floatField34 = floatField34;
    }

    public Double getDoubleField8() {
        return doubleField8;
    }

    public void setDoubleField8(Double doubleField8) {
        this.doubleField8 = doubleField8;
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
