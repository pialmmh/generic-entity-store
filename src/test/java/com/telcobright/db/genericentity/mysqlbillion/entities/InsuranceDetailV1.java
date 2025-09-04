package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceDetailV1 implements Serializable {
    private static final long serialVersionUID = 540L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField66;
    private Integer intField58;
    private Long bigIntField28;
    private BigDecimal decimalField54;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField5;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public InsuranceDetailV1() {}

    public InsuranceDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField39() {
        return tinyIntField39;
    }

    public void setTinyIntField39(Byte tinyIntField39) {
        this.tinyIntField39 = tinyIntField39;
    }

    public Short getSmallIntField66() {
        return smallIntField66;
    }

    public void setSmallIntField66(Short smallIntField66) {
        this.smallIntField66 = smallIntField66;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField28() {
        return bigIntField28;
    }

    public void setBigIntField28(Long bigIntField28) {
        this.bigIntField28 = bigIntField28;
    }

    public BigDecimal getDecimalField54() {
        return decimalField54;
    }

    public void setDecimalField54(BigDecimal decimalField54) {
        this.decimalField54 = decimalField54;
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

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
