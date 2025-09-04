package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 48L;

    private Long id;
    private Byte tinyIntField68;
    private Short smallIntField16;
    private Integer intField31;
    private Long bigIntField44;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField11;
    private Double doubleField22;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public FinanceInvoiceV1() {}

    public FinanceInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField68() {
        return tinyIntField68;
    }

    public void setTinyIntField68(Byte tinyIntField68) {
        this.tinyIntField68 = tinyIntField68;
    }

    public Short getSmallIntField16() {
        return smallIntField16;
    }

    public void setSmallIntField16(Short smallIntField16) {
        this.smallIntField16 = smallIntField16;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField44() {
        return bigIntField44;
    }

    public void setBigIntField44(Long bigIntField44) {
        this.bigIntField44 = bigIntField44;
    }

    public BigDecimal getDecimalField77() {
        return decimalField77;
    }

    public void setDecimalField77(BigDecimal decimalField77) {
        this.decimalField77 = decimalField77;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField11() {
        return floatField11;
    }

    public void setFloatField11(Float floatField11) {
        this.floatField11 = floatField11;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
