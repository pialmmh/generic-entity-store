package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: BankingMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingMetricV1 implements Serializable {
    private static final long serialVersionUID = 624L;

    private Long id;
    private Byte tinyIntField85;
    private Short smallIntField52;
    private Integer intField49;
    private Long bigIntField73;
    private BigDecimal decimalField68;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField71;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public BankingMetricV1() {}

    public BankingMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField85() {
        return tinyIntField85;
    }

    public void setTinyIntField85(Byte tinyIntField85) {
        this.tinyIntField85 = tinyIntField85;
    }

    public Short getSmallIntField52() {
        return smallIntField52;
    }

    public void setSmallIntField52(Short smallIntField52) {
        this.smallIntField52 = smallIntField52;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField73() {
        return bigIntField73;
    }

    public void setBigIntField73(Long bigIntField73) {
        this.bigIntField73 = bigIntField73;
    }

    public BigDecimal getDecimalField68() {
        return decimalField68;
    }

    public void setDecimalField68(BigDecimal decimalField68) {
        this.decimalField68 = decimalField68;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField22() {
        return floatField22;
    }

    public void setFloatField22(Float floatField22) {
        this.floatField22 = floatField22;
    }

    public Double getDoubleField71() {
        return doubleField71;
    }

    public void setDoubleField71(Double doubleField71) {
        this.doubleField71 = doubleField71;
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
