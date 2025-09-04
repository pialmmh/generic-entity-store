package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyPaymentV1 implements Serializable {
    private static final long serialVersionUID = 1110L;

    private Long id;
    private Byte tinyIntField0;
    private Short smallIntField66;
    private Integer intField86;
    private Long bigIntField3;
    private BigDecimal decimalField63;
    private BigDecimal priceField;
    private Float floatField75;
    private Double doubleField82;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EnergyPaymentV1() {}

    public EnergyPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField0() {
        return tinyIntField0;
    }

    public void setTinyIntField0(Byte tinyIntField0) {
        this.tinyIntField0 = tinyIntField0;
    }

    public Short getSmallIntField66() {
        return smallIntField66;
    }

    public void setSmallIntField66(Short smallIntField66) {
        this.smallIntField66 = smallIntField66;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField3() {
        return bigIntField3;
    }

    public void setBigIntField3(Long bigIntField3) {
        this.bigIntField3 = bigIntField3;
    }

    public BigDecimal getDecimalField63() {
        return decimalField63;
    }

    public void setDecimalField63(BigDecimal decimalField63) {
        this.decimalField63 = decimalField63;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField75() {
        return floatField75;
    }

    public void setFloatField75(Float floatField75) {
        this.floatField75 = floatField75;
    }

    public Double getDoubleField82() {
        return doubleField82;
    }

    public void setDoubleField82(Double doubleField82) {
        this.doubleField82 = doubleField82;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
