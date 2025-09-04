package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyLogV1 implements Serializable {
    private static final long serialVersionUID = 1065L;

    private Long id;
    private Byte tinyIntField70;
    private Short smallIntField70;
    private Integer intField15;
    private Long bigIntField15;
    private BigDecimal decimalField18;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField0;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EnergyLogV1() {}

    public EnergyLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField70() {
        return tinyIntField70;
    }

    public void setTinyIntField70(Byte tinyIntField70) {
        this.tinyIntField70 = tinyIntField70;
    }

    public Short getSmallIntField70() {
        return smallIntField70;
    }

    public void setSmallIntField70(Short smallIntField70) {
        this.smallIntField70 = smallIntField70;
    }

    public Integer getIntField15() {
        return intField15;
    }

    public void setIntField15(Integer intField15) {
        this.intField15 = intField15;
    }

    public Long getBigIntField15() {
        return bigIntField15;
    }

    public void setBigIntField15(Long bigIntField15) {
        this.bigIntField15 = bigIntField15;
    }

    public BigDecimal getDecimalField18() {
        return decimalField18;
    }

    public void setDecimalField18(BigDecimal decimalField18) {
        this.decimalField18 = decimalField18;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField0() {
        return doubleField0;
    }

    public void setDoubleField0(Double doubleField0) {
        this.doubleField0 = doubleField0;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
