package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceMetricV1 implements Serializable {
    private static final long serialVersionUID = 690L;

    private Long id;
    private Byte tinyIntField28;
    private Short smallIntField28;
    private Integer intField22;
    private Long bigIntField33;
    private BigDecimal decimalField94;
    private BigDecimal priceField;
    private Float floatField51;
    private Double doubleField36;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EcommerceMetricV1() {}

    public EcommerceMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField28() {
        return tinyIntField28;
    }

    public void setTinyIntField28(Byte tinyIntField28) {
        this.tinyIntField28 = tinyIntField28;
    }

    public Short getSmallIntField28() {
        return smallIntField28;
    }

    public void setSmallIntField28(Short smallIntField28) {
        this.smallIntField28 = smallIntField28;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField33() {
        return bigIntField33;
    }

    public void setBigIntField33(Long bigIntField33) {
        this.bigIntField33 = bigIntField33;
    }

    public BigDecimal getDecimalField94() {
        return decimalField94;
    }

    public void setDecimalField94(BigDecimal decimalField94) {
        this.decimalField94 = decimalField94;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField51() {
        return floatField51;
    }

    public void setFloatField51(Float floatField51) {
        this.floatField51 = floatField51;
    }

    public Double getDoubleField36() {
        return doubleField36;
    }

    public void setDoubleField36(Double doubleField36) {
        this.doubleField36 = doubleField36;
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
