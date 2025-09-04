package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 378L;

    private Long id;
    private Byte tinyIntField16;
    private Short smallIntField51;
    private Integer intField56;
    private Long bigIntField26;
    private BigDecimal decimalField60;
    private BigDecimal priceField;
    private Float floatField45;
    private Double doubleField25;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EducationInvoiceV1() {}

    public EducationInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField16() {
        return tinyIntField16;
    }

    public void setTinyIntField16(Byte tinyIntField16) {
        this.tinyIntField16 = tinyIntField16;
    }

    public Short getSmallIntField51() {
        return smallIntField51;
    }

    public void setSmallIntField51(Short smallIntField51) {
        this.smallIntField51 = smallIntField51;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField26() {
        return bigIntField26;
    }

    public void setBigIntField26(Long bigIntField26) {
        this.bigIntField26 = bigIntField26;
    }

    public BigDecimal getDecimalField60() {
        return decimalField60;
    }

    public void setDecimalField60(BigDecimal decimalField60) {
        this.decimalField60 = decimalField60;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField45() {
        return floatField45;
    }

    public void setFloatField45(Float floatField45) {
        this.floatField45 = floatField45;
    }

    public Double getDoubleField25() {
        return doubleField25;
    }

    public void setDoubleField25(Double doubleField25) {
        this.doubleField25 = doubleField25;
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
