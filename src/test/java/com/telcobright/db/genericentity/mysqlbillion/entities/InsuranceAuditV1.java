package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceAuditV1 implements Serializable {
    private static final long serialVersionUID = 552L;

    private Long id;
    private Byte tinyIntField63;
    private Short smallIntField61;
    private Integer intField41;
    private Long bigIntField56;
    private BigDecimal decimalField88;
    private BigDecimal priceField;
    private Float floatField48;
    private Double doubleField24;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public InsuranceAuditV1() {}

    public InsuranceAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField63() {
        return tinyIntField63;
    }

    public void setTinyIntField63(Byte tinyIntField63) {
        this.tinyIntField63 = tinyIntField63;
    }

    public Short getSmallIntField61() {
        return smallIntField61;
    }

    public void setSmallIntField61(Short smallIntField61) {
        this.smallIntField61 = smallIntField61;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField56() {
        return bigIntField56;
    }

    public void setBigIntField56(Long bigIntField56) {
        this.bigIntField56 = bigIntField56;
    }

    public BigDecimal getDecimalField88() {
        return decimalField88;
    }

    public void setDecimalField88(BigDecimal decimalField88) {
        this.decimalField88 = decimalField88;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField48() {
        return floatField48;
    }

    public void setFloatField48(Float floatField48) {
        this.floatField48 = floatField48;
    }

    public Double getDoubleField24() {
        return doubleField24;
    }

    public void setDoubleField24(Double doubleField24) {
        this.doubleField24 = doubleField24;
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
