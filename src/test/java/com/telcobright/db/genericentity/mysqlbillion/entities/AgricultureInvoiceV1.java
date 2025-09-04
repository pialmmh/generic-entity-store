package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 1170L;

    private Long id;
    private Byte tinyIntField92;
    private Short smallIntField18;
    private Integer intField22;
    private Long bigIntField32;
    private BigDecimal decimalField62;
    private BigDecimal priceField;
    private Float floatField2;
    private Double doubleField12;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public AgricultureInvoiceV1() {}

    public AgricultureInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField92() {
        return tinyIntField92;
    }

    public void setTinyIntField92(Byte tinyIntField92) {
        this.tinyIntField92 = tinyIntField92;
    }

    public Short getSmallIntField18() {
        return smallIntField18;
    }

    public void setSmallIntField18(Short smallIntField18) {
        this.smallIntField18 = smallIntField18;
    }

    public Integer getIntField22() {
        return intField22;
    }

    public void setIntField22(Integer intField22) {
        this.intField22 = intField22;
    }

    public Long getBigIntField32() {
        return bigIntField32;
    }

    public void setBigIntField32(Long bigIntField32) {
        this.bigIntField32 = bigIntField32;
    }

    public BigDecimal getDecimalField62() {
        return decimalField62;
    }

    public void setDecimalField62(BigDecimal decimalField62) {
        this.decimalField62 = decimalField62;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField2() {
        return floatField2;
    }

    public void setFloatField2(Float floatField2) {
        this.floatField2 = floatField2;
    }

    public Double getDoubleField12() {
        return doubleField12;
    }

    public void setDoubleField12(Double doubleField12) {
        this.doubleField12 = doubleField12;
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
