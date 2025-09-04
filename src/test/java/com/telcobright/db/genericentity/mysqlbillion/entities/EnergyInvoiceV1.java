package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 1104L;

    private Long id;
    private Byte tinyIntField49;
    private Short smallIntField90;
    private Integer intField97;
    private Long bigIntField24;
    private BigDecimal decimalField84;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField48;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EnergyInvoiceV1() {}

    public EnergyInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField49() {
        return tinyIntField49;
    }

    public void setTinyIntField49(Byte tinyIntField49) {
        this.tinyIntField49 = tinyIntField49;
    }

    public Short getSmallIntField90() {
        return smallIntField90;
    }

    public void setSmallIntField90(Short smallIntField90) {
        this.smallIntField90 = smallIntField90;
    }

    public Integer getIntField97() {
        return intField97;
    }

    public void setIntField97(Integer intField97) {
        this.intField97 = intField97;
    }

    public Long getBigIntField24() {
        return bigIntField24;
    }

    public void setBigIntField24(Long bigIntField24) {
        this.bigIntField24 = bigIntField24;
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

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField48() {
        return doubleField48;
    }

    public void setDoubleField48(Double doubleField48) {
        this.doubleField48 = doubleField48;
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
