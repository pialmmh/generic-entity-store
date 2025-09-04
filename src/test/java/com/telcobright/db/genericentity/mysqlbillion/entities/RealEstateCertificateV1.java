package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateCertificateV1 implements Serializable {
    private static final long serialVersionUID = 1035L;

    private Long id;
    private Byte tinyIntField2;
    private Short smallIntField11;
    private Integer intField22;
    private Long bigIntField41;
    private BigDecimal decimalField16;
    private BigDecimal priceField;
    private Float floatField99;
    private Double doubleField58;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RealEstateCertificateV1() {}

    public RealEstateCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField2() {
        return tinyIntField2;
    }

    public void setTinyIntField2(Byte tinyIntField2) {
        this.tinyIntField2 = tinyIntField2;
    }

    public Short getSmallIntField11() {
        return smallIntField11;
    }

    public void setSmallIntField11(Short smallIntField11) {
        this.smallIntField11 = smallIntField11;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField41() {
        return bigIntField41;
    }

    public void setBigIntField41(Long bigIntField41) {
        this.bigIntField41 = bigIntField41;
    }

    public BigDecimal getDecimalField16() {
        return decimalField16;
    }

    public void setDecimalField16(BigDecimal decimalField16) {
        this.decimalField16 = decimalField16;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField99() {
        return floatField99;
    }

    public void setFloatField99(Float floatField99) {
        this.floatField99 = floatField99;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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
