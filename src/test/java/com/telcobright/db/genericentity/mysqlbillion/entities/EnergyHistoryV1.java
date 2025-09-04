package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyHistoryV1 implements Serializable {
    private static final long serialVersionUID = 1074L;

    private Long id;
    private Byte tinyIntField80;
    private Short smallIntField31;
    private Integer intField4;
    private Long bigIntField50;
    private BigDecimal decimalField34;
    private BigDecimal priceField;
    private Float floatField53;
    private Double doubleField54;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EnergyHistoryV1() {}

    public EnergyHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField80() {
        return tinyIntField80;
    }

    public void setTinyIntField80(Byte tinyIntField80) {
        this.tinyIntField80 = tinyIntField80;
    }

    public Short getSmallIntField31() {
        return smallIntField31;
    }

    public void setSmallIntField31(Short smallIntField31) {
        this.smallIntField31 = smallIntField31;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField50() {
        return bigIntField50;
    }

    public void setBigIntField50(Long bigIntField50) {
        this.bigIntField50 = bigIntField50;
    }

    public BigDecimal getDecimalField34() {
        return decimalField34;
    }

    public void setDecimalField34(BigDecimal decimalField34) {
        this.decimalField34 = decimalField34;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField53() {
        return floatField53;
    }

    public void setFloatField53(Float floatField53) {
        this.floatField53 = floatField53;
    }

    public Double getDoubleField54() {
        return doubleField54;
    }

    public void setDoubleField54(Double doubleField54) {
        this.doubleField54 = doubleField54;
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
