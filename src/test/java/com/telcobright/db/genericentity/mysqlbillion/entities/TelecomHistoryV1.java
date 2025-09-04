package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomHistoryV1 implements Serializable {
    private static final long serialVersionUID = 480L;

    private Long id;
    private Byte tinyIntField1;
    private Short smallIntField6;
    private Integer intField20;
    private Long bigIntField56;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField71;
    private Double doubleField17;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TelecomHistoryV1() {}

    public TelecomHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField1() {
        return tinyIntField1;
    }

    public void setTinyIntField1(Byte tinyIntField1) {
        this.tinyIntField1 = tinyIntField1;
    }

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField56() {
        return bigIntField56;
    }

    public void setBigIntField56(Long bigIntField56) {
        this.bigIntField56 = bigIntField56;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField71() {
        return floatField71;
    }

    public void setFloatField71(Float floatField71) {
        this.floatField71 = floatField71;
    }

    public Double getDoubleField17() {
        return doubleField17;
    }

    public void setDoubleField17(Double doubleField17) {
        this.doubleField17 = doubleField17;
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
