package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 114L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField2;
    private Integer intField57;
    private Long bigIntField0;
    private BigDecimal decimalField50;
    private BigDecimal priceField;
    private Float floatField52;
    private Double doubleField53;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcareInvoiceV1() {}

    public HealthcareInvoiceV1(Long id, String code, String name) {
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

    public Short getSmallIntField2() {
        return smallIntField2;
    }

    public void setSmallIntField2(Short smallIntField2) {
        this.smallIntField2 = smallIntField2;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField0() {
        return bigIntField0;
    }

    public void setBigIntField0(Long bigIntField0) {
        this.bigIntField0 = bigIntField0;
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

    public Float getFloatField52() {
        return floatField52;
    }

    public void setFloatField52(Float floatField52) {
        this.floatField52 = floatField52;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
