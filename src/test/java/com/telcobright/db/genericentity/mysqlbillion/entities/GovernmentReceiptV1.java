package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentReceiptV1 implements Serializable {
    private static final long serialVersionUID = 453L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField66;
    private Integer intField57;
    private Long bigIntField91;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField6;
    private Double doubleField71;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GovernmentReceiptV1() {}

    public GovernmentReceiptV1(Long id, String code, String name) {
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

    public Short getSmallIntField66() {
        return smallIntField66;
    }

    public void setSmallIntField66(Short smallIntField66) {
        this.smallIntField66 = smallIntField66;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField91() {
        return bigIntField91;
    }

    public void setBigIntField91(Long bigIntField91) {
        this.bigIntField91 = bigIntField91;
    }

    public BigDecimal getDecimalField11() {
        return decimalField11;
    }

    public void setDecimalField11(BigDecimal decimalField11) {
        this.decimalField11 = decimalField11;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField6() {
        return floatField6;
    }

    public void setFloatField6(Float floatField6) {
        this.floatField6 = floatField6;
    }

    public Double getDoubleField71() {
        return doubleField71;
    }

    public void setDoubleField71(Double doubleField71) {
        this.doubleField71 = doubleField71;
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
