package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailPaymentV1 implements Serializable {
    private static final long serialVersionUID = 186L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField66;
    private Integer intField20;
    private Long bigIntField62;
    private BigDecimal decimalField60;
    private BigDecimal priceField;
    private Float floatField36;
    private Double doubleField42;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RetailPaymentV1() {}

    public RetailPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField51() {
        return tinyIntField51;
    }

    public void setTinyIntField51(Byte tinyIntField51) {
        this.tinyIntField51 = tinyIntField51;
    }

    public Short getSmallIntField66() {
        return smallIntField66;
    }

    public void setSmallIntField66(Short smallIntField66) {
        this.smallIntField66 = smallIntField66;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField60() {
        return decimalField60;
    }

    public void setDecimalField60(BigDecimal decimalField60) {
        this.decimalField60 = decimalField60;
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

    public Double getDoubleField42() {
        return doubleField42;
    }

    public void setDoubleField42(Double doubleField42) {
        this.doubleField42 = doubleField42;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
