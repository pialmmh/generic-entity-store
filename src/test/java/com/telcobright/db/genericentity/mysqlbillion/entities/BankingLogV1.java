package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingLogV1 implements Serializable {
    private static final long serialVersionUID = 603L;

    private Long id;
    private Byte tinyIntField46;
    private Short smallIntField88;
    private Integer intField76;
    private Long bigIntField87;
    private BigDecimal decimalField10;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField11;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public BankingLogV1() {}

    public BankingLogV1(Long id, String code, String name) {
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

    public Short getSmallIntField88() {
        return smallIntField88;
    }

    public void setSmallIntField88(Short smallIntField88) {
        this.smallIntField88 = smallIntField88;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
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

    public Float getFloatField7() {
        return floatField7;
    }

    public void setFloatField7(Float floatField7) {
        this.floatField7 = floatField7;
    }

    public Double getDoubleField11() {
        return doubleField11;
    }

    public void setDoubleField11(Double doubleField11) {
        this.doubleField11 = doubleField11;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
