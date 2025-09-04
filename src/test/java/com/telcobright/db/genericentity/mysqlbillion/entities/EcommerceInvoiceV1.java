package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 708L;

    private Long id;
    private Byte tinyIntField8;
    private Short smallIntField59;
    private Integer intField95;
    private Long bigIntField15;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField34;
    private Double doubleField79;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EcommerceInvoiceV1() {}

    public EcommerceInvoiceV1(Long id, String code, String name) {
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

    public Short getSmallIntField59() {
        return smallIntField59;
    }

    public void setSmallIntField59(Short smallIntField59) {
        this.smallIntField59 = smallIntField59;
    }

    public Integer getIntField95() {
        return intField95;
    }

    public void setIntField95(Integer intField95) {
        this.intField95 = intField95;
    }

    public Long getBigIntField15() {
        return bigIntField15;
    }

    public void setBigIntField15(Long bigIntField15) {
        this.bigIntField15 = bigIntField15;
    }

    public BigDecimal getDecimalField11() {
        return decimalField11;
    }

    public void setDecimalField11(BigDecimal decimalField11) {
        this.decimalField11 = decimalField11;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField34() {
        return floatField34;
    }

    public void setFloatField34(Float floatField34) {
        this.floatField34 = floatField34;
    }

    public Double getDoubleField79() {
        return doubleField79;
    }

    public void setDoubleField79(Double doubleField79) {
        this.doubleField79 = doubleField79;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
