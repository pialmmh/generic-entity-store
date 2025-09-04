package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingSummaryV1 implements Serializable {
    private static final long serialVersionUID = 807L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField58;
    private Integer intField94;
    private Long bigIntField83;
    private BigDecimal decimalField0;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField95;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GamingSummaryV1() {}

    public GamingSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField95() {
        return tinyIntField95;
    }

    public void setTinyIntField95(Byte tinyIntField95) {
        this.tinyIntField95 = tinyIntField95;
    }

    public Short getSmallIntField58() {
        return smallIntField58;
    }

    public void setSmallIntField58(Short smallIntField58) {
        this.smallIntField58 = smallIntField58;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField0() {
        return decimalField0;
    }

    public void setDecimalField0(BigDecimal decimalField0) {
        this.decimalField0 = decimalField0;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField95() {
        return doubleField95;
    }

    public void setDoubleField95(Double doubleField95) {
        this.doubleField95 = doubleField95;
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
