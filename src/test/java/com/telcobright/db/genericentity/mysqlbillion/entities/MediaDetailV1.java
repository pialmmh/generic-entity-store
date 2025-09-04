package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaDetailV1 implements Serializable {
    private static final long serialVersionUID = 870L;

    private Long id;
    private Byte tinyIntField4;
    private Short smallIntField85;
    private Integer intField39;
    private Long bigIntField5;
    private BigDecimal decimalField61;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField69;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public MediaDetailV1() {}

    public MediaDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField4() {
        return tinyIntField4;
    }

    public void setTinyIntField4(Byte tinyIntField4) {
        this.tinyIntField4 = tinyIntField4;
    }

    public Short getSmallIntField85() {
        return smallIntField85;
    }

    public void setSmallIntField85(Short smallIntField85) {
        this.smallIntField85 = smallIntField85;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField5() {
        return bigIntField5;
    }

    public void setBigIntField5(Long bigIntField5) {
        this.bigIntField5 = bigIntField5;
    }

    public BigDecimal getDecimalField61() {
        return decimalField61;
    }

    public void setDecimalField61(BigDecimal decimalField61) {
        this.decimalField61 = decimalField61;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField24() {
        return floatField24;
    }

    public void setFloatField24(Float floatField24) {
        this.floatField24 = floatField24;
    }

    public Double getDoubleField69() {
        return doubleField69;
    }

    public void setDoubleField69(Double doubleField69) {
        this.doubleField69 = doubleField69;
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
