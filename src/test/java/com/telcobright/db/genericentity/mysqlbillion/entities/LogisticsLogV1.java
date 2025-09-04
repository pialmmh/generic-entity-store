package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsLogV1 implements Serializable {
    private static final long serialVersionUID = 273L;

    private Long id;
    private Byte tinyIntField35;
    private Short smallIntField9;
    private Integer intField92;
    private Long bigIntField19;
    private BigDecimal decimalField96;
    private BigDecimal priceField;
    private Float floatField33;
    private Double doubleField38;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public LogisticsLogV1() {}

    public LogisticsLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField35() {
        return tinyIntField35;
    }

    public void setTinyIntField35(Byte tinyIntField35) {
        this.tinyIntField35 = tinyIntField35;
    }

    public Short getSmallIntField9() {
        return smallIntField9;
    }

    public void setSmallIntField9(Short smallIntField9) {
        this.smallIntField9 = smallIntField9;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField19() {
        return bigIntField19;
    }

    public void setBigIntField19(Long bigIntField19) {
        this.bigIntField19 = bigIntField19;
    }

    public BigDecimal getDecimalField96() {
        return decimalField96;
    }

    public void setDecimalField96(BigDecimal decimalField96) {
        this.decimalField96 = decimalField96;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField33() {
        return floatField33;
    }

    public void setFloatField33(Float floatField33) {
        this.floatField33 = floatField33;
    }

    public Double getDoubleField38() {
        return doubleField38;
    }

    public void setDoubleField38(Double doubleField38) {
        this.doubleField38 = doubleField38;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
