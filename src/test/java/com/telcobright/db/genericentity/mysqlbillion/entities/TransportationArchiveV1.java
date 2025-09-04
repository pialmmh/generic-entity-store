package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationArchiveV1 implements Serializable {
    private static final long serialVersionUID = 945L;

    private Long id;
    private Byte tinyIntField64;
    private Short smallIntField33;
    private Integer intField76;
    private Long bigIntField82;
    private BigDecimal decimalField64;
    private BigDecimal priceField;
    private Float floatField93;
    private Double doubleField46;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TransportationArchiveV1() {}

    public TransportationArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField64() {
        return tinyIntField64;
    }

    public void setTinyIntField64(Byte tinyIntField64) {
        this.tinyIntField64 = tinyIntField64;
    }

    public Short getSmallIntField33() {
        return smallIntField33;
    }

    public void setSmallIntField33(Short smallIntField33) {
        this.smallIntField33 = smallIntField33;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField82() {
        return bigIntField82;
    }

    public void setBigIntField82(Long bigIntField82) {
        this.bigIntField82 = bigIntField82;
    }

    public BigDecimal getDecimalField64() {
        return decimalField64;
    }

    public void setDecimalField64(BigDecimal decimalField64) {
        this.decimalField64 = decimalField64;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField93() {
        return floatField93;
    }

    public void setFloatField93(Float floatField93) {
        this.floatField93 = floatField93;
    }

    public Double getDoubleField46() {
        return doubleField46;
    }

    public void setDoubleField46(Double doubleField46) {
        this.doubleField46 = doubleField46;
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
