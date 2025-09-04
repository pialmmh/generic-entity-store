package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomDocumentV1 implements Serializable {
    private static final long serialVersionUID = 504L;

    private Long id;
    private Byte tinyIntField97;
    private Short smallIntField98;
    private Integer intField19;
    private Long bigIntField34;
    private BigDecimal decimalField38;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField26;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TelecomDocumentV1() {}

    public TelecomDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField97() {
        return tinyIntField97;
    }

    public void setTinyIntField97(Byte tinyIntField97) {
        this.tinyIntField97 = tinyIntField97;
    }

    public Short getSmallIntField98() {
        return smallIntField98;
    }

    public void setSmallIntField98(Short smallIntField98) {
        this.smallIntField98 = smallIntField98;
    }

    public Integer getIntField19() {
        return intField19;
    }

    public void setIntField19(Integer intField19) {
        this.intField19 = intField19;
    }

    public Long getBigIntField34() {
        return bigIntField34;
    }

    public void setBigIntField34(Long bigIntField34) {
        this.bigIntField34 = bigIntField34;
    }

    public BigDecimal getDecimalField38() {
        return decimalField38;
    }

    public void setDecimalField38(BigDecimal decimalField38) {
        this.decimalField38 = decimalField38;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField18() {
        return floatField18;
    }

    public void setFloatField18(Float floatField18) {
        this.floatField18 = floatField18;
    }

    public Double getDoubleField26() {
        return doubleField26;
    }

    public void setDoubleField26(Double doubleField26) {
        this.doubleField26 = doubleField26;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
