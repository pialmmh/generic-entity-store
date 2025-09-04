package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityReportV1 implements Serializable {
    private static final long serialVersionUID = 1215L;

    private Long id;
    private Byte tinyIntField42;
    private Short smallIntField1;
    private Integer intField23;
    private Long bigIntField77;
    private BigDecimal decimalField35;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField22;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public HospitalityReportV1() {}

    public HospitalityReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField42() {
        return tinyIntField42;
    }

    public void setTinyIntField42(Byte tinyIntField42) {
        this.tinyIntField42 = tinyIntField42;
    }

    public Short getSmallIntField1() {
        return smallIntField1;
    }

    public void setSmallIntField1(Short smallIntField1) {
        this.smallIntField1 = smallIntField1;
    }

    public Integer getIntField23() {
        return intField23;
    }

    public void setIntField23(Integer intField23) {
        this.intField23 = intField23;
    }

    public Long getBigIntField77() {
        return bigIntField77;
    }

    public void setBigIntField77(Long bigIntField77) {
        this.bigIntField77 = bigIntField77;
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

    public Float getFloatField80() {
        return floatField80;
    }

    public void setFloatField80(Float floatField80) {
        this.floatField80 = floatField80;
    }

    public Double getDoubleField22() {
        return doubleField22;
    }

    public void setDoubleField22(Double doubleField22) {
        this.doubleField22 = doubleField22;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
