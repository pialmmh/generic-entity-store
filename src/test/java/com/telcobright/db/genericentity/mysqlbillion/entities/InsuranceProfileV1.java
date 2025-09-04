package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceProfileV1 implements Serializable {
    private static final long serialVersionUID = 564L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField89;
    private Integer intField12;
    private Long bigIntField48;
    private BigDecimal decimalField73;
    private BigDecimal priceField;
    private Float floatField36;
    private Double doubleField74;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public InsuranceProfileV1() {}

    public InsuranceProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField52() {
        return tinyIntField52;
    }

    public void setTinyIntField52(Byte tinyIntField52) {
        this.tinyIntField52 = tinyIntField52;
    }

    public Short getSmallIntField89() {
        return smallIntField89;
    }

    public void setSmallIntField89(Short smallIntField89) {
        this.smallIntField89 = smallIntField89;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField48() {
        return bigIntField48;
    }

    public void setBigIntField48(Long bigIntField48) {
        this.bigIntField48 = bigIntField48;
    }

    public BigDecimal getDecimalField73() {
        return decimalField73;
    }

    public void setDecimalField73(BigDecimal decimalField73) {
        this.decimalField73 = decimalField73;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField36() {
        return floatField36;
    }

    public void setFloatField36(Float floatField36) {
        this.floatField36 = floatField36;
    }

    public Double getDoubleField74() {
        return doubleField74;
    }

    public void setDoubleField74(Double doubleField74) {
        this.doubleField74 = doubleField74;
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

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
