package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: BankingInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 642L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField12;
    private Integer intField20;
    private Long bigIntField36;
    private BigDecimal decimalField32;
    private BigDecimal priceField;
    private Float floatField92;
    private Double doubleField57;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public BankingInvoiceV1() {}

    public BankingInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField12() {
        return smallIntField12;
    }

    public void setSmallIntField12(Short smallIntField12) {
        this.smallIntField12 = smallIntField12;
    }

    public Integer getIntField20() {
        return intField20;
    }

    public void setIntField20(Integer intField20) {
        this.intField20 = intField20;
    }

    public Long getBigIntField36() {
        return bigIntField36;
    }

    public void setBigIntField36(Long bigIntField36) {
        this.bigIntField36 = bigIntField36;
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

    public Float getFloatField92() {
        return floatField92;
    }

    public void setFloatField92(Float floatField92) {
        this.floatField92 = floatField92;
    }

    public Double getDoubleField57() {
        return doubleField57;
    }

    public void setDoubleField57(Double doubleField57) {
        this.doubleField57 = doubleField57;
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
