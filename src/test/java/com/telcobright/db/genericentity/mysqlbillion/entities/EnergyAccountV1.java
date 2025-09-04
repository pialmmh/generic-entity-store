package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergyAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergyAccountV1 implements Serializable {
    private static final long serialVersionUID = 1095L;

    private Long id;
    private Byte tinyIntField35;
    private Short smallIntField22;
    private Integer intField59;
    private Long bigIntField66;
    private BigDecimal decimalField12;
    private BigDecimal priceField;
    private Float floatField85;
    private Double doubleField55;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EnergyAccountV1() {}

    public EnergyAccountV1(Long id, String code, String name) {
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

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField66() {
        return bigIntField66;
    }

    public void setBigIntField66(Long bigIntField66) {
        this.bigIntField66 = bigIntField66;
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

    public Float getFloatField85() {
        return floatField85;
    }

    public void setFloatField85(Float floatField85) {
        this.floatField85 = floatField85;
    }

    public Double getDoubleField55() {
        return doubleField55;
    }

    public void setDoubleField55(Double doubleField55) {
        this.doubleField55 = doubleField55;
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
