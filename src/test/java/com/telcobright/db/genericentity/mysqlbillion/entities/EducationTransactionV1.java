package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationTransactionV1 implements Serializable {
    private static final long serialVersionUID = 330L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField84;
    private Integer intField2;
    private Long bigIntField29;
    private BigDecimal decimalField98;
    private BigDecimal priceField;
    private Float floatField87;
    private Double doubleField47;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationTransactionV1() {}

    public EducationTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField29() {
        return bigIntField29;
    }

    public void setBigIntField29(Long bigIntField29) {
        this.bigIntField29 = bigIntField29;
    }

    public BigDecimal getDecimalField98() {
        return decimalField98;
    }

    public void setDecimalField98(BigDecimal decimalField98) {
        this.decimalField98 = decimalField98;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField87() {
        return floatField87;
    }

    public void setFloatField87(Float floatField87) {
        this.floatField87 = floatField87;
    }

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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
