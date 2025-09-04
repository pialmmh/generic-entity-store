package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceBalanceV1 implements Serializable {
    private static final long serialVersionUID = 63L;

    private Long id;
    private Byte tinyIntField49;
    private Short smallIntField39;
    private Integer intField39;
    private Long bigIntField64;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField37;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceBalanceV1() {}

    public FinanceBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField49() {
        return tinyIntField49;
    }

    public void setTinyIntField49(Byte tinyIntField49) {
        this.tinyIntField49 = tinyIntField49;
    }

    public Short getSmallIntField39() {
        return smallIntField39;
    }

    public void setSmallIntField39(Short smallIntField39) {
        this.smallIntField39 = smallIntField39;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField64() {
        return bigIntField64;
    }

    public void setBigIntField64(Long bigIntField64) {
        this.bigIntField64 = bigIntField64;
    }

    public BigDecimal getDecimalField99() {
        return decimalField99;
    }

    public void setDecimalField99(BigDecimal decimalField99) {
        this.decimalField99 = decimalField99;
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

    public Double getDoubleField37() {
        return doubleField37;
    }

    public void setDoubleField37(Double doubleField37) {
        this.doubleField37 = doubleField37;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
