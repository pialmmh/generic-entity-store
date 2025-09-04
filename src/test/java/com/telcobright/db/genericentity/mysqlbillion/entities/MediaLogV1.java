package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaLogV1 implements Serializable {
    private static final long serialVersionUID = 867L;

    private Long id;
    private Byte tinyIntField28;
    private Short smallIntField69;
    private Integer intField31;
    private Long bigIntField8;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField92;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public MediaLogV1() {}

    public MediaLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField28() {
        return tinyIntField28;
    }

    public void setTinyIntField28(Byte tinyIntField28) {
        this.tinyIntField28 = tinyIntField28;
    }

    public Short getSmallIntField69() {
        return smallIntField69;
    }

    public void setSmallIntField69(Short smallIntField69) {
        this.smallIntField69 = smallIntField69;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField8() {
        return bigIntField8;
    }

    public void setBigIntField8(Long bigIntField8) {
        this.bigIntField8 = bigIntField8;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField22() {
        return floatField22;
    }

    public void setFloatField22(Float floatField22) {
        this.floatField22 = floatField22;
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
