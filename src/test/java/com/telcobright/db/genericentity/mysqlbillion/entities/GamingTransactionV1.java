package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: GamingTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingTransactionV1 implements Serializable {
    private static final long serialVersionUID = 792L;

    private Long id;
    private Byte tinyIntField96;
    private Short smallIntField51;
    private Integer intField30;
    private Long bigIntField21;
    private BigDecimal decimalField6;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField19;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GamingTransactionV1() {}

    public GamingTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField96() {
        return tinyIntField96;
    }

    public void setTinyIntField96(Byte tinyIntField96) {
        this.tinyIntField96 = tinyIntField96;
    }

    public Short getSmallIntField51() {
        return smallIntField51;
    }

    public void setSmallIntField51(Short smallIntField51) {
        this.smallIntField51 = smallIntField51;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField21() {
        return bigIntField21;
    }

    public void setBigIntField21(Long bigIntField21) {
        this.bigIntField21 = bigIntField21;
    }

    public BigDecimal getDecimalField6() {
        return decimalField6;
    }

    public void setDecimalField6(BigDecimal decimalField6) {
        this.decimalField6 = decimalField6;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField7() {
        return floatField7;
    }

    public void setFloatField7(Float floatField7) {
        this.floatField7 = floatField7;
    }

    public Double getDoubleField19() {
        return doubleField19;
    }

    public void setDoubleField19(Double doubleField19) {
        this.doubleField19 = doubleField19;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
