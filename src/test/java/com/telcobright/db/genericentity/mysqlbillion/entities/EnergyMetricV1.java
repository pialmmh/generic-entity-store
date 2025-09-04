package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyMetricV1 implements Serializable {
    private static final long serialVersionUID = 1086L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField42;
    private Integer intField31;
    private Long bigIntField84;
    private BigDecimal decimalField44;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField12;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EnergyMetricV1() {}

    public EnergyMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField42() {
        return smallIntField42;
    }

    public void setSmallIntField42(Short smallIntField42) {
        this.smallIntField42 = smallIntField42;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField84() {
        return bigIntField84;
    }

    public void setBigIntField84(Long bigIntField84) {
        this.bigIntField84 = bigIntField84;
    }

    public BigDecimal getDecimalField44() {
        return decimalField44;
    }

    public void setDecimalField44(BigDecimal decimalField44) {
        this.decimalField44 = decimalField44;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField12() {
        return doubleField12;
    }

    public void setDoubleField12(Double doubleField12) {
        this.doubleField12 = doubleField12;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
