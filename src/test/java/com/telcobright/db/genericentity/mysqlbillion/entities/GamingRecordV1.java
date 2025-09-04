package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GamingRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingRecordV1 implements Serializable {
    private static final long serialVersionUID = 795L;

    private Long id;
    private Byte tinyIntField70;
    private Short smallIntField63;
    private Integer intField11;
    private Long bigIntField55;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField56;
    private Double doubleField76;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GamingRecordV1() {}

    public GamingRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField70() {
        return tinyIntField70;
    }

    public void setTinyIntField70(Byte tinyIntField70) {
        this.tinyIntField70 = tinyIntField70;
    }

    public Short getSmallIntField63() {
        return smallIntField63;
    }

    public void setSmallIntField63(Short smallIntField63) {
        this.smallIntField63 = smallIntField63;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField55() {
        return bigIntField55;
    }

    public void setBigIntField55(Long bigIntField55) {
        this.bigIntField55 = bigIntField55;
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

    public Float getFloatField56() {
        return floatField56;
    }

    public void setFloatField56(Float floatField56) {
        this.floatField56 = floatField56;
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
