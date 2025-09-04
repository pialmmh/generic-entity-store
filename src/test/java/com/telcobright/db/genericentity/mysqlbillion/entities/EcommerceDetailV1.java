package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceDetailV1 implements Serializable {
    private static final long serialVersionUID = 672L;

    private Long id;
    private Byte tinyIntField88;
    private Short smallIntField71;
    private Integer intField13;
    private Long bigIntField10;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField12;
    private Double doubleField0;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EcommerceDetailV1() {}

    public EcommerceDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField88() {
        return tinyIntField88;
    }

    public void setTinyIntField88(Byte tinyIntField88) {
        this.tinyIntField88 = tinyIntField88;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField13() {
        return intField13;
    }

    public void setIntField13(Integer intField13) {
        this.intField13 = intField13;
    }

    public Long getBigIntField10() {
        return bigIntField10;
    }

    public void setBigIntField10(Long bigIntField10) {
        this.bigIntField10 = bigIntField10;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField12() {
        return floatField12;
    }

    public void setFloatField12(Float floatField12) {
        this.floatField12 = floatField12;
    }

    public Double getDoubleField0() {
        return doubleField0;
    }

    public void setDoubleField0(Double doubleField0) {
        this.doubleField0 = doubleField0;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
