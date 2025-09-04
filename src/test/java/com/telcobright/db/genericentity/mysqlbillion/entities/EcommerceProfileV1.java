package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceProfileV1 implements Serializable {
    private static final long serialVersionUID = 696L;

    private Long id;
    private Byte tinyIntField84;
    private Short smallIntField64;
    private Integer intField12;
    private Long bigIntField87;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField60;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceProfileV1() {}

    public EcommerceProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField84() {
        return tinyIntField84;
    }

    public void setTinyIntField84(Byte tinyIntField84) {
        this.tinyIntField84 = tinyIntField84;
    }

    public Short getSmallIntField64() {
        return smallIntField64;
    }

    public void setSmallIntField64(Short smallIntField64) {
        this.smallIntField64 = smallIntField64;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField60() {
        return doubleField60;
    }

    public void setDoubleField60(Double doubleField60) {
        this.doubleField60 = doubleField60;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
