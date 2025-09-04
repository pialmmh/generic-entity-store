package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: BankingCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingCertificateV1 implements Serializable {
    private static final long serialVersionUID = 639L;

    private Long id;
    private Byte tinyIntField66;
    private Short smallIntField76;
    private Integer intField58;
    private Long bigIntField93;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField29;
    private Double doubleField39;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public BankingCertificateV1() {}

    public BankingCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField66() {
        return tinyIntField66;
    }

    public void setTinyIntField66(Byte tinyIntField66) {
        this.tinyIntField66 = tinyIntField66;
    }

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField93() {
        return bigIntField93;
    }

    public void setBigIntField93(Long bigIntField93) {
        this.bigIntField93 = bigIntField93;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField29() {
        return floatField29;
    }

    public void setFloatField29(Float floatField29) {
        this.floatField29 = floatField29;
    }

    public Double getDoubleField39() {
        return doubleField39;
    }

    public void setDoubleField39(Double doubleField39) {
        this.doubleField39 = doubleField39;
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
