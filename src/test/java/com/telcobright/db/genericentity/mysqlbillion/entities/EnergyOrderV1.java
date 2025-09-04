package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyOrderV1 implements Serializable {
    private static final long serialVersionUID = 1107L;

    private Long id;
    private Byte tinyIntField24;
    private Short smallIntField50;
    private Integer intField78;
    private Long bigIntField58;
    private BigDecimal decimalField97;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField5;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EnergyOrderV1() {}

    public EnergyOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField24() {
        return tinyIntField24;
    }

    public void setTinyIntField24(Byte tinyIntField24) {
        this.tinyIntField24 = tinyIntField24;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField78() {
        return intField78;
    }

    public void setIntField78(Integer intField78) {
        this.intField78 = intField78;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField97() {
        return decimalField97;
    }

    public void setDecimalField97(BigDecimal decimalField97) {
        this.decimalField97 = decimalField97;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
