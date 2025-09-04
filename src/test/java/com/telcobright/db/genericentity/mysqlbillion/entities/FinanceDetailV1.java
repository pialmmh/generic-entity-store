package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceDetailV1 implements Serializable {
    private static final long serialVersionUID = 12L;

    private Long id;
    private Byte tinyIntField66;
    private Short smallIntField12;
    private Integer intField56;
    private Long bigIntField33;
    private BigDecimal decimalField24;
    private BigDecimal priceField;
    private Float floatField11;
    private Double doubleField50;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceDetailV1() {}

    public FinanceDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField66() {
        return tinyIntField66;
    }

    public void setTinyIntField66(Byte tinyIntField66) {
        this.tinyIntField66 = tinyIntField66;
    }

    public Short getSmallIntField12() {
        return smallIntField12;
    }

    public void setSmallIntField12(Short smallIntField12) {
        this.smallIntField12 = smallIntField12;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField33() {
        return bigIntField33;
    }

    public void setBigIntField33(Long bigIntField33) {
        this.bigIntField33 = bigIntField33;
    }

    public BigDecimal getDecimalField24() {
        return decimalField24;
    }

    public void setDecimalField24(BigDecimal decimalField24) {
        this.decimalField24 = decimalField24;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField11() {
        return floatField11;
    }

    public void setFloatField11(Float floatField11) {
        this.floatField11 = floatField11;
    }

    public Double getDoubleField50() {
        return doubleField50;
    }

    public void setDoubleField50(Double doubleField50) {
        this.doubleField50 = doubleField50;
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
