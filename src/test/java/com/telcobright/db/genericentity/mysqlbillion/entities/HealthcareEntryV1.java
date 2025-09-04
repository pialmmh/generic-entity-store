package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareEntryV1 implements Serializable {
    private static final long serialVersionUID = 72L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField22;
    private Integer intField93;
    private Long bigIntField57;
    private BigDecimal decimalField20;
    private BigDecimal priceField;
    private Float floatField97;
    private Double doubleField47;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public HealthcareEntryV1() {}

    public HealthcareEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField99() {
        return tinyIntField99;
    }

    public void setTinyIntField99(Byte tinyIntField99) {
        this.tinyIntField99 = tinyIntField99;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField57() {
        return bigIntField57;
    }

    public void setBigIntField57(Long bigIntField57) {
        this.bigIntField57 = bigIntField57;
    }

    public BigDecimal getDecimalField20() {
        return decimalField20;
    }

    public void setDecimalField20(BigDecimal decimalField20) {
        this.decimalField20 = decimalField20;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField97() {
        return floatField97;
    }

    public void setFloatField97(Float floatField97) {
        this.floatField97 = floatField97;
    }

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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
