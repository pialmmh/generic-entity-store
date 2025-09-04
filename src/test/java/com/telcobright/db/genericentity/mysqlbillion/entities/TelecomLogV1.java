package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomLogV1 implements Serializable {
    private static final long serialVersionUID = 471L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField23;
    private Integer intField66;
    private Long bigIntField63;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField44;
    private Double doubleField7;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public TelecomLogV1() {}

    public TelecomLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField51() {
        return tinyIntField51;
    }

    public void setTinyIntField51(Byte tinyIntField51) {
        this.tinyIntField51 = tinyIntField51;
    }

    public Short getSmallIntField23() {
        return smallIntField23;
    }

    public void setSmallIntField23(Short smallIntField23) {
        this.smallIntField23 = smallIntField23;
    }

    public Integer getIntField66() {
        return intField66;
    }

    public void setIntField66(Integer intField66) {
        this.intField66 = intField66;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField44() {
        return floatField44;
    }

    public void setFloatField44(Float floatField44) {
        this.floatField44 = floatField44;
    }

    public Double getDoubleField7() {
        return doubleField7;
    }

    public void setDoubleField7(Double doubleField7) {
        this.doubleField7 = doubleField7;
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
