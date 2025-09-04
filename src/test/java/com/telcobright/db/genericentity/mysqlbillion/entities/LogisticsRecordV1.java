package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsRecordV1 implements Serializable {
    private static final long serialVersionUID = 267L;

    private Long id;
    private Byte tinyIntField98;
    private Short smallIntField57;
    private Integer intField10;
    private Long bigIntField59;
    private BigDecimal decimalField37;
    private BigDecimal priceField;
    private Float floatField47;
    private Double doubleField21;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public LogisticsRecordV1() {}

    public LogisticsRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField98() {
        return tinyIntField98;
    }

    public void setTinyIntField98(Byte tinyIntField98) {
        this.tinyIntField98 = tinyIntField98;
    }

    public Short getSmallIntField57() {
        return smallIntField57;
    }

    public void setSmallIntField57(Short smallIntField57) {
        this.smallIntField57 = smallIntField57;
    }

    public Integer getIntField10() {
        return intField10;
    }

    public void setIntField10(Integer intField10) {
        this.intField10 = intField10;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
    }

    public BigDecimal getDecimalField37() {
        return decimalField37;
    }

    public void setDecimalField37(BigDecimal decimalField37) {
        this.decimalField37 = decimalField37;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField47() {
        return floatField47;
    }

    public void setFloatField47(Float floatField47) {
        this.floatField47 = floatField47;
    }

    public Double getDoubleField21() {
        return doubleField21;
    }

    public void setDoubleField21(Double doubleField21) {
        this.doubleField21 = doubleField21;
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
