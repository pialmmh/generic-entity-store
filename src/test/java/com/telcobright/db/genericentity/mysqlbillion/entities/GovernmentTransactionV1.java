package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentTransactionV1 implements Serializable {
    private static final long serialVersionUID = 396L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField19;
    private Integer intField28;
    private Long bigIntField12;
    private BigDecimal decimalField80;
    private BigDecimal priceField;
    private Float floatField69;
    private Double doubleField50;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GovernmentTransactionV1() {}

    public GovernmentTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField19() {
        return smallIntField19;
    }

    public void setSmallIntField19(Short smallIntField19) {
        this.smallIntField19 = smallIntField19;
    }

    public Integer getIntField28() {
        return intField28;
    }

    public void setIntField28(Integer intField28) {
        this.intField28 = intField28;
    }

    public Long getBigIntField12() {
        return bigIntField12;
    }

    public void setBigIntField12(Long bigIntField12) {
        this.bigIntField12 = bigIntField12;
    }

    public BigDecimal getDecimalField80() {
        return decimalField80;
    }

    public void setDecimalField80(BigDecimal decimalField80) {
        this.decimalField80 = decimalField80;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField69() {
        return floatField69;
    }

    public void setFloatField69(Float floatField69) {
        this.floatField69 = floatField69;
    }

    public Double getDoubleField50() {
        return doubleField50;
    }

    public void setDoubleField50(Double doubleField50) {
        this.doubleField50 = doubleField50;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
