package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailRecordV1 implements Serializable {
    private static final long serialVersionUID = 135L;

    private Long id;
    private Byte tinyIntField66;
    private Short smallIntField34;
    private Integer intField10;
    private Long bigIntField20;
    private BigDecimal decimalField32;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField35;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RetailRecordV1() {}

    public RetailRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField66() {
        return tinyIntField66;
    }

    public void setTinyIntField66(Byte tinyIntField66) {
        this.tinyIntField66 = tinyIntField66;
    }

    public Short getSmallIntField34() {
        return smallIntField34;
    }

    public void setSmallIntField34(Short smallIntField34) {
        this.smallIntField34 = smallIntField34;
    }

    public Integer getIntField10() {
        return intField10;
    }

    public void setIntField10(Integer intField10) {
        this.intField10 = intField10;
    }

    public Long getBigIntField20() {
        return bigIntField20;
    }

    public void setBigIntField20(Long bigIntField20) {
        this.bigIntField20 = bigIntField20;
    }

    public BigDecimal getDecimalField32() {
        return decimalField32;
    }

    public void setDecimalField32(BigDecimal decimalField32) {
        this.decimalField32 = decimalField32;
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

    public Double getDoubleField35() {
        return doubleField35;
    }

    public void setDoubleField35(Double doubleField35) {
        this.doubleField35 = doubleField35;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
