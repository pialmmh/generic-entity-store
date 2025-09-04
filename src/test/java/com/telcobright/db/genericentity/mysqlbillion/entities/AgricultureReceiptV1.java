package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureReceiptV1 implements Serializable {
    private static final long serialVersionUID = 1179L;

    private Long id;
    private Byte tinyIntField22;
    private Short smallIntField14;
    private Integer intField41;
    private Long bigIntField72;
    private BigDecimal decimalField6;
    private BigDecimal priceField;
    private Float floatField58;
    private Double doubleField94;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public AgricultureReceiptV1() {}

    public AgricultureReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField22() {
        return tinyIntField22;
    }

    public void setTinyIntField22(Byte tinyIntField22) {
        this.tinyIntField22 = tinyIntField22;
    }

    public Short getSmallIntField14() {
        return smallIntField14;
    }

    public void setSmallIntField14(Short smallIntField14) {
        this.smallIntField14 = smallIntField14;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField72() {
        return bigIntField72;
    }

    public void setBigIntField72(Long bigIntField72) {
        this.bigIntField72 = bigIntField72;
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

    public Float getFloatField58() {
        return floatField58;
    }

    public void setFloatField58(Float floatField58) {
        this.floatField58 = floatField58;
    }

    public Double getDoubleField94() {
        return doubleField94;
    }

    public void setDoubleField94(Double doubleField94) {
        this.doubleField94 = doubleField94;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
