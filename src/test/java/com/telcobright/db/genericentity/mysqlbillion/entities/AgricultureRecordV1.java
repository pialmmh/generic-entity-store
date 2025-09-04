package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureRecordV1 implements Serializable {
    private static final long serialVersionUID = 1125L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField81;
    private Integer intField52;
    private Long bigIntField40;
    private BigDecimal decimalField14;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField97;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public AgricultureRecordV1() {}

    public AgricultureRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField81() {
        return smallIntField81;
    }

    public void setSmallIntField81(Short smallIntField81) {
        this.smallIntField81 = smallIntField81;
    }

    public Integer getIntField52() {
        return intField52;
    }

    public void setIntField52(Integer intField52) {
        this.intField52 = intField52;
    }

    public Long getBigIntField40() {
        return bigIntField40;
    }

    public void setBigIntField40(Long bigIntField40) {
        this.bigIntField40 = bigIntField40;
    }

    public BigDecimal getDecimalField14() {
        return decimalField14;
    }

    public void setDecimalField14(BigDecimal decimalField14) {
        this.decimalField14 = decimalField14;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField57() {
        return floatField57;
    }

    public void setFloatField57(Float floatField57) {
        this.floatField57 = floatField57;
    }

    public Double getDoubleField97() {
        return doubleField97;
    }

    public void setDoubleField97(Double doubleField97) {
        this.doubleField97 = doubleField97;
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
