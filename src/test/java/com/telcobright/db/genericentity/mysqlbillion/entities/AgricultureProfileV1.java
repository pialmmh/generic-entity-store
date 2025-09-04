package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureProfileV1 implements Serializable {
    private static final long serialVersionUID = 1158L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField38;
    private Integer intField50;
    private Long bigIntField40;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField65;
    private Double doubleField62;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public AgricultureProfileV1() {}

    public AgricultureProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField38() {
        return smallIntField38;
    }

    public void setSmallIntField38(Short smallIntField38) {
        this.smallIntField38 = smallIntField38;
    }

    public Integer getIntField50() {
        return intField50;
    }

    public void setIntField50(Integer intField50) {
        this.intField50 = intField50;
    }

    public Long getBigIntField40() {
        return bigIntField40;
    }

    public void setBigIntField40(Long bigIntField40) {
        this.bigIntField40 = bigIntField40;
    }

    public BigDecimal getDecimalField77() {
        return decimalField77;
    }

    public void setDecimalField77(BigDecimal decimalField77) {
        this.decimalField77 = decimalField77;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField65() {
        return floatField65;
    }

    public void setFloatField65(Float floatField65) {
        this.floatField65 = floatField65;
    }

    public Double getDoubleField62() {
        return doubleField62;
    }

    public void setDoubleField62(Double doubleField62) {
        this.doubleField62 = doubleField62;
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
