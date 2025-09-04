package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentOrderV1 implements Serializable {
    private static final long serialVersionUID = 447L;

    private Long id;
    private Byte tinyIntField38;
    private Short smallIntField47;
    private Integer intField11;
    private Long bigIntField43;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField28;
    private Double doubleField38;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GovernmentOrderV1() {}

    public GovernmentOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField38() {
        return tinyIntField38;
    }

    public void setTinyIntField38(Byte tinyIntField38) {
        this.tinyIntField38 = tinyIntField38;
    }

    public Short getSmallIntField47() {
        return smallIntField47;
    }

    public void setSmallIntField47(Short smallIntField47) {
        this.smallIntField47 = smallIntField47;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField43() {
        return bigIntField43;
    }

    public void setBigIntField43(Long bigIntField43) {
        this.bigIntField43 = bigIntField43;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField28() {
        return floatField28;
    }

    public void setFloatField28(Float floatField28) {
        this.floatField28 = floatField28;
    }

    public Double getDoubleField38() {
        return doubleField38;
    }

    public void setDoubleField38(Double doubleField38) {
        this.doubleField38 = doubleField38;
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
