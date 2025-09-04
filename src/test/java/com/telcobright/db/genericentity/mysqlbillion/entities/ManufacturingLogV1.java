package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingLogV1 implements Serializable {
    private static final long serialVersionUID = 207L;

    private Long id;
    private Byte tinyIntField5;
    private Short smallIntField57;
    private Integer intField74;
    private Long bigIntField31;
    private BigDecimal decimalField37;
    private BigDecimal priceField;
    private Float floatField69;
    private Double doubleField43;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public ManufacturingLogV1() {}

    public ManufacturingLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField5() {
        return tinyIntField5;
    }

    public void setTinyIntField5(Byte tinyIntField5) {
        this.tinyIntField5 = tinyIntField5;
    }

    public Short getSmallIntField57() {
        return smallIntField57;
    }

    public void setSmallIntField57(Short smallIntField57) {
        this.smallIntField57 = smallIntField57;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField31() {
        return bigIntField31;
    }

    public void setBigIntField31(Long bigIntField31) {
        this.bigIntField31 = bigIntField31;
    }

    public BigDecimal getDecimalField37() {
        return decimalField37;
    }

    public void setDecimalField37(BigDecimal decimalField37) {
        this.decimalField37 = decimalField37;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField69() {
        return floatField69;
    }

    public void setFloatField69(Float floatField69) {
        this.floatField69 = floatField69;
    }

    public Double getDoubleField43() {
        return doubleField43;
    }

    public void setDoubleField43(Double doubleField43) {
        this.doubleField43 = doubleField43;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
