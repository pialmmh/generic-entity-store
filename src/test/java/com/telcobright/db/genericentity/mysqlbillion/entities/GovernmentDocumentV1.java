package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentDocumentV1 implements Serializable {
    private static final long serialVersionUID = 438L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField51;
    private Integer intField91;
    private Long bigIntField55;
    private BigDecimal decimalField59;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField56;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GovernmentDocumentV1() {}

    public GovernmentDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField8() {
        return tinyIntField8;
    }

    public void setTinyIntField8(Byte tinyIntField8) {
        this.tinyIntField8 = tinyIntField8;
    }

    public Short getSmallIntField51() {
        return smallIntField51;
    }

    public void setSmallIntField51(Short smallIntField51) {
        this.smallIntField51 = smallIntField51;
    }

    public Integer getIntField91() {
        return intField91;
    }

    public void setIntField91(Integer intField91) {
        this.intField91 = intField91;
    }

    public Long getBigIntField55() {
        return bigIntField55;
    }

    public void setBigIntField55(Long bigIntField55) {
        this.bigIntField55 = bigIntField55;
    }

    public BigDecimal getDecimalField59() {
        return decimalField59;
    }

    public void setDecimalField59(BigDecimal decimalField59) {
        this.decimalField59 = decimalField59;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField24() {
        return floatField24;
    }

    public void setFloatField24(Float floatField24) {
        this.floatField24 = floatField24;
    }

    public Double getDoubleField56() {
        return doubleField56;
    }

    public void setDoubleField56(Double doubleField56) {
        this.doubleField56 = doubleField56;
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
