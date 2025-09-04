package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureHistoryV1 implements Serializable {
    private static final long serialVersionUID = 1140L;

    private Long id;
    private Byte tinyIntField69;
    private Short smallIntField25;
    private Integer intField31;
    private Long bigIntField29;
    private BigDecimal decimalField13;
    private BigDecimal priceField;
    private Float floatField47;
    private Double doubleField76;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public AgricultureHistoryV1() {}

    public AgricultureHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField69() {
        return tinyIntField69;
    }

    public void setTinyIntField69(Byte tinyIntField69) {
        this.tinyIntField69 = tinyIntField69;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField29() {
        return bigIntField29;
    }

    public void setBigIntField29(Long bigIntField29) {
        this.bigIntField29 = bigIntField29;
    }

    public BigDecimal getDecimalField13() {
        return decimalField13;
    }

    public void setDecimalField13(BigDecimal decimalField13) {
        this.decimalField13 = decimalField13;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField47() {
        return floatField47;
    }

    public void setFloatField47(Float floatField47) {
        this.floatField47 = floatField47;
    }

    public Double getDoubleField76() {
        return doubleField76;
    }

    public void setDoubleField76(Double doubleField76) {
        this.doubleField76 = doubleField76;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
