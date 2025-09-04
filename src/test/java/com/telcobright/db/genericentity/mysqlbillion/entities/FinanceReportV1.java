package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceReportV1 implements Serializable {
    private static final long serialVersionUID = 27L;

    private Long id;
    private Byte tinyIntField30;
    private Short smallIntField52;
    private Integer intField57;
    private Long bigIntField58;
    private BigDecimal decimalField71;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField10;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public FinanceReportV1() {}

    public FinanceReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField30() {
        return tinyIntField30;
    }

    public void setTinyIntField30(Byte tinyIntField30) {
        this.tinyIntField30 = tinyIntField30;
    }

    public Short getSmallIntField52() {
        return smallIntField52;
    }

    public void setSmallIntField52(Short smallIntField52) {
        this.smallIntField52 = smallIntField52;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField58() {
        return bigIntField58;
    }

    public void setBigIntField58(Long bigIntField58) {
        this.bigIntField58 = bigIntField58;
    }

    public BigDecimal getDecimalField71() {
        return decimalField71;
    }

    public void setDecimalField71(BigDecimal decimalField71) {
        this.decimalField71 = decimalField71;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField10() {
        return doubleField10;
    }

    public void setDoubleField10(Double doubleField10) {
        this.doubleField10 = doubleField10;
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
