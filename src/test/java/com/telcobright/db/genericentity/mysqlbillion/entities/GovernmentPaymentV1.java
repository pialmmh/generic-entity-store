package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentPaymentV1 implements Serializable {
    private static final long serialVersionUID = 450L;

    private Long id;
    private Byte tinyIntField32;
    private Short smallIntField46;
    private Integer intField75;
    private Long bigIntField83;
    private BigDecimal decimalField45;
    private BigDecimal priceField;
    private Float floatField51;
    private Double doubleField23;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GovernmentPaymentV1() {}

    public GovernmentPaymentV1(Long id, String code, String name) {
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

    public Short getSmallIntField46() {
        return smallIntField46;
    }

    public void setSmallIntField46(Short smallIntField46) {
        this.smallIntField46 = smallIntField46;
    }

    public Integer getIntField75() {
        return intField75;
    }

    public void setIntField75(Integer intField75) {
        this.intField75 = intField75;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
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

    public Float getFloatField51() {
        return floatField51;
    }

    public void setFloatField51(Float floatField51) {
        this.floatField51 = floatField51;
    }

    public Double getDoubleField23() {
        return doubleField23;
    }

    public void setDoubleField23(Double doubleField23) {
        this.doubleField23 = doubleField23;
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
