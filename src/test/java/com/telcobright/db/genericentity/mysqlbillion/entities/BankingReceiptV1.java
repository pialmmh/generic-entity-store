package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingReceiptV1 implements Serializable {
    private static final long serialVersionUID = 651L;

    private Long id;
    private Byte tinyIntField50;
    private Short smallIntField60;
    private Integer intField40;
    private Long bigIntField24;
    private BigDecimal decimalField76;
    private BigDecimal priceField;
    private Float floatField97;
    private Double doubleField39;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingReceiptV1() {}

    public BankingReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField50() {
        return tinyIntField50;
    }

    public void setTinyIntField50(Byte tinyIntField50) {
        this.tinyIntField50 = tinyIntField50;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField40() {
        return intField40;
    }

    public void setIntField40(Integer intField40) {
        this.intField40 = intField40;
    }

    public Long getBigIntField24() {
        return bigIntField24;
    }

    public void setBigIntField24(Long bigIntField24) {
        this.bigIntField24 = bigIntField24;
    }

    public BigDecimal getDecimalField76() {
        return decimalField76;
    }

    public void setDecimalField76(BigDecimal decimalField76) {
        this.decimalField76 = decimalField76;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField97() {
        return floatField97;
    }

    public void setFloatField97(Float floatField97) {
        this.floatField97 = floatField97;
    }

    public Double getDoubleField39() {
        return doubleField39;
    }

    public void setDoubleField39(Double doubleField39) {
        this.doubleField39 = doubleField39;
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
