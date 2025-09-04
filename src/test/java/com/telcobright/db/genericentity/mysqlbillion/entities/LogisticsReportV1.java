package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsReportV1 implements Serializable {
    private static final long serialVersionUID = 291L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField32;
    private Integer intField64;
    private Long bigIntField79;
    private BigDecimal decimalField56;
    private BigDecimal priceField;
    private Float floatField11;
    private Double doubleField90;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public LogisticsReportV1() {}

    public LogisticsReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField11() {
        return tinyIntField11;
    }

    public void setTinyIntField11(Byte tinyIntField11) {
        this.tinyIntField11 = tinyIntField11;
    }

    public Short getSmallIntField32() {
        return smallIntField32;
    }

    public void setSmallIntField32(Short smallIntField32) {
        this.smallIntField32 = smallIntField32;
    }

    public Integer getIntField64() {
        return intField64;
    }

    public void setIntField64(Integer intField64) {
        this.intField64 = intField64;
    }

    public Long getBigIntField79() {
        return bigIntField79;
    }

    public void setBigIntField79(Long bigIntField79) {
        this.bigIntField79 = bigIntField79;
    }

    public BigDecimal getDecimalField56() {
        return decimalField56;
    }

    public void setDecimalField56(BigDecimal decimalField56) {
        this.decimalField56 = decimalField56;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField11() {
        return floatField11;
    }

    public void setFloatField11(Float floatField11) {
        this.floatField11 = floatField11;
    }

    public Double getDoubleField90() {
        return doubleField90;
    }

    public void setDoubleField90(Double doubleField90) {
        this.doubleField90 = doubleField90;
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
