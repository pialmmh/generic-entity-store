package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsStatementV1 implements Serializable {
    private static final long serialVersionUID = 1314L;

    private Long id;
    private Byte tinyIntField48;
    private Short smallIntField36;
    private Integer intField4;
    private Long bigIntField99;
    private BigDecimal decimalField0;
    private BigDecimal priceField;
    private Float floatField52;
    private Double doubleField66;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SportsStatementV1() {}

    public SportsStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField48() {
        return tinyIntField48;
    }

    public void setTinyIntField48(Byte tinyIntField48) {
        this.tinyIntField48 = tinyIntField48;
    }

    public Short getSmallIntField36() {
        return smallIntField36;
    }

    public void setSmallIntField36(Short smallIntField36) {
        this.smallIntField36 = smallIntField36;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField99() {
        return bigIntField99;
    }

    public void setBigIntField99(Long bigIntField99) {
        this.bigIntField99 = bigIntField99;
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

    public Float getFloatField52() {
        return floatField52;
    }

    public void setFloatField52(Float floatField52) {
        this.floatField52 = floatField52;
    }

    public Double getDoubleField66() {
        return doubleField66;
    }

    public void setDoubleField66(Double doubleField66) {
        this.doubleField66 = doubleField66;
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
