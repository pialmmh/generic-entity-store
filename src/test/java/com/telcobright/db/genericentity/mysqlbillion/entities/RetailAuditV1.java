package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RetailAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailAuditV1 implements Serializable {
    private static final long serialVersionUID = 156L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField15;
    private Integer intField76;
    private Long bigIntField11;
    private BigDecimal decimalField14;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField39;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RetailAuditV1() {}

    public RetailAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField15() {
        return smallIntField15;
    }

    public void setSmallIntField15(Short smallIntField15) {
        this.smallIntField15 = smallIntField15;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField11() {
        return bigIntField11;
    }

    public void setBigIntField11(Long bigIntField11) {
        this.bigIntField11 = bigIntField11;
    }

    public BigDecimal getDecimalField14() {
        return decimalField14;
    }

    public void setDecimalField14(BigDecimal decimalField14) {
        this.decimalField14 = decimalField14;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
    }

    public Double getDoubleField39() {
        return doubleField39;
    }

    public void setDoubleField39(Double doubleField39) {
        this.doubleField39 = doubleField39;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
