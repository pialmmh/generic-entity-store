package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureTransactionV1 implements Serializable {
    private static final long serialVersionUID = 1122L;

    private Long id;
    private Byte tinyIntField24;
    private Short smallIntField61;
    private Integer intField69;
    private Long bigIntField83;
    private BigDecimal decimalField96;
    private BigDecimal priceField;
    private Float floatField3;
    private Double doubleField1;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public AgricultureTransactionV1() {}

    public AgricultureTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField24() {
        return tinyIntField24;
    }

    public void setTinyIntField24(Byte tinyIntField24) {
        this.tinyIntField24 = tinyIntField24;
    }

    public Short getSmallIntField61() {
        return smallIntField61;
    }

    public void setSmallIntField61(Short smallIntField61) {
        this.smallIntField61 = smallIntField61;
    }

    public Integer getIntField69() {
        return intField69;
    }

    public void setIntField69(Integer intField69) {
        this.intField69 = intField69;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField96() {
        return decimalField96;
    }

    public void setDecimalField96(BigDecimal decimalField96) {
        this.decimalField96 = decimalField96;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField3() {
        return floatField3;
    }

    public void setFloatField3(Float floatField3) {
        this.floatField3 = floatField3;
    }

    public Double getDoubleField1() {
        return doubleField1;
    }

    public void setDoubleField1(Double doubleField1) {
        this.doubleField1 = doubleField1;
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
