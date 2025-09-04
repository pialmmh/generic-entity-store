package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureAuditV1 implements Serializable {
    private static final long serialVersionUID = 1146L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField53;
    private Integer intField68;
    private Long bigIntField9;
    private BigDecimal decimalField39;
    private BigDecimal priceField;
    private Float floatField98;
    private Double doubleField10;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public AgricultureAuditV1() {}

    public AgricultureAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField53() {
        return smallIntField53;
    }

    public void setSmallIntField53(Short smallIntField53) {
        this.smallIntField53 = smallIntField53;
    }

    public Integer getIntField68() {
        return intField68;
    }

    public void setIntField68(Integer intField68) {
        this.intField68 = intField68;
    }

    public Long getBigIntField9() {
        return bigIntField9;
    }

    public void setBigIntField9(Long bigIntField9) {
        this.bigIntField9 = bigIntField9;
    }

    public BigDecimal getDecimalField39() {
        return decimalField39;
    }

    public void setDecimalField39(BigDecimal decimalField39) {
        this.decimalField39 = decimalField39;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField98() {
        return floatField98;
    }

    public void setFloatField98(Float floatField98) {
        this.floatField98 = floatField98;
    }

    public Double getDoubleField10() {
        return doubleField10;
    }

    public void setDoubleField10(Double doubleField10) {
        this.doubleField10 = doubleField10;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
