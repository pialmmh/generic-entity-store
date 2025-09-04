package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: EducationRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationRecordV1 implements Serializable {
    private static final long serialVersionUID = 333L;

    private Long id;
    private Byte tinyIntField86;
    private Short smallIntField3;
    private Integer intField85;
    private Long bigIntField38;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField43;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationRecordV1() {}

    public EducationRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField86() {
        return tinyIntField86;
    }

    public void setTinyIntField86(Byte tinyIntField86) {
        this.tinyIntField86 = tinyIntField86;
    }

    public Short getSmallIntField3() {
        return smallIntField3;
    }

    public void setSmallIntField3(Short smallIntField3) {
        this.smallIntField3 = smallIntField3;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField38() {
        return bigIntField38;
    }

    public void setBigIntField38(Long bigIntField38) {
        this.bigIntField38 = bigIntField38;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField41() {
        return floatField41;
    }

    public void setFloatField41(Float floatField41) {
        this.floatField41 = floatField41;
    }

    public Double getDoubleField43() {
        return doubleField43;
    }

    public void setDoubleField43(Double doubleField43) {
        this.doubleField43 = doubleField43;
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
