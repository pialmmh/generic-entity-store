package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceOrderV1 implements Serializable {
    private static final long serialVersionUID = 579L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField96;
    private Integer intField77;
    private Long bigIntField62;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField13;
    private Double doubleField50;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public InsuranceOrderV1() {}

    public InsuranceOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField51() {
        return tinyIntField51;
    }

    public void setTinyIntField51(Byte tinyIntField51) {
        this.tinyIntField51 = tinyIntField51;
    }

    public Short getSmallIntField96() {
        return smallIntField96;
    }

    public void setSmallIntField96(Short smallIntField96) {
        this.smallIntField96 = smallIntField96;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField67() {
        return decimalField67;
    }

    public void setDecimalField67(BigDecimal decimalField67) {
        this.decimalField67 = decimalField67;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField13() {
        return floatField13;
    }

    public void setFloatField13(Float floatField13) {
        this.floatField13 = floatField13;
    }

    public Double getDoubleField50() {
        return doubleField50;
    }

    public void setDoubleField50(Double doubleField50) {
        this.doubleField50 = doubleField50;
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
