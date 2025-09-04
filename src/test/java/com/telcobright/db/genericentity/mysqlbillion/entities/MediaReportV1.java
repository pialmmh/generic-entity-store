package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaReportV1 implements Serializable {
    private static final long serialVersionUID = 885L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField33;
    private Integer intField93;
    private Long bigIntField53;
    private BigDecimal decimalField64;
    private BigDecimal priceField;
    private Float floatField66;
    private Double doubleField67;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public MediaReportV1() {}

    public MediaReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField33() {
        return smallIntField33;
    }

    public void setSmallIntField33(Short smallIntField33) {
        this.smallIntField33 = smallIntField33;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField53() {
        return bigIntField53;
    }

    public void setBigIntField53(Long bigIntField53) {
        this.bigIntField53 = bigIntField53;
    }

    public BigDecimal getDecimalField64() {
        return decimalField64;
    }

    public void setDecimalField64(BigDecimal decimalField64) {
        this.decimalField64 = decimalField64;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField66() {
        return floatField66;
    }

    public void setFloatField66(Float floatField66) {
        this.floatField66 = floatField66;
    }

    public Double getDoubleField67() {
        return doubleField67;
    }

    public void setDoubleField67(Double doubleField67) {
        this.doubleField67 = doubleField67;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
