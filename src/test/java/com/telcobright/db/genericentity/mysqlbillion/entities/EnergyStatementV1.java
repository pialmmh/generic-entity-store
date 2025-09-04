package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyStatementV1 implements Serializable {
    private static final long serialVersionUID = 1116L;

    private Long id;
    private Byte tinyIntField56;
    private Short smallIntField2;
    private Integer intField76;
    private Long bigIntField58;
    private BigDecimal decimalField94;
    private BigDecimal priceField;
    private Float floatField31;
    private Double doubleField7;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EnergyStatementV1() {}

    public EnergyStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField56() {
        return tinyIntField56;
    }

    public void setTinyIntField56(Byte tinyIntField56) {
        this.tinyIntField56 = tinyIntField56;
    }

    public Short getSmallIntField2() {
        return smallIntField2;
    }

    public void setSmallIntField2(Short smallIntField2) {
        this.smallIntField2 = smallIntField2;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField94() {
        return decimalField94;
    }

    public void setDecimalField94(BigDecimal decimalField94) {
        this.decimalField94 = decimalField94;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField31() {
        return floatField31;
    }

    public void setFloatField31(Float floatField31) {
        this.floatField31 = floatField31;
    }

    public Double getDoubleField7() {
        return doubleField7;
    }

    public void setDoubleField7(Double doubleField7) {
        this.doubleField7 = doubleField7;
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
