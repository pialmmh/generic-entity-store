package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingAccountV1 implements Serializable {
    private static final long serialVersionUID = 237L;

    private Long id;
    private Byte tinyIntField74;
    private Short smallIntField16;
    private Integer intField19;
    private Long bigIntField4;
    private BigDecimal decimalField87;
    private BigDecimal priceField;
    private Float floatField40;
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

    public ManufacturingAccountV1() {}

    public ManufacturingAccountV1(Long id, String code, String name) {
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

    public Short getSmallIntField16() {
        return smallIntField16;
    }

    public void setSmallIntField16(Short smallIntField16) {
        this.smallIntField16 = smallIntField16;
    }

    public Integer getIntField19() {
        return intField19;
    }

    public void setIntField19(Integer intField19) {
        this.intField19 = intField19;
    }

    public Long getBigIntField4() {
        return bigIntField4;
    }

    public void setBigIntField4(Long bigIntField4) {
        this.bigIntField4 = bigIntField4;
    }

    public BigDecimal getDecimalField87() {
        return decimalField87;
    }

    public void setDecimalField87(BigDecimal decimalField87) {
        this.decimalField87 = decimalField87;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField40() {
        return floatField40;
    }

    public void setFloatField40(Float floatField40) {
        this.floatField40 = floatField40;
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
