package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareLogV1 implements Serializable {
    private static final long serialVersionUID = 75L;

    private Long id;
    private Byte tinyIntField74;
    private Short smallIntField82;
    private Integer intField75;
    private Long bigIntField92;
    private BigDecimal decimalField33;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField56;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcareLogV1() {}

    public HealthcareLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField74() {
        return tinyIntField74;
    }

    public void setTinyIntField74(Byte tinyIntField74) {
        this.tinyIntField74 = tinyIntField74;
    }

    public Short getSmallIntField82() {
        return smallIntField82;
    }

    public void setSmallIntField82(Short smallIntField82) {
        this.smallIntField82 = smallIntField82;
    }

    public Integer getIntField75() {
        return intField75;
    }

    public void setIntField75(Integer intField75) {
        this.intField75 = intField75;
    }

    public Long getBigIntField92() {
        return bigIntField92;
    }

    public void setBigIntField92(Long bigIntField92) {
        this.bigIntField92 = bigIntField92;
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

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField56() {
        return doubleField56;
    }

    public void setDoubleField56(Double doubleField56) {
        this.doubleField56 = doubleField56;
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
