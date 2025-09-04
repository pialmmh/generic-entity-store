package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsStatementV1 implements Serializable {
    private static final long serialVersionUID = 324L;

    private Long id;
    private Byte tinyIntField56;
    private Short smallIntField8;
    private Integer intField65;
    private Long bigIntField50;
    private BigDecimal decimalField71;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField61;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public LogisticsStatementV1() {}

    public LogisticsStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField56() {
        return tinyIntField56;
    }

    public void setTinyIntField56(Byte tinyIntField56) {
        this.tinyIntField56 = tinyIntField56;
    }

    public Short getSmallIntField8() {
        return smallIntField8;
    }

    public void setSmallIntField8(Short smallIntField8) {
        this.smallIntField8 = smallIntField8;
    }

    public Integer getIntField65() {
        return intField65;
    }

    public void setIntField65(Integer intField65) {
        this.intField65 = intField65;
    }

    public Long getBigIntField50() {
        return bigIntField50;
    }

    public void setBigIntField50(Long bigIntField50) {
        this.bigIntField50 = bigIntField50;
    }

    public BigDecimal getDecimalField71() {
        return decimalField71;
    }

    public void setDecimalField71(BigDecimal decimalField71) {
        this.decimalField71 = decimalField71;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField61() {
        return doubleField61;
    }

    public void setDoubleField61(Double doubleField61) {
        this.doubleField61 = doubleField61;
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
