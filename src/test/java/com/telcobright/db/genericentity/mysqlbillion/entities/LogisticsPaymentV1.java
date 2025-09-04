package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsPaymentV1 implements Serializable {
    private static final long serialVersionUID = 318L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField89;
    private Integer intField19;
    private Long bigIntField1;
    private BigDecimal decimalField64;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField28;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public LogisticsPaymentV1() {}

    public LogisticsPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField83() {
        return tinyIntField83;
    }

    public void setTinyIntField83(Byte tinyIntField83) {
        this.tinyIntField83 = tinyIntField83;
    }

    public Short getSmallIntField89() {
        return smallIntField89;
    }

    public void setSmallIntField89(Short smallIntField89) {
        this.smallIntField89 = smallIntField89;
    }

    public Integer getIntField19() {
        return intField19;
    }

    public void setIntField19(Integer intField19) {
        this.intField19 = intField19;
    }

    public Long getBigIntField1() {
        return bigIntField1;
    }

    public void setBigIntField1(Long bigIntField1) {
        this.bigIntField1 = bigIntField1;
    }

    public BigDecimal getDecimalField64() {
        return decimalField64;
    }

    public void setDecimalField64(BigDecimal decimalField64) {
        this.decimalField64 = decimalField64;
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

    public Double getDoubleField28() {
        return doubleField28;
    }

    public void setDoubleField28(Double doubleField28) {
        this.doubleField28 = doubleField28;
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
