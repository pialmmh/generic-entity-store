package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsDocumentV1 implements Serializable {
    private static final long serialVersionUID = 1296L;

    private Long id;
    private Byte tinyIntField73;
    private Short smallIntField65;
    private Integer intField32;
    private Long bigIntField91;
    private BigDecimal decimalField40;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField13;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SportsDocumentV1() {}

    public SportsDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField73() {
        return tinyIntField73;
    }

    public void setTinyIntField73(Byte tinyIntField73) {
        this.tinyIntField73 = tinyIntField73;
    }

    public Short getSmallIntField65() {
        return smallIntField65;
    }

    public void setSmallIntField65(Short smallIntField65) {
        this.smallIntField65 = smallIntField65;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField91() {
        return bigIntField91;
    }

    public void setBigIntField91(Long bigIntField91) {
        this.bigIntField91 = bigIntField91;
    }

    public BigDecimal getDecimalField40() {
        return decimalField40;
    }

    public void setDecimalField40(BigDecimal decimalField40) {
        this.decimalField40 = decimalField40;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField13() {
        return doubleField13;
    }

    public void setDoubleField13(Double doubleField13) {
        this.doubleField13 = doubleField13;
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
