package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationPaymentV1 implements Serializable {
    private static final long serialVersionUID = 384L;

    private Long id;
    private Byte tinyIntField48;
    private Short smallIntField8;
    private Integer intField0;
    private Long bigIntField26;
    private BigDecimal decimalField71;
    private BigDecimal priceField;
    private Float floatField63;
    private Double doubleField92;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EducationPaymentV1() {}

    public EducationPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField48() {
        return tinyIntField48;
    }

    public void setTinyIntField48(Byte tinyIntField48) {
        this.tinyIntField48 = tinyIntField48;
    }

    public Short getSmallIntField8() {
        return smallIntField8;
    }

    public void setSmallIntField8(Short smallIntField8) {
        this.smallIntField8 = smallIntField8;
    }

    public Integer getIntField0() {
        return intField0;
    }

    public void setIntField0(Integer intField0) {
        this.intField0 = intField0;
    }

    public Long getBigIntField26() {
        return bigIntField26;
    }

    public void setBigIntField26(Long bigIntField26) {
        this.bigIntField26 = bigIntField26;
    }

    public BigDecimal getDecimalField71() {
        return decimalField71;
    }

    public void setDecimalField71(BigDecimal decimalField71) {
        this.decimalField71 = decimalField71;
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

    public Double getDoubleField92() {
        return doubleField92;
    }

    public void setDoubleField92(Double doubleField92) {
        this.doubleField92 = doubleField92;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
