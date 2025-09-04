package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaBalanceV1 implements Serializable {
    private static final long serialVersionUID = 921L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField9;
    private Integer intField21;
    private Long bigIntField62;
    private BigDecimal decimalField45;
    private BigDecimal priceField;
    private Float floatField28;
    private Double doubleField29;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public MediaBalanceV1() {}

    public MediaBalanceV1(Long id, String code, String name) {
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

    public Short getSmallIntField9() {
        return smallIntField9;
    }

    public void setSmallIntField9(Short smallIntField9) {
        this.smallIntField9 = smallIntField9;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField45() {
        return decimalField45;
    }

    public void setDecimalField45(BigDecimal decimalField45) {
        this.decimalField45 = decimalField45;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField28() {
        return floatField28;
    }

    public void setFloatField28(Float floatField28) {
        this.floatField28 = floatField28;
    }

    public Double getDoubleField29() {
        return doubleField29;
    }

    public void setDoubleField29(Double doubleField29) {
        this.doubleField29 = doubleField29;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
