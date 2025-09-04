package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceLogV1 implements Serializable {
    private static final long serialVersionUID = 9L;

    private Long id;
    private Byte tinyIntField89;
    private Short smallIntField96;
    private Integer intField48;
    private Long bigIntField35;
    private BigDecimal decimalField59;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField73;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public FinanceLogV1() {}

    public FinanceLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField89() {
        return tinyIntField89;
    }

    public void setTinyIntField89(Byte tinyIntField89) {
        this.tinyIntField89 = tinyIntField89;
    }

    public Short getSmallIntField96() {
        return smallIntField96;
    }

    public void setSmallIntField96(Short smallIntField96) {
        this.smallIntField96 = smallIntField96;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField35() {
        return bigIntField35;
    }

    public void setBigIntField35(Long bigIntField35) {
        this.bigIntField35 = bigIntField35;
    }

    public BigDecimal getDecimalField59() {
        return decimalField59;
    }

    public void setDecimalField59(BigDecimal decimalField59) {
        this.decimalField59 = decimalField59;
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

    public Double getDoubleField73() {
        return doubleField73;
    }

    public void setDoubleField73(Double doubleField73) {
        this.doubleField73 = doubleField73;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
