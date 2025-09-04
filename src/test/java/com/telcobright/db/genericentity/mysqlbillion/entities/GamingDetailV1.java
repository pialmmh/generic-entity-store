package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingDetailV1 implements Serializable {
    private static final long serialVersionUID = 804L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField46;
    private Integer intField13;
    private Long bigIntField49;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField86;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GamingDetailV1() {}

    public GamingDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField46() {
        return smallIntField46;
    }

    public void setSmallIntField46(Short smallIntField46) {
        this.smallIntField46 = smallIntField46;
    }

    public Integer getIntField13() {
        return intField13;
    }

    public void setIntField13(Integer intField13) {
        this.intField13 = intField13;
    }

    public Long getBigIntField49() {
        return bigIntField49;
    }

    public void setBigIntField49(Long bigIntField49) {
        this.bigIntField49 = bigIntField49;
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

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField86() {
        return doubleField86;
    }

    public void setDoubleField86(Double doubleField86) {
        this.doubleField86 = doubleField86;
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
