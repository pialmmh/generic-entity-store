package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceCertificateV1 implements Serializable {
    private static final long serialVersionUID = 705L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField43;
    private Integer intField39;
    private Long bigIntField69;
    private BigDecimal decimalField46;
    private BigDecimal priceField;
    private Float floatField33;
    private Double doubleField51;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceCertificateV1() {}

    public EcommerceCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField43() {
        return smallIntField43;
    }

    public void setSmallIntField43(Short smallIntField43) {
        this.smallIntField43 = smallIntField43;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField69() {
        return bigIntField69;
    }

    public void setBigIntField69(Long bigIntField69) {
        this.bigIntField69 = bigIntField69;
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

    public Float getFloatField33() {
        return floatField33;
    }

    public void setFloatField33(Float floatField33) {
        this.floatField33 = floatField33;
    }

    public Double getDoubleField51() {
        return doubleField51;
    }

    public void setDoubleField51(Double doubleField51) {
        this.doubleField51 = doubleField51;
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
