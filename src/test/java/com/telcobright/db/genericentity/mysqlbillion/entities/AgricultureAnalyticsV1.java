package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 1155L;

    private Long id;
    private Byte tinyIntField27;
    private Short smallIntField22;
    private Integer intField42;
    private Long bigIntField95;
    private BigDecimal decimalField63;
    private BigDecimal priceField;
    private Float floatField64;
    private Double doubleField33;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public AgricultureAnalyticsV1() {}

    public AgricultureAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField27() {
        return tinyIntField27;
    }

    public void setTinyIntField27(Byte tinyIntField27) {
        this.tinyIntField27 = tinyIntField27;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField42() {
        return intField42;
    }

    public void setIntField42(Integer intField42) {
        this.intField42 = intField42;
    }

    public Long getBigIntField95() {
        return bigIntField95;
    }

    public void setBigIntField95(Long bigIntField95) {
        this.bigIntField95 = bigIntField95;
    }

    public BigDecimal getDecimalField63() {
        return decimalField63;
    }

    public void setDecimalField63(BigDecimal decimalField63) {
        this.decimalField63 = decimalField63;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField64() {
        return floatField64;
    }

    public void setFloatField64(Float floatField64) {
        this.floatField64 = floatField64;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
