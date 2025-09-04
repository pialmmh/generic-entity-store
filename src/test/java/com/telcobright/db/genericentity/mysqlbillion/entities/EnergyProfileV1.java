package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyProfileV1 implements Serializable {
    private static final long serialVersionUID = 1092L;

    private Long id;
    private Byte tinyIntField60;
    private Short smallIntField10;
    private Integer intField77;
    private Long bigIntField32;
    private BigDecimal decimalField51;
    private BigDecimal priceField;
    private Float floatField36;
    private Double doubleField46;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EnergyProfileV1() {}

    public EnergyProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField60() {
        return tinyIntField60;
    }

    public void setTinyIntField60(Byte tinyIntField60) {
        this.tinyIntField60 = tinyIntField60;
    }

    public Short getSmallIntField10() {
        return smallIntField10;
    }

    public void setSmallIntField10(Short smallIntField10) {
        this.smallIntField10 = smallIntField10;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField32() {
        return bigIntField32;
    }

    public void setBigIntField32(Long bigIntField32) {
        this.bigIntField32 = bigIntField32;
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

    public Float getFloatField36() {
        return floatField36;
    }

    public void setFloatField36(Float floatField36) {
        this.floatField36 = floatField36;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
