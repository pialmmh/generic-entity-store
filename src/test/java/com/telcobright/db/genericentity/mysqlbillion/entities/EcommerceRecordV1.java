package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceRecordV1 implements Serializable {
    private static final long serialVersionUID = 663L;

    private Long id;
    private Byte tinyIntField39;
    private Short smallIntField88;
    private Integer intField11;
    private Long bigIntField16;
    private BigDecimal decimalField62;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField90;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EcommerceRecordV1() {}

    public EcommerceRecordV1(Long id, String code, String name) {
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

    public Short getSmallIntField88() {
        return smallIntField88;
    }

    public void setSmallIntField88(Short smallIntField88) {
        this.smallIntField88 = smallIntField88;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField62() {
        return decimalField62;
    }

    public void setDecimalField62(BigDecimal decimalField62) {
        this.decimalField62 = decimalField62;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField90() {
        return doubleField90;
    }

    public void setDoubleField90(Double doubleField90) {
        this.doubleField90 = doubleField90;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
