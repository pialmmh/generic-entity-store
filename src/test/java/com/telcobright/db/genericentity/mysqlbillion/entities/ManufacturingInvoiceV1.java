package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 246L;

    private Long id;
    private Byte tinyIntField84;
    private Short smallIntField77;
    private Integer intField57;
    private Long bigIntField87;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField39;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public ManufacturingInvoiceV1() {}

    public ManufacturingInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField84() {
        return tinyIntField84;
    }

    public void setTinyIntField84(Byte tinyIntField84) {
        this.tinyIntField84 = tinyIntField84;
    }

    public Short getSmallIntField77() {
        return smallIntField77;
    }

    public void setSmallIntField77(Short smallIntField77) {
        this.smallIntField77 = smallIntField77;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
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

    public Double getDoubleField39() {
        return doubleField39;
    }

    public void setDoubleField39(Double doubleField39) {
        this.doubleField39 = doubleField39;
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

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
