package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentLogV1 implements Serializable {
    private static final long serialVersionUID = 405L;

    private Long id;
    private Byte tinyIntField67;
    private Short smallIntField84;
    private Integer intField92;
    private Long bigIntField58;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField56;
    private Double doubleField24;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GovernmentLogV1() {}

    public GovernmentLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField67() {
        return tinyIntField67;
    }

    public void setTinyIntField67(Byte tinyIntField67) {
        this.tinyIntField67 = tinyIntField67;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField56() {
        return floatField56;
    }

    public void setFloatField56(Float floatField56) {
        this.floatField56 = floatField56;
    }

    public Double getDoubleField24() {
        return doubleField24;
    }

    public void setDoubleField24(Double doubleField24) {
        this.doubleField24 = doubleField24;
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
