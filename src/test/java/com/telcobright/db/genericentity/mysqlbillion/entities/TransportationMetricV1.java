package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationMetricV1 implements Serializable {
    private static final long serialVersionUID = 954L;

    private Long id;
    private Byte tinyIntField92;
    private Short smallIntField77;
    private Integer intField21;
    private Long bigIntField59;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField8;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TransportationMetricV1() {}

    public TransportationMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField92() {
        return tinyIntField92;
    }

    public void setTinyIntField92(Byte tinyIntField92) {
        this.tinyIntField92 = tinyIntField92;
    }

    public Short getSmallIntField77() {
        return smallIntField77;
    }

    public void setSmallIntField77(Short smallIntField77) {
        this.smallIntField77 = smallIntField77;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField8() {
        return doubleField8;
    }

    public void setDoubleField8(Double doubleField8) {
        this.doubleField8 = doubleField8;
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
