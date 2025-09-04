package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingDetailV1 implements Serializable {
    private static final long serialVersionUID = 606L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField4;
    private Integer intField32;
    private Long bigIntField85;
    private BigDecimal decimalField76;
    private BigDecimal priceField;
    private Float floatField9;
    private Double doubleField88;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingDetailV1() {}

    public BankingDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField4() {
        return smallIntField4;
    }

    public void setSmallIntField4(Short smallIntField4) {
        this.smallIntField4 = smallIntField4;
    }

    public Integer getIntField32() {
        return intField32;
    }

    public void setIntField32(Integer intField32) {
        this.intField32 = intField32;
    }

    public Long getBigIntField85() {
        return bigIntField85;
    }

    public void setBigIntField85(Long bigIntField85) {
        this.bigIntField85 = bigIntField85;
    }

    public BigDecimal getDecimalField76() {
        return decimalField76;
    }

    public void setDecimalField76(BigDecimal decimalField76) {
        this.decimalField76 = decimalField76;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField9() {
        return floatField9;
    }

    public void setFloatField9(Float floatField9) {
        this.floatField9 = floatField9;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
