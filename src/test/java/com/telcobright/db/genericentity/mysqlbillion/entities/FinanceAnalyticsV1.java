package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 33L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField19;
    private Integer intField3;
    private Long bigIntField7;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField43;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceAnalyticsV1() {}

    public FinanceAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField19() {
        return smallIntField19;
    }

    public void setSmallIntField19(Short smallIntField19) {
        this.smallIntField19 = smallIntField19;
    }

    public Integer getIntField3() {
        return intField3;
    }

    public void setIntField3(Integer intField3) {
        this.intField3 = intField3;
    }

    public Long getBigIntField7() {
        return bigIntField7;
    }

    public void setBigIntField7(Long bigIntField7) {
        this.bigIntField7 = bigIntField7;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField43() {
        return doubleField43;
    }

    public void setDoubleField43(Double doubleField43) {
        this.doubleField43 = doubleField43;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
