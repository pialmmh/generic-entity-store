package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailDetailV1 implements Serializable {
    private static final long serialVersionUID = 144L;

    private Long id;
    private Byte tinyIntField80;
    private Short smallIntField3;
    private Integer intField48;
    private Long bigIntField78;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField12;
    private Double doubleField28;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RetailDetailV1() {}

    public RetailDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField80() {
        return tinyIntField80;
    }

    public void setTinyIntField80(Byte tinyIntField80) {
        this.tinyIntField80 = tinyIntField80;
    }

    public Short getSmallIntField3() {
        return smallIntField3;
    }

    public void setSmallIntField3(Short smallIntField3) {
        this.smallIntField3 = smallIntField3;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
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
