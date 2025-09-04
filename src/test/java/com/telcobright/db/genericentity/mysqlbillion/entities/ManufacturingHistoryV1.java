package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingHistoryV1 implements Serializable {
    private static final long serialVersionUID = 216L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField25;
    private Integer intField65;
    private Long bigIntField36;
    private BigDecimal decimalField10;
    private BigDecimal priceField;
    private Float floatField56;
    private Double doubleField36;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public ManufacturingHistoryV1() {}

    public ManufacturingHistoryV1(Long id, String code, String name) {
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

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField65() {
        return intField65;
    }

    public void setIntField65(Integer intField65) {
        this.intField65 = intField65;
    }

    public Long getBigIntField36() {
        return bigIntField36;
    }

    public void setBigIntField36(Long bigIntField36) {
        this.bigIntField36 = bigIntField36;
    }

    public BigDecimal getDecimalField10() {
        return decimalField10;
    }

    public void setDecimalField10(BigDecimal decimalField10) {
        this.decimalField10 = decimalField10;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField56() {
        return floatField56;
    }

    public void setFloatField56(Float floatField56) {
        this.floatField56 = floatField56;
    }

    public Double getDoubleField36() {
        return doubleField36;
    }

    public void setDoubleField36(Double doubleField36) {
        this.doubleField36 = doubleField36;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
