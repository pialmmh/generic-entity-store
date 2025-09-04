package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomMetricV1 implements Serializable {
    private static final long serialVersionUID = 492L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField17;
    private Integer intField47;
    private Long bigIntField42;
    private BigDecimal decimalField4;
    private BigDecimal priceField;
    private Float floatField29;
    private Double doubleField75;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TelecomMetricV1() {}

    public TelecomMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField8() {
        return tinyIntField8;
    }

    public void setTinyIntField8(Byte tinyIntField8) {
        this.tinyIntField8 = tinyIntField8;
    }

    public Short getSmallIntField17() {
        return smallIntField17;
    }

    public void setSmallIntField17(Short smallIntField17) {
        this.smallIntField17 = smallIntField17;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField42() {
        return bigIntField42;
    }

    public void setBigIntField42(Long bigIntField42) {
        this.bigIntField42 = bigIntField42;
    }

    public BigDecimal getDecimalField4() {
        return decimalField4;
    }

    public void setDecimalField4(BigDecimal decimalField4) {
        this.decimalField4 = decimalField4;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField29() {
        return floatField29;
    }

    public void setFloatField29(Float floatField29) {
        this.floatField29 = floatField29;
    }

    public Double getDoubleField75() {
        return doubleField75;
    }

    public void setDoubleField75(Double doubleField75) {
        this.doubleField75 = doubleField75;
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
