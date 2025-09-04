package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceCertificateV1 implements Serializable {
    private static final long serialVersionUID = 45L;

    private Long id;
    private Byte tinyIntField9;
    private Short smallIntField31;
    private Integer intField31;
    private Long bigIntField40;
    private BigDecimal decimalField87;
    private BigDecimal priceField;
    private Float floatField31;
    private Double doubleField1;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public FinanceCertificateV1() {}

    public FinanceCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField9() {
        return tinyIntField9;
    }

    public void setTinyIntField9(Byte tinyIntField9) {
        this.tinyIntField9 = tinyIntField9;
    }

    public Short getSmallIntField31() {
        return smallIntField31;
    }

    public void setSmallIntField31(Short smallIntField31) {
        this.smallIntField31 = smallIntField31;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField40() {
        return bigIntField40;
    }

    public void setBigIntField40(Long bigIntField40) {
        this.bigIntField40 = bigIntField40;
    }

    public BigDecimal getDecimalField87() {
        return decimalField87;
    }

    public void setDecimalField87(BigDecimal decimalField87) {
        this.decimalField87 = decimalField87;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField31() {
        return floatField31;
    }

    public void setFloatField31(Float floatField31) {
        this.floatField31 = floatField31;
    }

    public Double getDoubleField1() {
        return doubleField1;
    }

    public void setDoubleField1(Double doubleField1) {
        this.doubleField1 = doubleField1;
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
