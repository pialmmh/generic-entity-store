package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceReportV1 implements Serializable {
    private static final long serialVersionUID = 687L;

    private Long id;
    private Byte tinyIntField69;
    private Short smallIntField95;
    private Integer intField22;
    private Long bigIntField29;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField67;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EcommerceReportV1() {}

    public EcommerceReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField69() {
        return tinyIntField69;
    }

    public void setTinyIntField69(Byte tinyIntField69) {
        this.tinyIntField69 = tinyIntField69;
    }

    public Short getSmallIntField95() {
        return smallIntField95;
    }

    public void setSmallIntField95(Short smallIntField95) {
        this.smallIntField95 = smallIntField95;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField29() {
        return bigIntField29;
    }

    public void setBigIntField29(Long bigIntField29) {
        this.bigIntField29 = bigIntField29;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField67() {
        return doubleField67;
    }

    public void setDoubleField67(Double doubleField67) {
        this.doubleField67 = doubleField67;
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
