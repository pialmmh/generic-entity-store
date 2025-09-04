package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailLogV1 implements Serializable {
    private static final long serialVersionUID = 141L;

    private Long id;
    private Byte tinyIntField21;
    private Short smallIntField18;
    private Integer intField48;
    private Long bigIntField74;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField60;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RetailLogV1() {}

    public RetailLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField21() {
        return tinyIntField21;
    }

    public void setTinyIntField21(Byte tinyIntField21) {
        this.tinyIntField21 = tinyIntField21;
    }

    public Short getSmallIntField18() {
        return smallIntField18;
    }

    public void setSmallIntField18(Short smallIntField18) {
        this.smallIntField18 = smallIntField18;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField74() {
        return bigIntField74;
    }

    public void setBigIntField74(Long bigIntField74) {
        this.bigIntField74 = bigIntField74;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
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

    public Double getDoubleField60() {
        return doubleField60;
    }

    public void setDoubleField60(Double doubleField60) {
        this.doubleField60 = doubleField60;
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
