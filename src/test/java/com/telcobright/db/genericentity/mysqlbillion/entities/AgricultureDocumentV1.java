package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureDocumentV1 implements Serializable {
    private static final long serialVersionUID = 1164L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField73;
    private Integer intField40;
    private Long bigIntField46;
    private BigDecimal decimalField60;
    private BigDecimal priceField;
    private Float floatField21;
    private Double doubleField35;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public AgricultureDocumentV1() {}

    public AgricultureDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField59() {
        return tinyIntField59;
    }

    public void setTinyIntField59(Byte tinyIntField59) {
        this.tinyIntField59 = tinyIntField59;
    }

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField40() {
        return intField40;
    }

    public void setIntField40(Integer intField40) {
        this.intField40 = intField40;
    }

    public Long getBigIntField46() {
        return bigIntField46;
    }

    public void setBigIntField46(Long bigIntField46) {
        this.bigIntField46 = bigIntField46;
    }

    public BigDecimal getDecimalField60() {
        return decimalField60;
    }

    public void setDecimalField60(BigDecimal decimalField60) {
        this.decimalField60 = decimalField60;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField21() {
        return floatField21;
    }

    public void setFloatField21(Float floatField21) {
        this.floatField21 = floatField21;
    }

    public Double getDoubleField35() {
        return doubleField35;
    }

    public void setDoubleField35(Double doubleField35) {
        this.doubleField35 = doubleField35;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
