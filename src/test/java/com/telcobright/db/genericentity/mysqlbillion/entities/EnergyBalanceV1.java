package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyBalanceV1 implements Serializable {
    private static final long serialVersionUID = 1119L;

    private Long id;
    private Byte tinyIntField30;
    private Short smallIntField14;
    private Integer intField6;
    private Long bigIntField44;
    private BigDecimal decimalField7;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField64;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EnergyBalanceV1() {}

    public EnergyBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField30() {
        return tinyIntField30;
    }

    public void setTinyIntField30(Byte tinyIntField30) {
        this.tinyIntField30 = tinyIntField30;
    }

    public Short getSmallIntField14() {
        return smallIntField14;
    }

    public void setSmallIntField14(Short smallIntField14) {
        this.smallIntField14 = smallIntField14;
    }

    public Integer getIntField6() {
        return intField6;
    }

    public void setIntField6(Integer intField6) {
        this.intField6 = intField6;
    }

    public Long getBigIntField44() {
        return bigIntField44;
    }

    public void setBigIntField44(Long bigIntField44) {
        this.bigIntField44 = bigIntField44;
    }

    public BigDecimal getDecimalField7() {
        return decimalField7;
    }

    public void setDecimalField7(BigDecimal decimalField7) {
        this.decimalField7 = decimalField7;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField80() {
        return floatField80;
    }

    public void setFloatField80(Float floatField80) {
        this.floatField80 = floatField80;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
