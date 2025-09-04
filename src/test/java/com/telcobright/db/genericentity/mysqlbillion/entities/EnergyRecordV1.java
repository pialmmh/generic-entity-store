package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyRecordV1 implements Serializable {
    private static final long serialVersionUID = 1059L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField34;
    private Integer intField77;
    private Long bigIntField61;
    private BigDecimal decimalField35;
    private BigDecimal priceField;
    private Float floatField63;
    private Double doubleField75;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EnergyRecordV1() {}

    public EnergyRecordV1(Long id, String code, String name) {
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

    public Short getSmallIntField34() {
        return smallIntField34;
    }

    public void setSmallIntField34(Short smallIntField34) {
        this.smallIntField34 = smallIntField34;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField61() {
        return bigIntField61;
    }

    public void setBigIntField61(Long bigIntField61) {
        this.bigIntField61 = bigIntField61;
    }

    public BigDecimal getDecimalField35() {
        return decimalField35;
    }

    public void setDecimalField35(BigDecimal decimalField35) {
        this.decimalField35 = decimalField35;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField63() {
        return floatField63;
    }

    public void setFloatField63(Float floatField63) {
        this.floatField63 = floatField63;
    }

    public Double getDoubleField75() {
        return doubleField75;
    }

    public void setDoubleField75(Double doubleField75) {
        this.doubleField75 = doubleField75;
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
