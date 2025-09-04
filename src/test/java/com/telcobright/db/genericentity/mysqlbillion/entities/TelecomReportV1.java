package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomReportV1 implements Serializable {
    private static final long serialVersionUID = 489L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField2;
    private Integer intField39;
    private Long bigIntField97;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField28;
    private Double doubleField99;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TelecomReportV1() {}

    public TelecomReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField2() {
        return smallIntField2;
    }

    public void setSmallIntField2(Short smallIntField2) {
        this.smallIntField2 = smallIntField2;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField97() {
        return bigIntField97;
    }

    public void setBigIntField97(Long bigIntField97) {
        this.bigIntField97 = bigIntField97;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField28() {
        return floatField28;
    }

    public void setFloatField28(Float floatField28) {
        this.floatField28 = floatField28;
    }

    public Double getDoubleField99() {
        return doubleField99;
    }

    public void setDoubleField99(Double doubleField99) {
        this.doubleField99 = doubleField99;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
