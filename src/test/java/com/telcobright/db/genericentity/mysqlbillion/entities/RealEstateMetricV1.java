package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateMetricV1 implements Serializable {
    private static final long serialVersionUID = 1020L;

    private Long id;
    private Byte tinyIntField81;
    private Short smallIntField23;
    private Integer intField48;
    private Long bigIntField38;
    private BigDecimal decimalField34;
    private BigDecimal priceField;
    private Float floatField91;
    private Double doubleField30;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RealEstateMetricV1() {}

    public RealEstateMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField81() {
        return tinyIntField81;
    }

    public void setTinyIntField81(Byte tinyIntField81) {
        this.tinyIntField81 = tinyIntField81;
    }

    public Short getSmallIntField23() {
        return smallIntField23;
    }

    public void setSmallIntField23(Short smallIntField23) {
        this.smallIntField23 = smallIntField23;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField38() {
        return bigIntField38;
    }

    public void setBigIntField38(Long bigIntField38) {
        this.bigIntField38 = bigIntField38;
    }

    public BigDecimal getDecimalField34() {
        return decimalField34;
    }

    public void setDecimalField34(BigDecimal decimalField34) {
        this.decimalField34 = decimalField34;
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

    public Double getDoubleField30() {
        return doubleField30;
    }

    public void setDoubleField30(Double doubleField30) {
        this.doubleField30 = doubleField30;
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
