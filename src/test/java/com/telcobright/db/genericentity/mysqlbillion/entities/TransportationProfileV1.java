package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationProfileV1 implements Serializable {
    private static final long serialVersionUID = 960L;

    private Long id;
    private Byte tinyIntField65;
    private Short smallIntField44;
    private Integer intField67;
    private Long bigIntField7;
    private BigDecimal decimalField63;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField41;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TransportationProfileV1() {}

    public TransportationProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField65() {
        return tinyIntField65;
    }

    public void setTinyIntField65(Byte tinyIntField65) {
        this.tinyIntField65 = tinyIntField65;
    }

    public Short getSmallIntField44() {
        return smallIntField44;
    }

    public void setSmallIntField44(Short smallIntField44) {
        this.smallIntField44 = smallIntField44;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField7() {
        return bigIntField7;
    }

    public void setBigIntField7(Long bigIntField7) {
        this.bigIntField7 = bigIntField7;
    }

    public BigDecimal getDecimalField63() {
        return decimalField63;
    }

    public void setDecimalField63(BigDecimal decimalField63) {
        this.decimalField63 = decimalField63;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField22() {
        return floatField22;
    }

    public void setFloatField22(Float floatField22) {
        this.floatField22 = floatField22;
    }

    public Double getDoubleField41() {
        return doubleField41;
    }

    public void setDoubleField41(Double doubleField41) {
        this.doubleField41 = doubleField41;
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
