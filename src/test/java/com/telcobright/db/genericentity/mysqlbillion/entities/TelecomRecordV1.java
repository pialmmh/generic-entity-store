package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomRecordV1 implements Serializable {
    private static final long serialVersionUID = 465L;

    private Long id;
    private Byte tinyIntField0;
    private Short smallIntField95;
    private Integer intField29;
    private Long bigIntField83;
    private BigDecimal decimalField96;
    private BigDecimal priceField;
    private Float floatField42;
    private Double doubleField21;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TelecomRecordV1() {}

    public TelecomRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField0() {
        return tinyIntField0;
    }

    public void setTinyIntField0(Byte tinyIntField0) {
        this.tinyIntField0 = tinyIntField0;
    }

    public Short getSmallIntField95() {
        return smallIntField95;
    }

    public void setSmallIntField95(Short smallIntField95) {
        this.smallIntField95 = smallIntField95;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField96() {
        return decimalField96;
    }

    public void setDecimalField96(BigDecimal decimalField96) {
        this.decimalField96 = decimalField96;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField42() {
        return floatField42;
    }

    public void setFloatField42(Float floatField42) {
        this.floatField42 = floatField42;
    }

    public Double getDoubleField21() {
        return doubleField21;
    }

    public void setDoubleField21(Double doubleField21) {
        this.doubleField21 = doubleField21;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
