package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsAuditV1 implements Serializable {
    private static final long serialVersionUID = 288L;

    private Long id;
    private Byte tinyIntField36;
    private Short smallIntField20;
    private Integer intField83;
    private Long bigIntField44;
    private BigDecimal decimalField43;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField33;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public LogisticsAuditV1() {}

    public LogisticsAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField36() {
        return tinyIntField36;
    }

    public void setTinyIntField36(Byte tinyIntField36) {
        this.tinyIntField36 = tinyIntField36;
    }

    public Short getSmallIntField20() {
        return smallIntField20;
    }

    public void setSmallIntField20(Short smallIntField20) {
        this.smallIntField20 = smallIntField20;
    }

    public Integer getIntField83() {
        return intField83;
    }

    public void setIntField83(Integer intField83) {
        this.intField83 = intField83;
    }

    public Long getBigIntField44() {
        return bigIntField44;
    }

    public void setBigIntField44(Long bigIntField44) {
        this.bigIntField44 = bigIntField44;
    }

    public BigDecimal getDecimalField43() {
        return decimalField43;
    }

    public void setDecimalField43(BigDecimal decimalField43) {
        this.decimalField43 = decimalField43;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField62() {
        return floatField62;
    }

    public void setFloatField62(Float floatField62) {
        this.floatField62 = floatField62;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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
