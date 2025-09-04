package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomPaymentV1 implements Serializable {
    private static final long serialVersionUID = 516L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField73;
    private Integer intField59;
    private Long bigIntField51;
    private BigDecimal decimalField59;
    private BigDecimal priceField;
    private Float floatField25;
    private Double doubleField96;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TelecomPaymentV1() {}

    public TelecomPaymentV1(Long id, String code, String name) {
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

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField51() {
        return bigIntField51;
    }

    public void setBigIntField51(Long bigIntField51) {
        this.bigIntField51 = bigIntField51;
    }

    public BigDecimal getDecimalField59() {
        return decimalField59;
    }

    public void setDecimalField59(BigDecimal decimalField59) {
        this.decimalField59 = decimalField59;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField25() {
        return floatField25;
    }

    public void setFloatField25(Float floatField25) {
        this.floatField25 = floatField25;
    }

    public Double getDoubleField96() {
        return doubleField96;
    }

    public void setDoubleField96(Double doubleField96) {
        this.doubleField96 = doubleField96;
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
