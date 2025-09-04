package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 1089L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField94;
    private Integer intField69;
    private Long bigIntField35;
    private BigDecimal decimalField85;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField69;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EnergyAnalyticsV1() {}

    public EnergyAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField83() {
        return tinyIntField83;
    }

    public void setTinyIntField83(Byte tinyIntField83) {
        this.tinyIntField83 = tinyIntField83;
    }

    public Short getSmallIntField94() {
        return smallIntField94;
    }

    public void setSmallIntField94(Short smallIntField94) {
        this.smallIntField94 = smallIntField94;
    }

    public Integer getIntField69() {
        return intField69;
    }

    public void setIntField69(Integer intField69) {
        this.intField69 = intField69;
    }

    public Long getBigIntField35() {
        return bigIntField35;
    }

    public void setBigIntField35(Long bigIntField35) {
        this.bigIntField35 = bigIntField35;
    }

    public BigDecimal getDecimalField85() {
        return decimalField85;
    }

    public void setDecimalField85(BigDecimal decimalField85) {
        this.decimalField85 = decimalField85;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField69() {
        return doubleField69;
    }

    public void setDoubleField69(Double doubleField69) {
        this.doubleField69 = doubleField69;
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
