package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialProfileV1 implements Serializable {
    private static final long serialVersionUID = 762L;

    private Long id;
    private Byte tinyIntField68;
    private Short smallIntField2;
    private Integer intField86;
    private Long bigIntField44;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField47;
    private Double doubleField43;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SocialProfileV1() {}

    public SocialProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField68() {
        return tinyIntField68;
    }

    public void setTinyIntField68(Byte tinyIntField68) {
        this.tinyIntField68 = tinyIntField68;
    }

    public Short getSmallIntField2() {
        return smallIntField2;
    }

    public void setSmallIntField2(Short smallIntField2) {
        this.smallIntField2 = smallIntField2;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField44() {
        return bigIntField44;
    }

    public void setBigIntField44(Long bigIntField44) {
        this.bigIntField44 = bigIntField44;
    }

    public BigDecimal getDecimalField99() {
        return decimalField99;
    }

    public void setDecimalField99(BigDecimal decimalField99) {
        this.decimalField99 = decimalField99;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField47() {
        return floatField47;
    }

    public void setFloatField47(Float floatField47) {
        this.floatField47 = floatField47;
    }

    public Double getDoubleField43() {
        return doubleField43;
    }

    public void setDoubleField43(Double doubleField43) {
        this.doubleField43 = doubleField43;
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
