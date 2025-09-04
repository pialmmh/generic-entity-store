package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceAuditV1 implements Serializable {
    private static final long serialVersionUID = 24L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField40;
    private Integer intField76;
    private Long bigIntField24;
    private BigDecimal decimalField10;
    private BigDecimal priceField;
    private Float floatField47;
    private Double doubleField52;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceAuditV1() {}

    public FinanceAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField40() {
        return smallIntField40;
    }

    public void setSmallIntField40(Short smallIntField40) {
        this.smallIntField40 = smallIntField40;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField24() {
        return bigIntField24;
    }

    public void setBigIntField24(Long bigIntField24) {
        this.bigIntField24 = bigIntField24;
    }

    public BigDecimal getDecimalField10() {
        return decimalField10;
    }

    public void setDecimalField10(BigDecimal decimalField10) {
        this.decimalField10 = decimalField10;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField47() {
        return floatField47;
    }

    public void setFloatField47(Float floatField47) {
        this.floatField47 = floatField47;
    }

    public Double getDoubleField52() {
        return doubleField52;
    }

    public void setDoubleField52(Double doubleField52) {
        this.doubleField52 = doubleField52;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
