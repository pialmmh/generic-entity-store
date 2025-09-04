package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateDetailV1 implements Serializable {
    private static final long serialVersionUID = 1002L;

    private Long id;
    private Byte tinyIntField36;
    private Short smallIntField7;
    private Integer intField38;
    private Long bigIntField92;
    private BigDecimal decimalField65;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField55;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RealEstateDetailV1() {}

    public RealEstateDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField36() {
        return tinyIntField36;
    }

    public void setTinyIntField36(Byte tinyIntField36) {
        this.tinyIntField36 = tinyIntField36;
    }

    public Short getSmallIntField7() {
        return smallIntField7;
    }

    public void setSmallIntField7(Short smallIntField7) {
        this.smallIntField7 = smallIntField7;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField92() {
        return bigIntField92;
    }

    public void setBigIntField92(Long bigIntField92) {
        this.bigIntField92 = bigIntField92;
    }

    public BigDecimal getDecimalField65() {
        return decimalField65;
    }

    public void setDecimalField65(BigDecimal decimalField65) {
        this.decimalField65 = decimalField65;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField55() {
        return doubleField55;
    }

    public void setDoubleField55(Double doubleField55) {
        this.doubleField55 = doubleField55;
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
