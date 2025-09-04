package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureCertificateV1 implements Serializable {
    private static final long serialVersionUID = 1167L;

    private Long id;
    private Byte tinyIntField33;
    private Short smallIntField33;
    private Integer intField21;
    private Long bigIntField80;
    private BigDecimal decimalField21;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField44;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public AgricultureCertificateV1() {}

    public AgricultureCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField33() {
        return tinyIntField33;
    }

    public void setTinyIntField33(Byte tinyIntField33) {
        this.tinyIntField33 = tinyIntField33;
    }

    public Short getSmallIntField33() {
        return smallIntField33;
    }

    public void setSmallIntField33(Short smallIntField33) {
        this.smallIntField33 = smallIntField33;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField80() {
        return bigIntField80;
    }

    public void setBigIntField80(Long bigIntField80) {
        this.bigIntField80 = bigIntField80;
    }

    public BigDecimal getDecimalField21() {
        return decimalField21;
    }

    public void setDecimalField21(BigDecimal decimalField21) {
        this.decimalField21 = decimalField21;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
    }

    public Double getDoubleField44() {
        return doubleField44;
    }

    public void setDoubleField44(Double doubleField44) {
        this.doubleField44 = doubleField44;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
