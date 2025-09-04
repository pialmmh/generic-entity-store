package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceAnalyticsV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceAnalyticsV1 implements Serializable {
    private static final long serialVersionUID = 693L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField48;
    private Integer intField4;
    private Long bigIntField42;
    private BigDecimal decimalField12;
    private BigDecimal priceField;
    private Float floatField5;
    private Double doubleField84;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EcommerceAnalyticsV1() {}

    public EcommerceAnalyticsV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField42() {
        return bigIntField42;
    }

    public void setBigIntField42(Long bigIntField42) {
        this.bigIntField42 = bigIntField42;
    }

    public BigDecimal getDecimalField12() {
        return decimalField12;
    }

    public void setDecimalField12(BigDecimal decimalField12) {
        this.decimalField12 = decimalField12;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField5() {
        return floatField5;
    }

    public void setFloatField5(Float floatField5) {
        this.floatField5 = floatField5;
    }

    public Double getDoubleField84() {
        return doubleField84;
    }

    public void setDoubleField84(Double doubleField84) {
        this.doubleField84 = doubleField84;
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
