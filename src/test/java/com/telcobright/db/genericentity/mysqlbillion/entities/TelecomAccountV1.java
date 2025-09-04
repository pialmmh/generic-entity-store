package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomAccountV1 implements Serializable {
    private static final long serialVersionUID = 501L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField82;
    private Integer intField11;
    private Long bigIntField88;
    private BigDecimal decimalField25;
    private BigDecimal priceField;
    private Float floatField64;
    private Double doubleField49;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TelecomAccountV1() {}

    public TelecomAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField82() {
        return smallIntField82;
    }

    public void setSmallIntField82(Short smallIntField82) {
        this.smallIntField82 = smallIntField82;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField25() {
        return decimalField25;
    }

    public void setDecimalField25(BigDecimal decimalField25) {
        this.decimalField25 = decimalField25;
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

    public Double getDoubleField49() {
        return doubleField49;
    }

    public void setDoubleField49(Double doubleField49) {
        this.doubleField49 = doubleField49;
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
