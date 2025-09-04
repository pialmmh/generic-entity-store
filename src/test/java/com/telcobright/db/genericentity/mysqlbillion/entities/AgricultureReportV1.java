package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureReportV1 implements Serializable {
    private static final long serialVersionUID = 1149L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField73;
    private Integer intField51;
    private Long bigIntField17;
    private BigDecimal decimalField57;
    private BigDecimal priceField;
    private Float floatField52;
    private Double doubleField58;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public AgricultureReportV1() {}

    public AgricultureReportV1(Long id, String code, String name) {
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

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField51() {
        return intField51;
    }

    public void setIntField51(Integer intField51) {
        this.intField51 = intField51;
    }

    public Long getBigIntField17() {
        return bigIntField17;
    }

    public void setBigIntField17(Long bigIntField17) {
        this.bigIntField17 = bigIntField17;
    }

    public BigDecimal getDecimalField57() {
        return decimalField57;
    }

    public void setDecimalField57(BigDecimal decimalField57) {
        this.decimalField57 = decimalField57;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField52() {
        return floatField52;
    }

    public void setFloatField52(Float floatField52) {
        this.floatField52 = floatField52;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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
