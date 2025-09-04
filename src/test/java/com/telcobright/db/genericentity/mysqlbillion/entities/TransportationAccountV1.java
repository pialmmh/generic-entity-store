package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationAccountV1 implements Serializable {
    private static final long serialVersionUID = 963L;

    private Long id;
    private Byte tinyIntField40;
    private Short smallIntField56;
    private Integer intField48;
    private Long bigIntField41;
    private BigDecimal decimalField24;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField98;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TransportationAccountV1() {}

    public TransportationAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField40() {
        return tinyIntField40;
    }

    public void setTinyIntField40(Byte tinyIntField40) {
        this.tinyIntField40 = tinyIntField40;
    }

    public Short getSmallIntField56() {
        return smallIntField56;
    }

    public void setSmallIntField56(Short smallIntField56) {
        this.smallIntField56 = smallIntField56;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField41() {
        return bigIntField41;
    }

    public void setBigIntField41(Long bigIntField41) {
        this.bigIntField41 = bigIntField41;
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

    public Float getFloatField23() {
        return floatField23;
    }

    public void setFloatField23(Float floatField23) {
        this.floatField23 = floatField23;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
