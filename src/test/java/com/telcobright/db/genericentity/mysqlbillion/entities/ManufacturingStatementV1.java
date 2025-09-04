package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingStatementV1 implements Serializable {
    private static final long serialVersionUID = 258L;

    private Long id;
    private Byte tinyIntField68;
    private Short smallIntField61;
    private Integer intField38;
    private Long bigIntField19;
    private BigDecimal decimalField93;
    private BigDecimal priceField;
    private Float floatField90;
    private Double doubleField39;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public ManufacturingStatementV1() {}

    public ManufacturingStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField68() {
        return tinyIntField68;
    }

    public void setTinyIntField68(Byte tinyIntField68) {
        this.tinyIntField68 = tinyIntField68;
    }

    public Short getSmallIntField61() {
        return smallIntField61;
    }

    public void setSmallIntField61(Short smallIntField61) {
        this.smallIntField61 = smallIntField61;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField19() {
        return bigIntField19;
    }

    public void setBigIntField19(Long bigIntField19) {
        this.bigIntField19 = bigIntField19;
    }

    public BigDecimal getDecimalField93() {
        return decimalField93;
    }

    public void setDecimalField93(BigDecimal decimalField93) {
        this.decimalField93 = decimalField93;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField90() {
        return floatField90;
    }

    public void setFloatField90(Float floatField90) {
        this.floatField90 = floatField90;
    }

    public Double getDoubleField39() {
        return doubleField39;
    }

    public void setDoubleField39(Double doubleField39) {
        this.doubleField39 = doubleField39;
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
