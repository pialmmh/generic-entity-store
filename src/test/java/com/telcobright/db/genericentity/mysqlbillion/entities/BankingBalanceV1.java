package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingBalanceV1 implements Serializable {
    private static final long serialVersionUID = 657L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField12;
    private Integer intField22;
    private Long bigIntField36;
    private BigDecimal decimalField36;
    private BigDecimal priceField;
    private Float floatField83;
    private Double doubleField56;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public BankingBalanceV1() {}

    public BankingBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField12() {
        return smallIntField12;
    }

    public void setSmallIntField12(Short smallIntField12) {
        this.smallIntField12 = smallIntField12;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField36() {
        return bigIntField36;
    }

    public void setBigIntField36(Long bigIntField36) {
        this.bigIntField36 = bigIntField36;
    }

    public BigDecimal getDecimalField36() {
        return decimalField36;
    }

    public void setDecimalField36(BigDecimal decimalField36) {
        this.decimalField36 = decimalField36;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField83() {
        return floatField83;
    }

    public void setFloatField83(Float floatField83) {
        this.floatField83 = floatField83;
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
