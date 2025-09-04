package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceEntryV1 implements Serializable {
    private static final long serialVersionUID = 6L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField76;
    private Integer intField66;
    private Long bigIntField78;
    private BigDecimal decimalField41;
    private BigDecimal priceField;
    private Float floatField3;
    private Double doubleField77;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceEntryV1() {}

    public FinanceEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField11() {
        return tinyIntField11;
    }

    public void setTinyIntField11(Byte tinyIntField11) {
        this.tinyIntField11 = tinyIntField11;
    }

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField66() {
        return intField66;
    }

    public void setIntField66(Integer intField66) {
        this.intField66 = intField66;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField41() {
        return decimalField41;
    }

    public void setDecimalField41(BigDecimal decimalField41) {
        this.decimalField41 = decimalField41;
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

    public Double getDoubleField77() {
        return doubleField77;
    }

    public void setDoubleField77(Double doubleField77) {
        this.doubleField77 = doubleField77;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
