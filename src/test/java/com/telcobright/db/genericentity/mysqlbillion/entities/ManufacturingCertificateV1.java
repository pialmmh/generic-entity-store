package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingCertificateV1 implements Serializable {
    private static final long serialVersionUID = 243L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField61;
    private Integer intField49;
    private Long bigIntField42;
    private BigDecimal decimalField90;
    private BigDecimal priceField;
    private Float floatField21;
    private Double doubleField62;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public ManufacturingCertificateV1() {}

    public ManufacturingCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField8() {
        return tinyIntField8;
    }

    public void setTinyIntField8(Byte tinyIntField8) {
        this.tinyIntField8 = tinyIntField8;
    }

    public Short getSmallIntField61() {
        return smallIntField61;
    }

    public void setSmallIntField61(Short smallIntField61) {
        this.smallIntField61 = smallIntField61;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField42() {
        return bigIntField42;
    }

    public void setBigIntField42(Long bigIntField42) {
        this.bigIntField42 = bigIntField42;
    }

    public BigDecimal getDecimalField90() {
        return decimalField90;
    }

    public void setDecimalField90(BigDecimal decimalField90) {
        this.decimalField90 = decimalField90;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField21() {
        return floatField21;
    }

    public void setFloatField21(Float floatField21) {
        this.floatField21 = floatField21;
    }

    public Double getDoubleField62() {
        return doubleField62;
    }

    public void setDoubleField62(Double doubleField62) {
        this.doubleField62 = doubleField62;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
