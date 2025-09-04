package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsDetailV1 implements Serializable {
    private static final long serialVersionUID = 276L;

    private Long id;
    private Byte tinyIntField12;
    private Short smallIntField25;
    private Integer intField48;
    private Long bigIntField65;
    private BigDecimal decimalField9;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField14;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public LogisticsDetailV1() {}

    public LogisticsDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField12() {
        return tinyIntField12;
    }

    public void setTinyIntField12(Byte tinyIntField12) {
        this.tinyIntField12 = tinyIntField12;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField65() {
        return bigIntField65;
    }

    public void setBigIntField65(Long bigIntField65) {
        this.bigIntField65 = bigIntField65;
    }

    public BigDecimal getDecimalField9() {
        return decimalField9;
    }

    public void setDecimalField9(BigDecimal decimalField9) {
        this.decimalField9 = decimalField9;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField14() {
        return doubleField14;
    }

    public void setDoubleField14(Double doubleField14) {
        this.doubleField14 = doubleField14;
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
