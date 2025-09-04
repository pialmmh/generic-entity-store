package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: SocialHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialHistoryV1 implements Serializable {
    private static final long serialVersionUID = 744L;

    private Long id;
    private Byte tinyIntField28;
    private Short smallIntField46;
    private Integer intField77;
    private Long bigIntField20;
    private BigDecimal decimalField88;
    private BigDecimal priceField;
    private Float floatField9;
    private Double doubleField7;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SocialHistoryV1() {}

    public SocialHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField28() {
        return tinyIntField28;
    }

    public void setTinyIntField28(Byte tinyIntField28) {
        this.tinyIntField28 = tinyIntField28;
    }

    public Short getSmallIntField46() {
        return smallIntField46;
    }

    public void setSmallIntField46(Short smallIntField46) {
        this.smallIntField46 = smallIntField46;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField20() {
        return bigIntField20;
    }

    public void setBigIntField20(Long bigIntField20) {
        this.bigIntField20 = bigIntField20;
    }

    public BigDecimal getDecimalField88() {
        return decimalField88;
    }

    public void setDecimalField88(BigDecimal decimalField88) {
        this.decimalField88 = decimalField88;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField9() {
        return floatField9;
    }

    public void setFloatField9(Float floatField9) {
        this.floatField9 = floatField9;
    }

    public Double getDoubleField7() {
        return doubleField7;
    }

    public void setDoubleField7(Double doubleField7) {
        this.doubleField7 = doubleField7;
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
