package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityAccountV1 implements Serializable {
    private static final long serialVersionUID = 1227L;

    private Long id;
    private Byte tinyIntField66;
    private Short smallIntField44;
    private Integer intField58;
    private Long bigIntField5;
    private BigDecimal decimalField68;
    private BigDecimal priceField;
    private Float floatField8;
    private Double doubleField41;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityAccountV1() {}

    public HospitalityAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField66() {
        return tinyIntField66;
    }

    public void setTinyIntField66(Byte tinyIntField66) {
        this.tinyIntField66 = tinyIntField66;
    }

    public Short getSmallIntField44() {
        return smallIntField44;
    }

    public void setSmallIntField44(Short smallIntField44) {
        this.smallIntField44 = smallIntField44;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField5() {
        return bigIntField5;
    }

    public void setBigIntField5(Long bigIntField5) {
        this.bigIntField5 = bigIntField5;
    }

    public BigDecimal getDecimalField68() {
        return decimalField68;
    }

    public void setDecimalField68(BigDecimal decimalField68) {
        this.decimalField68 = decimalField68;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField8() {
        return floatField8;
    }

    public void setFloatField8(Float floatField8) {
        this.floatField8 = floatField8;
    }

    public Double getDoubleField41() {
        return doubleField41;
    }

    public void setDoubleField41(Double doubleField41) {
        this.doubleField41 = doubleField41;
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
