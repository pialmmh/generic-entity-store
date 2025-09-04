package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateProfileV1 implements Serializable {
    private static final long serialVersionUID = 1026L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField63;
    private Integer intField50;
    private Long bigIntField53;
    private BigDecimal decimalField72;
    private BigDecimal priceField;
    private Float floatField42;
    private Double doubleField76;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RealEstateProfileV1() {}

    public RealEstateProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField63() {
        return smallIntField63;
    }

    public void setSmallIntField63(Short smallIntField63) {
        this.smallIntField63 = smallIntField63;
    }

    public Integer getIntField50() {
        return intField50;
    }

    public void setIntField50(Integer intField50) {
        this.intField50 = intField50;
    }

    public Long getBigIntField53() {
        return bigIntField53;
    }

    public void setBigIntField53(Long bigIntField53) {
        this.bigIntField53 = bigIntField53;
    }

    public BigDecimal getDecimalField72() {
        return decimalField72;
    }

    public void setDecimalField72(BigDecimal decimalField72) {
        this.decimalField72 = decimalField72;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField42() {
        return floatField42;
    }

    public void setFloatField42(Float floatField42) {
        this.floatField42 = floatField42;
    }

    public Double getDoubleField76() {
        return doubleField76;
    }

    public void setDoubleField76(Double doubleField76) {
        this.doubleField76 = doubleField76;
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
