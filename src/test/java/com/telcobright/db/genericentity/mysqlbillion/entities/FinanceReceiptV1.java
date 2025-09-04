package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceReceiptV1 implements Serializable {
    private static final long serialVersionUID = 57L;

    private Long id;
    private Byte tinyIntField98;
    private Short smallIntField11;
    private Integer intField2;
    private Long bigIntField32;
    private BigDecimal decimalField21;
    private BigDecimal priceField;
    private Float floatField68;
    private Double doubleField4;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public FinanceReceiptV1() {}

    public FinanceReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField98() {
        return tinyIntField98;
    }

    public void setTinyIntField98(Byte tinyIntField98) {
        this.tinyIntField98 = tinyIntField98;
    }

    public Short getSmallIntField11() {
        return smallIntField11;
    }

    public void setSmallIntField11(Short smallIntField11) {
        this.smallIntField11 = smallIntField11;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField32() {
        return bigIntField32;
    }

    public void setBigIntField32(Long bigIntField32) {
        this.bigIntField32 = bigIntField32;
    }

    public BigDecimal getDecimalField21() {
        return decimalField21;
    }

    public void setDecimalField21(BigDecimal decimalField21) {
        this.decimalField21 = decimalField21;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField68() {
        return floatField68;
    }

    public void setFloatField68(Float floatField68) {
        this.floatField68 = floatField68;
    }

    public Double getDoubleField4() {
        return doubleField4;
    }

    public void setDoubleField4(Double doubleField4) {
        this.doubleField4 = doubleField4;
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
