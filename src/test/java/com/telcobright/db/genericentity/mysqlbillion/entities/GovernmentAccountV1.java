package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentAccountV1 implements Serializable {
    private static final long serialVersionUID = 435L;

    private Long id;
    private Byte tinyIntField32;
    private Short smallIntField35;
    private Integer intField84;
    private Long bigIntField9;
    private BigDecimal decimalField46;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField27;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GovernmentAccountV1() {}

    public GovernmentAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField32() {
        return tinyIntField32;
    }

    public void setTinyIntField32(Byte tinyIntField32) {
        this.tinyIntField32 = tinyIntField32;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField9() {
        return bigIntField9;
    }

    public void setBigIntField9(Long bigIntField9) {
        this.bigIntField9 = bigIntField9;
    }

    public BigDecimal getDecimalField46() {
        return decimalField46;
    }

    public void setDecimalField46(BigDecimal decimalField46) {
        this.decimalField46 = decimalField46;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
    }

    public Double getDoubleField27() {
        return doubleField27;
    }

    public void setDoubleField27(Double doubleField27) {
        this.doubleField27 = doubleField27;
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
