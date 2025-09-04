package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 957L;

    private Long id;
    private Byte tinyIntField71;
    private Short smallIntField97;
    private Integer intField4;
    private Long bigIntField68;
    private BigDecimal decimalField73;
    private BigDecimal priceField;
    private Float floatField51;
    private Double doubleField56;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TransportationAnalyticsV1() {}

    public TransportationAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField71() {
        return tinyIntField71;
    }

    public void setTinyIntField71(Byte tinyIntField71) {
        this.tinyIntField71 = tinyIntField71;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField68() {
        return bigIntField68;
    }

    public void setBigIntField68(Long bigIntField68) {
        this.bigIntField68 = bigIntField68;
    }

    public BigDecimal getDecimalField73() {
        return decimalField73;
    }

    public void setDecimalField73(BigDecimal decimalField73) {
        this.decimalField73 = decimalField73;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField51() {
        return floatField51;
    }

    public void setFloatField51(Float floatField51) {
        this.floatField51 = floatField51;
    }

    public Double getDoubleField56() {
        return doubleField56;
    }

    public void setDoubleField56(Double doubleField56) {
        this.doubleField56 = doubleField56;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
