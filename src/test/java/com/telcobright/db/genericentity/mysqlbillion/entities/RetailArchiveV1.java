package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailArchiveV1 implements Serializable {
    private static final long serialVersionUID = 153L;

    private Long id;
    private Byte tinyIntField10;
    private Short smallIntField99;
    private Integer intField20;
    private Long bigIntField66;
    private BigDecimal decimalField49;
    private BigDecimal priceField;
    private Float floatField68;
    private Double doubleField10;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RetailArchiveV1() {}

    public RetailArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField10() {
        return tinyIntField10;
    }

    public void setTinyIntField10(Byte tinyIntField10) {
        this.tinyIntField10 = tinyIntField10;
    }

    public Short getSmallIntField99() {
        return smallIntField99;
    }

    public void setSmallIntField99(Short smallIntField99) {
        this.smallIntField99 = smallIntField99;
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

    public BigDecimal getDecimalField49() {
        return decimalField49;
    }

    public void setDecimalField49(BigDecimal decimalField49) {
        this.decimalField49 = decimalField49;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField68() {
        return floatField68;
    }

    public void setFloatField68(Float floatField68) {
        this.floatField68 = floatField68;
    }

    public Double getDoubleField10() {
        return doubleField10;
    }

    public void setDoubleField10(Double doubleField10) {
        this.doubleField10 = doubleField10;
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
