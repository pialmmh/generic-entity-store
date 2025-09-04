package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceBalanceV1 implements Serializable {
    private static final long serialVersionUID = 723L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField99;
    private Integer intField48;
    private Long bigIntField41;
    private BigDecimal decimalField57;
    private BigDecimal priceField;
    private Float floatField72;
    private Double doubleField87;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EcommerceBalanceV1() {}

    public EcommerceBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField99() {
        return smallIntField99;
    }

    public void setSmallIntField99(Short smallIntField99) {
        this.smallIntField99 = smallIntField99;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField41() {
        return bigIntField41;
    }

    public void setBigIntField41(Long bigIntField41) {
        this.bigIntField41 = bigIntField41;
    }

    public BigDecimal getDecimalField57() {
        return decimalField57;
    }

    public void setDecimalField57(BigDecimal decimalField57) {
        this.decimalField57 = decimalField57;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField72() {
        return floatField72;
    }

    public void setFloatField72(Float floatField72) {
        this.floatField72 = floatField72;
    }

    public Double getDoubleField87() {
        return doubleField87;
    }

    public void setDoubleField87(Double doubleField87) {
        this.doubleField87 = doubleField87;
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
