package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceProfileV1 implements Serializable {
    private static final long serialVersionUID = 36L;

    private Long id;
    private Byte tinyIntField79;
    private Short smallIntField35;
    private Integer intField11;
    private Long bigIntField52;
    private BigDecimal decimalField43;
    private BigDecimal priceField;
    private Float floatField75;
    private Double doubleField19;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public FinanceProfileV1() {}

    public FinanceProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField79() {
        return tinyIntField79;
    }

    public void setTinyIntField79(Byte tinyIntField79) {
        this.tinyIntField79 = tinyIntField79;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField52() {
        return bigIntField52;
    }

    public void setBigIntField52(Long bigIntField52) {
        this.bigIntField52 = bigIntField52;
    }

    public BigDecimal getDecimalField43() {
        return decimalField43;
    }

    public void setDecimalField43(BigDecimal decimalField43) {
        this.decimalField43 = decimalField43;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField75() {
        return floatField75;
    }

    public void setFloatField75(Float floatField75) {
        this.floatField75 = floatField75;
    }

    public Double getDoubleField19() {
        return doubleField19;
    }

    public void setDoubleField19(Double doubleField19) {
        this.doubleField19 = doubleField19;
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
