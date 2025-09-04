package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: BankingOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingOrderV1 implements Serializable {
    private static final long serialVersionUID = 645L;

    private Long id;
    private Byte tinyIntField98;
    private Short smallIntField32;
    private Integer intField2;
    private Long bigIntField45;
    private BigDecimal decimalField50;
    private BigDecimal priceField;
    private Float floatField47;
    private Double doubleField54;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public BankingOrderV1() {}

    public BankingOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField98() {
        return tinyIntField98;
    }

    public void setTinyIntField98(Byte tinyIntField98) {
        this.tinyIntField98 = tinyIntField98;
    }

    public Short getSmallIntField32() {
        return smallIntField32;
    }

    public void setSmallIntField32(Short smallIntField32) {
        this.smallIntField32 = smallIntField32;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField45() {
        return bigIntField45;
    }

    public void setBigIntField45(Long bigIntField45) {
        this.bigIntField45 = bigIntField45;
    }

    public BigDecimal getDecimalField50() {
        return decimalField50;
    }

    public void setDecimalField50(BigDecimal decimalField50) {
        this.decimalField50 = decimalField50;
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

    public Double getDoubleField54() {
        return doubleField54;
    }

    public void setDoubleField54(Double doubleField54) {
        this.doubleField54 = doubleField54;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
