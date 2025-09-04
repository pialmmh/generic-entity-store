package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateHistoryV1 implements Serializable {
    private static final long serialVersionUID = 1008L;

    private Long id;
    private Byte tinyIntField74;
    private Short smallIntField60;
    private Integer intField21;
    private Long bigIntField4;
    private BigDecimal decimalField25;
    private BigDecimal priceField;
    private Float floatField32;
    private Double doubleField72;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public RealEstateHistoryV1() {}

    public RealEstateHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField74() {
        return tinyIntField74;
    }

    public void setTinyIntField74(Byte tinyIntField74) {
        this.tinyIntField74 = tinyIntField74;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField4() {
        return bigIntField4;
    }

    public void setBigIntField4(Long bigIntField4) {
        this.bigIntField4 = bigIntField4;
    }

    public BigDecimal getDecimalField25() {
        return decimalField25;
    }

    public void setDecimalField25(BigDecimal decimalField25) {
        this.decimalField25 = decimalField25;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField32() {
        return floatField32;
    }

    public void setFloatField32(Float floatField32) {
        this.floatField32 = floatField32;
    }

    public Double getDoubleField72() {
        return doubleField72;
    }

    public void setDoubleField72(Double doubleField72) {
        this.doubleField72 = doubleField72;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
