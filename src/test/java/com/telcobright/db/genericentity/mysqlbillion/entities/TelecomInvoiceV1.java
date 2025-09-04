package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 510L;

    private Long id;
    private Byte tinyIntField48;
    private Short smallIntField74;
    private Integer intField56;
    private Long bigIntField65;
    private BigDecimal decimalField64;
    private BigDecimal priceField;
    private Float floatField68;
    private Double doubleField11;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TelecomInvoiceV1() {}

    public TelecomInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField48() {
        return tinyIntField48;
    }

    public void setTinyIntField48(Byte tinyIntField48) {
        this.tinyIntField48 = tinyIntField48;
    }

    public Short getSmallIntField74() {
        return smallIntField74;
    }

    public void setSmallIntField74(Short smallIntField74) {
        this.smallIntField74 = smallIntField74;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField65() {
        return bigIntField65;
    }

    public void setBigIntField65(Long bigIntField65) {
        this.bigIntField65 = bigIntField65;
    }

    public BigDecimal getDecimalField64() {
        return decimalField64;
    }

    public void setDecimalField64(BigDecimal decimalField64) {
        this.decimalField64 = decimalField64;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField68() {
        return floatField68;
    }

    public void setFloatField68(Float floatField68) {
        this.floatField68 = floatField68;
    }

    public Double getDoubleField11() {
        return doubleField11;
    }

    public void setDoubleField11(Double doubleField11) {
        this.doubleField11 = doubleField11;
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
