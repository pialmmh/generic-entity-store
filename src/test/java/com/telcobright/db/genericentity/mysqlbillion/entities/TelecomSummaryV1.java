package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomSummaryV1 implements Serializable {
    private static final long serialVersionUID = 477L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField6;
    private Integer intField56;
    private Long bigIntField17;
    private BigDecimal decimalField6;
    private BigDecimal priceField;
    private Float floatField0;
    private Double doubleField80;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TelecomSummaryV1() {}

    public TelecomSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField6() {
        return smallIntField6;
    }

    public void setSmallIntField6(Short smallIntField6) {
        this.smallIntField6 = smallIntField6;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField17() {
        return bigIntField17;
    }

    public void setBigIntField17(Long bigIntField17) {
        this.bigIntField17 = bigIntField17;
    }

    public BigDecimal getDecimalField6() {
        return decimalField6;
    }

    public void setDecimalField6(BigDecimal decimalField6) {
        this.decimalField6 = decimalField6;
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

    public Double getDoubleField80() {
        return doubleField80;
    }

    public void setDoubleField80(Double doubleField80) {
        this.doubleField80 = doubleField80;
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
