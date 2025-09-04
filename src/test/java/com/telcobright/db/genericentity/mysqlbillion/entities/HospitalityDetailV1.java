package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityDetailV1 implements Serializable {
    private static final long serialVersionUID = 1200L;

    private Long id;
    private Byte tinyIntField61;
    private Short smallIntField77;
    private Integer intField14;
    private Long bigIntField57;
    private BigDecimal decimalField12;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField54;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HospitalityDetailV1() {}

    public HospitalityDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField61() {
        return tinyIntField61;
    }

    public void setTinyIntField61(Byte tinyIntField61) {
        this.tinyIntField61 = tinyIntField61;
    }

    public Short getSmallIntField77() {
        return smallIntField77;
    }

    public void setSmallIntField77(Short smallIntField77) {
        this.smallIntField77 = smallIntField77;
    }

    public Integer getIntField14() {
        return intField14;
    }

    public void setIntField14(Integer intField14) {
        this.intField14 = intField14;
    }

    public Long getBigIntField57() {
        return bigIntField57;
    }

    public void setBigIntField57(Long bigIntField57) {
        this.bigIntField57 = bigIntField57;
    }

    public BigDecimal getDecimalField12() {
        return decimalField12;
    }

    public void setDecimalField12(BigDecimal decimalField12) {
        this.decimalField12 = decimalField12;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField54() {
        return doubleField54;
    }

    public void setDoubleField54(Double doubleField54) {
        this.doubleField54 = doubleField54;
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
