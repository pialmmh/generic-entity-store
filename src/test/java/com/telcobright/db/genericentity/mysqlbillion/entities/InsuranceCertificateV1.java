package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceCertificateV1 implements Serializable {
    private static final long serialVersionUID = 573L;

    private Long id;
    private Byte tinyIntField82;
    private Short smallIntField37;
    private Integer intField32;
    private Long bigIntField36;
    private BigDecimal decimalField17;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField56;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public InsuranceCertificateV1() {}

    public InsuranceCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField82() {
        return tinyIntField82;
    }

    public void setTinyIntField82(Byte tinyIntField82) {
        this.tinyIntField82 = tinyIntField82;
    }

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField36() {
        return bigIntField36;
    }

    public void setBigIntField36(Long bigIntField36) {
        this.bigIntField36 = bigIntField36;
    }

    public BigDecimal getDecimalField17() {
        return decimalField17;
    }

    public void setDecimalField17(BigDecimal decimalField17) {
        this.decimalField17 = decimalField17;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField41() {
        return floatField41;
    }

    public void setFloatField41(Float floatField41) {
        this.floatField41 = floatField41;
    }

    public Double getDoubleField56() {
        return doubleField56;
    }

    public void setDoubleField56(Double doubleField56) {
        this.doubleField56 = doubleField56;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
