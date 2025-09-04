package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateAuditV1 implements Serializable {
    private static final long serialVersionUID = 1014L;

    private Long id;
    private Byte tinyIntField25;
    private Short smallIntField88;
    private Integer intField58;
    private Long bigIntField84;
    private BigDecimal decimalField51;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField5;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RealEstateAuditV1() {}

    public RealEstateAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField25() {
        return tinyIntField25;
    }

    public void setTinyIntField25(Byte tinyIntField25) {
        this.tinyIntField25 = tinyIntField25;
    }

    public Short getSmallIntField88() {
        return smallIntField88;
    }

    public void setSmallIntField88(Short smallIntField88) {
        this.smallIntField88 = smallIntField88;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField84() {
        return bigIntField84;
    }

    public void setBigIntField84(Long bigIntField84) {
        this.bigIntField84 = bigIntField84;
    }

    public BigDecimal getDecimalField51() {
        return decimalField51;
    }

    public void setDecimalField51(BigDecimal decimalField51) {
        this.decimalField51 = decimalField51;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
