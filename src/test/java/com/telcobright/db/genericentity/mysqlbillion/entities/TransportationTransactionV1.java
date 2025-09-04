package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationTransactionV1 implements Serializable {
    private static final long serialVersionUID = 924L;

    private Long id;
    private Byte tinyIntField28;
    private Short smallIntField25;
    private Integer intField29;
    private Long bigIntField8;
    private BigDecimal decimalField10;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField5;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TransportationTransactionV1() {}

    public TransportationTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField28() {
        return tinyIntField28;
    }

    public void setTinyIntField28(Byte tinyIntField28) {
        this.tinyIntField28 = tinyIntField28;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField8() {
        return bigIntField8;
    }

    public void setBigIntField8(Long bigIntField8) {
        this.bigIntField8 = bigIntField8;
    }

    public BigDecimal getDecimalField10() {
        return decimalField10;
    }

    public void setDecimalField10(BigDecimal decimalField10) {
        this.decimalField10 = decimalField10;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
