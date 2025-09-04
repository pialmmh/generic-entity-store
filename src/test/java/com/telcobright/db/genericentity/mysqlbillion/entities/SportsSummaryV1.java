package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsSummaryV1 implements Serializable {
    private static final long serialVersionUID = 1269L;

    private Long id;
    private Byte tinyIntField24;
    private Short smallIntField84;
    private Integer intField23;
    private Long bigIntField71;
    private BigDecimal decimalField4;
    private BigDecimal priceField;
    private Float floatField16;
    private Double doubleField33;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SportsSummaryV1() {}

    public SportsSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField24() {
        return tinyIntField24;
    }

    public void setTinyIntField24(Byte tinyIntField24) {
        this.tinyIntField24 = tinyIntField24;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField23() {
        return intField23;
    }

    public void setIntField23(Integer intField23) {
        this.intField23 = intField23;
    }

    public Long getBigIntField71() {
        return bigIntField71;
    }

    public void setBigIntField71(Long bigIntField71) {
        this.bigIntField71 = bigIntField71;
    }

    public BigDecimal getDecimalField4() {
        return decimalField4;
    }

    public void setDecimalField4(BigDecimal decimalField4) {
        this.decimalField4 = decimalField4;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField16() {
        return floatField16;
    }

    public void setFloatField16(Float floatField16) {
        this.floatField16 = floatField16;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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
