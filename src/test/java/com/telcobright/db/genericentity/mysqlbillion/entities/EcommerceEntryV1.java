package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceEntryV1 implements Serializable {
    private static final long serialVersionUID = 666L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField4;
    private Integer intField67;
    private Long bigIntField13;
    private BigDecimal decimalField75;
    private BigDecimal priceField;
    private Float floatField87;
    private Double doubleField18;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EcommerceEntryV1() {}

    public EcommerceEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField15() {
        return tinyIntField15;
    }

    public void setTinyIntField15(Byte tinyIntField15) {
        this.tinyIntField15 = tinyIntField15;
    }

    public Short getSmallIntField4() {
        return smallIntField4;
    }

    public void setSmallIntField4(Short smallIntField4) {
        this.smallIntField4 = smallIntField4;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField13() {
        return bigIntField13;
    }

    public void setBigIntField13(Long bigIntField13) {
        this.bigIntField13 = bigIntField13;
    }

    public BigDecimal getDecimalField75() {
        return decimalField75;
    }

    public void setDecimalField75(BigDecimal decimalField75) {
        this.decimalField75 = decimalField75;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField87() {
        return floatField87;
    }

    public void setFloatField87(Float floatField87) {
        this.floatField87 = floatField87;
    }

    public Double getDoubleField18() {
        return doubleField18;
    }

    public void setDoubleField18(Double doubleField18) {
        this.doubleField18 = doubleField18;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
