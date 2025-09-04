package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationSummaryV1 implements Serializable {
    private static final long serialVersionUID = 345L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField84;
    private Integer intField56;
    private Long bigIntField30;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField77;
    private Double doubleField93;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EducationSummaryV1() {}

    public EducationSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField75() {
        return tinyIntField75;
    }

    public void setTinyIntField75(Byte tinyIntField75) {
        this.tinyIntField75 = tinyIntField75;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField30() {
        return bigIntField30;
    }

    public void setBigIntField30(Long bigIntField30) {
        this.bigIntField30 = bigIntField30;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField77() {
        return floatField77;
    }

    public void setFloatField77(Float floatField77) {
        this.floatField77 = floatField77;
    }

    public Double getDoubleField93() {
        return doubleField93;
    }

    public void setDoubleField93(Double doubleField93) {
        this.doubleField93 = doubleField93;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
