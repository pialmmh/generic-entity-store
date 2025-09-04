package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingOrderV1 implements Serializable {
    private static final long serialVersionUID = 249L;

    private Long id;
    private Byte tinyIntField63;
    private Short smallIntField97;
    private Integer intField39;
    private Long bigIntField96;
    private BigDecimal decimalField73;
    private BigDecimal priceField;
    private Float floatField77;
    private Double doubleField87;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public ManufacturingOrderV1() {}

    public ManufacturingOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField63() {
        return tinyIntField63;
    }

    public void setTinyIntField63(Byte tinyIntField63) {
        this.tinyIntField63 = tinyIntField63;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField96() {
        return bigIntField96;
    }

    public void setBigIntField96(Long bigIntField96) {
        this.bigIntField96 = bigIntField96;
    }

    public BigDecimal getDecimalField73() {
        return decimalField73;
    }

    public void setDecimalField73(BigDecimal decimalField73) {
        this.decimalField73 = decimalField73;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField77() {
        return floatField77;
    }

    public void setFloatField77(Float floatField77) {
        this.floatField77 = floatField77;
    }

    public Double getDoubleField87() {
        return doubleField87;
    }

    public void setDoubleField87(Double doubleField87) {
        this.doubleField87 = doubleField87;
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
