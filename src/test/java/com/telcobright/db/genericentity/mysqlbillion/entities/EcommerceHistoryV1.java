package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceHistoryV1 implements Serializable {
    private static final long serialVersionUID = 678L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField99;
    private Integer intField2;
    private Long bigIntField41;
    private BigDecimal decimalField61;
    private BigDecimal priceField;
    private Float floatField15;
    private Double doubleField85;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceHistoryV1() {}

    public EcommerceHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField39() {
        return tinyIntField39;
    }

    public void setTinyIntField39(Byte tinyIntField39) {
        this.tinyIntField39 = tinyIntField39;
    }

    public Short getSmallIntField99() {
        return smallIntField99;
    }

    public void setSmallIntField99(Short smallIntField99) {
        this.smallIntField99 = smallIntField99;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField41() {
        return bigIntField41;
    }

    public void setBigIntField41(Long bigIntField41) {
        this.bigIntField41 = bigIntField41;
    }

    public BigDecimal getDecimalField61() {
        return decimalField61;
    }

    public void setDecimalField61(BigDecimal decimalField61) {
        this.decimalField61 = decimalField61;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField15() {
        return floatField15;
    }

    public void setFloatField15(Float floatField15) {
        this.floatField15 = floatField15;
    }

    public Double getDoubleField85() {
        return doubleField85;
    }

    public void setDoubleField85(Double doubleField85) {
        this.doubleField85 = doubleField85;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
