package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstatePaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstatePaymentV1 implements Serializable {
    private static final long serialVersionUID = 1044L;

    private Long id;
    private Byte tinyIntField16;
    private Short smallIntField79;
    private Integer intField60;
    private Long bigIntField99;
    private BigDecimal decimalField89;
    private BigDecimal priceField;
    private Float floatField87;
    private Double doubleField51;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RealEstatePaymentV1() {}

    public RealEstatePaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField16() {
        return tinyIntField16;
    }

    public void setTinyIntField16(Byte tinyIntField16) {
        this.tinyIntField16 = tinyIntField16;
    }

    public Short getSmallIntField79() {
        return smallIntField79;
    }

    public void setSmallIntField79(Short smallIntField79) {
        this.smallIntField79 = smallIntField79;
    }

    public Integer getIntField60() {
        return intField60;
    }

    public void setIntField60(Integer intField60) {
        this.intField60 = intField60;
    }

    public Long getBigIntField99() {
        return bigIntField99;
    }

    public void setBigIntField99(Long bigIntField99) {
        this.bigIntField99 = bigIntField99;
    }

    public BigDecimal getDecimalField89() {
        return decimalField89;
    }

    public void setDecimalField89(BigDecimal decimalField89) {
        this.decimalField89 = decimalField89;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField87() {
        return floatField87;
    }

    public void setFloatField87(Float floatField87) {
        this.floatField87 = floatField87;
    }

    public Double getDoubleField51() {
        return doubleField51;
    }

    public void setDoubleField51(Double doubleField51) {
        this.doubleField51 = doubleField51;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
