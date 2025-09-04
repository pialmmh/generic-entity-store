package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialBalanceV1 implements Serializable {
    private static final long serialVersionUID = 789L;

    private Long id;
    private Byte tinyIntField19;
    private Short smallIntField35;
    private Integer intField22;
    private Long bigIntField23;
    private BigDecimal decimalField40;
    private BigDecimal priceField;
    private Float floatField6;
    private Double doubleField42;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SocialBalanceV1() {}

    public SocialBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField19() {
        return tinyIntField19;
    }

    public void setTinyIntField19(Byte tinyIntField19) {
        this.tinyIntField19 = tinyIntField19;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField23() {
        return bigIntField23;
    }

    public void setBigIntField23(Long bigIntField23) {
        this.bigIntField23 = bigIntField23;
    }

    public BigDecimal getDecimalField40() {
        return decimalField40;
    }

    public void setDecimalField40(BigDecimal decimalField40) {
        this.decimalField40 = decimalField40;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField6() {
        return floatField6;
    }

    public void setFloatField6(Float floatField6) {
        this.floatField6 = floatField6;
    }

    public Double getDoubleField42() {
        return doubleField42;
    }

    public void setDoubleField42(Double doubleField42) {
        this.doubleField42 = doubleField42;
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
