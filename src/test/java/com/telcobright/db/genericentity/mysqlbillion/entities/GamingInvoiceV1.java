package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 840L;

    private Long id;
    private Byte tinyIntField40;
    private Short smallIntField33;
    private Integer intField95;
    private Long bigIntField54;
    private BigDecimal decimalField16;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField66;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GamingInvoiceV1() {}

    public GamingInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField40() {
        return tinyIntField40;
    }

    public void setTinyIntField40(Byte tinyIntField40) {
        this.tinyIntField40 = tinyIntField40;
    }

    public Short getSmallIntField33() {
        return smallIntField33;
    }

    public void setSmallIntField33(Short smallIntField33) {
        this.smallIntField33 = smallIntField33;
    }

    public Integer getIntField95() {
        return intField95;
    }

    public void setIntField95(Integer intField95) {
        this.intField95 = intField95;
    }

    public Long getBigIntField54() {
        return bigIntField54;
    }

    public void setBigIntField54(Long bigIntField54) {
        this.bigIntField54 = bigIntField54;
    }

    public BigDecimal getDecimalField16() {
        return decimalField16;
    }

    public void setDecimalField16(BigDecimal decimalField16) {
        this.decimalField16 = decimalField16;
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

    public Double getDoubleField66() {
        return doubleField66;
    }

    public void setDoubleField66(Double doubleField66) {
        this.doubleField66 = doubleField66;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
