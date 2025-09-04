package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityMetricV1 implements Serializable {
    private static final long serialVersionUID = 1218L;

    private Long id;
    private Byte tinyIntField36;
    private Short smallIntField48;
    private Integer intField87;
    private Long bigIntField17;
    private BigDecimal decimalField72;
    private BigDecimal priceField;
    private Float floatField51;
    private Double doubleField7;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityMetricV1() {}

    public HospitalityMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField36() {
        return tinyIntField36;
    }

    public void setTinyIntField36(Byte tinyIntField36) {
        this.tinyIntField36 = tinyIntField36;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField87() {
        return intField87;
    }

    public void setIntField87(Integer intField87) {
        this.intField87 = intField87;
    }

    public Long getBigIntField17() {
        return bigIntField17;
    }

    public void setBigIntField17(Long bigIntField17) {
        this.bigIntField17 = bigIntField17;
    }

    public BigDecimal getDecimalField72() {
        return decimalField72;
    }

    public void setDecimalField72(BigDecimal decimalField72) {
        this.decimalField72 = decimalField72;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField51() {
        return floatField51;
    }

    public void setFloatField51(Float floatField51) {
        this.floatField51 = floatField51;
    }

    public Double getDoubleField7() {
        return doubleField7;
    }

    public void setDoubleField7(Double doubleField7) {
        this.doubleField7 = doubleField7;
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
