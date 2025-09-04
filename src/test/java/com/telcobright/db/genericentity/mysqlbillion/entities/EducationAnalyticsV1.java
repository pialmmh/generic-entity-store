package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: EducationAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 363L;

    private Long id;
    private Byte tinyIntField50;
    private Short smallIntField55;
    private Integer intField29;
    private Long bigIntField89;
    private BigDecimal decimalField61;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField46;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EducationAnalyticsV1() {}

    public EducationAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField50() {
        return tinyIntField50;
    }

    public void setTinyIntField50(Byte tinyIntField50) {
        this.tinyIntField50 = tinyIntField50;
    }

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField89() {
        return bigIntField89;
    }

    public void setBigIntField89(Long bigIntField89) {
        this.bigIntField89 = bigIntField89;
    }

    public BigDecimal getDecimalField61() {
        return decimalField61;
    }

    public void setDecimalField61(BigDecimal decimalField61) {
        this.decimalField61 = decimalField61;
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

    public Double getDoubleField46() {
        return doubleField46;
    }

    public void setDoubleField46(Double doubleField46) {
        this.doubleField46 = doubleField46;
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
