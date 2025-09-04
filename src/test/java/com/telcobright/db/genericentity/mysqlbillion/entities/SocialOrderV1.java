package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialOrderV1 implements Serializable {
    private static final long serialVersionUID = 777L;

    private Long id;
    private Byte tinyIntField30;
    private Short smallIntField6;
    private Integer intField2;
    private Long bigIntField32;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField69;
    private Double doubleField40;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SocialOrderV1() {}

    public SocialOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField30() {
        return tinyIntField30;
    }

    public void setTinyIntField30(Byte tinyIntField30) {
        this.tinyIntField30 = tinyIntField30;
    }

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField32() {
        return bigIntField32;
    }

    public void setBigIntField32(Long bigIntField32) {
        this.bigIntField32 = bigIntField32;
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

    public Float getFloatField69() {
        return floatField69;
    }

    public void setFloatField69(Float floatField69) {
        this.floatField69 = floatField69;
    }

    public Double getDoubleField40() {
        return doubleField40;
    }

    public void setDoubleField40(Double doubleField40) {
        this.doubleField40 = doubleField40;
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
