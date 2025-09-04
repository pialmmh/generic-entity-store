package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 1236L;

    private Long id;
    private Byte tinyIntField81;
    private Short smallIntField13;
    private Integer intField97;
    private Long bigIntField63;
    private BigDecimal decimalField41;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField34;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HospitalityInvoiceV1() {}

    public HospitalityInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField81() {
        return tinyIntField81;
    }

    public void setTinyIntField81(Byte tinyIntField81) {
        this.tinyIntField81 = tinyIntField81;
    }

    public Short getSmallIntField13() {
        return smallIntField13;
    }

    public void setSmallIntField13(Short smallIntField13) {
        this.smallIntField13 = smallIntField13;
    }

    public Integer getIntField97() {
        return intField97;
    }

    public void setIntField97(Integer intField97) {
        this.intField97 = intField97;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
    }

    public BigDecimal getDecimalField41() {
        return decimalField41;
    }

    public void setDecimalField41(BigDecimal decimalField41) {
        this.decimalField41 = decimalField41;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField34() {
        return doubleField34;
    }

    public void setDoubleField34(Double doubleField34) {
        this.doubleField34 = doubleField34;
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
