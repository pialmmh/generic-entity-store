package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureArchiveV1 implements Serializable {
    private static final long serialVersionUID = 1143L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField37;
    private Integer intField61;
    private Long bigIntField63;
    private BigDecimal decimalField74;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField33;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public AgricultureArchiveV1() {}

    public AgricultureArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField43() {
        return tinyIntField43;
    }

    public void setTinyIntField43(Byte tinyIntField43) {
        this.tinyIntField43 = tinyIntField43;
    }

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField61() {
        return intField61;
    }

    public void setIntField61(Integer intField61) {
        this.intField61 = intField61;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
    }

    public BigDecimal getDecimalField74() {
        return decimalField74;
    }

    public void setDecimalField74(BigDecimal decimalField74) {
        this.decimalField74 = decimalField74;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
