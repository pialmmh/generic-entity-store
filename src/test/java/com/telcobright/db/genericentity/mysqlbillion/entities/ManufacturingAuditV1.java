package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingAuditV1 implements Serializable {
    private static final long serialVersionUID = 222L;

    private Long id;
    private Byte tinyIntField71;
    private Short smallIntField1;
    private Integer intField2;
    private Long bigIntField68;
    private BigDecimal decimalField36;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField70;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public ManufacturingAuditV1() {}

    public ManufacturingAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField71() {
        return tinyIntField71;
    }

    public void setTinyIntField71(Byte tinyIntField71) {
        this.tinyIntField71 = tinyIntField71;
    }

    public Short getSmallIntField1() {
        return smallIntField1;
    }

    public void setSmallIntField1(Short smallIntField1) {
        this.smallIntField1 = smallIntField1;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField68() {
        return bigIntField68;
    }

    public void setBigIntField68(Long bigIntField68) {
        this.bigIntField68 = bigIntField68;
    }

    public BigDecimal getDecimalField36() {
        return decimalField36;
    }

    public void setDecimalField36(BigDecimal decimalField36) {
        this.decimalField36 = decimalField36;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField70() {
        return doubleField70;
    }

    public void setDoubleField70(Double doubleField70) {
        this.doubleField70 = doubleField70;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
