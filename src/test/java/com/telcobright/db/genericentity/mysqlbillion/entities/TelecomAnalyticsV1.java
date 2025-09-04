package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 495L;

    private Long id;
    private Byte tinyIntField82;
    private Short smallIntField29;
    private Integer intField28;
    private Long bigIntField76;
    private BigDecimal decimalField65;
    private BigDecimal priceField;
    private Float floatField78;
    private Double doubleField32;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TelecomAnalyticsV1() {}

    public TelecomAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField82() {
        return tinyIntField82;
    }

    public void setTinyIntField82(Byte tinyIntField82) {
        this.tinyIntField82 = tinyIntField82;
    }

    public Short getSmallIntField29() {
        return smallIntField29;
    }

    public void setSmallIntField29(Short smallIntField29) {
        this.smallIntField29 = smallIntField29;
    }

    public Integer getIntField28() {
        return intField28;
    }

    public void setIntField28(Integer intField28) {
        this.intField28 = intField28;
    }

    public Long getBigIntField76() {
        return bigIntField76;
    }

    public void setBigIntField76(Long bigIntField76) {
        this.bigIntField76 = bigIntField76;
    }

    public BigDecimal getDecimalField65() {
        return decimalField65;
    }

    public void setDecimalField65(BigDecimal decimalField65) {
        this.decimalField65 = decimalField65;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField78() {
        return floatField78;
    }

    public void setFloatField78(Float floatField78) {
        this.floatField78 = floatField78;
    }

    public Double getDoubleField32() {
        return doubleField32;
    }

    public void setDoubleField32(Double doubleField32) {
        this.doubleField32 = doubleField32;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
