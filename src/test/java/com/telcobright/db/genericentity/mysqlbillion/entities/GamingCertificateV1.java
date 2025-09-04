package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: GamingCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingCertificateV1 implements Serializable {
    private static final long serialVersionUID = 837L;

    private Long id;
    private Byte tinyIntField63;
    private Short smallIntField17;
    private Integer intField39;
    private Long bigIntField56;
    private BigDecimal decimalField50;
    private BigDecimal priceField;
    private Float floatField56;
    private Double doubleField37;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GamingCertificateV1() {}

    public GamingCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField63() {
        return tinyIntField63;
    }

    public void setTinyIntField63(Byte tinyIntField63) {
        this.tinyIntField63 = tinyIntField63;
    }

    public Short getSmallIntField17() {
        return smallIntField17;
    }

    public void setSmallIntField17(Short smallIntField17) {
        this.smallIntField17 = smallIntField17;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField56() {
        return bigIntField56;
    }

    public void setBigIntField56(Long bigIntField56) {
        this.bigIntField56 = bigIntField56;
    }

    public BigDecimal getDecimalField50() {
        return decimalField50;
    }

    public void setDecimalField50(BigDecimal decimalField50) {
        this.decimalField50 = decimalField50;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField56() {
        return floatField56;
    }

    public void setFloatField56(Float floatField56) {
        this.floatField56 = floatField56;
    }

    public Double getDoubleField37() {
        return doubleField37;
    }

    public void setDoubleField37(Double doubleField37) {
        this.doubleField37 = doubleField37;
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
