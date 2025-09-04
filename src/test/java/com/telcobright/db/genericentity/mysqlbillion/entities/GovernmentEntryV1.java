package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentEntryV1 implements Serializable {
    private static final long serialVersionUID = 402L;

    private Long id;
    private Byte tinyIntField88;
    private Short smallIntField64;
    private Integer intField9;
    private Long bigIntField49;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField50;
    private Double doubleField28;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GovernmentEntryV1() {}

    public GovernmentEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField88() {
        return tinyIntField88;
    }

    public void setTinyIntField88(Byte tinyIntField88) {
        this.tinyIntField88 = tinyIntField88;
    }

    public Short getSmallIntField64() {
        return smallIntField64;
    }

    public void setSmallIntField64(Short smallIntField64) {
        this.smallIntField64 = smallIntField64;
    }

    public Integer getIntField9() {
        return intField9;
    }

    public void setIntField9(Integer intField9) {
        this.intField9 = intField9;
    }

    public Long getBigIntField49() {
        return bigIntField49;
    }

    public void setBigIntField49(Long bigIntField49) {
        this.bigIntField49 = bigIntField49;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField50() {
        return floatField50;
    }

    public void setFloatField50(Float floatField50) {
        this.floatField50 = floatField50;
    }

    public Double getDoubleField28() {
        return doubleField28;
    }

    public void setDoubleField28(Double doubleField28) {
        this.doubleField28 = doubleField28;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
