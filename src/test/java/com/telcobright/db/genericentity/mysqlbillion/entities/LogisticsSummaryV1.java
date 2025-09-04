package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsSummaryV1 implements Serializable {
    private static final long serialVersionUID = 279L;

    private Long id;
    private Byte tinyIntField87;
    private Short smallIntField37;
    private Integer intField29;
    private Long bigIntField51;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField83;
    private Double doubleField24;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public LogisticsSummaryV1() {}

    public LogisticsSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField87() {
        return tinyIntField87;
    }

    public void setTinyIntField87(Byte tinyIntField87) {
        this.tinyIntField87 = tinyIntField87;
    }

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField51() {
        return bigIntField51;
    }

    public void setBigIntField51(Long bigIntField51) {
        this.bigIntField51 = bigIntField51;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField83() {
        return floatField83;
    }

    public void setFloatField83(Float floatField83) {
        this.floatField83 = floatField83;
    }

    public Double getDoubleField24() {
        return doubleField24;
    }

    public void setDoubleField24(Double doubleField24) {
        this.doubleField24 = doubleField24;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
