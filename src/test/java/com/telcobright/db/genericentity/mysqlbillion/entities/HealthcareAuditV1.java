package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareAuditV1 implements Serializable {
    private static final long serialVersionUID = 90L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField79;
    private Integer intField2;
    private Long bigIntField29;
    private BigDecimal decimalField31;
    private BigDecimal priceField;
    private Float floatField36;
    private Double doubleField83;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HealthcareAuditV1() {}

    public HealthcareAuditV1(Long id, String code, String name) {
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

    public Short getSmallIntField79() {
        return smallIntField79;
    }

    public void setSmallIntField79(Short smallIntField79) {
        this.smallIntField79 = smallIntField79;
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

    public BigDecimal getDecimalField31() {
        return decimalField31;
    }

    public void setDecimalField31(BigDecimal decimalField31) {
        this.decimalField31 = decimalField31;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField36() {
        return floatField36;
    }

    public void setFloatField36(Float floatField36) {
        this.floatField36 = floatField36;
    }

    public Double getDoubleField83() {
        return doubleField83;
    }

    public void setDoubleField83(Double doubleField83) {
        this.doubleField83 = doubleField83;
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
