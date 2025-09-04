package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: SocialArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialArchiveV1 implements Serializable {
    private static final long serialVersionUID = 747L;

    private Long id;
    private Byte tinyIntField2;
    private Short smallIntField6;
    private Integer intField59;
    private Long bigIntField54;
    private BigDecimal decimalField0;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField64;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SocialArchiveV1() {}

    public SocialArchiveV1(Long id, String code, String name) {
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

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField54() {
        return bigIntField54;
    }

    public void setBigIntField54(Long bigIntField54) {
        this.bigIntField54 = bigIntField54;
    }

    public BigDecimal getDecimalField0() {
        return decimalField0;
    }

    public void setDecimalField0(BigDecimal decimalField0) {
        this.decimalField0 = decimalField0;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField57() {
        return floatField57;
    }

    public void setFloatField57(Float floatField57) {
        this.floatField57 = floatField57;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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
