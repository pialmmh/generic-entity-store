package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentRecordV1 implements Serializable {
    private static final long serialVersionUID = 399L;

    private Long id;
    private Byte tinyIntField29;
    private Short smallIntField31;
    private Integer intField9;
    private Long bigIntField46;
    private BigDecimal decimalField41;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField7;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GovernmentRecordV1() {}

    public GovernmentRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField29() {
        return tinyIntField29;
    }

    public void setTinyIntField29(Byte tinyIntField29) {
        this.tinyIntField29 = tinyIntField29;
    }

    public Short getSmallIntField31() {
        return smallIntField31;
    }

    public void setSmallIntField31(Short smallIntField31) {
        this.smallIntField31 = smallIntField31;
    }

    public Integer getIntField9() {
        return intField9;
    }

    public void setIntField9(Integer intField9) {
        this.intField9 = intField9;
    }

    public Long getBigIntField46() {
        return bigIntField46;
    }

    public void setBigIntField46(Long bigIntField46) {
        this.bigIntField46 = bigIntField46;
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

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
