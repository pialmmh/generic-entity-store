package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 891L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField61;
    private Integer intField30;
    private Long bigIntField85;
    private BigDecimal decimalField90;
    private BigDecimal priceField;
    private Float floatField17;
    private Double doubleField1;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public MediaAnalyticsV1() {}

    public MediaAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField61() {
        return smallIntField61;
    }

    public void setSmallIntField61(Short smallIntField61) {
        this.smallIntField61 = smallIntField61;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField85() {
        return bigIntField85;
    }

    public void setBigIntField85(Long bigIntField85) {
        this.bigIntField85 = bigIntField85;
    }

    public BigDecimal getDecimalField90() {
        return decimalField90;
    }

    public void setDecimalField90(BigDecimal decimalField90) {
        this.decimalField90 = decimalField90;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField17() {
        return floatField17;
    }

    public void setFloatField17(Float floatField17) {
        this.floatField17 = floatField17;
    }

    public Double getDoubleField1() {
        return doubleField1;
    }

    public void setDoubleField1(Double doubleField1) {
        this.doubleField1 = doubleField1;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
