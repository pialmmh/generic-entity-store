package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsAccountV1 implements Serializable {
    private static final long serialVersionUID = 1293L;

    private Long id;
    private Byte tinyIntField14;
    private Short smallIntField80;
    private Integer intField32;
    private Long bigIntField88;
    private BigDecimal decimalField51;
    private BigDecimal priceField;
    private Float floatField42;
    private Double doubleField44;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SportsAccountV1() {}

    public SportsAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField14() {
        return tinyIntField14;
    }

    public void setTinyIntField14(Byte tinyIntField14) {
        this.tinyIntField14 = tinyIntField14;
    }

    public Short getSmallIntField80() {
        return smallIntField80;
    }

    public void setSmallIntField80(Short smallIntField80) {
        this.smallIntField80 = smallIntField80;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField51() {
        return decimalField51;
    }

    public void setDecimalField51(BigDecimal decimalField51) {
        this.decimalField51 = decimalField51;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField42() {
        return floatField42;
    }

    public void setFloatField42(Float floatField42) {
        this.floatField42 = floatField42;
    }

    public Double getDoubleField44() {
        return doubleField44;
    }

    public void setDoubleField44(Double doubleField44) {
        this.doubleField44 = doubleField44;
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
