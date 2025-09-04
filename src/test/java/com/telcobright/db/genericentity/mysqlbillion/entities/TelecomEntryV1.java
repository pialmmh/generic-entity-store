package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomEntryV1 implements Serializable {
    private static final long serialVersionUID = 468L;

    private Long id;
    private Byte tinyIntField77;
    private Short smallIntField11;
    private Integer intField84;
    private Long bigIntField28;
    private BigDecimal decimalField61;
    private BigDecimal priceField;
    private Float floatField44;
    private Double doubleField98;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public TelecomEntryV1() {}

    public TelecomEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField77() {
        return tinyIntField77;
    }

    public void setTinyIntField77(Byte tinyIntField77) {
        this.tinyIntField77 = tinyIntField77;
    }

    public Short getSmallIntField11() {
        return smallIntField11;
    }

    public void setSmallIntField11(Short smallIntField11) {
        this.smallIntField11 = smallIntField11;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField28() {
        return bigIntField28;
    }

    public void setBigIntField28(Long bigIntField28) {
        this.bigIntField28 = bigIntField28;
    }

    public BigDecimal getDecimalField61() {
        return decimalField61;
    }

    public void setDecimalField61(BigDecimal decimalField61) {
        this.decimalField61 = decimalField61;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField44() {
        return floatField44;
    }

    public void setFloatField44(Float floatField44) {
        this.floatField44 = floatField44;
    }

    public Double getDoubleField98() {
        return doubleField98;
    }

    public void setDoubleField98(Double doubleField98) {
        this.doubleField98 = doubleField98;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
