package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: GamingMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingMetricV1 implements Serializable {
    private static final long serialVersionUID = 822L;

    private Long id;
    private Byte tinyIntField60;
    private Short smallIntField2;
    private Integer intField22;
    private Long bigIntField72;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField22;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GamingMetricV1() {}

    public GamingMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField60() {
        return tinyIntField60;
    }

    public void setTinyIntField60(Byte tinyIntField60) {
        this.tinyIntField60 = tinyIntField60;
    }

    public Short getSmallIntField2() {
        return smallIntField2;
    }

    public void setSmallIntField2(Short smallIntField2) {
        this.smallIntField2 = smallIntField2;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField72() {
        return bigIntField72;
    }

    public void setBigIntField72(Long bigIntField72) {
        this.bigIntField72 = bigIntField72;
    }

    public BigDecimal getDecimalField99() {
        return decimalField99;
    }

    public void setDecimalField99(BigDecimal decimalField99) {
        this.decimalField99 = decimalField99;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField22() {
        return doubleField22;
    }

    public void setDoubleField22(Double doubleField22) {
        this.doubleField22 = doubleField22;
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
