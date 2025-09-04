package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: MediaPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaPaymentV1 implements Serializable {
    private static final long serialVersionUID = 912L;

    private Long id;
    private Byte tinyIntField21;
    private Short smallIntField62;
    private Integer intField2;
    private Long bigIntField74;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField72;
    private Double doubleField47;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public MediaPaymentV1() {}

    public MediaPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField21() {
        return tinyIntField21;
    }

    public void setTinyIntField21(Byte tinyIntField21) {
        this.tinyIntField21 = tinyIntField21;
    }

    public Short getSmallIntField62() {
        return smallIntField62;
    }

    public void setSmallIntField62(Short smallIntField62) {
        this.smallIntField62 = smallIntField62;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField74() {
        return bigIntField74;
    }

    public void setBigIntField74(Long bigIntField74) {
        this.bigIntField74 = bigIntField74;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField72() {
        return floatField72;
    }

    public void setFloatField72(Float floatField72) {
        this.floatField72 = floatField72;
    }

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
