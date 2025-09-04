package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: GamingHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingHistoryV1 implements Serializable {
    private static final long serialVersionUID = 810L;

    private Long id;
    private Byte tinyIntField71;
    private Short smallIntField22;
    private Integer intField2;
    private Long bigIntField80;
    private BigDecimal decimalField65;
    private BigDecimal priceField;
    private Float floatField37;
    private Double doubleField72;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GamingHistoryV1() {}

    public GamingHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField71() {
        return tinyIntField71;
    }

    public void setTinyIntField71(Byte tinyIntField71) {
        this.tinyIntField71 = tinyIntField71;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField80() {
        return bigIntField80;
    }

    public void setBigIntField80(Long bigIntField80) {
        this.bigIntField80 = bigIntField80;
    }

    public BigDecimal getDecimalField65() {
        return decimalField65;
    }

    public void setDecimalField65(BigDecimal decimalField65) {
        this.decimalField65 = decimalField65;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField37() {
        return floatField37;
    }

    public void setFloatField37(Float floatField37) {
        this.floatField37 = floatField37;
    }

    public Double getDoubleField72() {
        return doubleField72;
    }

    public void setDoubleField72(Double doubleField72) {
        this.doubleField72 = doubleField72;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
