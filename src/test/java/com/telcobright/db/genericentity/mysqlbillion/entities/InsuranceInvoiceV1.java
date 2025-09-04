package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 576L;

    private Long id;
    private Byte tinyIntField76;
    private Short smallIntField84;
    private Integer intField96;
    private Long bigIntField28;
    private BigDecimal decimalField7;
    private BigDecimal priceField;
    private Float floatField64;
    private Double doubleField93;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceInvoiceV1() {}

    public InsuranceInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField76() {
        return tinyIntField76;
    }

    public void setTinyIntField76(Byte tinyIntField76) {
        this.tinyIntField76 = tinyIntField76;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField96() {
        return intField96;
    }

    public void setIntField96(Integer intField96) {
        this.intField96 = intField96;
    }

    public Long getBigIntField28() {
        return bigIntField28;
    }

    public void setBigIntField28(Long bigIntField28) {
        this.bigIntField28 = bigIntField28;
    }

    public BigDecimal getDecimalField7() {
        return decimalField7;
    }

    public void setDecimalField7(BigDecimal decimalField7) {
        this.decimalField7 = decimalField7;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField64() {
        return floatField64;
    }

    public void setFloatField64(Float floatField64) {
        this.floatField64 = floatField64;
    }

    public Double getDoubleField93() {
        return doubleField93;
    }

    public void setDoubleField93(Double doubleField93) {
        this.doubleField93 = doubleField93;
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
