package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareMetricV1 implements Serializable {
    private static final long serialVersionUID = 96L;

    private Long id;
    private Byte tinyIntField12;
    private Short smallIntField46;
    private Integer intField48;
    private Long bigIntField77;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField13;
    private Double doubleField16;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HealthcareMetricV1() {}

    public HealthcareMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField12() {
        return tinyIntField12;
    }

    public void setTinyIntField12(Byte tinyIntField12) {
        this.tinyIntField12 = tinyIntField12;
    }

    public Short getSmallIntField46() {
        return smallIntField46;
    }

    public void setSmallIntField46(Short smallIntField46) {
        this.smallIntField46 = smallIntField46;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField77() {
        return bigIntField77;
    }

    public void setBigIntField77(Long bigIntField77) {
        this.bigIntField77 = bigIntField77;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField13() {
        return floatField13;
    }

    public void setFloatField13(Float floatField13) {
        this.floatField13 = floatField13;
    }

    public Double getDoubleField16() {
        return doubleField16;
    }

    public void setDoubleField16(Double doubleField16) {
        this.doubleField16 = doubleField16;
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
