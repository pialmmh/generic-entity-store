package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsTransactionV1 implements Serializable {
    private static final long serialVersionUID = 1254L;

    private Long id;
    private Byte tinyIntField56;
    private Short smallIntField36;
    private Integer intField69;
    private Long bigIntField70;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField26;
    private Double doubleField87;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SportsTransactionV1() {}

    public SportsTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField56() {
        return tinyIntField56;
    }

    public void setTinyIntField56(Byte tinyIntField56) {
        this.tinyIntField56 = tinyIntField56;
    }

    public Short getSmallIntField36() {
        return smallIntField36;
    }

    public void setSmallIntField36(Short smallIntField36) {
        this.smallIntField36 = smallIntField36;
    }

    public Integer getIntField69() {
        return intField69;
    }

    public void setIntField69(Integer intField69) {
        this.intField69 = intField69;
    }

    public Long getBigIntField70() {
        return bigIntField70;
    }

    public void setBigIntField70(Long bigIntField70) {
        this.bigIntField70 = bigIntField70;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField26() {
        return floatField26;
    }

    public void setFloatField26(Float floatField26) {
        this.floatField26 = floatField26;
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

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
