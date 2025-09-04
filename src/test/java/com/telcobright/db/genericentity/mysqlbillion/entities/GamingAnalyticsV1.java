package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 825L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField22;
    private Integer intField4;
    private Long bigIntField29;
    private BigDecimal decimalField17;
    private BigDecimal priceField;
    private Float floatField28;
    private Double doubleField70;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GamingAnalyticsV1() {}

    public GamingAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField39() {
        return tinyIntField39;
    }

    public void setTinyIntField39(Byte tinyIntField39) {
        this.tinyIntField39 = tinyIntField39;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField29() {
        return bigIntField29;
    }

    public void setBigIntField29(Long bigIntField29) {
        this.bigIntField29 = bigIntField29;
    }

    public BigDecimal getDecimalField17() {
        return decimalField17;
    }

    public void setDecimalField17(BigDecimal decimalField17) {
        this.decimalField17 = decimalField17;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField28() {
        return floatField28;
    }

    public void setFloatField28(Float floatField28) {
        this.floatField28 = floatField28;
    }

    public Double getDoubleField70() {
        return doubleField70;
    }

    public void setDoubleField70(Double doubleField70) {
        this.doubleField70 = doubleField70;
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
