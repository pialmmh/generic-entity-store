package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 444L;

    private Long id;
    private Byte tinyIntField64;
    private Short smallIntField87;
    private Integer intField30;
    private Long bigIntField9;
    private BigDecimal decimalField42;
    private BigDecimal priceField;
    private Float floatField79;
    private Double doubleField81;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GovernmentInvoiceV1() {}

    public GovernmentInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField64() {
        return tinyIntField64;
    }

    public void setTinyIntField64(Byte tinyIntField64) {
        this.tinyIntField64 = tinyIntField64;
    }

    public Short getSmallIntField87() {
        return smallIntField87;
    }

    public void setSmallIntField87(Short smallIntField87) {
        this.smallIntField87 = smallIntField87;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField9() {
        return bigIntField9;
    }

    public void setBigIntField9(Long bigIntField9) {
        this.bigIntField9 = bigIntField9;
    }

    public BigDecimal getDecimalField42() {
        return decimalField42;
    }

    public void setDecimalField42(BigDecimal decimalField42) {
        this.decimalField42 = decimalField42;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField79() {
        return floatField79;
    }

    public void setFloatField79(Float floatField79) {
        this.floatField79 = floatField79;
    }

    public Double getDoubleField81() {
        return doubleField81;
    }

    public void setDoubleField81(Double doubleField81) {
        this.doubleField81 = doubleField81;
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
