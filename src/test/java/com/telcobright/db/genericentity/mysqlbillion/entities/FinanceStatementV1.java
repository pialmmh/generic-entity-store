package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceStatementV1 implements Serializable {
    private static final long serialVersionUID = 60L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField27;
    private Integer intField58;
    private Long bigIntField30;
    private BigDecimal decimalField86;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField80;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public FinanceStatementV1() {}

    public FinanceStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField75() {
        return tinyIntField75;
    }

    public void setTinyIntField75(Byte tinyIntField75) {
        this.tinyIntField75 = tinyIntField75;
    }

    public Short getSmallIntField27() {
        return smallIntField27;
    }

    public void setSmallIntField27(Short smallIntField27) {
        this.smallIntField27 = smallIntField27;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField30() {
        return bigIntField30;
    }

    public void setBigIntField30(Long bigIntField30) {
        this.bigIntField30 = bigIntField30;
    }

    public BigDecimal getDecimalField86() {
        return decimalField86;
    }

    public void setDecimalField86(BigDecimal decimalField86) {
        this.decimalField86 = decimalField86;
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
