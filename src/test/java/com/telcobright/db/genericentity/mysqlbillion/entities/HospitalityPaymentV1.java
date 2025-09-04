package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityPaymentV1 implements Serializable {
    private static final long serialVersionUID = 1242L;

    private Long id;
    private Byte tinyIntField32;
    private Short smallIntField41;
    private Integer intField86;
    private Long bigIntField42;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField98;
    private Double doubleField68;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HospitalityPaymentV1() {}

    public HospitalityPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField32() {
        return tinyIntField32;
    }

    public void setTinyIntField32(Byte tinyIntField32) {
        this.tinyIntField32 = tinyIntField32;
    }

    public Short getSmallIntField41() {
        return smallIntField41;
    }

    public void setSmallIntField41(Short smallIntField41) {
        this.smallIntField41 = smallIntField41;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField42() {
        return bigIntField42;
    }

    public void setBigIntField42(Long bigIntField42) {
        this.bigIntField42 = bigIntField42;
    }

    public BigDecimal getDecimalField67() {
        return decimalField67;
    }

    public void setDecimalField67(BigDecimal decimalField67) {
        this.decimalField67 = decimalField67;
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

    public Double getDoubleField68() {
        return doubleField68;
    }

    public void setDoubleField68(Double doubleField68) {
        this.doubleField68 = doubleField68;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
