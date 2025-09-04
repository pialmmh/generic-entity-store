package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialRecordV1 implements Serializable {
    private static final long serialVersionUID = 729L;

    private Long id;
    private Byte tinyIntField27;
    private Short smallIntField35;
    private Integer intField38;
    private Long bigIntField95;
    private BigDecimal decimalField41;
    private BigDecimal priceField;
    private Float floatField28;
    private Double doubleField12;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SocialRecordV1() {}

    public SocialRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField27() {
        return tinyIntField27;
    }

    public void setTinyIntField27(Byte tinyIntField27) {
        this.tinyIntField27 = tinyIntField27;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField95() {
        return bigIntField95;
    }

    public void setBigIntField95(Long bigIntField95) {
        this.bigIntField95 = bigIntField95;
    }

    public BigDecimal getDecimalField41() {
        return decimalField41;
    }

    public void setDecimalField41(BigDecimal decimalField41) {
        this.decimalField41 = decimalField41;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField28() {
        return floatField28;
    }

    public void setFloatField28(Float floatField28) {
        this.floatField28 = floatField28;
    }

    public Double getDoubleField12() {
        return doubleField12;
    }

    public void setDoubleField12(Double doubleField12) {
        this.doubleField12 = doubleField12;
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
