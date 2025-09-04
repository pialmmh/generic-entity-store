package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 297L;

    private Long id;
    private Byte tinyIntField66;
    private Short smallIntField16;
    private Integer intField2;
    private Long bigIntField33;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField67;
    private Double doubleField15;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public LogisticsAnalyticsV1() {}

    public LogisticsAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField66() {
        return tinyIntField66;
    }

    public void setTinyIntField66(Byte tinyIntField66) {
        this.tinyIntField66 = tinyIntField66;
    }

    public Short getSmallIntField16() {
        return smallIntField16;
    }

    public void setSmallIntField16(Short smallIntField16) {
        this.smallIntField16 = smallIntField16;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField33() {
        return bigIntField33;
    }

    public void setBigIntField33(Long bigIntField33) {
        this.bigIntField33 = bigIntField33;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField67() {
        return floatField67;
    }

    public void setFloatField67(Float floatField67) {
        this.floatField67 = floatField67;
    }

    public Double getDoubleField15() {
        return doubleField15;
    }

    public void setDoubleField15(Double doubleField15) {
        this.doubleField15 = doubleField15;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
