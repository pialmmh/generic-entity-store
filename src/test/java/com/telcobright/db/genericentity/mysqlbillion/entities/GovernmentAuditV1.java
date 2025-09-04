package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentAuditV1 implements Serializable {
    private static final long serialVersionUID = 420L;

    private Long id;
    private Byte tinyIntField68;
    private Short smallIntField95;
    private Integer intField83;
    private Long bigIntField31;
    private BigDecimal decimalField99;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField20;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GovernmentAuditV1() {}

    public GovernmentAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField68() {
        return tinyIntField68;
    }

    public void setTinyIntField68(Byte tinyIntField68) {
        this.tinyIntField68 = tinyIntField68;
    }

    public Short getSmallIntField95() {
        return smallIntField95;
    }

    public void setSmallIntField95(Short smallIntField95) {
        this.smallIntField95 = smallIntField95;
    }

    public Integer getIntField83() {
        return intField83;
    }

    public void setIntField83(Integer intField83) {
        this.intField83 = intField83;
    }

    public Long getBigIntField31() {
        return bigIntField31;
    }

    public void setBigIntField31(Long bigIntField31) {
        this.bigIntField31 = bigIntField31;
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

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField20() {
        return doubleField20;
    }

    public void setDoubleField20(Double doubleField20) {
        this.doubleField20 = doubleField20;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
