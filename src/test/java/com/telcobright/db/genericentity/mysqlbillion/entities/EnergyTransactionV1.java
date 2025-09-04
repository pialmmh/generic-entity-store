package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyTransactionV1 implements Serializable {
    private static final long serialVersionUID = 1056L;

    private Long id;
    private Byte tinyIntField40;
    private Short smallIntField22;
    private Integer intField95;
    private Long bigIntField27;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField14;
    private Double doubleField18;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EnergyTransactionV1() {}

    public EnergyTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField40() {
        return tinyIntField40;
    }

    public void setTinyIntField40(Byte tinyIntField40) {
        this.tinyIntField40 = tinyIntField40;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField95() {
        return intField95;
    }

    public void setIntField95(Integer intField95) {
        this.intField95 = intField95;
    }

    public Long getBigIntField27() {
        return bigIntField27;
    }

    public void setBigIntField27(Long bigIntField27) {
        this.bigIntField27 = bigIntField27;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField14() {
        return floatField14;
    }

    public void setFloatField14(Float floatField14) {
        this.floatField14 = floatField14;
    }

    public Double getDoubleField18() {
        return doubleField18;
    }

    public void setDoubleField18(Double doubleField18) {
        this.doubleField18 = doubleField18;
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
