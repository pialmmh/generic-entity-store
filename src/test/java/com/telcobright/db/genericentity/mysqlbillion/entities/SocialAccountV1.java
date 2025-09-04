package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: SocialAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialAccountV1 implements Serializable {
    private static final long serialVersionUID = 765L;

    private Long id;
    private Byte tinyIntField47;
    private Short smallIntField22;
    private Integer intField21;
    private Long bigIntField0;
    private BigDecimal decimalField17;
    private BigDecimal priceField;
    private Float floatField2;
    private Double doubleField40;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SocialAccountV1() {}

    public SocialAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField47() {
        return tinyIntField47;
    }

    public void setTinyIntField47(Byte tinyIntField47) {
        this.tinyIntField47 = tinyIntField47;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField21() {
        return intField21;
    }

    public void setIntField21(Integer intField21) {
        this.intField21 = intField21;
    }

    public Long getBigIntField0() {
        return bigIntField0;
    }

    public void setBigIntField0(Long bigIntField0) {
        this.bigIntField0 = bigIntField0;
    }

    public BigDecimal getDecimalField17() {
        return decimalField17;
    }

    public void setDecimalField17(BigDecimal decimalField17) {
        this.decimalField17 = decimalField17;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField2() {
        return floatField2;
    }

    public void setFloatField2(Float floatField2) {
        this.floatField2 = floatField2;
    }

    public Double getDoubleField40() {
        return doubleField40;
    }

    public void setDoubleField40(Double doubleField40) {
        this.doubleField40 = doubleField40;
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
