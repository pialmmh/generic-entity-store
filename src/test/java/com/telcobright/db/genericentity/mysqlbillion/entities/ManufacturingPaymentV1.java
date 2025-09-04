package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingPaymentV1 implements Serializable {
    private static final long serialVersionUID = 252L;

    private Long id;
    private Byte tinyIntField40;
    private Short smallIntField13;
    private Integer intField47;
    private Long bigIntField41;
    private BigDecimal decimalField38;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField64;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public ManufacturingPaymentV1() {}

    public ManufacturingPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField40() {
        return tinyIntField40;
    }

    public void setTinyIntField40(Byte tinyIntField40) {
        this.tinyIntField40 = tinyIntField40;
    }

    public Short getSmallIntField13() {
        return smallIntField13;
    }

    public void setSmallIntField13(Short smallIntField13) {
        this.smallIntField13 = smallIntField13;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField41() {
        return bigIntField41;
    }

    public void setBigIntField41(Long bigIntField41) {
        this.bigIntField41 = bigIntField41;
    }

    public BigDecimal getDecimalField38() {
        return decimalField38;
    }

    public void setDecimalField38(BigDecimal decimalField38) {
        this.decimalField38 = decimalField38;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
