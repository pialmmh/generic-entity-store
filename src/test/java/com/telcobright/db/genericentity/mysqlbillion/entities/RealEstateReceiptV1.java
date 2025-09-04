package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateReceiptV1 implements Serializable {
    private static final long serialVersionUID = 1047L;

    private Long id;
    private Byte tinyIntField91;
    private Short smallIntField39;
    private Integer intField41;
    private Long bigIntField33;
    private BigDecimal decimalField2;
    private BigDecimal priceField;
    private Float floatField36;
    private Double doubleField8;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RealEstateReceiptV1() {}

    public RealEstateReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField91() {
        return tinyIntField91;
    }

    public void setTinyIntField91(Byte tinyIntField91) {
        this.tinyIntField91 = tinyIntField91;
    }

    public Short getSmallIntField39() {
        return smallIntField39;
    }

    public void setSmallIntField39(Short smallIntField39) {
        this.smallIntField39 = smallIntField39;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField33() {
        return bigIntField33;
    }

    public void setBigIntField33(Long bigIntField33) {
        this.bigIntField33 = bigIntField33;
    }

    public BigDecimal getDecimalField2() {
        return decimalField2;
    }

    public void setDecimalField2(BigDecimal decimalField2) {
        this.decimalField2 = decimalField2;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField36() {
        return floatField36;
    }

    public void setFloatField36(Float floatField36) {
        this.floatField36 = floatField36;
    }

    public Double getDoubleField8() {
        return doubleField8;
    }

    public void setDoubleField8(Double doubleField8) {
        this.doubleField8 = doubleField8;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
