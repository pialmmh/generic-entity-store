package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationHistoryV1 implements Serializable {
    private static final long serialVersionUID = 348L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField0;
    private Integer intField64;
    private Long bigIntField75;
    private BigDecimal decimalField14;
    private BigDecimal priceField;
    private Float floatField79;
    private Double doubleField22;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationHistoryV1() {}

    public EducationHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField52() {
        return tinyIntField52;
    }

    public void setTinyIntField52(Byte tinyIntField52) {
        this.tinyIntField52 = tinyIntField52;
    }

    public Short getSmallIntField0() {
        return smallIntField0;
    }

    public void setSmallIntField0(Short smallIntField0) {
        this.smallIntField0 = smallIntField0;
    }

    public Integer getIntField64() {
        return intField64;
    }

    public void setIntField64(Integer intField64) {
        this.intField64 = intField64;
    }

    public Long getBigIntField75() {
        return bigIntField75;
    }

    public void setBigIntField75(Long bigIntField75) {
        this.bigIntField75 = bigIntField75;
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

    public Float getFloatField79() {
        return floatField79;
    }

    public void setFloatField79(Float floatField79) {
        this.floatField79 = floatField79;
    }

    public Double getDoubleField22() {
        return doubleField22;
    }

    public void setDoubleField22(Double doubleField22) {
        this.doubleField22 = doubleField22;
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
