package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceAuditV1 implements Serializable {
    private static final long serialVersionUID = 684L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField83;
    private Integer intField40;
    private Long bigIntField95;
    private BigDecimal decimalField92;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField10;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceAuditV1() {}

    public EcommerceAuditV1(Long id, String code, String name) {
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

    public Short getSmallIntField83() {
        return smallIntField83;
    }

    public void setSmallIntField83(Short smallIntField83) {
        this.smallIntField83 = smallIntField83;
    }

    public Integer getIntField40() {
        return intField40;
    }

    public void setIntField40(Integer intField40) {
        this.intField40 = intField40;
    }

    public Long getBigIntField95() {
        return bigIntField95;
    }

    public void setBigIntField95(Long bigIntField95) {
        this.bigIntField95 = bigIntField95;
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

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
    }

    public Double getDoubleField10() {
        return doubleField10;
    }

    public void setDoubleField10(Double doubleField10) {
        this.doubleField10 = doubleField10;
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
