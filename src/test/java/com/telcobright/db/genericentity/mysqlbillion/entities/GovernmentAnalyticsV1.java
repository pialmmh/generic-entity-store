package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 429L;

    private Long id;
    private Byte tinyIntField98;
    private Short smallIntField91;
    private Integer intField2;
    private Long bigIntField72;
    private BigDecimal decimalField44;
    private BigDecimal priceField;
    private Float floatField89;
    private Double doubleField2;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GovernmentAnalyticsV1() {}

    public GovernmentAnalyticsV1(Long id, String code, String name) {
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

    public Short getSmallIntField91() {
        return smallIntField91;
    }

    public void setSmallIntField91(Short smallIntField91) {
        this.smallIntField91 = smallIntField91;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField72() {
        return bigIntField72;
    }

    public void setBigIntField72(Long bigIntField72) {
        this.bigIntField72 = bigIntField72;
    }

    public BigDecimal getDecimalField44() {
        return decimalField44;
    }

    public void setDecimalField44(BigDecimal decimalField44) {
        this.decimalField44 = decimalField44;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField89() {
        return floatField89;
    }

    public void setFloatField89(Float floatField89) {
        this.floatField89 = floatField89;
    }

    public Double getDoubleField2() {
        return doubleField2;
    }

    public void setDoubleField2(Double doubleField2) {
        this.doubleField2 = doubleField2;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
