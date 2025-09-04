package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RetailAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 165L;

    private Long id;
    private Byte tinyIntField34;
    private Short smallIntField94;
    private Integer intField3;
    private Long bigIntField94;
    private BigDecimal decimalField82;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField29;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RetailAnalyticsV1() {}

    public RetailAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField34() {
        return tinyIntField34;
    }

    public void setTinyIntField34(Byte tinyIntField34) {
        this.tinyIntField34 = tinyIntField34;
    }

    public Short getSmallIntField94() {
        return smallIntField94;
    }

    public void setSmallIntField94(Short smallIntField94) {
        this.smallIntField94 = smallIntField94;
    }

    public Integer getIntField3() {
        return intField3;
    }

    public void setIntField3(Integer intField3) {
        this.intField3 = intField3;
    }

    public Long getBigIntField94() {
        return bigIntField94;
    }

    public void setBigIntField94(Long bigIntField94) {
        this.bigIntField94 = bigIntField94;
    }

    public BigDecimal getDecimalField82() {
        return decimalField82;
    }

    public void setDecimalField82(BigDecimal decimalField82) {
        this.decimalField82 = decimalField82;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField29() {
        return doubleField29;
    }

    public void setDoubleField29(Double doubleField29) {
        this.doubleField29 = doubleField29;
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
