package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationOrderV1 implements Serializable {
    private static final long serialVersionUID = 381L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField19;
    private Integer intField38;
    private Long bigIntField35;
    private BigDecimal decimalField77;
    private BigDecimal priceField;
    private Float floatField0;
    private Double doubleField73;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EducationOrderV1() {}

    public EducationOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField95() {
        return tinyIntField95;
    }

    public void setTinyIntField95(Byte tinyIntField95) {
        this.tinyIntField95 = tinyIntField95;
    }

    public Short getSmallIntField19() {
        return smallIntField19;
    }

    public void setSmallIntField19(Short smallIntField19) {
        this.smallIntField19 = smallIntField19;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField35() {
        return bigIntField35;
    }

    public void setBigIntField35(Long bigIntField35) {
        this.bigIntField35 = bigIntField35;
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

    public Float getFloatField0() {
        return floatField0;
    }

    public void setFloatField0(Float floatField0) {
        this.floatField0 = floatField0;
    }

    public Double getDoubleField73() {
        return doubleField73;
    }

    public void setDoubleField73(Double doubleField73) {
        this.doubleField73 = doubleField73;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
