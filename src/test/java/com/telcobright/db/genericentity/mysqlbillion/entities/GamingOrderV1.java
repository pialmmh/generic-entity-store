package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingOrderV1 implements Serializable {
    private static final long serialVersionUID = 843L;

    private Long id;
    private Byte tinyIntField14;
    private Short smallIntField93;
    private Integer intField76;
    private Long bigIntField88;
    private BigDecimal decimalField28;
    private BigDecimal priceField;
    private Float floatField58;
    private Double doubleField23;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GamingOrderV1() {}

    public GamingOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField14() {
        return tinyIntField14;
    }

    public void setTinyIntField14(Byte tinyIntField14) {
        this.tinyIntField14 = tinyIntField14;
    }

    public Short getSmallIntField93() {
        return smallIntField93;
    }

    public void setSmallIntField93(Short smallIntField93) {
        this.smallIntField93 = smallIntField93;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField28() {
        return decimalField28;
    }

    public void setDecimalField28(BigDecimal decimalField28) {
        this.decimalField28 = decimalField28;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField58() {
        return floatField58;
    }

    public void setFloatField58(Float floatField58) {
        this.floatField58 = floatField58;
    }

    public Double getDoubleField23() {
        return doubleField23;
    }

    public void setDoubleField23(Double doubleField23) {
        this.doubleField23 = doubleField23;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
