package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingRecordV1 implements Serializable {
    private static final long serialVersionUID = 201L;

    private Long id;
    private Byte tinyIntField54;
    private Short smallIntField81;
    private Integer intField85;
    private Long bigIntField99;
    private BigDecimal decimalField11;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField57;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public ManufacturingRecordV1() {}

    public ManufacturingRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField54() {
        return tinyIntField54;
    }

    public void setTinyIntField54(Byte tinyIntField54) {
        this.tinyIntField54 = tinyIntField54;
    }

    public Short getSmallIntField81() {
        return smallIntField81;
    }

    public void setSmallIntField81(Short smallIntField81) {
        this.smallIntField81 = smallIntField81;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField99() {
        return bigIntField99;
    }

    public void setBigIntField99(Long bigIntField99) {
        this.bigIntField99 = bigIntField99;
    }

    public BigDecimal getDecimalField11() {
        return decimalField11;
    }

    public void setDecimalField11(BigDecimal decimalField11) {
        this.decimalField11 = decimalField11;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField18() {
        return floatField18;
    }

    public void setFloatField18(Float floatField18) {
        this.floatField18 = floatField18;
    }

    public Double getDoubleField57() {
        return doubleField57;
    }

    public void setDoubleField57(Double doubleField57) {
        this.doubleField57 = doubleField57;
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
