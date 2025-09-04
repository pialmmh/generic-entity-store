package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailReportV1 implements Serializable {
    private static final long serialVersionUID = 159L;

    private Long id;
    private Byte tinyIntField61;
    private Short smallIntField27;
    private Integer intField57;
    private Long bigIntField97;
    private BigDecimal decimalField75;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField96;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RetailReportV1() {}

    public RetailReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField61() {
        return tinyIntField61;
    }

    public void setTinyIntField61(Byte tinyIntField61) {
        this.tinyIntField61 = tinyIntField61;
    }

    public Short getSmallIntField27() {
        return smallIntField27;
    }

    public void setSmallIntField27(Short smallIntField27) {
        this.smallIntField27 = smallIntField27;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField97() {
        return bigIntField97;
    }

    public void setBigIntField97(Long bigIntField97) {
        this.bigIntField97 = bigIntField97;
    }

    public BigDecimal getDecimalField75() {
        return decimalField75;
    }

    public void setDecimalField75(BigDecimal decimalField75) {
        this.decimalField75 = decimalField75;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField96() {
        return doubleField96;
    }

    public void setDoubleField96(Double doubleField96) {
        this.doubleField96 = doubleField96;
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
