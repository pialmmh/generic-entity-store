package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationDetailV1 implements Serializable {
    private static final long serialVersionUID = 342L;

    private Long id;
    private Byte tinyIntField96;
    private Short smallIntField64;
    private Integer intField74;
    private Long bigIntField21;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField97;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationDetailV1() {}

    public EducationDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField96() {
        return tinyIntField96;
    }

    public void setTinyIntField96(Byte tinyIntField96) {
        this.tinyIntField96 = tinyIntField96;
    }

    public Short getSmallIntField64() {
        return smallIntField64;
    }

    public void setSmallIntField64(Short smallIntField64) {
        this.smallIntField64 = smallIntField64;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField21() {
        return bigIntField21;
    }

    public void setBigIntField21(Long bigIntField21) {
        this.bigIntField21 = bigIntField21;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField23() {
        return floatField23;
    }

    public void setFloatField23(Float floatField23) {
        this.floatField23 = floatField23;
    }

    public Double getDoubleField97() {
        return doubleField97;
    }

    public void setDoubleField97(Double doubleField97) {
        this.doubleField97 = doubleField97;
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
