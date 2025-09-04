package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailTransactionV1 implements Serializable {
    private static final long serialVersionUID = 132L;

    private Long id;
    private Byte tinyIntField91;
    private Short smallIntField22;
    private Integer intField28;
    private Long bigIntField86;
    private BigDecimal decimalField19;
    private BigDecimal priceField;
    private Float floatField75;
    private Double doubleField78;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RetailTransactionV1() {}

    public RetailTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField91() {
        return tinyIntField91;
    }

    public void setTinyIntField91(Byte tinyIntField91) {
        this.tinyIntField91 = tinyIntField91;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField28() {
        return intField28;
    }

    public void setIntField28(Integer intField28) {
        this.intField28 = intField28;
    }

    public Long getBigIntField86() {
        return bigIntField86;
    }

    public void setBigIntField86(Long bigIntField86) {
        this.bigIntField86 = bigIntField86;
    }

    public BigDecimal getDecimalField19() {
        return decimalField19;
    }

    public void setDecimalField19(BigDecimal decimalField19) {
        this.decimalField19 = decimalField19;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField75() {
        return floatField75;
    }

    public void setFloatField75(Float floatField75) {
        this.floatField75 = floatField75;
    }

    public Double getDoubleField78() {
        return doubleField78;
    }

    public void setDoubleField78(Double doubleField78) {
        this.doubleField78 = doubleField78;
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
