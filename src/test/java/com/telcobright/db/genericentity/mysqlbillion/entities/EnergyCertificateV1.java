package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyCertificateV1 implements Serializable {
    private static final long serialVersionUID = 1101L;

    private Long id;
    private Byte tinyIntField90;
    private Short smallIntField57;
    private Integer intField97;
    private Long bigIntField20;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField28;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EnergyCertificateV1() {}

    public EnergyCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField90() {
        return tinyIntField90;
    }

    public void setTinyIntField90(Byte tinyIntField90) {
        this.tinyIntField90 = tinyIntField90;
    }

    public Short getSmallIntField57() {
        return smallIntField57;
    }

    public void setSmallIntField57(Short smallIntField57) {
        this.smallIntField57 = smallIntField57;
    }

    public Integer getIntField97() {
        return intField97;
    }

    public void setIntField97(Integer intField97) {
        this.intField97 = intField97;
    }

    public Long getBigIntField20() {
        return bigIntField20;
    }

    public void setBigIntField20(Long bigIntField20) {
        this.bigIntField20 = bigIntField20;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
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

    public Double getDoubleField28() {
        return doubleField28;
    }

    public void setDoubleField28(Double doubleField28) {
        this.doubleField28 = doubleField28;
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
