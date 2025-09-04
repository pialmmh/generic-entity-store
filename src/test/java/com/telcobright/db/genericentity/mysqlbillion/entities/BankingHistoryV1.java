package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: BankingHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingHistoryV1 implements Serializable {
    private static final long serialVersionUID = 612L;

    private Long id;
    private Byte tinyIntField96;
    private Short smallIntField71;
    private Integer intField30;
    private Long bigIntField81;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField86;
    private Double doubleField21;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public BankingHistoryV1() {}

    public BankingHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField96() {
        return tinyIntField96;
    }

    public void setTinyIntField96(Byte tinyIntField96) {
        this.tinyIntField96 = tinyIntField96;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField81() {
        return bigIntField81;
    }

    public void setBigIntField81(Long bigIntField81) {
        this.bigIntField81 = bigIntField81;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField86() {
        return floatField86;
    }

    public void setFloatField86(Float floatField86) {
        this.floatField86 = floatField86;
    }

    public Double getDoubleField21() {
        return doubleField21;
    }

    public void setDoubleField21(Double doubleField21) {
        this.doubleField21 = doubleField21;
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
