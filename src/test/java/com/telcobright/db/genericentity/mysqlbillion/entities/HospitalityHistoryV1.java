package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityHistoryV1 implements Serializable {
    private static final long serialVersionUID = 1206L;

    private Long id;
    private Byte tinyIntField12;
    private Short smallIntField53;
    private Integer intField4;
    private Long bigIntField37;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField40;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HospitalityHistoryV1() {}

    public HospitalityHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField12() {
        return tinyIntField12;
    }

    public void setTinyIntField12(Byte tinyIntField12) {
        this.tinyIntField12 = tinyIntField12;
    }

    public Short getSmallIntField53() {
        return smallIntField53;
    }

    public void setSmallIntField53(Short smallIntField53) {
        this.smallIntField53 = smallIntField53;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
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

    public Double getDoubleField40() {
        return doubleField40;
    }

    public void setDoubleField40(Double doubleField40) {
        this.doubleField40 = doubleField40;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
