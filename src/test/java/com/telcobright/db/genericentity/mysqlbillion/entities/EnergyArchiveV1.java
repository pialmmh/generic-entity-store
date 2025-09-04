package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyArchiveV1 implements Serializable {
    private static final long serialVersionUID = 1077L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField99;
    private Integer intField86;
    private Long bigIntField7;
    private BigDecimal decimalField52;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField2;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EnergyArchiveV1() {}

    public EnergyArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField59() {
        return tinyIntField59;
    }

    public void setTinyIntField59(Byte tinyIntField59) {
        this.tinyIntField59 = tinyIntField59;
    }

    public Short getSmallIntField99() {
        return smallIntField99;
    }

    public void setSmallIntField99(Short smallIntField99) {
        this.smallIntField99 = smallIntField99;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField7() {
        return bigIntField7;
    }

    public void setBigIntField7(Long bigIntField7) {
        this.bigIntField7 = bigIntField7;
    }

    public BigDecimal getDecimalField52() {
        return decimalField52;
    }

    public void setDecimalField52(BigDecimal decimalField52) {
        this.decimalField52 = decimalField52;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField7() {
        return floatField7;
    }

    public void setFloatField7(Float floatField7) {
        this.floatField7 = floatField7;
    }

    public Double getDoubleField2() {
        return doubleField2;
    }

    public void setDoubleField2(Double doubleField2) {
        this.doubleField2 = doubleField2;
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
