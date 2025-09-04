package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingAccountV1 implements Serializable {
    private static final long serialVersionUID = 633L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField48;
    private Integer intField21;
    private Long bigIntField13;
    private BigDecimal decimalField13;
    private BigDecimal priceField;
    private Float floatField79;
    private Double doubleField53;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingAccountV1() {}

    public BankingAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField15() {
        return tinyIntField15;
    }

    public void setTinyIntField15(Byte tinyIntField15) {
        this.tinyIntField15 = tinyIntField15;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField13() {
        return bigIntField13;
    }

    public void setBigIntField13(Long bigIntField13) {
        this.bigIntField13 = bigIntField13;
    }

    public BigDecimal getDecimalField13() {
        return decimalField13;
    }

    public void setDecimalField13(BigDecimal decimalField13) {
        this.decimalField13 = decimalField13;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField79() {
        return floatField79;
    }

    public void setFloatField79(Float floatField79) {
        this.floatField79 = floatField79;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
