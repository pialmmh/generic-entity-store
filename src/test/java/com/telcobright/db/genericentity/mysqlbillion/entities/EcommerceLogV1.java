package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceLogV1 implements Serializable {
    private static final long serialVersionUID = 669L;

    private Long id;
    private Byte tinyIntField94;
    private Short smallIntField24;
    private Integer intField49;
    private Long bigIntField70;
    private BigDecimal decimalField93;
    private BigDecimal priceField;
    private Float floatField41;
    private Double doubleField15;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EcommerceLogV1() {}

    public EcommerceLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField94() {
        return tinyIntField94;
    }

    public void setTinyIntField94(Byte tinyIntField94) {
        this.tinyIntField94 = tinyIntField94;
    }

    public Short getSmallIntField24() {
        return smallIntField24;
    }

    public void setSmallIntField24(Short smallIntField24) {
        this.smallIntField24 = smallIntField24;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField70() {
        return bigIntField70;
    }

    public void setBigIntField70(Long bigIntField70) {
        this.bigIntField70 = bigIntField70;
    }

    public BigDecimal getDecimalField93() {
        return decimalField93;
    }

    public void setDecimalField93(BigDecimal decimalField93) {
        this.decimalField93 = decimalField93;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField41() {
        return floatField41;
    }

    public void setFloatField41(Float floatField41) {
        this.floatField41 = floatField41;
    }

    public Double getDoubleField15() {
        return doubleField15;
    }

    public void setDoubleField15(Double doubleField15) {
        this.doubleField15 = doubleField15;
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
