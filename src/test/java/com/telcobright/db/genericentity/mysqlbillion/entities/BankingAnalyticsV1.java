package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: BankingAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 627L;

    private Long id;
    private Byte tinyIntField60;
    private Short smallIntField12;
    private Integer intField31;
    private Long bigIntField59;
    private BigDecimal decimalField29;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField28;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public BankingAnalyticsV1() {}

    public BankingAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField60() {
        return tinyIntField60;
    }

    public void setTinyIntField60(Byte tinyIntField60) {
        this.tinyIntField60 = tinyIntField60;
    }

    public Short getSmallIntField12() {
        return smallIntField12;
    }

    public void setSmallIntField12(Short smallIntField12) {
        this.smallIntField12 = smallIntField12;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
    }

    public BigDecimal getDecimalField29() {
        return decimalField29;
    }

    public void setDecimalField29(BigDecimal decimalField29) {
        this.decimalField29 = decimalField29;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField23() {
        return floatField23;
    }

    public void setFloatField23(Float floatField23) {
        this.floatField23 = floatField23;
    }

    public Double getDoubleField28() {
        return doubleField28;
    }

    public void setDoubleField28(Double doubleField28) {
        this.doubleField28 = doubleField28;
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
