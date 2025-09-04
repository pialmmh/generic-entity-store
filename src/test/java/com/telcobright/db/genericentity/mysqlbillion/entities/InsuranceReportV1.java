package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceReportV1 implements Serializable {
    private static final long serialVersionUID = 555L;

    private Long id;
    private Byte tinyIntField38;
    private Short smallIntField73;
    private Integer intField22;
    private Long bigIntField42;
    private BigDecimal decimalField48;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField81;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public InsuranceReportV1() {}

    public InsuranceReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField38() {
        return tinyIntField38;
    }

    public void setTinyIntField38(Byte tinyIntField38) {
        this.tinyIntField38 = tinyIntField38;
    }

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField42() {
        return bigIntField42;
    }

    public void setBigIntField42(Long bigIntField42) {
        this.bigIntField42 = bigIntField42;
    }

    public BigDecimal getDecimalField48() {
        return decimalField48;
    }

    public void setDecimalField48(BigDecimal decimalField48) {
        this.decimalField48 = decimalField48;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField81() {
        return doubleField81;
    }

    public void setDoubleField81(Double doubleField81) {
        this.doubleField81 = doubleField81;
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
