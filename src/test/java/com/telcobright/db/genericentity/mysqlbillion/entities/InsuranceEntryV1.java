package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceEntryV1 implements Serializable {
    private static final long serialVersionUID = 534L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField30;
    private Integer intField68;
    private Long bigIntField74;
    private BigDecimal decimalField71;
    private BigDecimal priceField;
    private Float floatField64;
    private Double doubleField32;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public InsuranceEntryV1() {}

    public InsuranceEntryV1(Long id, String code, String name) {
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

    public Short getSmallIntField30() {
        return smallIntField30;
    }

    public void setSmallIntField30(Short smallIntField30) {
        this.smallIntField30 = smallIntField30;
    }

    public Integer getIntField68() {
        return intField68;
    }

    public void setIntField68(Integer intField68) {
        this.intField68 = intField68;
    }

    public Long getBigIntField74() {
        return bigIntField74;
    }

    public void setBigIntField74(Long bigIntField74) {
        this.bigIntField74 = bigIntField74;
    }

    public BigDecimal getDecimalField71() {
        return decimalField71;
    }

    public void setDecimalField71(BigDecimal decimalField71) {
        this.decimalField71 = decimalField71;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField64() {
        return floatField64;
    }

    public void setFloatField64(Float floatField64) {
        this.floatField64 = floatField64;
    }

    public Double getDoubleField32() {
        return doubleField32;
    }

    public void setDoubleField32(Double doubleField32) {
        this.doubleField32 = doubleField32;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
