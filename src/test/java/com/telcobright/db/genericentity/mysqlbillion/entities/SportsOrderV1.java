package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsOrderV1 implements Serializable {
    private static final long serialVersionUID = 1305L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField60;
    private Integer intField3;
    private Long bigIntField79;
    private BigDecimal decimalField85;
    private BigDecimal priceField;
    private Float floatField79;
    private Double doubleField95;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public SportsOrderV1() {}

    public SportsOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField3() {
        return intField3;
    }

    public void setIntField3(Integer intField3) {
        this.intField3 = intField3;
    }

    public Long getBigIntField79() {
        return bigIntField79;
    }

    public void setBigIntField79(Long bigIntField79) {
        this.bigIntField79 = bigIntField79;
    }

    public BigDecimal getDecimalField85() {
        return decimalField85;
    }

    public void setDecimalField85(BigDecimal decimalField85) {
        this.decimalField85 = decimalField85;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField79() {
        return floatField79;
    }

    public void setFloatField79(Float floatField79) {
        this.floatField79 = floatField79;
    }

    public Double getDoubleField95() {
        return doubleField95;
    }

    public void setDoubleField95(Double doubleField95) {
        this.doubleField95 = doubleField95;
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
