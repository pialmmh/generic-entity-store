package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsArchiveV1 implements Serializable {
    private static final long serialVersionUID = 1275L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField12;
    private Integer intField60;
    private Long bigIntField2;
    private BigDecimal decimalField30;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField19;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SportsArchiveV1() {}

    public SportsArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField75() {
        return tinyIntField75;
    }

    public void setTinyIntField75(Byte tinyIntField75) {
        this.tinyIntField75 = tinyIntField75;
    }

    public Short getSmallIntField12() {
        return smallIntField12;
    }

    public void setSmallIntField12(Short smallIntField12) {
        this.smallIntField12 = smallIntField12;
    }

    public Integer getIntField60() {
        return intField60;
    }

    public void setIntField60(Integer intField60) {
        this.intField60 = intField60;
    }

    public Long getBigIntField2() {
        return bigIntField2;
    }

    public void setBigIntField2(Long bigIntField2) {
        this.bigIntField2 = bigIntField2;
    }

    public BigDecimal getDecimalField30() {
        return decimalField30;
    }

    public void setDecimalField30(BigDecimal decimalField30) {
        this.decimalField30 = decimalField30;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField19() {
        return doubleField19;
    }

    public void setDoubleField19(Double doubleField19) {
        this.doubleField19 = doubleField19;
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
