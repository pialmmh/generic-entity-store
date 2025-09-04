package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceAccountV1 implements Serializable {
    private static final long serialVersionUID = 699L;

    private Long id;
    private Byte tinyIntField58;
    private Short smallIntField76;
    private Integer intField93;
    private Long bigIntField21;
    private BigDecimal decimalField38;
    private BigDecimal priceField;
    private Float floatField8;
    private Double doubleField18;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceAccountV1() {}

    public EcommerceAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField58() {
        return tinyIntField58;
    }

    public void setTinyIntField58(Byte tinyIntField58) {
        this.tinyIntField58 = tinyIntField58;
    }

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField21() {
        return bigIntField21;
    }

    public void setBigIntField21(Long bigIntField21) {
        this.bigIntField21 = bigIntField21;
    }

    public BigDecimal getDecimalField38() {
        return decimalField38;
    }

    public void setDecimalField38(BigDecimal decimalField38) {
        this.decimalField38 = decimalField38;
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

    public Double getDoubleField18() {
        return doubleField18;
    }

    public void setDoubleField18(Double doubleField18) {
        this.doubleField18 = doubleField18;
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
