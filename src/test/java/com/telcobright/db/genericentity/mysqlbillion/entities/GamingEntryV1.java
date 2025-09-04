package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingEntryV1 implements Serializable {
    private static final long serialVersionUID = 798L;

    private Long id;
    private Byte tinyIntField47;
    private Short smallIntField79;
    private Integer intField67;
    private Long bigIntField0;
    private BigDecimal decimalField32;
    private BigDecimal priceField;
    private Float floatField10;
    private Double doubleField5;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GamingEntryV1() {}

    public GamingEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField47() {
        return tinyIntField47;
    }

    public void setTinyIntField47(Byte tinyIntField47) {
        this.tinyIntField47 = tinyIntField47;
    }

    public Short getSmallIntField79() {
        return smallIntField79;
    }

    public void setSmallIntField79(Short smallIntField79) {
        this.smallIntField79 = smallIntField79;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField0() {
        return bigIntField0;
    }

    public void setBigIntField0(Long bigIntField0) {
        this.bigIntField0 = bigIntField0;
    }

    public BigDecimal getDecimalField32() {
        return decimalField32;
    }

    public void setDecimalField32(BigDecimal decimalField32) {
        this.decimalField32 = decimalField32;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField10() {
        return floatField10;
    }

    public void setFloatField10(Float floatField10) {
        this.floatField10 = floatField10;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
