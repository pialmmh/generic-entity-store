package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalitySummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalitySummaryV1 implements Serializable {
    private static final long serialVersionUID = 1203L;

    private Long id;
    private Byte tinyIntField36;
    private Short smallIntField37;
    private Integer intField96;
    private Long bigIntField92;
    private BigDecimal decimalField25;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField63;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public HospitalitySummaryV1() {}

    public HospitalitySummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField36() {
        return tinyIntField36;
    }

    public void setTinyIntField36(Byte tinyIntField36) {
        this.tinyIntField36 = tinyIntField36;
    }

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField96() {
        return intField96;
    }

    public void setIntField96(Integer intField96) {
        this.intField96 = intField96;
    }

    public Long getBigIntField92() {
        return bigIntField92;
    }

    public void setBigIntField92(Long bigIntField92) {
        this.bigIntField92 = bigIntField92;
    }

    public BigDecimal getDecimalField25() {
        return decimalField25;
    }

    public void setDecimalField25(BigDecimal decimalField25) {
        this.decimalField25 = decimalField25;
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

    public Double getDoubleField63() {
        return doubleField63;
    }

    public void setDoubleField63(Double doubleField63) {
        this.doubleField63 = doubleField63;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
