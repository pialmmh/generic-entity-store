package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceMetricV1 implements Serializable {
    private static final long serialVersionUID = 558L;

    private Long id;
    private Byte tinyIntField14;
    private Short smallIntField37;
    private Integer intField30;
    private Long bigIntField88;
    private BigDecimal decimalField14;
    private BigDecimal priceField;
    private Float floatField50;
    private Double doubleField58;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceMetricV1() {}

    public InsuranceMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField14() {
        return tinyIntField14;
    }

    public void setTinyIntField14(Byte tinyIntField14) {
        this.tinyIntField14 = tinyIntField14;
    }

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField14() {
        return decimalField14;
    }

    public void setDecimalField14(BigDecimal decimalField14) {
        this.decimalField14 = decimalField14;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField50() {
        return floatField50;
    }

    public void setFloatField50(Float floatField50) {
        this.floatField50 = floatField50;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
