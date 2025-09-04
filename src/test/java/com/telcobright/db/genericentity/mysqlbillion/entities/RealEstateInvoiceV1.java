package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 1038L;

    private Long id;
    private Byte tinyIntField78;
    private Short smallIntField27;
    private Integer intField78;
    private Long bigIntField87;
    private BigDecimal decimalField82;
    private BigDecimal priceField;
    private Float floatField0;
    private Double doubleField34;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RealEstateInvoiceV1() {}

    public RealEstateInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField78() {
        return tinyIntField78;
    }

    public void setTinyIntField78(Byte tinyIntField78) {
        this.tinyIntField78 = tinyIntField78;
    }

    public Short getSmallIntField27() {
        return smallIntField27;
    }

    public void setSmallIntField27(Short smallIntField27) {
        this.smallIntField27 = smallIntField27;
    }

    public Integer getIntField78() {
        return intField78;
    }

    public void setIntField78(Integer intField78) {
        this.intField78 = intField78;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
    }

    public BigDecimal getDecimalField82() {
        return decimalField82;
    }

    public void setDecimalField82(BigDecimal decimalField82) {
        this.decimalField82 = decimalField82;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField0() {
        return floatField0;
    }

    public void setFloatField0(Float floatField0) {
        this.floatField0 = floatField0;
    }

    public Double getDoubleField34() {
        return doubleField34;
    }

    public void setDoubleField34(Double doubleField34) {
        this.doubleField34 = doubleField34;
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
