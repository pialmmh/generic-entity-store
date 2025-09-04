package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 1221L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField68;
    private Integer intField69;
    private Long bigIntField74;
    private BigDecimal decimalField90;
    private BigDecimal priceField;
    private Float floatField58;
    private Double doubleField55;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HospitalityAnalyticsV1() {}

    public HospitalityAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField15() {
        return tinyIntField15;
    }

    public void setTinyIntField15(Byte tinyIntField15) {
        this.tinyIntField15 = tinyIntField15;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField69() {
        return intField69;
    }

    public void setIntField69(Integer intField69) {
        this.intField69 = intField69;
    }

    public Long getBigIntField74() {
        return bigIntField74;
    }

    public void setBigIntField74(Long bigIntField74) {
        this.bigIntField74 = bigIntField74;
    }

    public BigDecimal getDecimalField90() {
        return decimalField90;
    }

    public void setDecimalField90(BigDecimal decimalField90) {
        this.decimalField90 = decimalField90;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField58() {
        return floatField58;
    }

    public void setFloatField58(Float floatField58) {
        this.floatField58 = floatField58;
    }

    public Double getDoubleField55() {
        return doubleField55;
    }

    public void setDoubleField55(Double doubleField55) {
        this.doubleField55 = doubleField55;
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
