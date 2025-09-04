package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 561L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField25;
    private Integer intField5;
    private Long bigIntField3;
    private BigDecimal decimalField8;
    private BigDecimal priceField;
    private Float floatField83;
    private Double doubleField98;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public InsuranceAnalyticsV1() {}

    public InsuranceAnalyticsV1(Long id, String code, String name) {
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

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField5() {
        return intField5;
    }

    public void setIntField5(Integer intField5) {
        this.intField5 = intField5;
    }

    public Long getBigIntField3() {
        return bigIntField3;
    }

    public void setBigIntField3(Long bigIntField3) {
        this.bigIntField3 = bigIntField3;
    }

    public BigDecimal getDecimalField8() {
        return decimalField8;
    }

    public void setDecimalField8(BigDecimal decimalField8) {
        this.decimalField8 = decimalField8;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField83() {
        return floatField83;
    }

    public void setFloatField83(Float floatField83) {
        this.floatField83 = floatField83;
    }

    public Double getDoubleField98() {
        return doubleField98;
    }

    public void setDoubleField98(Double doubleField98) {
        this.doubleField98 = doubleField98;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
