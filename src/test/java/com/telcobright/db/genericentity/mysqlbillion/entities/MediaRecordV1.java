package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaRecordV1 implements Serializable {
    private static final long serialVersionUID = 861L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField9;
    private Integer intField86;
    private Long bigIntField34;
    private BigDecimal decimalField45;
    private BigDecimal priceField;
    private Float floatField50;
    private Double doubleField98;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public MediaRecordV1() {}

    public MediaRecordV1(Long id, String code, String name) {
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

    public Short getSmallIntField9() {
        return smallIntField9;
    }

    public void setSmallIntField9(Short smallIntField9) {
        this.smallIntField9 = smallIntField9;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField34() {
        return bigIntField34;
    }

    public void setBigIntField34(Long bigIntField34) {
        this.bigIntField34 = bigIntField34;
    }

    public BigDecimal getDecimalField45() {
        return decimalField45;
    }

    public void setDecimalField45(BigDecimal decimalField45) {
        this.decimalField45 = decimalField45;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField50() {
        return floatField50;
    }

    public void setFloatField50(Float floatField50) {
        this.floatField50 = floatField50;
    }

    public Double getDoubleField98() {
        return doubleField98;
    }

    public void setDoubleField98(Double doubleField98) {
        this.doubleField98 = doubleField98;
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
