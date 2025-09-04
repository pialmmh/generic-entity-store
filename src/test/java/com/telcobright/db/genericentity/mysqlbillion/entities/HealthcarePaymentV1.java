package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcarePaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcarePaymentV1 implements Serializable {
    private static final long serialVersionUID = 120L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField38;
    private Integer intField47;
    private Long bigIntField54;
    private BigDecimal decimalField82;
    private BigDecimal priceField;
    private Float floatField8;
    private Double doubleField77;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public HealthcarePaymentV1() {}

    public HealthcarePaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField8() {
        return tinyIntField8;
    }

    public void setTinyIntField8(Byte tinyIntField8) {
        this.tinyIntField8 = tinyIntField8;
    }

    public Short getSmallIntField38() {
        return smallIntField38;
    }

    public void setSmallIntField38(Short smallIntField38) {
        this.smallIntField38 = smallIntField38;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField54() {
        return bigIntField54;
    }

    public void setBigIntField54(Long bigIntField54) {
        this.bigIntField54 = bigIntField54;
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

    public Float getFloatField8() {
        return floatField8;
    }

    public void setFloatField8(Float floatField8) {
        this.floatField8 = floatField8;
    }

    public Double getDoubleField77() {
        return doubleField77;
    }

    public void setDoubleField77(Double doubleField77) {
        this.doubleField77 = doubleField77;
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
