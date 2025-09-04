package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationReceiptV1 implements Serializable {
    private static final long serialVersionUID = 387L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField20;
    private Integer intField30;
    private Long bigIntField12;
    private BigDecimal decimalField84;
    private BigDecimal priceField;
    private Float floatField11;
    private Double doubleField49;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EducationReceiptV1() {}

    public EducationReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField20() {
        return smallIntField20;
    }

    public void setSmallIntField20(Short smallIntField20) {
        this.smallIntField20 = smallIntField20;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField12() {
        return bigIntField12;
    }

    public void setBigIntField12(Long bigIntField12) {
        this.bigIntField12 = bigIntField12;
    }

    public BigDecimal getDecimalField84() {
        return decimalField84;
    }

    public void setDecimalField84(BigDecimal decimalField84) {
        this.decimalField84 = decimalField84;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField11() {
        return floatField11;
    }

    public void setFloatField11(Float floatField11) {
        this.floatField11 = floatField11;
    }

    public Double getDoubleField49() {
        return doubleField49;
    }

    public void setDoubleField49(Double doubleField49) {
        this.doubleField49 = doubleField49;
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
