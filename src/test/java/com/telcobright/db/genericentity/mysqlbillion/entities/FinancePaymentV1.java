package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: FinancePaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinancePaymentV1 implements Serializable {
    private static final long serialVersionUID = 54L;

    private Long id;
    private Byte tinyIntField19;
    private Short smallIntField91;
    private Integer intField20;
    private Long bigIntField75;
    private BigDecimal decimalField3;
    private BigDecimal priceField;
    private Float floatField14;
    private Double doubleField55;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public FinancePaymentV1() {}

    public FinancePaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField19() {
        return tinyIntField19;
    }

    public void setTinyIntField19(Byte tinyIntField19) {
        this.tinyIntField19 = tinyIntField19;
    }

    public Short getSmallIntField91() {
        return smallIntField91;
    }

    public void setSmallIntField91(Short smallIntField91) {
        this.smallIntField91 = smallIntField91;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField75() {
        return bigIntField75;
    }

    public void setBigIntField75(Long bigIntField75) {
        this.bigIntField75 = bigIntField75;
    }

    public BigDecimal getDecimalField3() {
        return decimalField3;
    }

    public void setDecimalField3(BigDecimal decimalField3) {
        this.decimalField3 = decimalField3;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField14() {
        return floatField14;
    }

    public void setFloatField14(Float floatField14) {
        this.floatField14 = floatField14;
    }

    public Double getDoubleField55() {
        return doubleField55;
    }

    public void setDoubleField55(Double doubleField55) {
        this.doubleField55 = doubleField55;
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
