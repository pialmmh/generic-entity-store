package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateBalanceV1 implements Serializable {
    private static final long serialVersionUID = 1053L;

    private Long id;
    private Byte tinyIntField46;
    private Short smallIntField75;
    private Integer intField32;
    private Long bigIntField87;
    private BigDecimal decimalField33;
    private BigDecimal priceField;
    private Float floatField91;
    private Double doubleField33;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RealEstateBalanceV1() {}

    public RealEstateBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField46() {
        return tinyIntField46;
    }

    public void setTinyIntField46(Byte tinyIntField46) {
        this.tinyIntField46 = tinyIntField46;
    }

    public Short getSmallIntField75() {
        return smallIntField75;
    }

    public void setSmallIntField75(Short smallIntField75) {
        this.smallIntField75 = smallIntField75;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
    }

    public BigDecimal getDecimalField33() {
        return decimalField33;
    }

    public void setDecimalField33(BigDecimal decimalField33) {
        this.decimalField33 = decimalField33;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField91() {
        return floatField91;
    }

    public void setFloatField91(Float floatField91) {
        this.floatField91 = floatField91;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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
