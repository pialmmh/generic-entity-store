package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingBalanceV1 implements Serializable {
    private static final long serialVersionUID = 261L;

    private Long id;
    private Byte tinyIntField46;
    private Short smallIntField81;
    private Integer intField20;
    private Long bigIntField27;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField45;
    private Double doubleField87;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public ManufacturingBalanceV1() {}

    public ManufacturingBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField46() {
        return tinyIntField46;
    }

    public void setTinyIntField46(Byte tinyIntField46) {
        this.tinyIntField46 = tinyIntField46;
    }

    public Short getSmallIntField81() {
        return smallIntField81;
    }

    public void setSmallIntField81(Short smallIntField81) {
        this.smallIntField81 = smallIntField81;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField27() {
        return bigIntField27;
    }

    public void setBigIntField27(Long bigIntField27) {
        this.bigIntField27 = bigIntField27;
    }

    public BigDecimal getDecimalField11() {
        return decimalField11;
    }

    public void setDecimalField11(BigDecimal decimalField11) {
        this.decimalField11 = decimalField11;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField45() {
        return floatField45;
    }

    public void setFloatField45(Float floatField45) {
        this.floatField45 = floatField45;
    }

    public Double getDoubleField87() {
        return doubleField87;
    }

    public void setDoubleField87(Double doubleField87) {
        this.doubleField87 = doubleField87;
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
