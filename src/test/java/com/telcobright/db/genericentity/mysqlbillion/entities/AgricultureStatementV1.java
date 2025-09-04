package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureStatementV1 implements Serializable {
    private static final long serialVersionUID = 1182L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField30;
    private Integer intField49;
    private Long bigIntField18;
    private BigDecimal decimalField72;
    private BigDecimal priceField;
    private Float floatField60;
    private Double doubleField71;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public AgricultureStatementV1() {}

    public AgricultureStatementV1(Long id, String code, String name) {
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

    public Short getSmallIntField30() {
        return smallIntField30;
    }

    public void setSmallIntField30(Short smallIntField30) {
        this.smallIntField30 = smallIntField30;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField18() {
        return bigIntField18;
    }

    public void setBigIntField18(Long bigIntField18) {
        this.bigIntField18 = bigIntField18;
    }

    public BigDecimal getDecimalField72() {
        return decimalField72;
    }

    public void setDecimalField72(BigDecimal decimalField72) {
        this.decimalField72 = decimalField72;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField60() {
        return floatField60;
    }

    public void setFloatField60(Float floatField60) {
        this.floatField60 = floatField60;
    }

    public Double getDoubleField71() {
        return doubleField71;
    }

    public void setDoubleField71(Double doubleField71) {
        this.doubleField71 = doubleField71;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
