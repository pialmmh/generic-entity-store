package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateRecordV1 implements Serializable {
    private static final long serialVersionUID = 993L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField15;
    private Integer intField93;
    private Long bigIntField15;
    private BigDecimal decimalField74;
    private BigDecimal priceField;
    private Float floatField42;
    private Double doubleField93;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RealEstateRecordV1() {}

    public RealEstateRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField8() {
        return tinyIntField8;
    }

    public void setTinyIntField8(Byte tinyIntField8) {
        this.tinyIntField8 = tinyIntField8;
    }

    public Short getSmallIntField15() {
        return smallIntField15;
    }

    public void setSmallIntField15(Short smallIntField15) {
        this.smallIntField15 = smallIntField15;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField15() {
        return bigIntField15;
    }

    public void setBigIntField15(Long bigIntField15) {
        this.bigIntField15 = bigIntField15;
    }

    public BigDecimal getDecimalField74() {
        return decimalField74;
    }

    public void setDecimalField74(BigDecimal decimalField74) {
        this.decimalField74 = decimalField74;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField42() {
        return floatField42;
    }

    public void setFloatField42(Float floatField42) {
        this.floatField42 = floatField42;
    }

    public Double getDoubleField93() {
        return doubleField93;
    }

    public void setDoubleField93(Double doubleField93) {
        this.doubleField93 = doubleField93;
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
