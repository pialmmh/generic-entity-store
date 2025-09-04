package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateSummaryV1 implements Serializable {
    private static final long serialVersionUID = 1005L;

    private Long id;
    private Byte tinyIntField15;
    private Short smallIntField27;
    private Integer intField21;
    private Long bigIntField1;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField0;
    private Double doubleField51;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RealEstateSummaryV1() {}

    public RealEstateSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField15() {
        return tinyIntField15;
    }

    public void setTinyIntField15(Byte tinyIntField15) {
        this.tinyIntField15 = tinyIntField15;
    }

    public Short getSmallIntField27() {
        return smallIntField27;
    }

    public void setSmallIntField27(Short smallIntField27) {
        this.smallIntField27 = smallIntField27;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField1() {
        return bigIntField1;
    }

    public void setBigIntField1(Long bigIntField1) {
        this.bigIntField1 = bigIntField1;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField0() {
        return floatField0;
    }

    public void setFloatField0(Float floatField0) {
        this.floatField0 = floatField0;
    }

    public Double getDoubleField51() {
        return doubleField51;
    }

    public void setDoubleField51(Double doubleField51) {
        this.doubleField51 = doubleField51;
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
