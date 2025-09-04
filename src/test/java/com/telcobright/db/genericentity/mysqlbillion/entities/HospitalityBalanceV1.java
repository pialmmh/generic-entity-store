package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityBalanceV1 implements Serializable {
    private static final long serialVersionUID = 1251L;

    private Long id;
    private Byte tinyIntField80;
    private Short smallIntField20;
    private Integer intField13;
    private Long bigIntField25;
    private BigDecimal decimalField35;
    private BigDecimal priceField;
    private Float floatField72;
    private Double doubleField58;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HospitalityBalanceV1() {}

    public HospitalityBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField80() {
        return tinyIntField80;
    }

    public void setTinyIntField80(Byte tinyIntField80) {
        this.tinyIntField80 = tinyIntField80;
    }

    public Short getSmallIntField20() {
        return smallIntField20;
    }

    public void setSmallIntField20(Short smallIntField20) {
        this.smallIntField20 = smallIntField20;
    }

    public Integer getIntField13() {
        return intField13;
    }

    public void setIntField13(Integer intField13) {
        this.intField13 = intField13;
    }

    public Long getBigIntField25() {
        return bigIntField25;
    }

    public void setBigIntField25(Long bigIntField25) {
        this.bigIntField25 = bigIntField25;
    }

    public BigDecimal getDecimalField35() {
        return decimalField35;
    }

    public void setDecimalField35(BigDecimal decimalField35) {
        this.decimalField35 = decimalField35;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField72() {
        return floatField72;
    }

    public void setFloatField72(Float floatField72) {
        this.floatField72 = floatField72;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
