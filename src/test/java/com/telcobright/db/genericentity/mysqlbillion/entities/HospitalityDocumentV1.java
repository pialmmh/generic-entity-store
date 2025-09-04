package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityDocumentV1 implements Serializable {
    private static final long serialVersionUID = 1230L;

    private Long id;
    private Byte tinyIntField43;
    private Short smallIntField60;
    private Integer intField14;
    private Long bigIntField51;
    private BigDecimal decimalField82;
    private BigDecimal priceField;
    private Float floatField9;
    private Double doubleField18;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HospitalityDocumentV1() {}

    public HospitalityDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField43() {
        return tinyIntField43;
    }

    public void setTinyIntField43(Byte tinyIntField43) {
        this.tinyIntField43 = tinyIntField43;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField14() {
        return intField14;
    }

    public void setIntField14(Integer intField14) {
        this.intField14 = intField14;
    }

    public Long getBigIntField51() {
        return bigIntField51;
    }

    public void setBigIntField51(Long bigIntField51) {
        this.bigIntField51 = bigIntField51;
    }

    public BigDecimal getDecimalField82() {
        return decimalField82;
    }

    public void setDecimalField82(BigDecimal decimalField82) {
        this.decimalField82 = decimalField82;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField9() {
        return floatField9;
    }

    public void setFloatField9(Float floatField9) {
        this.floatField9 = floatField9;
    }

    public Double getDoubleField18() {
        return doubleField18;
    }

    public void setDoubleField18(Double doubleField18) {
        this.doubleField18 = doubleField18;
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
