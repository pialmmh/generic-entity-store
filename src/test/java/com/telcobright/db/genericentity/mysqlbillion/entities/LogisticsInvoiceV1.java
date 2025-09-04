package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 312L;

    private Long id;
    private Byte tinyIntField32;
    private Short smallIntField13;
    private Integer intField30;
    private Long bigIntField70;
    private BigDecimal decimalField38;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField94;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public LogisticsInvoiceV1() {}

    public LogisticsInvoiceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField32() {
        return tinyIntField32;
    }

    public void setTinyIntField32(Byte tinyIntField32) {
        this.tinyIntField32 = tinyIntField32;
    }

    public Short getSmallIntField13() {
        return smallIntField13;
    }

    public void setSmallIntField13(Short smallIntField13) {
        this.smallIntField13 = smallIntField13;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField70() {
        return bigIntField70;
    }

    public void setBigIntField70(Long bigIntField70) {
        this.bigIntField70 = bigIntField70;
    }

    public BigDecimal getDecimalField38() {
        return decimalField38;
    }

    public void setDecimalField38(BigDecimal decimalField38) {
        this.decimalField38 = decimalField38;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField57() {
        return floatField57;
    }

    public void setFloatField57(Float floatField57) {
        this.floatField57 = floatField57;
    }

    public Double getDoubleField94() {
        return doubleField94;
    }

    public void setDoubleField94(Double doubleField94) {
        this.doubleField94 = doubleField94;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
