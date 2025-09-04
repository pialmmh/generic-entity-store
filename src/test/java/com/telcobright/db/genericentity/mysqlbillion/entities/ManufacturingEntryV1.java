package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingEntryV1 implements Serializable {
    private static final long serialVersionUID = 204L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField45;
    private Integer intField93;
    private Long bigIntField44;
    private BigDecimal decimalField24;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField33;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public ManufacturingEntryV1() {}

    public ManufacturingEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField45() {
        return smallIntField45;
    }

    public void setSmallIntField45(Short smallIntField45) {
        this.smallIntField45 = smallIntField45;
    }

    public Integer getIntField93() {
        return intField93;
    }

    public void setIntField93(Integer intField93) {
        this.intField93 = intField93;
    }

    public Long getBigIntField44() {
        return bigIntField44;
    }

    public void setBigIntField44(Long bigIntField44) {
        this.bigIntField44 = bigIntField44;
    }

    public BigDecimal getDecimalField24() {
        return decimalField24;
    }

    public void setDecimalField24(BigDecimal decimalField24) {
        this.decimalField24 = decimalField24;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField20() {
        return floatField20;
    }

    public void setFloatField20(Float floatField20) {
        this.floatField20 = floatField20;
    }

    public Double getDoubleField33() {
        return doubleField33;
    }

    public void setDoubleField33(Double doubleField33) {
        this.doubleField33 = doubleField33;
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
