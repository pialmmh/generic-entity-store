package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingAccountV1 implements Serializable {
    private static final long serialVersionUID = 831L;

    private Long id;
    private Byte tinyIntField90;
    private Short smallIntField98;
    private Integer intField93;
    private Long bigIntField60;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField4;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GamingAccountV1() {}

    public GamingAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField90() {
        return tinyIntField90;
    }

    public void setTinyIntField90(Byte tinyIntField90) {
        this.tinyIntField90 = tinyIntField90;
    }

    public Short getSmallIntField98() {
        return smallIntField98;
    }

    public void setSmallIntField98(Short smallIntField98) {
        this.smallIntField98 = smallIntField98;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField60() {
        return bigIntField60;
    }

    public void setBigIntField60(Long bigIntField60) {
        this.bigIntField60 = bigIntField60;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField4() {
        return doubleField4;
    }

    public void setDoubleField4(Double doubleField4) {
        this.doubleField4 = doubleField4;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
