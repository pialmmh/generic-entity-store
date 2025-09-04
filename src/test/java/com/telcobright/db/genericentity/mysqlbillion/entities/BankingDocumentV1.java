package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingDocumentV1 implements Serializable {
    private static final long serialVersionUID = 636L;

    private Long id;
    private Byte tinyIntField92;
    private Short smallIntField64;
    private Integer intField77;
    private Long bigIntField59;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField81;
    private Double doubleField82;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public BankingDocumentV1() {}

    public BankingDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField92() {
        return tinyIntField92;
    }

    public void setTinyIntField92(Byte tinyIntField92) {
        this.tinyIntField92 = tinyIntField92;
    }

    public Short getSmallIntField64() {
        return smallIntField64;
    }

    public void setSmallIntField64(Short smallIntField64) {
        this.smallIntField64 = smallIntField64;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField81() {
        return floatField81;
    }

    public void setFloatField81(Float floatField81) {
        this.floatField81 = floatField81;
    }

    public Double getDoubleField82() {
        return doubleField82;
    }

    public void setDoubleField82(Double doubleField82) {
        this.doubleField82 = doubleField82;
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
