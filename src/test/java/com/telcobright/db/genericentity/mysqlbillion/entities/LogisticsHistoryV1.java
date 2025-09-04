package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsHistoryV1 implements Serializable {
    private static final long serialVersionUID = 282L;

    private Long id;
    private Byte tinyIntField63;
    private Short smallIntField53;
    private Integer intField37;
    private Long bigIntField96;
    private BigDecimal decimalField36;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField0;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public LogisticsHistoryV1() {}

    public LogisticsHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField63() {
        return tinyIntField63;
    }

    public void setTinyIntField63(Byte tinyIntField63) {
        this.tinyIntField63 = tinyIntField63;
    }

    public Short getSmallIntField53() {
        return smallIntField53;
    }

    public void setSmallIntField53(Short smallIntField53) {
        this.smallIntField53 = smallIntField53;
    }

    public Integer getIntField37() {
        return intField37;
    }

    public void setIntField37(Integer intField37) {
        this.intField37 = intField37;
    }

    public Long getBigIntField96() {
        return bigIntField96;
    }

    public void setBigIntField96(Long bigIntField96) {
        this.bigIntField96 = bigIntField96;
    }

    public BigDecimal getDecimalField36() {
        return decimalField36;
    }

    public void setDecimalField36(BigDecimal decimalField36) {
        this.decimalField36 = decimalField36;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField0() {
        return doubleField0;
    }

    public void setDoubleField0(Double doubleField0) {
        this.doubleField0 = doubleField0;
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
