package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentCertificateV1 implements Serializable {
    private static final long serialVersionUID = 441L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField71;
    private Integer intField74;
    private Long bigIntField63;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField78;
    private Double doubleField52;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GovernmentCertificateV1() {}

    public GovernmentCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField63() {
        return bigIntField63;
    }

    public void setBigIntField63(Long bigIntField63) {
        this.bigIntField63 = bigIntField63;
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

    public Float getFloatField78() {
        return floatField78;
    }

    public void setFloatField78(Float floatField78) {
        this.floatField78 = floatField78;
    }

    public Double getDoubleField52() {
        return doubleField52;
    }

    public void setDoubleField52(Double doubleField52) {
        this.doubleField52 = doubleField52;
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
