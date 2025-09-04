package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyReceiptV1 implements Serializable {
    private static final long serialVersionUID = 1113L;

    private Long id;
    private Byte tinyIntField79;
    private Short smallIntField86;
    private Integer intField69;
    private Long bigIntField12;
    private BigDecimal decimalField80;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField30;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EnergyReceiptV1() {}

    public EnergyReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField79() {
        return tinyIntField79;
    }

    public void setTinyIntField79(Byte tinyIntField79) {
        this.tinyIntField79 = tinyIntField79;
    }

    public Short getSmallIntField86() {
        return smallIntField86;
    }

    public void setSmallIntField86(Short smallIntField86) {
        this.smallIntField86 = smallIntField86;
    }

    public Integer getIntField69() {
        return intField69;
    }

    public void setIntField69(Integer intField69) {
        this.intField69 = intField69;
    }

    public Long getBigIntField12() {
        return bigIntField12;
    }

    public void setBigIntField12(Long bigIntField12) {
        this.bigIntField12 = bigIntField12;
    }

    public BigDecimal getDecimalField80() {
        return decimalField80;
    }

    public void setDecimalField80(BigDecimal decimalField80) {
        this.decimalField80 = decimalField80;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField30() {
        return doubleField30;
    }

    public void setDoubleField30(Double doubleField30) {
        this.doubleField30 = doubleField30;
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
