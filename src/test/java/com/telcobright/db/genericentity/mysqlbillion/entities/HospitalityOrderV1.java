package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityOrderV1 implements Serializable {
    private static final long serialVersionUID = 1239L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField25;
    private Integer intField78;
    private Long bigIntField97;
    private BigDecimal decimalField2;
    private BigDecimal priceField;
    private Float floatField45;
    private Double doubleField91;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityOrderV1() {}

    public HospitalityOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField78() {
        return intField78;
    }

    public void setIntField78(Integer intField78) {
        this.intField78 = intField78;
    }

    public Long getBigIntField97() {
        return bigIntField97;
    }

    public void setBigIntField97(Long bigIntField97) {
        this.bigIntField97 = bigIntField97;
    }

    public BigDecimal getDecimalField2() {
        return decimalField2;
    }

    public void setDecimalField2(BigDecimal decimalField2) {
        this.decimalField2 = decimalField2;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField45() {
        return floatField45;
    }

    public void setFloatField45(Float floatField45) {
        this.floatField45 = floatField45;
    }

    public Double getDoubleField91() {
        return doubleField91;
    }

    public void setDoubleField91(Double doubleField91) {
        this.doubleField91 = doubleField91;
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
