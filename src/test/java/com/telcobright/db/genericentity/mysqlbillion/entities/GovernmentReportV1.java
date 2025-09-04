package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentReportV1 implements Serializable {
    private static final long serialVersionUID = 423L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField55;
    private Integer intField64;
    private Long bigIntField18;
    private BigDecimal decimalField60;
    private BigDecimal priceField;
    private Float floatField34;
    private Double doubleField77;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GovernmentReportV1() {}

    public GovernmentReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField43() {
        return tinyIntField43;
    }

    public void setTinyIntField43(Byte tinyIntField43) {
        this.tinyIntField43 = tinyIntField43;
    }

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
    }

    public Integer getIntField64() {
        return intField64;
    }

    public void setIntField64(Integer intField64) {
        this.intField64 = intField64;
    }

    public Long getBigIntField18() {
        return bigIntField18;
    }

    public void setBigIntField18(Long bigIntField18) {
        this.bigIntField18 = bigIntField18;
    }

    public BigDecimal getDecimalField60() {
        return decimalField60;
    }

    public void setDecimalField60(BigDecimal decimalField60) {
        this.decimalField60 = decimalField60;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField34() {
        return floatField34;
    }

    public void setFloatField34(Float floatField34) {
        this.floatField34 = floatField34;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
