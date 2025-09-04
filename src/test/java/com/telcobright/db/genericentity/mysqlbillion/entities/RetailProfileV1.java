package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailProfileV1 implements Serializable {
    private static final long serialVersionUID = 168L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField10;
    private Integer intField11;
    private Long bigIntField91;
    private BigDecimal decimalField48;
    private BigDecimal priceField;
    private Float floatField98;
    private Double doubleField6;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RetailProfileV1() {}

    public RetailProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField11() {
        return tinyIntField11;
    }

    public void setTinyIntField11(Byte tinyIntField11) {
        this.tinyIntField11 = tinyIntField11;
    }

    public Short getSmallIntField10() {
        return smallIntField10;
    }

    public void setSmallIntField10(Short smallIntField10) {
        this.smallIntField10 = smallIntField10;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField91() {
        return bigIntField91;
    }

    public void setBigIntField91(Long bigIntField91) {
        this.bigIntField91 = bigIntField91;
    }

    public BigDecimal getDecimalField48() {
        return decimalField48;
    }

    public void setDecimalField48(BigDecimal decimalField48) {
        this.decimalField48 = decimalField48;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField98() {
        return floatField98;
    }

    public void setFloatField98(Float floatField98) {
        this.floatField98 = floatField98;
    }

    public Double getDoubleField6() {
        return doubleField6;
    }

    public void setDoubleField6(Double doubleField6) {
        this.doubleField6 = doubleField6;
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
