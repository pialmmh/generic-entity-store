package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingTransactionV1 implements Serializable {
    private static final long serialVersionUID = 594L;

    private Long id;
    private Byte tinyIntField16;
    private Short smallIntField40;
    private Integer intField4;
    private Long bigIntField99;
    private BigDecimal decimalField66;
    private BigDecimal priceField;
    private Float floatField3;
    private Double doubleField29;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public BankingTransactionV1() {}

    public BankingTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField16() {
        return tinyIntField16;
    }

    public void setTinyIntField16(Byte tinyIntField16) {
        this.tinyIntField16 = tinyIntField16;
    }

    public Short getSmallIntField40() {
        return smallIntField40;
    }

    public void setSmallIntField40(Short smallIntField40) {
        this.smallIntField40 = smallIntField40;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField99() {
        return bigIntField99;
    }

    public void setBigIntField99(Long bigIntField99) {
        this.bigIntField99 = bigIntField99;
    }

    public BigDecimal getDecimalField66() {
        return decimalField66;
    }

    public void setDecimalField66(BigDecimal decimalField66) {
        this.decimalField66 = decimalField66;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField3() {
        return floatField3;
    }

    public void setFloatField3(Float floatField3) {
        this.floatField3 = floatField3;
    }

    public Double getDoubleField29() {
        return doubleField29;
    }

    public void setDoubleField29(Double doubleField29) {
        this.doubleField29 = doubleField29;
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
