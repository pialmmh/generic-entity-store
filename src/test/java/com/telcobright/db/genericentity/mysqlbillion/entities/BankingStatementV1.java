package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: BankingStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingStatementV1 implements Serializable {
    private static final long serialVersionUID = 654L;

    private Long id;
    private Byte tinyIntField26;
    private Short smallIntField24;
    private Integer intField47;
    private Long bigIntField22;
    private BigDecimal decimalField42;
    private BigDecimal priceField;
    private Float floatField98;
    private Double doubleField16;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public BankingStatementV1() {}

    public BankingStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField26() {
        return tinyIntField26;
    }

    public void setTinyIntField26(Byte tinyIntField26) {
        this.tinyIntField26 = tinyIntField26;
    }

    public Short getSmallIntField24() {
        return smallIntField24;
    }

    public void setSmallIntField24(Short smallIntField24) {
        this.smallIntField24 = smallIntField24;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField22() {
        return bigIntField22;
    }

    public void setBigIntField22(Long bigIntField22) {
        this.bigIntField22 = bigIntField22;
    }

    public BigDecimal getDecimalField42() {
        return decimalField42;
    }

    public void setDecimalField42(BigDecimal decimalField42) {
        this.decimalField42 = decimalField42;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField98() {
        return floatField98;
    }

    public void setFloatField98(Float floatField98) {
        this.floatField98 = floatField98;
    }

    public Double getDoubleField16() {
        return doubleField16;
    }

    public void setDoubleField16(Double doubleField16) {
        this.doubleField16 = doubleField16;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
