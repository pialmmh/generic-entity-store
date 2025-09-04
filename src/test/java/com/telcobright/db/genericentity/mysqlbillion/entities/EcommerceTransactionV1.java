package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceTransactionV1 implements Serializable {
    private static final long serialVersionUID = 660L;

    private Long id;
    private Byte tinyIntField64;
    private Short smallIntField76;
    private Integer intField30;
    private Long bigIntField82;
    private BigDecimal decimalField49;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField33;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EcommerceTransactionV1() {}

    public EcommerceTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField64() {
        return tinyIntField64;
    }

    public void setTinyIntField64(Byte tinyIntField64) {
        this.tinyIntField64 = tinyIntField64;
    }

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField82() {
        return bigIntField82;
    }

    public void setBigIntField82(Long bigIntField82) {
        this.bigIntField82 = bigIntField82;
    }

    public BigDecimal getDecimalField49() {
        return decimalField49;
    }

    public void setDecimalField49(BigDecimal decimalField49) {
        this.decimalField49 = decimalField49;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
