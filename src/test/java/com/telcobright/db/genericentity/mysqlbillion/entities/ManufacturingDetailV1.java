package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingDetailV1 implements Serializable {
    private static final long serialVersionUID = 210L;

    private Long id;
    private Byte tinyIntField64;
    private Short smallIntField90;
    private Integer intField74;
    private Long bigIntField82;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField1;
    private Double doubleField11;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public ManufacturingDetailV1() {}

    public ManufacturingDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField64() {
        return tinyIntField64;
    }

    public void setTinyIntField64(Byte tinyIntField64) {
        this.tinyIntField64 = tinyIntField64;
    }

    public Short getSmallIntField90() {
        return smallIntField90;
    }

    public void setSmallIntField90(Short smallIntField90) {
        this.smallIntField90 = smallIntField90;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField82() {
        return bigIntField82;
    }

    public void setBigIntField82(Long bigIntField82) {
        this.bigIntField82 = bigIntField82;
    }

    public BigDecimal getDecimalField27() {
        return decimalField27;
    }

    public void setDecimalField27(BigDecimal decimalField27) {
        this.decimalField27 = decimalField27;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField1() {
        return floatField1;
    }

    public void setFloatField1(Float floatField1) {
        this.floatField1 = floatField1;
    }

    public Double getDoubleField11() {
        return doubleField11;
    }

    public void setDoubleField11(Double doubleField11) {
        this.doubleField11 = doubleField11;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
