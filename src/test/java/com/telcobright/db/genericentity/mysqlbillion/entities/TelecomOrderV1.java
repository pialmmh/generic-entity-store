package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomOrderV1 implements Serializable {
    private static final long serialVersionUID = 513L;

    private Long id;
    private Byte tinyIntField67;
    private Short smallIntField57;
    private Integer intField3;
    private Long bigIntField6;
    private BigDecimal decimalField46;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField67;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public TelecomOrderV1() {}

    public TelecomOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField67() {
        return tinyIntField67;
    }

    public void setTinyIntField67(Byte tinyIntField67) {
        this.tinyIntField67 = tinyIntField67;
    }

    public Short getSmallIntField57() {
        return smallIntField57;
    }

    public void setSmallIntField57(Short smallIntField57) {
        this.smallIntField57 = smallIntField57;
    }

    public Integer getIntField3() {
        return intField3;
    }

    public void setIntField3(Integer intField3) {
        this.intField3 = intField3;
    }

    public Long getBigIntField6() {
        return bigIntField6;
    }

    public void setBigIntField6(Long bigIntField6) {
        this.bigIntField6 = bigIntField6;
    }

    public BigDecimal getDecimalField46() {
        return decimalField46;
    }

    public void setDecimalField46(BigDecimal decimalField46) {
        this.decimalField46 = decimalField46;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField24() {
        return floatField24;
    }

    public void setFloatField24(Float floatField24) {
        this.floatField24 = floatField24;
    }

    public Double getDoubleField67() {
        return doubleField67;
    }

    public void setDoubleField67(Double doubleField67) {
        this.doubleField67 = doubleField67;
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
