package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentBalanceV1 implements Serializable {
    private static final long serialVersionUID = 459L;

    private Long id;
    private Byte tinyIntField62;
    private Short smallIntField42;
    private Integer intField46;
    private Long bigIntField71;
    private BigDecimal decimalField89;
    private BigDecimal priceField;
    private Float floatField56;
    private Double doubleField5;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GovernmentBalanceV1() {}

    public GovernmentBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField62() {
        return tinyIntField62;
    }

    public void setTinyIntField62(Byte tinyIntField62) {
        this.tinyIntField62 = tinyIntField62;
    }

    public Short getSmallIntField42() {
        return smallIntField42;
    }

    public void setSmallIntField42(Short smallIntField42) {
        this.smallIntField42 = smallIntField42;
    }

    public Integer getIntField46() {
        return intField46;
    }

    public void setIntField46(Integer intField46) {
        this.intField46 = intField46;
    }

    public Long getBigIntField71() {
        return bigIntField71;
    }

    public void setBigIntField71(Long bigIntField71) {
        this.bigIntField71 = bigIntField71;
    }

    public BigDecimal getDecimalField89() {
        return decimalField89;
    }

    public void setDecimalField89(BigDecimal decimalField89) {
        this.decimalField89 = decimalField89;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField56() {
        return floatField56;
    }

    public void setFloatField56(Float floatField56) {
        this.floatField56 = floatField56;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
