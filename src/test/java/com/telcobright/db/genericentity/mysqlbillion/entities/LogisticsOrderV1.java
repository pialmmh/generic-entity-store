package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsOrderV1 implements Serializable {
    private static final long serialVersionUID = 315L;

    private Long id;
    private Byte tinyIntField6;
    private Short smallIntField25;
    private Integer intField11;
    private Long bigIntField4;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField6;
    private Double doubleField51;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public LogisticsOrderV1() {}

    public LogisticsOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField6() {
        return tinyIntField6;
    }

    public void setTinyIntField6(Byte tinyIntField6) {
        this.tinyIntField6 = tinyIntField6;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField4() {
        return bigIntField4;
    }

    public void setBigIntField4(Long bigIntField4) {
        this.bigIntField4 = bigIntField4;
    }

    public BigDecimal getDecimalField99() {
        return decimalField99;
    }

    public void setDecimalField99(BigDecimal decimalField99) {
        this.decimalField99 = decimalField99;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField6() {
        return floatField6;
    }

    public void setFloatField6(Float floatField6) {
        this.floatField6 = floatField6;
    }

    public Double getDoubleField51() {
        return doubleField51;
    }

    public void setDoubleField51(Double doubleField51) {
        this.doubleField51 = doubleField51;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
