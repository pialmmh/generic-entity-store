package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaAuditV1 implements Serializable {
    private static final long serialVersionUID = 882L;

    private Long id;
    private Byte tinyIntField93;
    private Short smallIntField13;
    private Integer intField59;
    private Long bigIntField97;
    private BigDecimal decimalField46;
    private BigDecimal priceField;
    private Float floatField12;
    private Double doubleField19;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public MediaAuditV1() {}

    public MediaAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField93() {
        return tinyIntField93;
    }

    public void setTinyIntField93(Byte tinyIntField93) {
        this.tinyIntField93 = tinyIntField93;
    }

    public Short getSmallIntField13() {
        return smallIntField13;
    }

    public void setSmallIntField13(Short smallIntField13) {
        this.smallIntField13 = smallIntField13;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField97() {
        return bigIntField97;
    }

    public void setBigIntField97(Long bigIntField97) {
        this.bigIntField97 = bigIntField97;
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

    public Float getFloatField12() {
        return floatField12;
    }

    public void setFloatField12(Float floatField12) {
        this.floatField12 = floatField12;
    }

    public Double getDoubleField19() {
        return doubleField19;
    }

    public void setDoubleField19(Double doubleField19) {
        this.doubleField19 = doubleField19;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
