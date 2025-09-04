package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailSummaryV1 implements Serializable {
    private static final long serialVersionUID = 147L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField63;
    private Integer intField30;
    private Long bigIntField12;
    private BigDecimal decimalField66;
    private BigDecimal priceField;
    private Float floatField61;
    private Double doubleField37;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RetailSummaryV1() {}

    public RetailSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField63() {
        return smallIntField63;
    }

    public void setSmallIntField63(Short smallIntField63) {
        this.smallIntField63 = smallIntField63;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField12() {
        return bigIntField12;
    }

    public void setBigIntField12(Long bigIntField12) {
        this.bigIntField12 = bigIntField12;
    }

    public BigDecimal getDecimalField66() {
        return decimalField66;
    }

    public void setDecimalField66(BigDecimal decimalField66) {
        this.decimalField66 = decimalField66;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField61() {
        return floatField61;
    }

    public void setFloatField61(Float floatField61) {
        this.floatField61 = floatField61;
    }

    public Double getDoubleField37() {
        return doubleField37;
    }

    public void setDoubleField37(Double doubleField37) {
        this.doubleField37 = doubleField37;
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
