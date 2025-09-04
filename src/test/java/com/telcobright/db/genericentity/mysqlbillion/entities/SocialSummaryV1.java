package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialSummaryV1 implements Serializable {
    private static final long serialVersionUID = 741L;

    private Long id;
    private Byte tinyIntField51;
    private Short smallIntField30;
    private Integer intField22;
    private Long bigIntField75;
    private BigDecimal decimalField74;
    private BigDecimal priceField;
    private Float floatField55;
    private Double doubleField79;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public SocialSummaryV1() {}

    public SocialSummaryV1(Long id, String code, String name) {
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

    public Short getSmallIntField30() {
        return smallIntField30;
    }

    public void setSmallIntField30(Short smallIntField30) {
        this.smallIntField30 = smallIntField30;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField75() {
        return bigIntField75;
    }

    public void setBigIntField75(Long bigIntField75) {
        this.bigIntField75 = bigIntField75;
    }

    public BigDecimal getDecimalField74() {
        return decimalField74;
    }

    public void setDecimalField74(BigDecimal decimalField74) {
        this.decimalField74 = decimalField74;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField55() {
        return floatField55;
    }

    public void setFloatField55(Float floatField55) {
        this.floatField55 = floatField55;
    }

    public Double getDoubleField79() {
        return doubleField79;
    }

    public void setDoubleField79(Double doubleField79) {
        this.doubleField79 = doubleField79;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
