package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareDocumentV1 implements Serializable {
    private static final long serialVersionUID = 108L;

    private Long id;
    private Byte tinyIntField19;
    private Short smallIntField58;
    private Integer intField75;
    private Long bigIntField63;
    private BigDecimal decimalField48;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField27;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcareDocumentV1() {}

    public HealthcareDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField19() {
        return tinyIntField19;
    }

    public void setTinyIntField19(Byte tinyIntField19) {
        this.tinyIntField19 = tinyIntField19;
    }

    public Short getSmallIntField58() {
        return smallIntField58;
    }

    public void setSmallIntField58(Short smallIntField58) {
        this.smallIntField58 = smallIntField58;
    }

    public Integer getIntField75() {
        return intField75;
    }

    public void setIntField75(Integer intField75) {
        this.intField75 = intField75;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
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

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField27() {
        return doubleField27;
    }

    public void setDoubleField27(Double doubleField27) {
        this.doubleField27 = doubleField27;
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
