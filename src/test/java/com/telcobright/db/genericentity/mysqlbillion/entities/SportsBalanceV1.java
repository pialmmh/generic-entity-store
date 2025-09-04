package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: SportsBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsBalanceV1 implements Serializable {
    private static final long serialVersionUID = 1317L;

    private Long id;
    private Byte tinyIntField27;
    private Short smallIntField55;
    private Integer intField87;
    private Long bigIntField7;
    private BigDecimal decimalField18;
    private BigDecimal priceField;
    private Float floatField6;
    private Double doubleField14;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SportsBalanceV1() {}

    public SportsBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField27() {
        return tinyIntField27;
    }

    public void setTinyIntField27(Byte tinyIntField27) {
        this.tinyIntField27 = tinyIntField27;
    }

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
    }

    public Integer getIntField87() {
        return intField87;
    }

    public void setIntField87(Integer intField87) {
        this.intField87 = intField87;
    }

    public Long getBigIntField7() {
        return bigIntField7;
    }

    public void setBigIntField7(Long bigIntField7) {
        this.bigIntField7 = bigIntField7;
    }

    public BigDecimal getDecimalField18() {
        return decimalField18;
    }

    public void setDecimalField18(BigDecimal decimalField18) {
        this.decimalField18 = decimalField18;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField6() {
        return floatField6;
    }

    public void setFloatField6(Float floatField6) {
        this.floatField6 = floatField6;
    }

    public Double getDoubleField14() {
        return doubleField14;
    }

    public void setDoubleField14(Double doubleField14) {
        this.doubleField14 = doubleField14;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
