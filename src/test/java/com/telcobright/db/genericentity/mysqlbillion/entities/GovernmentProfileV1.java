package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentProfileV1 implements Serializable {
    private static final long serialVersionUID = 432L;

    private Long id;
    private Byte tinyIntField57;
    private Short smallIntField23;
    private Integer intField2;
    private Long bigIntField23;
    private BigDecimal decimalField33;
    private BigDecimal priceField;
    private Float floatField21;
    private Double doubleField70;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GovernmentProfileV1() {}

    public GovernmentProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField57() {
        return tinyIntField57;
    }

    public void setTinyIntField57(Byte tinyIntField57) {
        this.tinyIntField57 = tinyIntField57;
    }

    public Short getSmallIntField23() {
        return smallIntField23;
    }

    public void setSmallIntField23(Short smallIntField23) {
        this.smallIntField23 = smallIntField23;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField23() {
        return bigIntField23;
    }

    public void setBigIntField23(Long bigIntField23) {
        this.bigIntField23 = bigIntField23;
    }

    public BigDecimal getDecimalField33() {
        return decimalField33;
    }

    public void setDecimalField33(BigDecimal decimalField33) {
        this.decimalField33 = decimalField33;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField21() {
        return floatField21;
    }

    public void setFloatField21(Float floatField21) {
        this.floatField21 = floatField21;
    }

    public Double getDoubleField70() {
        return doubleField70;
    }

    public void setDoubleField70(Double doubleField70) {
        this.doubleField70 = doubleField70;
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
