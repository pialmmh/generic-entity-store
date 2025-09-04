package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsEntryV1 implements Serializable {
    private static final long serialVersionUID = 1260L;

    private Long id;
    private Byte tinyIntField12;
    private Short smallIntField19;
    private Integer intField59;
    private Long bigIntField24;
    private BigDecimal decimalField84;
    private BigDecimal priceField;
    private Float floatField81;
    private Double doubleField60;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SportsEntryV1() {}

    public SportsEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField12() {
        return tinyIntField12;
    }

    public void setTinyIntField12(Byte tinyIntField12) {
        this.tinyIntField12 = tinyIntField12;
    }

    public Short getSmallIntField19() {
        return smallIntField19;
    }

    public void setSmallIntField19(Short smallIntField19) {
        this.smallIntField19 = smallIntField19;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField24() {
        return bigIntField24;
    }

    public void setBigIntField24(Long bigIntField24) {
        this.bigIntField24 = bigIntField24;
    }

    public BigDecimal getDecimalField84() {
        return decimalField84;
    }

    public void setDecimalField84(BigDecimal decimalField84) {
        this.decimalField84 = decimalField84;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField81() {
        return floatField81;
    }

    public void setFloatField81(Float floatField81) {
        this.floatField81 = floatField81;
    }

    public Double getDoubleField60() {
        return doubleField60;
    }

    public void setDoubleField60(Double doubleField60) {
        this.doubleField60 = doubleField60;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
