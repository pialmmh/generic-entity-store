package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceReceiptV1 implements Serializable {
    private static final long serialVersionUID = 585L;

    private Long id;
    private Byte tinyIntField6;
    private Short smallIntField32;
    private Integer intField67;
    private Long bigIntField16;
    private BigDecimal decimalField51;
    private BigDecimal priceField;
    private Float floatField68;
    private Double doubleField75;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public InsuranceReceiptV1() {}

    public InsuranceReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField6() {
        return tinyIntField6;
    }

    public void setTinyIntField6(Byte tinyIntField6) {
        this.tinyIntField6 = tinyIntField6;
    }

    public Short getSmallIntField32() {
        return smallIntField32;
    }

    public void setSmallIntField32(Short smallIntField32) {
        this.smallIntField32 = smallIntField32;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField51() {
        return decimalField51;
    }

    public void setDecimalField51(BigDecimal decimalField51) {
        this.decimalField51 = decimalField51;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField68() {
        return floatField68;
    }

    public void setFloatField68(Float floatField68) {
        this.floatField68 = floatField68;
    }

    public Double getDoubleField75() {
        return doubleField75;
    }

    public void setDoubleField75(Double doubleField75) {
        this.doubleField75 = doubleField75;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
