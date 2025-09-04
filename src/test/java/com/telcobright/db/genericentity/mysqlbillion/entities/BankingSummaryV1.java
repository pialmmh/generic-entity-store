package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingSummaryV1 implements Serializable {
    private static final long serialVersionUID = 609L;

    private Long id;
    private Byte tinyIntField19;
    private Short smallIntField55;
    private Integer intField22;
    private Long bigIntField36;
    private BigDecimal decimalField18;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField92;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public BankingSummaryV1() {}

    public BankingSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField19() {
        return tinyIntField19;
    }

    public void setTinyIntField19(Byte tinyIntField19) {
        this.tinyIntField19 = tinyIntField19;
    }

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
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

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField92() {
        return doubleField92;
    }

    public void setDoubleField92(Double doubleField92) {
        this.doubleField92 = doubleField92;
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
