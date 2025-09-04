package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomDetailV1 implements Serializable {
    private static final long serialVersionUID = 474L;

    private Long id;
    private Byte tinyIntField28;
    private Short smallIntField39;
    private Integer intField74;
    private Long bigIntField60;
    private BigDecimal decimalField88;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField84;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TelecomDetailV1() {}

    public TelecomDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField28() {
        return tinyIntField28;
    }

    public void setTinyIntField28(Byte tinyIntField28) {
        this.tinyIntField28 = tinyIntField28;
    }

    public Short getSmallIntField39() {
        return smallIntField39;
    }

    public void setSmallIntField39(Short smallIntField39) {
        this.smallIntField39 = smallIntField39;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField60() {
        return bigIntField60;
    }

    public void setBigIntField60(Long bigIntField60) {
        this.bigIntField60 = bigIntField60;
    }

    public BigDecimal getDecimalField88() {
        return decimalField88;
    }

    public void setDecimalField88(BigDecimal decimalField88) {
        this.decimalField88 = decimalField88;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField84() {
        return doubleField84;
    }

    public void setDoubleField84(Double doubleField84) {
        this.doubleField84 = doubleField84;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
