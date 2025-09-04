package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialDocumentV1 implements Serializable {
    private static final long serialVersionUID = 768L;

    private Long id;
    private Byte tinyIntField0;
    private Short smallIntField59;
    private Integer intField31;
    private Long bigIntField43;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField13;
    private Double doubleField58;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SocialDocumentV1() {}

    public SocialDocumentV1(Long id, String code, String name) {
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

    public Short getSmallIntField59() {
        return smallIntField59;
    }

    public void setSmallIntField59(Short smallIntField59) {
        this.smallIntField59 = smallIntField59;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField43() {
        return bigIntField43;
    }

    public void setBigIntField43(Long bigIntField43) {
        this.bigIntField43 = bigIntField43;
    }

    public BigDecimal getDecimalField11() {
        return decimalField11;
    }

    public void setDecimalField11(BigDecimal decimalField11) {
        this.decimalField11 = decimalField11;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField13() {
        return floatField13;
    }

    public void setFloatField13(Float floatField13) {
        this.floatField13 = floatField13;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
