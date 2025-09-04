package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceAccountV1 implements Serializable {
    private static final long serialVersionUID = 567L;

    private Long id;
    private Byte tinyIntField27;
    private Short smallIntField1;
    private Integer intField94;
    private Long bigIntField82;
    private BigDecimal decimalField34;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField31;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public InsuranceAccountV1() {}

    public InsuranceAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField27() {
        return tinyIntField27;
    }

    public void setTinyIntField27(Byte tinyIntField27) {
        this.tinyIntField27 = tinyIntField27;
    }

    public Short getSmallIntField1() {
        return smallIntField1;
    }

    public void setSmallIntField1(Short smallIntField1) {
        this.smallIntField1 = smallIntField1;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField82() {
        return bigIntField82;
    }

    public void setBigIntField82(Long bigIntField82) {
        this.bigIntField82 = bigIntField82;
    }

    public BigDecimal getDecimalField34() {
        return decimalField34;
    }

    public void setDecimalField34(BigDecimal decimalField34) {
        this.decimalField34 = decimalField34;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField31() {
        return doubleField31;
    }

    public void setDoubleField31(Double doubleField31) {
        this.doubleField31 = doubleField31;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
