package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceSummaryV1 implements Serializable {
    private static final long serialVersionUID = 543L;

    private Long id;
    private Byte tinyIntField13;
    private Short smallIntField78;
    private Integer intField39;
    private Long bigIntField63;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField69;
    private Double doubleField14;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceSummaryV1() {}

    public InsuranceSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField13() {
        return tinyIntField13;
    }

    public void setTinyIntField13(Byte tinyIntField13) {
        this.tinyIntField13 = tinyIntField13;
    }

    public Short getSmallIntField78() {
        return smallIntField78;
    }

    public void setSmallIntField78(Short smallIntField78) {
        this.smallIntField78 = smallIntField78;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField69() {
        return floatField69;
    }

    public void setFloatField69(Float floatField69) {
        this.floatField69 = floatField69;
    }

    public Double getDoubleField14() {
        return doubleField14;
    }

    public void setDoubleField14(Double doubleField14) {
        this.doubleField14 = doubleField14;
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
