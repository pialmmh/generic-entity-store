package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 774L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField87;
    private Integer intField68;
    private Long bigIntField75;
    private BigDecimal decimalField37;
    private BigDecimal priceField;
    private Float floatField63;
    private Double doubleField44;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SocialInvoiceV1() {}

    public SocialInvoiceV1(Long id, String code, String name) {
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

    public Short getSmallIntField87() {
        return smallIntField87;
    }

    public void setSmallIntField87(Short smallIntField87) {
        this.smallIntField87 = smallIntField87;
    }

    public Integer getIntField68() {
        return intField68;
    }

    public void setIntField68(Integer intField68) {
        this.intField68 = intField68;
    }

    public Long getBigIntField75() {
        return bigIntField75;
    }

    public void setBigIntField75(Long bigIntField75) {
        this.bigIntField75 = bigIntField75;
    }

    public BigDecimal getDecimalField37() {
        return decimalField37;
    }

    public void setDecimalField37(BigDecimal decimalField37) {
        this.decimalField37 = decimalField37;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField63() {
        return floatField63;
    }

    public void setFloatField63(Float floatField63) {
        this.floatField63 = floatField63;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
