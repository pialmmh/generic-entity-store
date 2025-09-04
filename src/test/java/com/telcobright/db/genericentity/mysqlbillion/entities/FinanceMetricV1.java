package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceMetricV1 implements Serializable {
    private static final long serialVersionUID = 30L;

    private Long id;
    private Byte tinyIntField6;
    private Short smallIntField68;
    private Integer intField65;
    private Long bigIntField4;
    private BigDecimal decimalField36;
    private BigDecimal priceField;
    private Float floatField98;
    private Double doubleField86;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public FinanceMetricV1() {}

    public FinanceMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField6() {
        return tinyIntField6;
    }

    public void setTinyIntField6(Byte tinyIntField6) {
        this.tinyIntField6 = tinyIntField6;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField65() {
        return intField65;
    }

    public void setIntField65(Integer intField65) {
        this.intField65 = intField65;
    }

    public Long getBigIntField4() {
        return bigIntField4;
    }

    public void setBigIntField4(Long bigIntField4) {
        this.bigIntField4 = bigIntField4;
    }

    public BigDecimal getDecimalField36() {
        return decimalField36;
    }

    public void setDecimalField36(BigDecimal decimalField36) {
        this.decimalField36 = decimalField36;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField98() {
        return floatField98;
    }

    public void setFloatField98(Float floatField98) {
        this.floatField98 = floatField98;
    }

    public Double getDoubleField86() {
        return doubleField86;
    }

    public void setDoubleField86(Double doubleField86) {
        this.doubleField86 = doubleField86;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
