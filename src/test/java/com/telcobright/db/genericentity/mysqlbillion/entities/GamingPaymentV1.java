package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GamingPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingPaymentV1 implements Serializable {
    private static final long serialVersionUID = 846L;

    private Long id;
    private Byte tinyIntField91;
    private Short smallIntField9;
    private Integer intField84;
    private Long bigIntField34;
    private BigDecimal decimalField42;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField99;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GamingPaymentV1() {}

    public GamingPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField91() {
        return tinyIntField91;
    }

    public void setTinyIntField91(Byte tinyIntField91) {
        this.tinyIntField91 = tinyIntField91;
    }

    public Short getSmallIntField9() {
        return smallIntField9;
    }

    public void setSmallIntField9(Short smallIntField9) {
        this.smallIntField9 = smallIntField9;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField34() {
        return bigIntField34;
    }

    public void setBigIntField34(Long bigIntField34) {
        this.bigIntField34 = bigIntField34;
    }

    public BigDecimal getDecimalField42() {
        return decimalField42;
    }

    public void setDecimalField42(BigDecimal decimalField42) {
        this.decimalField42 = decimalField42;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
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
