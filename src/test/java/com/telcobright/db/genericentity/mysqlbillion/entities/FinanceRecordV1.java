package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceRecordV1 implements Serializable {
    private static final long serialVersionUID = 3L;

    private Long id;
    private Byte tinyIntField34;
    private Short smallIntField60;
    private Integer intField10;
    private Long bigIntField81;
    private BigDecimal decimalField28;
    private BigDecimal priceField;
    private Float floatField2;
    private Double doubleField49;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public FinanceRecordV1() {}

    public FinanceRecordV1(Long id, String code, String name) {
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

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField10() {
        return intField10;
    }

    public void setIntField10(Integer intField10) {
        this.intField10 = intField10;
    }

    public Long getBigIntField81() {
        return bigIntField81;
    }

    public void setBigIntField81(Long bigIntField81) {
        this.bigIntField81 = bigIntField81;
    }

    public BigDecimal getDecimalField28() {
        return decimalField28;
    }

    public void setDecimalField28(BigDecimal decimalField28) {
        this.decimalField28 = decimalField28;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField2() {
        return floatField2;
    }

    public void setFloatField2(Float floatField2) {
        this.floatField2 = floatField2;
    }

    public Double getDoubleField49() {
        return doubleField49;
    }

    public void setDoubleField49(Double doubleField49) {
        this.doubleField49 = doubleField49;
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
