package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationBalanceV1 implements Serializable {
    private static final long serialVersionUID = 393L;

    private Long id;
    private Byte tinyIntField78;
    private Short smallIntField3;
    private Integer intField20;
    private Long bigIntField66;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField67;
    private Double doubleField74;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EducationBalanceV1() {}

    public EducationBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField78() {
        return tinyIntField78;
    }

    public void setTinyIntField78(Byte tinyIntField78) {
        this.tinyIntField78 = tinyIntField78;
    }

    public Short getSmallIntField3() {
        return smallIntField3;
    }

    public void setSmallIntField3(Short smallIntField3) {
        this.smallIntField3 = smallIntField3;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField66() {
        return bigIntField66;
    }

    public void setBigIntField66(Long bigIntField66) {
        this.bigIntField66 = bigIntField66;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField67() {
        return floatField67;
    }

    public void setFloatField67(Float floatField67) {
        this.floatField67 = floatField67;
    }

    public Double getDoubleField74() {
        return doubleField74;
    }

    public void setDoubleField74(Double doubleField74) {
        this.doubleField74 = doubleField74;
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
