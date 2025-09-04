package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 759L;

    private Long id;
    private Byte tinyIntField91;
    private Short smallIntField86;
    private Integer intField30;
    private Long bigIntField46;
    private BigDecimal decimalField34;
    private BigDecimal priceField;
    private Float floatField94;
    private Double doubleField15;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SocialAnalyticsV1() {}

    public SocialAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField91() {
        return tinyIntField91;
    }

    public void setTinyIntField91(Byte tinyIntField91) {
        this.tinyIntField91 = tinyIntField91;
    }

    public Short getSmallIntField86() {
        return smallIntField86;
    }

    public void setSmallIntField86(Short smallIntField86) {
        this.smallIntField86 = smallIntField86;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField46() {
        return bigIntField46;
    }

    public void setBigIntField46(Long bigIntField46) {
        this.bigIntField46 = bigIntField46;
    }

    public BigDecimal getDecimalField34() {
        return decimalField34;
    }

    public void setDecimalField34(BigDecimal decimalField34) {
        this.decimalField34 = decimalField34;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField94() {
        return floatField94;
    }

    public void setFloatField94(Float floatField94) {
        this.floatField94 = floatField94;
    }

    public Double getDoubleField15() {
        return doubleField15;
    }

    public void setDoubleField15(Double doubleField15) {
        this.doubleField15 = doubleField15;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
