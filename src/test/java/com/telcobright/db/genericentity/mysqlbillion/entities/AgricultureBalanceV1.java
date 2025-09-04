package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureBalanceV1 implements Serializable {
    private static final long serialVersionUID = 1185L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField81;
    private Integer intField87;
    private Long bigIntField68;
    private BigDecimal decimalField13;
    private BigDecimal priceField;
    private Float floatField83;
    private Double doubleField27;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public AgricultureBalanceV1() {}

    public AgricultureBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField95() {
        return tinyIntField95;
    }

    public void setTinyIntField95(Byte tinyIntField95) {
        this.tinyIntField95 = tinyIntField95;
    }

    public Short getSmallIntField81() {
        return smallIntField81;
    }

    public void setSmallIntField81(Short smallIntField81) {
        this.smallIntField81 = smallIntField81;
    }

    public Integer getIntField87() {
        return intField87;
    }

    public void setIntField87(Integer intField87) {
        this.intField87 = intField87;
    }

    public Long getBigIntField68() {
        return bigIntField68;
    }

    public void setBigIntField68(Long bigIntField68) {
        this.bigIntField68 = bigIntField68;
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

    public Float getFloatField83() {
        return floatField83;
    }

    public void setFloatField83(Float floatField83) {
        this.floatField83 = floatField83;
    }

    public Double getDoubleField27() {
        return doubleField27;
    }

    public void setDoubleField27(Double doubleField27) {
        this.doubleField27 = doubleField27;
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
