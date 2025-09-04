package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 1023L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField83;
    private Integer intField30;
    private Long bigIntField24;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField39;
    private Double doubleField87;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RealEstateAnalyticsV1() {}

    public RealEstateAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField83() {
        return smallIntField83;
    }

    public void setSmallIntField83(Short smallIntField83) {
        this.smallIntField83 = smallIntField83;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField24() {
        return bigIntField24;
    }

    public void setBigIntField24(Long bigIntField24) {
        this.bigIntField24 = bigIntField24;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField39() {
        return floatField39;
    }

    public void setFloatField39(Float floatField39) {
        this.floatField39 = floatField39;
    }

    public Double getDoubleField87() {
        return doubleField87;
    }

    public void setDoubleField87(Double doubleField87) {
        this.doubleField87 = doubleField87;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
