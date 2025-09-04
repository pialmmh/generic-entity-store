package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceOrderV1 implements Serializable {
    private static final long serialVersionUID = 51L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField76;
    private Integer intField12;
    private Long bigIntField78;
    private BigDecimal decimalField90;
    private BigDecimal priceField;
    private Float floatField12;
    private Double doubleField79;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public FinanceOrderV1() {}

    public FinanceOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField43() {
        return tinyIntField43;
    }

    public void setTinyIntField43(Byte tinyIntField43) {
        this.tinyIntField43 = tinyIntField43;
    }

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField90() {
        return decimalField90;
    }

    public void setDecimalField90(BigDecimal decimalField90) {
        this.decimalField90 = decimalField90;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField12() {
        return floatField12;
    }

    public void setFloatField12(Float floatField12) {
        this.floatField12 = floatField12;
    }

    public Double getDoubleField79() {
        return doubleField79;
    }

    public void setDoubleField79(Double doubleField79) {
        this.doubleField79 = doubleField79;
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
