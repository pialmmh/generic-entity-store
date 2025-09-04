package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceLogV1 implements Serializable {
    private static final long serialVersionUID = 537L;

    private Long id;
    private Byte tinyIntField62;
    private Short smallIntField50;
    private Integer intField50;
    private Long bigIntField83;
    private BigDecimal decimalField89;
    private BigDecimal priceField;
    private Float floatField19;
    private Double doubleField28;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public InsuranceLogV1() {}

    public InsuranceLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField62() {
        return tinyIntField62;
    }

    public void setTinyIntField62(Byte tinyIntField62) {
        this.tinyIntField62 = tinyIntField62;
    }

    public Short getSmallIntField50() {
        return smallIntField50;
    }

    public void setSmallIntField50(Short smallIntField50) {
        this.smallIntField50 = smallIntField50;
    }

    public Integer getIntField50() {
        return intField50;
    }

    public void setIntField50(Integer intField50) {
        this.intField50 = intField50;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField89() {
        return decimalField89;
    }

    public void setDecimalField89(BigDecimal decimalField89) {
        this.decimalField89 = decimalField89;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField19() {
        return floatField19;
    }

    public void setFloatField19(Float floatField19) {
        this.floatField19 = floatField19;
    }

    public Double getDoubleField28() {
        return doubleField28;
    }

    public void setDoubleField28(Double doubleField28) {
        this.doubleField28 = doubleField28;
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
