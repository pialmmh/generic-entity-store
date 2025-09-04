package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationReportV1 implements Serializable {
    private static final long serialVersionUID = 357L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField79;
    private Integer intField39;
    private Long bigIntField58;
    private BigDecimal decimalField34;
    private BigDecimal priceField;
    private Float floatField5;
    private Double doubleField12;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationReportV1() {}

    public EducationReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField99() {
        return tinyIntField99;
    }

    public void setTinyIntField99(Byte tinyIntField99) {
        this.tinyIntField99 = tinyIntField99;
    }

    public Short getSmallIntField79() {
        return smallIntField79;
    }

    public void setSmallIntField79(Short smallIntField79) {
        this.smallIntField79 = smallIntField79;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField34() {
        return decimalField34;
    }

    public void setDecimalField34(BigDecimal decimalField34) {
        this.decimalField34 = decimalField34;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField5() {
        return floatField5;
    }

    public void setFloatField5(Float floatField5) {
        this.floatField5 = floatField5;
    }

    public Double getDoubleField12() {
        return doubleField12;
    }

    public void setDoubleField12(Double doubleField12) {
        this.doubleField12 = doubleField12;
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
