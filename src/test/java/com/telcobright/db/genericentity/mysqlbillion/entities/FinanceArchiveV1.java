package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceArchiveV1 implements Serializable {
    private static final long serialVersionUID = 21L;

    private Long id;
    private Byte tinyIntField78;
    private Short smallIntField24;
    private Integer intField20;
    private Long bigIntField27;
    private BigDecimal decimalField44;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField24;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public FinanceArchiveV1() {}

    public FinanceArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField78() {
        return tinyIntField78;
    }

    public void setTinyIntField78(Byte tinyIntField78) {
        this.tinyIntField78 = tinyIntField78;
    }

    public Short getSmallIntField24() {
        return smallIntField24;
    }

    public void setSmallIntField24(Short smallIntField24) {
        this.smallIntField24 = smallIntField24;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField27() {
        return bigIntField27;
    }

    public void setBigIntField27(Long bigIntField27) {
        this.bigIntField27 = bigIntField27;
    }

    public BigDecimal getDecimalField44() {
        return decimalField44;
    }

    public void setDecimalField44(BigDecimal decimalField44) {
        this.decimalField44 = decimalField44;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField24() {
        return doubleField24;
    }

    public void setDoubleField24(Double doubleField24) {
        this.doubleField24 = doubleField24;
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
