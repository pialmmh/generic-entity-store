package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationStatementV1 implements Serializable {
    private static final long serialVersionUID = 390L;

    private Long id;
    private Byte tinyIntField99;
    private Short smallIntField36;
    private Integer intField38;
    private Long bigIntField58;
    private BigDecimal decimalField97;
    private BigDecimal priceField;
    private Float floatField13;
    private Double doubleField26;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EducationStatementV1() {}

    public EducationStatementV1(Long id, String code, String name) {
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

    public Short getSmallIntField36() {
        return smallIntField36;
    }

    public void setSmallIntField36(Short smallIntField36) {
        this.smallIntField36 = smallIntField36;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField97() {
        return decimalField97;
    }

    public void setDecimalField97(BigDecimal decimalField97) {
        this.decimalField97 = decimalField97;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField13() {
        return floatField13;
    }

    public void setFloatField13(Float floatField13) {
        this.floatField13 = floatField13;
    }

    public Double getDoubleField26() {
        return doubleField26;
    }

    public void setDoubleField26(Double doubleField26) {
        this.doubleField26 = doubleField26;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
