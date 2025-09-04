package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceAccountV1 implements Serializable {
    private static final long serialVersionUID = 39L;

    private Long id;
    private Byte tinyIntField54;
    private Short smallIntField47;
    private Integer intField92;
    private Long bigIntField86;
    private BigDecimal decimalField4;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField76;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public FinanceAccountV1() {}

    public FinanceAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField54() {
        return tinyIntField54;
    }

    public void setTinyIntField54(Byte tinyIntField54) {
        this.tinyIntField54 = tinyIntField54;
    }

    public Short getSmallIntField47() {
        return smallIntField47;
    }

    public void setSmallIntField47(Short smallIntField47) {
        this.smallIntField47 = smallIntField47;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField86() {
        return bigIntField86;
    }

    public void setBigIntField86(Long bigIntField86) {
        this.bigIntField86 = bigIntField86;
    }

    public BigDecimal getDecimalField4() {
        return decimalField4;
    }

    public void setDecimalField4(BigDecimal decimalField4) {
        this.decimalField4 = decimalField4;
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
