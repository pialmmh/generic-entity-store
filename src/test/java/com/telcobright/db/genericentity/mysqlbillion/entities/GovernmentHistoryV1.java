package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GovernmentHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GovernmentHistoryV1 implements Serializable {
    private static final long serialVersionUID = 414L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField76;
    private Integer intField37;
    private Long bigIntField35;
    private BigDecimal decimalField92;
    private BigDecimal priceField;
    private Float floatField8;
    private Double doubleField86;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GovernmentHistoryV1() {}

    public GovernmentHistoryV1(Long id, String code, String name) {
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

    public Short getSmallIntField76() {
        return smallIntField76;
    }

    public void setSmallIntField76(Short smallIntField76) {
        this.smallIntField76 = smallIntField76;
    }

    public Integer getIntField37() {
        return intField37;
    }

    public void setIntField37(Integer intField37) {
        this.intField37 = intField37;
    }

    public Long getBigIntField35() {
        return bigIntField35;
    }

    public void setBigIntField35(Long bigIntField35) {
        this.bigIntField35 = bigIntField35;
    }

    public BigDecimal getDecimalField92() {
        return decimalField92;
    }

    public void setDecimalField92(BigDecimal decimalField92) {
        this.decimalField92 = decimalField92;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField8() {
        return floatField8;
    }

    public void setFloatField8(Float floatField8) {
        this.floatField8 = floatField8;
    }

    public Double getDoubleField86() {
        return doubleField86;
    }

    public void setDoubleField86(Double doubleField86) {
        this.doubleField86 = doubleField86;
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
