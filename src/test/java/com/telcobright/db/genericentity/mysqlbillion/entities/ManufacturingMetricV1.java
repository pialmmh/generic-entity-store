package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingMetricV1 implements Serializable {
    private static final long serialVersionUID = 228L;

    private Long id;
    private Byte tinyIntField44;
    private Short smallIntField20;
    private Integer intField48;
    private Long bigIntField16;
    private BigDecimal decimalField43;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField3;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public ManufacturingMetricV1() {}

    public ManufacturingMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField44() {
        return tinyIntField44;
    }

    public void setTinyIntField44(Byte tinyIntField44) {
        this.tinyIntField44 = tinyIntField44;
    }

    public Short getSmallIntField20() {
        return smallIntField20;
    }

    public void setSmallIntField20(Short smallIntField20) {
        this.smallIntField20 = smallIntField20;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField43() {
        return decimalField43;
    }

    public void setDecimalField43(BigDecimal decimalField43) {
        this.decimalField43 = decimalField43;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField3() {
        return doubleField3;
    }

    public void setDoubleField3(Double doubleField3) {
        this.doubleField3 = doubleField3;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
