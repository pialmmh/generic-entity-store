package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateOrderV1 implements Serializable {
    private static final long serialVersionUID = 1041L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField63;
    private Integer intField4;
    private Long bigIntField1;
    private BigDecimal decimalField75;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField22;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RealEstateOrderV1() {}

    public RealEstateOrderV1(Long id, String code, String name) {
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

    public Short getSmallIntField63() {
        return smallIntField63;
    }

    public void setSmallIntField63(Short smallIntField63) {
        this.smallIntField63 = smallIntField63;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField1() {
        return bigIntField1;
    }

    public void setBigIntField1(Long bigIntField1) {
        this.bigIntField1 = bigIntField1;
    }

    public BigDecimal getDecimalField75() {
        return decimalField75;
    }

    public void setDecimalField75(BigDecimal decimalField75) {
        this.decimalField75 = decimalField75;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField22() {
        return doubleField22;
    }

    public void setDoubleField22(Double doubleField22) {
        this.doubleField22 = doubleField22;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
