package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsAuditV1 implements Serializable {
    private static final long serialVersionUID = 1278L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField28;
    private Integer intField68;
    private Long bigIntField48;
    private BigDecimal decimalField44;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField96;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public SportsAuditV1() {}

    public SportsAuditV1(Long id, String code, String name) {
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

    public Short getSmallIntField28() {
        return smallIntField28;
    }

    public void setSmallIntField28(Short smallIntField28) {
        this.smallIntField28 = smallIntField28;
    }

    public Integer getIntField68() {
        return intField68;
    }

    public void setIntField68(Integer intField68) {
        this.intField68 = intField68;
    }

    public Long getBigIntField48() {
        return bigIntField48;
    }

    public void setBigIntField48(Long bigIntField48) {
        this.bigIntField48 = bigIntField48;
    }

    public BigDecimal getDecimalField44() {
        return decimalField44;
    }

    public void setDecimalField44(BigDecimal decimalField44) {
        this.decimalField44 = decimalField44;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField20() {
        return floatField20;
    }

    public void setFloatField20(Float floatField20) {
        this.floatField20 = floatField20;
    }

    public Double getDoubleField96() {
        return doubleField96;
    }

    public void setDoubleField96(Double doubleField96) {
        this.doubleField96 = doubleField96;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
