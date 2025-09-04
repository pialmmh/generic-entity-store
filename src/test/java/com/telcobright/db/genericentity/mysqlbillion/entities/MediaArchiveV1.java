package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: MediaArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaArchiveV1 implements Serializable {
    private static final long serialVersionUID = 879L;

    private Long id;
    private Byte tinyIntField34;
    private Short smallIntField80;
    private Integer intField58;
    private Long bigIntField93;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField51;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public MediaArchiveV1() {}

    public MediaArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField34() {
        return tinyIntField34;
    }

    public void setTinyIntField34(Byte tinyIntField34) {
        this.tinyIntField34 = tinyIntField34;
    }

    public Short getSmallIntField80() {
        return smallIntField80;
    }

    public void setSmallIntField80(Short smallIntField80) {
        this.smallIntField80 = smallIntField80;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField93() {
        return bigIntField93;
    }

    public void setBigIntField93(Long bigIntField93) {
        this.bigIntField93 = bigIntField93;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField80() {
        return floatField80;
    }

    public void setFloatField80(Float floatField80) {
        this.floatField80 = floatField80;
    }

    public Double getDoubleField51() {
        return doubleField51;
    }

    public void setDoubleField51(Double doubleField51) {
        this.doubleField51 = doubleField51;
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
