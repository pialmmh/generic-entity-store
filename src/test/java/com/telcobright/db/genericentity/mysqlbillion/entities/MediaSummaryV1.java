package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaSummaryV1 implements Serializable {
    private static final long serialVersionUID = 873L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField52;
    private Integer intField21;
    private Long bigIntField62;
    private BigDecimal decimalField79;
    private BigDecimal priceField;
    private Float floatField78;
    private Double doubleField65;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public MediaSummaryV1() {}

    public MediaSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField83() {
        return tinyIntField83;
    }

    public void setTinyIntField83(Byte tinyIntField83) {
        this.tinyIntField83 = tinyIntField83;
    }

    public Short getSmallIntField52() {
        return smallIntField52;
    }

    public void setSmallIntField52(Short smallIntField52) {
        this.smallIntField52 = smallIntField52;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField79() {
        return decimalField79;
    }

    public void setDecimalField79(BigDecimal decimalField79) {
        this.decimalField79 = decimalField79;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField78() {
        return floatField78;
    }

    public void setFloatField78(Float floatField78) {
        this.floatField78 = floatField78;
    }

    public Double getDoubleField65() {
        return doubleField65;
    }

    public void setDoubleField65(Double doubleField65) {
        this.doubleField65 = doubleField65;
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
