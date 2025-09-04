package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityLogV1 implements Serializable {
    private static final long serialVersionUID = 1197L;

    private Long id;
    private Byte tinyIntField2;
    private Short smallIntField93;
    private Integer intField14;
    private Long bigIntField54;
    private BigDecimal decimalField23;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField86;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityLogV1() {}

    public HospitalityLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField2() {
        return tinyIntField2;
    }

    public void setTinyIntField2(Byte tinyIntField2) {
        this.tinyIntField2 = tinyIntField2;
    }

    public Short getSmallIntField93() {
        return smallIntField93;
    }

    public void setSmallIntField93(Short smallIntField93) {
        this.smallIntField93 = smallIntField93;
    }

    public Integer getIntField14() {
        return intField14;
    }

    public void setIntField14(Integer intField14) {
        this.intField14 = intField14;
    }

    public Long getBigIntField54() {
        return bigIntField54;
    }

    public void setBigIntField54(Long bigIntField54) {
        this.bigIntField54 = bigIntField54;
    }

    public BigDecimal getDecimalField23() {
        return decimalField23;
    }

    public void setDecimalField23(BigDecimal decimalField23) {
        this.decimalField23 = decimalField23;
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

    public Double getDoubleField86() {
        return doubleField86;
    }

    public void setDoubleField86(Double doubleField86) {
        this.doubleField86 = doubleField86;
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
