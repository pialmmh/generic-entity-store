package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 1287L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField96;
    private Integer intField42;
    private Long bigIntField34;
    private BigDecimal decimalField68;
    private BigDecimal priceField;
    private Float floatField34;
    private Double doubleField20;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public SportsAnalyticsV1() {}

    public SportsAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField59() {
        return tinyIntField59;
    }

    public void setTinyIntField59(Byte tinyIntField59) {
        this.tinyIntField59 = tinyIntField59;
    }

    public Short getSmallIntField96() {
        return smallIntField96;
    }

    public void setSmallIntField96(Short smallIntField96) {
        this.smallIntField96 = smallIntField96;
    }

    public Integer getIntField42() {
        return intField42;
    }

    public void setIntField42(Integer intField42) {
        this.intField42 = intField42;
    }

    public Long getBigIntField34() {
        return bigIntField34;
    }

    public void setBigIntField34(Long bigIntField34) {
        this.bigIntField34 = bigIntField34;
    }

    public BigDecimal getDecimalField68() {
        return decimalField68;
    }

    public void setDecimalField68(BigDecimal decimalField68) {
        this.decimalField68 = decimalField68;
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

    public Double getDoubleField20() {
        return doubleField20;
    }

    public void setDoubleField20(Double doubleField20) {
        this.doubleField20 = doubleField20;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
