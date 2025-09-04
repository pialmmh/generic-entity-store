package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsProfileV1 implements Serializable {
    private static final long serialVersionUID = 300L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField32;
    private Integer intField10;
    private Long bigIntField78;
    private BigDecimal decimalField52;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField92;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public LogisticsProfileV1() {}

    public LogisticsProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField43() {
        return tinyIntField43;
    }

    public void setTinyIntField43(Byte tinyIntField43) {
        this.tinyIntField43 = tinyIntField43;
    }

    public Short getSmallIntField32() {
        return smallIntField32;
    }

    public void setSmallIntField32(Short smallIntField32) {
        this.smallIntField32 = smallIntField32;
    }

    public Integer getIntField10() {
        return intField10;
    }

    public void setIntField10(Integer intField10) {
        this.intField10 = intField10;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField52() {
        return decimalField52;
    }

    public void setDecimalField52(BigDecimal decimalField52) {
        this.decimalField52 = decimalField52;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField20() {
        return floatField20;
    }

    public void setFloatField20(Float floatField20) {
        this.floatField20 = floatField20;
    }

    public Double getDoubleField92() {
        return doubleField92;
    }

    public void setDoubleField92(Double doubleField92) {
        this.doubleField92 = doubleField92;
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
