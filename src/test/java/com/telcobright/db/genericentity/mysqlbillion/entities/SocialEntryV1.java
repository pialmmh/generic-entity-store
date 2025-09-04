package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialEntryV1 implements Serializable {
    private static final long serialVersionUID = 732L;

    private Long id;
    private Byte tinyIntField4;
    private Short smallIntField51;
    private Integer intField94;
    private Long bigIntField92;
    private BigDecimal decimalField54;
    private BigDecimal priceField;
    private Float floatField81;
    private Double doubleField88;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SocialEntryV1() {}

    public SocialEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField4() {
        return tinyIntField4;
    }

    public void setTinyIntField4(Byte tinyIntField4) {
        this.tinyIntField4 = tinyIntField4;
    }

    public Short getSmallIntField51() {
        return smallIntField51;
    }

    public void setSmallIntField51(Short smallIntField51) {
        this.smallIntField51 = smallIntField51;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField92() {
        return bigIntField92;
    }

    public void setBigIntField92(Long bigIntField92) {
        this.bigIntField92 = bigIntField92;
    }

    public BigDecimal getDecimalField54() {
        return decimalField54;
    }

    public void setDecimalField54(BigDecimal decimalField54) {
        this.decimalField54 = decimalField54;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField81() {
        return floatField81;
    }

    public void setFloatField81(Float floatField81) {
        this.floatField81 = floatField81;
    }

    public Double getDoubleField88() {
        return doubleField88;
    }

    public void setDoubleField88(Double doubleField88) {
        this.doubleField88 = doubleField88;
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
