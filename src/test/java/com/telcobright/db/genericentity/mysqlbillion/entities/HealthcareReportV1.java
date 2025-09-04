package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareReportV1 implements Serializable {
    private static final long serialVersionUID = 93L;

    private Long id;
    private Byte tinyIntField18;
    private Short smallIntField99;
    private Integer intField84;
    private Long bigIntField37;
    private BigDecimal decimalField49;
    private BigDecimal priceField;
    private Float floatField90;
    private Double doubleField31;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public HealthcareReportV1() {}

    public HealthcareReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField18() {
        return tinyIntField18;
    }

    public void setTinyIntField18(Byte tinyIntField18) {
        this.tinyIntField18 = tinyIntField18;
    }

    public Short getSmallIntField99() {
        return smallIntField99;
    }

    public void setSmallIntField99(Short smallIntField99) {
        this.smallIntField99 = smallIntField99;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField49() {
        return decimalField49;
    }

    public void setDecimalField49(BigDecimal decimalField49) {
        this.decimalField49 = decimalField49;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField90() {
        return floatField90;
    }

    public void setFloatField90(Float floatField90) {
        this.floatField90 = floatField90;
    }

    public Double getDoubleField31() {
        return doubleField31;
    }

    public void setDoubleField31(Double doubleField31) {
        this.doubleField31 = doubleField31;
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
