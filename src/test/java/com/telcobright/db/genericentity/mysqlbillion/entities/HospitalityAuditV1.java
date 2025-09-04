package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityAuditV1 implements Serializable {
    private static final long serialVersionUID = 1212L;

    private Long id;
    private Byte tinyIntField68;
    private Short smallIntField89;
    private Integer intField42;
    private Long bigIntField91;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField32;
    private Double doubleField65;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HospitalityAuditV1() {}

    public HospitalityAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField68() {
        return tinyIntField68;
    }

    public void setTinyIntField68(Byte tinyIntField68) {
        this.tinyIntField68 = tinyIntField68;
    }

    public Short getSmallIntField89() {
        return smallIntField89;
    }

    public void setSmallIntField89(Short smallIntField89) {
        this.smallIntField89 = smallIntField89;
    }

    public Integer getIntField42() {
        return intField42;
    }

    public void setIntField42(Integer intField42) {
        this.intField42 = intField42;
    }

    public Long getBigIntField91() {
        return bigIntField91;
    }

    public void setBigIntField91(Long bigIntField91) {
        this.bigIntField91 = bigIntField91;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField32() {
        return floatField32;
    }

    public void setFloatField32(Float floatField32) {
        this.floatField32 = floatField32;
    }

    public Double getDoubleField65() {
        return doubleField65;
    }

    public void setDoubleField65(Double doubleField65) {
        this.doubleField65 = doubleField65;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
