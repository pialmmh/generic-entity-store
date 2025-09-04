package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareTransactionV1 implements Serializable {
    private static final long serialVersionUID = 66L;

    private Long id;
    private Byte tinyIntField44;
    private Short smallIntField87;
    private Integer intField3;
    private Long bigIntField3;
    private BigDecimal decimalField36;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField74;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HealthcareTransactionV1() {}

    public HealthcareTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField44() {
        return tinyIntField44;
    }

    public void setTinyIntField44(Byte tinyIntField44) {
        this.tinyIntField44 = tinyIntField44;
    }

    public Short getSmallIntField87() {
        return smallIntField87;
    }

    public void setSmallIntField87(Short smallIntField87) {
        this.smallIntField87 = smallIntField87;
    }

    public Integer getIntField3() {
        return intField3;
    }

    public void setIntField3(Integer intField3) {
        this.intField3 = intField3;
    }

    public Long getBigIntField3() {
        return bigIntField3;
    }

    public void setBigIntField3(Long bigIntField3) {
        this.bigIntField3 = bigIntField3;
    }

    public BigDecimal getDecimalField36() {
        return decimalField36;
    }

    public void setDecimalField36(BigDecimal decimalField36) {
        this.decimalField36 = decimalField36;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField41() {
        return floatField41;
    }

    public void setFloatField41(Float floatField41) {
        this.floatField41 = floatField41;
    }

    public Double getDoubleField74() {
        return doubleField74;
    }

    public void setDoubleField74(Double doubleField74) {
        this.doubleField74 = doubleField74;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
