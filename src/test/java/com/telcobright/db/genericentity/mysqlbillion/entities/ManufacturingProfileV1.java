package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingProfileV1 implements Serializable {
    private static final long serialVersionUID = 234L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField96;
    private Integer intField85;
    private Long bigIntField96;
    private BigDecimal decimalField70;
    private BigDecimal priceField;
    private Float floatField86;
    private Double doubleField88;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public ManufacturingProfileV1() {}

    public ManufacturingProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField95() {
        return tinyIntField95;
    }

    public void setTinyIntField95(Byte tinyIntField95) {
        this.tinyIntField95 = tinyIntField95;
    }

    public Short getSmallIntField96() {
        return smallIntField96;
    }

    public void setSmallIntField96(Short smallIntField96) {
        this.smallIntField96 = smallIntField96;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField96() {
        return bigIntField96;
    }

    public void setBigIntField96(Long bigIntField96) {
        this.bigIntField96 = bigIntField96;
    }

    public BigDecimal getDecimalField70() {
        return decimalField70;
    }

    public void setDecimalField70(BigDecimal decimalField70) {
        this.decimalField70 = decimalField70;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField86() {
        return floatField86;
    }

    public void setFloatField86(Float floatField86) {
        this.floatField86 = floatField86;
    }

    public Double getDoubleField88() {
        return doubleField88;
    }

    public void setDoubleField88(Double doubleField88) {
        this.doubleField88 = doubleField88;
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
