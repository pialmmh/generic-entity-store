package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationCertificateV1 implements Serializable {
    private static final long serialVersionUID = 375L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField35;
    private Integer intField48;
    private Long bigIntField81;
    private BigDecimal decimalField94;
    private BigDecimal priceField;
    private Float floatField44;
    private Double doubleField48;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EducationCertificateV1() {}

    public EducationCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField39() {
        return tinyIntField39;
    }

    public void setTinyIntField39(Byte tinyIntField39) {
        this.tinyIntField39 = tinyIntField39;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField81() {
        return bigIntField81;
    }

    public void setBigIntField81(Long bigIntField81) {
        this.bigIntField81 = bigIntField81;
    }

    public BigDecimal getDecimalField94() {
        return decimalField94;
    }

    public void setDecimalField94(BigDecimal decimalField94) {
        this.decimalField94 = decimalField94;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField44() {
        return floatField44;
    }

    public void setFloatField44(Float floatField44) {
        this.floatField44 = floatField44;
    }

    public Double getDoubleField48() {
        return doubleField48;
    }

    public void setDoubleField48(Double doubleField48) {
        this.doubleField48 = doubleField48;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
