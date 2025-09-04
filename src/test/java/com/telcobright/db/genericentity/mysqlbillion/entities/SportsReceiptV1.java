package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsReceiptV1 implements Serializable {
    private static final long serialVersionUID = 1311L;

    private Long id;
    private Byte tinyIntField54;
    private Short smallIntField88;
    private Integer intField41;
    private Long bigIntField59;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField81;
    private Double doubleField81;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SportsReceiptV1() {}

    public SportsReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField54() {
        return tinyIntField54;
    }

    public void setTinyIntField54(Byte tinyIntField54) {
        this.tinyIntField54 = tinyIntField54;
    }

    public Short getSmallIntField88() {
        return smallIntField88;
    }

    public void setSmallIntField88(Short smallIntField88) {
        this.smallIntField88 = smallIntField88;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
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

    public Float getFloatField81() {
        return floatField81;
    }

    public void setFloatField81(Float floatField81) {
        this.floatField81 = floatField81;
    }

    public Double getDoubleField81() {
        return doubleField81;
    }

    public void setDoubleField81(Double doubleField81) {
        this.doubleField81 = doubleField81;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
