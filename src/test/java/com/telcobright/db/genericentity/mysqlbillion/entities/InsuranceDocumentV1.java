package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceDocumentV1 implements Serializable {
    private static final long serialVersionUID = 570L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField17;
    private Integer intField50;
    private Long bigIntField80;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField86;
    private Double doubleField60;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceDocumentV1() {}

    public InsuranceDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField17() {
        return smallIntField17;
    }

    public void setSmallIntField17(Short smallIntField17) {
        this.smallIntField17 = smallIntField17;
    }

    public Integer getIntField50() {
        return intField50;
    }

    public void setIntField50(Integer intField50) {
        this.intField50 = intField50;
    }

    public Long getBigIntField80() {
        return bigIntField80;
    }

    public void setBigIntField80(Long bigIntField80) {
        this.bigIntField80 = bigIntField80;
    }

    public BigDecimal getDecimalField99() {
        return decimalField99;
    }

    public void setDecimalField99(BigDecimal decimalField99) {
        this.decimalField99 = decimalField99;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField86() {
        return floatField86;
    }

    public void setFloatField86(Float floatField86) {
        this.floatField86 = floatField86;
    }

    public Double getDoubleField60() {
        return doubleField60;
    }

    public void setDoubleField60(Double doubleField60) {
        this.doubleField60 = doubleField60;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
