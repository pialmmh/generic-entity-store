package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityProfileV1 implements Serializable {
    private static final long serialVersionUID = 1224L;

    private Long id;
    private Byte tinyIntField92;
    private Short smallIntField84;
    private Integer intField77;
    private Long bigIntField71;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField32;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityProfileV1() {}

    public HospitalityProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField92() {
        return tinyIntField92;
    }

    public void setTinyIntField92(Byte tinyIntField92) {
        this.tinyIntField92 = tinyIntField92;
    }

    public Short getSmallIntField84() {
        return smallIntField84;
    }

    public void setSmallIntField84(Short smallIntField84) {
        this.smallIntField84 = smallIntField84;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField71() {
        return bigIntField71;
    }

    public void setBigIntField71(Long bigIntField71) {
        this.bigIntField71 = bigIntField71;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField32() {
        return doubleField32;
    }

    public void setDoubleField32(Double doubleField32) {
        this.doubleField32 = doubleField32;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
