package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaEntryV1 implements Serializable {
    private static final long serialVersionUID = 864L;

    private Long id;
    private Byte tinyIntField53;
    private Short smallIntField57;
    private Integer intField50;
    private Long bigIntField73;
    private BigDecimal decimalField35;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField83;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public MediaEntryV1() {}

    public MediaEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField53() {
        return tinyIntField53;
    }

    public void setTinyIntField53(Byte tinyIntField53) {
        this.tinyIntField53 = tinyIntField53;
    }

    public Short getSmallIntField57() {
        return smallIntField57;
    }

    public void setSmallIntField57(Short smallIntField57) {
        this.smallIntField57 = smallIntField57;
    }

    public Integer getIntField50() {
        return intField50;
    }

    public void setIntField50(Integer intField50) {
        this.intField50 = intField50;
    }

    public Long getBigIntField73() {
        return bigIntField73;
    }

    public void setBigIntField73(Long bigIntField73) {
        this.bigIntField73 = bigIntField73;
    }

    public BigDecimal getDecimalField35() {
        return decimalField35;
    }

    public void setDecimalField35(BigDecimal decimalField35) {
        this.decimalField35 = decimalField35;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField83() {
        return doubleField83;
    }

    public void setDoubleField83(Double doubleField83) {
        this.doubleField83 = doubleField83;
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
