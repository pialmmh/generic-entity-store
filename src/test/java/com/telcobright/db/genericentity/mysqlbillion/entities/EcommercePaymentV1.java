package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommercePaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommercePaymentV1 implements Serializable {
    private static final long serialVersionUID = 714L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField35;
    private Integer intField84;
    private Long bigIntField46;
    private BigDecimal decimalField37;
    private BigDecimal priceField;
    private Float floatField37;
    private Double doubleField13;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EcommercePaymentV1() {}

    public EcommercePaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField59() {
        return tinyIntField59;
    }

    public void setTinyIntField59(Byte tinyIntField59) {
        this.tinyIntField59 = tinyIntField59;
    }

    public Short getSmallIntField35() {
        return smallIntField35;
    }

    public void setSmallIntField35(Short smallIntField35) {
        this.smallIntField35 = smallIntField35;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField46() {
        return bigIntField46;
    }

    public void setBigIntField46(Long bigIntField46) {
        this.bigIntField46 = bigIntField46;
    }

    public BigDecimal getDecimalField37() {
        return decimalField37;
    }

    public void setDecimalField37(BigDecimal decimalField37) {
        this.decimalField37 = decimalField37;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField37() {
        return floatField37;
    }

    public void setFloatField37(Float floatField37) {
        this.floatField37 = floatField37;
    }

    public Double getDoubleField13() {
        return doubleField13;
    }

    public void setDoubleField13(Double doubleField13) {
        this.doubleField13 = doubleField13;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
