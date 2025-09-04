package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailAccountV1 implements Serializable {
    private static final long serialVersionUID = 171L;

    private Long id;
    private Byte tinyIntField86;
    private Short smallIntField70;
    private Integer intField92;
    private Long bigIntField25;
    private BigDecimal decimalField9;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField63;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RetailAccountV1() {}

    public RetailAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField86() {
        return tinyIntField86;
    }

    public void setTinyIntField86(Byte tinyIntField86) {
        this.tinyIntField86 = tinyIntField86;
    }

    public Short getSmallIntField70() {
        return smallIntField70;
    }

    public void setSmallIntField70(Short smallIntField70) {
        this.smallIntField70 = smallIntField70;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField25() {
        return bigIntField25;
    }

    public void setBigIntField25(Long bigIntField25) {
        this.bigIntField25 = bigIntField25;
    }

    public BigDecimal getDecimalField9() {
        return decimalField9;
    }

    public void setDecimalField9(BigDecimal decimalField9) {
        this.decimalField9 = decimalField9;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField63() {
        return doubleField63;
    }

    public void setDoubleField63(Double doubleField63) {
        this.doubleField63 = doubleField63;
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
