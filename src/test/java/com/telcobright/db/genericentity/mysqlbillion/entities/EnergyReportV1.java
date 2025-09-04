package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyReportV1 implements Serializable {
    private static final long serialVersionUID = 1083L;

    private Long id;
    private Byte tinyIntField10;
    private Short smallIntField27;
    private Integer intField24;
    private Long bigIntField38;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField58;
    private Double doubleField36;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EnergyReportV1() {}

    public EnergyReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField10() {
        return tinyIntField10;
    }

    public void setTinyIntField10(Byte tinyIntField10) {
        this.tinyIntField10 = tinyIntField10;
    }

    public Short getSmallIntField27() {
        return smallIntField27;
    }

    public void setSmallIntField27(Short smallIntField27) {
        this.smallIntField27 = smallIntField27;
    }

    public Integer getIntField24() {
        return intField24;
    }

    public void setIntField24(Integer intField24) {
        this.intField24 = intField24;
    }

    public Long getBigIntField38() {
        return bigIntField38;
    }

    public void setBigIntField38(Long bigIntField38) {
        this.bigIntField38 = bigIntField38;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
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

    public Double getDoubleField36() {
        return doubleField36;
    }

    public void setDoubleField36(Double doubleField36) {
        this.doubleField36 = doubleField36;
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
