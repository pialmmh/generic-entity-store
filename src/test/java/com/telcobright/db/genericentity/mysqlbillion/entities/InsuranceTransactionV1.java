package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceTransactionV1 implements Serializable {
    private static final long serialVersionUID = 528L;

    private Long id;
    private Byte tinyIntField32;
    private Short smallIntField54;
    private Integer intField30;
    private Long bigIntField43;
    private BigDecimal decimalField45;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField46;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceTransactionV1() {}

    public InsuranceTransactionV1(Long id, String code, String name) {
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

    public Short getSmallIntField54() {
        return smallIntField54;
    }

    public void setSmallIntField54(Short smallIntField54) {
        this.smallIntField54 = smallIntField54;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField43() {
        return bigIntField43;
    }

    public void setBigIntField43(Long bigIntField43) {
        this.bigIntField43 = bigIntField43;
    }

    public BigDecimal getDecimalField45() {
        return decimalField45;
    }

    public void setDecimalField45(BigDecimal decimalField45) {
        this.decimalField45 = decimalField45;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField62() {
        return floatField62;
    }

    public void setFloatField62(Float floatField62) {
        this.floatField62 = floatField62;
    }

    public Double getDoubleField46() {
        return doubleField46;
    }

    public void setDoubleField46(Double doubleField46) {
        this.doubleField46 = doubleField46;
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
