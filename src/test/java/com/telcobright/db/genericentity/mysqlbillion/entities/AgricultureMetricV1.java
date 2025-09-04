package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureMetricV1 implements Serializable {
    private static final long serialVersionUID = 1152L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField10;
    private Integer intField13;
    private Long bigIntField60;
    private BigDecimal decimalField50;
    private BigDecimal priceField;
    private Float floatField63;
    private Double doubleField76;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public AgricultureMetricV1() {}

    public AgricultureMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField52() {
        return tinyIntField52;
    }

    public void setTinyIntField52(Byte tinyIntField52) {
        this.tinyIntField52 = tinyIntField52;
    }

    public Short getSmallIntField10() {
        return smallIntField10;
    }

    public void setSmallIntField10(Short smallIntField10) {
        this.smallIntField10 = smallIntField10;
    }

    public Integer getIntField13() {
        return intField13;
    }

    public void setIntField13(Integer intField13) {
        this.intField13 = intField13;
    }

    public Long getBigIntField60() {
        return bigIntField60;
    }

    public void setBigIntField60(Long bigIntField60) {
        this.bigIntField60 = bigIntField60;
    }

    public BigDecimal getDecimalField50() {
        return decimalField50;
    }

    public void setDecimalField50(BigDecimal decimalField50) {
        this.decimalField50 = decimalField50;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField63() {
        return floatField63;
    }

    public void setFloatField63(Float floatField63) {
        this.floatField63 = floatField63;
    }

    public Double getDoubleField76() {
        return doubleField76;
    }

    public void setDoubleField76(Double doubleField76) {
        this.doubleField76 = doubleField76;
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
