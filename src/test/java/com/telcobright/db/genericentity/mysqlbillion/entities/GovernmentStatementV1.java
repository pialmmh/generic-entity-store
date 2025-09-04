package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentStatementV1 implements Serializable {
    private static final long serialVersionUID = 456L;

    private Long id;
    private Byte tinyIntField88;
    private Short smallIntField30;
    private Integer intField65;
    private Long bigIntField37;
    private BigDecimal decimalField76;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField47;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GovernmentStatementV1() {}

    public GovernmentStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField88() {
        return tinyIntField88;
    }

    public void setTinyIntField88(Byte tinyIntField88) {
        this.tinyIntField88 = tinyIntField88;
    }

    public Short getSmallIntField30() {
        return smallIntField30;
    }

    public void setSmallIntField30(Short smallIntField30) {
        this.smallIntField30 = smallIntField30;
    }

    public Integer getIntField65() {
        return intField65;
    }

    public void setIntField65(Integer intField65) {
        this.intField65 = intField65;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField76() {
        return decimalField76;
    }

    public void setDecimalField76(BigDecimal decimalField76) {
        this.decimalField76 = decimalField76;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField7() {
        return floatField7;
    }

    public void setFloatField7(Float floatField7) {
        this.floatField7 = floatField7;
    }

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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
