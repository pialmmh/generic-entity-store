package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityCertificateV1 implements Serializable {
    private static final long serialVersionUID = 1233L;

    private Long id;
    private Byte tinyIntField4;
    private Short smallIntField49;
    private Integer intField41;
    private Long bigIntField65;
    private BigDecimal decimalField75;
    private BigDecimal priceField;
    private Float floatField94;
    private Double doubleField6;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HospitalityCertificateV1() {}

    public HospitalityCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField4() {
        return tinyIntField4;
    }

    public void setTinyIntField4(Byte tinyIntField4) {
        this.tinyIntField4 = tinyIntField4;
    }

    public Short getSmallIntField49() {
        return smallIntField49;
    }

    public void setSmallIntField49(Short smallIntField49) {
        this.smallIntField49 = smallIntField49;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField65() {
        return bigIntField65;
    }

    public void setBigIntField65(Long bigIntField65) {
        this.bigIntField65 = bigIntField65;
    }

    public BigDecimal getDecimalField75() {
        return decimalField75;
    }

    public void setDecimalField75(BigDecimal decimalField75) {
        this.decimalField75 = decimalField75;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField94() {
        return floatField94;
    }

    public void setFloatField94(Float floatField94) {
        this.floatField94 = floatField94;
    }

    public Double getDoubleField6() {
        return doubleField6;
    }

    public void setDoubleField6(Double doubleField6) {
        this.doubleField6 = doubleField6;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
