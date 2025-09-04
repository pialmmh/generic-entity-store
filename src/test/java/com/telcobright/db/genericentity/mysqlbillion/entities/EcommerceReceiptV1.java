package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceReceiptV1 implements Serializable {
    private static final long serialVersionUID = 717L;

    private Long id;
    private Byte tinyIntField38;
    private Short smallIntField54;
    private Integer intField67;
    private Long bigIntField3;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField91;
    private Double doubleField61;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EcommerceReceiptV1() {}

    public EcommerceReceiptV1(Long id, String code, String name) {
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

    public Short getSmallIntField54() {
        return smallIntField54;
    }

    public void setSmallIntField54(Short smallIntField54) {
        this.smallIntField54 = smallIntField54;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField3() {
        return bigIntField3;
    }

    public void setBigIntField3(Long bigIntField3) {
        this.bigIntField3 = bigIntField3;
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

    public Float getFloatField91() {
        return floatField91;
    }

    public void setFloatField91(Float floatField91) {
        this.floatField91 = floatField91;
    }

    public Double getDoubleField61() {
        return doubleField61;
    }

    public void setDoubleField61(Double doubleField61) {
        this.doubleField61 = doubleField61;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
