package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialReceiptV1 implements Serializable {
    private static final long serialVersionUID = 783L;

    private Long id;
    private Byte tinyIntField81;
    private Short smallIntField82;
    private Integer intField39;
    private Long bigIntField63;
    private BigDecimal decimalField81;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField26;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SocialReceiptV1() {}

    public SocialReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField81() {
        return tinyIntField81;
    }

    public void setTinyIntField81(Byte tinyIntField81) {
        this.tinyIntField81 = tinyIntField81;
    }

    public Short getSmallIntField82() {
        return smallIntField82;
    }

    public void setSmallIntField82(Short smallIntField82) {
        this.smallIntField82 = smallIntField82;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
    }

    public BigDecimal getDecimalField81() {
        return decimalField81;
    }

    public void setDecimalField81(BigDecimal decimalField81) {
        this.decimalField81 = decimalField81;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField20() {
        return floatField20;
    }

    public void setFloatField20(Float floatField20) {
        this.floatField20 = floatField20;
    }

    public Double getDoubleField26() {
        return doubleField26;
    }

    public void setDoubleField26(Double doubleField26) {
        this.doubleField26 = doubleField26;
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
