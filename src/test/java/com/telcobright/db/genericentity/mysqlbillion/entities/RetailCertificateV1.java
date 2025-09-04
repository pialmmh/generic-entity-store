package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RetailCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailCertificateV1 implements Serializable {
    private static final long serialVersionUID = 177L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField22;
    private Integer intField75;
    private Long bigIntField85;
    private BigDecimal decimalField68;
    private BigDecimal priceField;
    private Float floatField33;
    private Double doubleField79;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RetailCertificateV1() {}

    public RetailCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField75() {
        return intField75;
    }

    public void setIntField75(Integer intField75) {
        this.intField75 = intField75;
    }

    public Long getBigIntField85() {
        return bigIntField85;
    }

    public void setBigIntField85(Long bigIntField85) {
        this.bigIntField85 = bigIntField85;
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

    public Float getFloatField33() {
        return floatField33;
    }

    public void setFloatField33(Float floatField33) {
        this.floatField33 = floatField33;
    }

    public Double getDoubleField79() {
        return doubleField79;
    }

    public void setDoubleField79(Double doubleField79) {
        this.doubleField79 = doubleField79;
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
