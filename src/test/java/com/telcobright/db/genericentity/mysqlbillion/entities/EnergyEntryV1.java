package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyEntryV1 implements Serializable {
    private static final long serialVersionUID = 1062L;

    private Long id;
    private Byte tinyIntField91;
    private Short smallIntField50;
    private Integer intField32;
    private Long bigIntField58;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField65;
    private Double doubleField4;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EnergyEntryV1() {}

    public EnergyEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField91() {
        return tinyIntField91;
    }

    public void setTinyIntField91(Byte tinyIntField91) {
        this.tinyIntField91 = tinyIntField91;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField65() {
        return floatField65;
    }

    public void setFloatField65(Float floatField65) {
        this.floatField65 = floatField65;
    }

    public Double getDoubleField4() {
        return doubleField4;
    }

    public void setDoubleField4(Double doubleField4) {
        this.doubleField4 = doubleField4;
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
