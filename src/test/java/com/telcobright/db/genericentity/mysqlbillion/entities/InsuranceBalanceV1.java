package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceBalanceV1 implements Serializable {
    private static final long serialVersionUID = 591L;

    private Long id;
    private Byte tinyIntField57;
    private Short smallIntField8;
    private Integer intField4;
    private Long bigIntField96;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField71;
    private Double doubleField9;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public InsuranceBalanceV1() {}

    public InsuranceBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField57() {
        return tinyIntField57;
    }

    public void setTinyIntField57(Byte tinyIntField57) {
        this.tinyIntField57 = tinyIntField57;
    }

    public Short getSmallIntField8() {
        return smallIntField8;
    }

    public void setSmallIntField8(Short smallIntField8) {
        this.smallIntField8 = smallIntField8;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField96() {
        return bigIntField96;
    }

    public void setBigIntField96(Long bigIntField96) {
        this.bigIntField96 = bigIntField96;
    }

    public BigDecimal getDecimalField77() {
        return decimalField77;
    }

    public void setDecimalField77(BigDecimal decimalField77) {
        this.decimalField77 = decimalField77;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField71() {
        return floatField71;
    }

    public void setFloatField71(Float floatField71) {
        this.floatField71 = floatField71;
    }

    public Double getDoubleField9() {
        return doubleField9;
    }

    public void setDoubleField9(Double doubleField9) {
        this.doubleField9 = doubleField9;
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
