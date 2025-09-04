package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GamingAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingAuditV1 implements Serializable {
    private static final long serialVersionUID = 816L;

    private Long id;
    private Byte tinyIntField9;
    private Short smallIntField26;
    private Integer intField84;
    private Long bigIntField40;
    private BigDecimal decimalField73;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField88;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public GamingAuditV1() {}

    public GamingAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField9() {
        return tinyIntField9;
    }

    public void setTinyIntField9(Byte tinyIntField9) {
        this.tinyIntField9 = tinyIntField9;
    }

    public Short getSmallIntField26() {
        return smallIntField26;
    }

    public void setSmallIntField26(Short smallIntField26) {
        this.smallIntField26 = smallIntField26;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField40() {
        return bigIntField40;
    }

    public void setBigIntField40(Long bigIntField40) {
        this.bigIntField40 = bigIntField40;
    }

    public BigDecimal getDecimalField73() {
        return decimalField73;
    }

    public void setDecimalField73(BigDecimal decimalField73) {
        this.decimalField73 = decimalField73;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField23() {
        return floatField23;
    }

    public void setFloatField23(Float floatField23) {
        this.floatField23 = floatField23;
    }

    public Double getDoubleField88() {
        return doubleField88;
    }

    public void setDoubleField88(Double doubleField88) {
        this.doubleField88 = doubleField88;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
