package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailOrderV1 implements Serializable {
    private static final long serialVersionUID = 183L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField50;
    private Integer intField12;
    private Long bigIntField17;
    private BigDecimal decimalField94;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField65;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RetailOrderV1() {}

    public RetailOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField75() {
        return tinyIntField75;
    }

    public void setTinyIntField75(Byte tinyIntField75) {
        this.tinyIntField75 = tinyIntField75;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField17() {
        return bigIntField17;
    }

    public void setBigIntField17(Long bigIntField17) {
        this.bigIntField17 = bigIntField17;
    }

    public BigDecimal getDecimalField94() {
        return decimalField94;
    }

    public void setDecimalField94(BigDecimal decimalField94) {
        this.decimalField94 = decimalField94;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField65() {
        return doubleField65;
    }

    public void setDoubleField65(Double doubleField65) {
        this.doubleField65 = doubleField65;
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
