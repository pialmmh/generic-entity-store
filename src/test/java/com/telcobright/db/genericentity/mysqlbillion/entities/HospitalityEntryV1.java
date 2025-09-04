package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityEntryV1 implements Serializable {
    private static final long serialVersionUID = 1194L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField25;
    private Integer intField32;
    private Long bigIntField45;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField87;
    private Double doubleField90;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HospitalityEntryV1() {}

    public HospitalityEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField45() {
        return bigIntField45;
    }

    public void setBigIntField45(Long bigIntField45) {
        this.bigIntField45 = bigIntField45;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField87() {
        return floatField87;
    }

    public void setFloatField87(Float floatField87) {
        this.floatField87 = floatField87;
    }

    public Double getDoubleField90() {
        return doubleField90;
    }

    public void setDoubleField90(Double doubleField90) {
        this.doubleField90 = doubleField90;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
