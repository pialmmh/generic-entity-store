package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsArchiveV1 implements Serializable {
    private static final long serialVersionUID = 285L;

    private Long id;
    private Byte tinyIntField42;
    private Short smallIntField73;
    private Integer intField19;
    private Long bigIntField5;
    private BigDecimal decimalField54;
    private BigDecimal priceField;
    private Float floatField39;
    private Double doubleField96;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public LogisticsArchiveV1() {}

    public LogisticsArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField42() {
        return tinyIntField42;
    }

    public void setTinyIntField42(Byte tinyIntField42) {
        this.tinyIntField42 = tinyIntField42;
    }

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField19() {
        return intField19;
    }

    public void setIntField19(Integer intField19) {
        this.intField19 = intField19;
    }

    public Long getBigIntField5() {
        return bigIntField5;
    }

    public void setBigIntField5(Long bigIntField5) {
        this.bigIntField5 = bigIntField5;
    }

    public BigDecimal getDecimalField54() {
        return decimalField54;
    }

    public void setDecimalField54(BigDecimal decimalField54) {
        this.decimalField54 = decimalField54;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField39() {
        return floatField39;
    }

    public void setFloatField39(Float floatField39) {
        this.floatField39 = floatField39;
    }

    public Double getDoubleField96() {
        return doubleField96;
    }

    public void setDoubleField96(Double doubleField96) {
        this.doubleField96 = doubleField96;
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
