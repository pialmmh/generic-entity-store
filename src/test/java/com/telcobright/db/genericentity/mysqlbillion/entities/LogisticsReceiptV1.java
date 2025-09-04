package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsReceiptV1 implements Serializable {
    private static final long serialVersionUID = 321L;

    private Long id;
    private Byte tinyIntField79;
    private Short smallIntField92;
    private Integer intField57;
    private Long bigIntField52;
    private BigDecimal decimalField6;
    private BigDecimal priceField;
    private Float floatField83;
    private Double doubleField85;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public LogisticsReceiptV1() {}

    public LogisticsReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField79() {
        return tinyIntField79;
    }

    public void setTinyIntField79(Byte tinyIntField79) {
        this.tinyIntField79 = tinyIntField79;
    }

    public Short getSmallIntField92() {
        return smallIntField92;
    }

    public void setSmallIntField92(Short smallIntField92) {
        this.smallIntField92 = smallIntField92;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField52() {
        return bigIntField52;
    }

    public void setBigIntField52(Long bigIntField52) {
        this.bigIntField52 = bigIntField52;
    }

    public BigDecimal getDecimalField6() {
        return decimalField6;
    }

    public void setDecimalField6(BigDecimal decimalField6) {
        this.decimalField6 = decimalField6;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField83() {
        return floatField83;
    }

    public void setFloatField83(Float floatField83) {
        this.floatField83 = floatField83;
    }

    public Double getDoubleField85() {
        return doubleField85;
    }

    public void setDoubleField85(Double doubleField85) {
        this.doubleField85 = doubleField85;
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
