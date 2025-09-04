package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyDocumentV1 implements Serializable {
    private static final long serialVersionUID = 1098L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField38;
    private Integer intField15;
    private Long bigIntField64;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField87;
    private Double doubleField31;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EnergyDocumentV1() {}

    public EnergyDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField11() {
        return tinyIntField11;
    }

    public void setTinyIntField11(Byte tinyIntField11) {
        this.tinyIntField11 = tinyIntField11;
    }

    public Short getSmallIntField38() {
        return smallIntField38;
    }

    public void setSmallIntField38(Short smallIntField38) {
        this.smallIntField38 = smallIntField38;
    }

    public Integer getIntField15() {
        return intField15;
    }

    public void setIntField15(Integer intField15) {
        this.intField15 = intField15;
    }

    public Long getBigIntField64() {
        return bigIntField64;
    }

    public void setBigIntField64(Long bigIntField64) {
        this.bigIntField64 = bigIntField64;
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

    public Float getFloatField87() {
        return floatField87;
    }

    public void setFloatField87(Float floatField87) {
        this.floatField87 = floatField87;
    }

    public Double getDoubleField31() {
        return doubleField31;
    }

    public void setDoubleField31(Double doubleField31) {
        this.doubleField31 = doubleField31;
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
