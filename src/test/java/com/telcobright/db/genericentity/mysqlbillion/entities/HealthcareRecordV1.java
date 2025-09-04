package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareRecordV1 implements Serializable {
    private static final long serialVersionUID = 69L;

    private Long id;
    private Byte tinyIntField22;
    private Short smallIntField6;
    private Integer intField85;
    private Long bigIntField60;
    private BigDecimal decimalField54;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField71;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HealthcareRecordV1() {}

    public HealthcareRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField22() {
        return tinyIntField22;
    }

    public void setTinyIntField22(Byte tinyIntField22) {
        this.tinyIntField22 = tinyIntField22;
    }

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField60() {
        return bigIntField60;
    }

    public void setBigIntField60(Long bigIntField60) {
        this.bigIntField60 = bigIntField60;
    }

    public BigDecimal getDecimalField54() {
        return decimalField54;
    }

    public void setDecimalField54(BigDecimal decimalField54) {
        this.decimalField54 = decimalField54;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
