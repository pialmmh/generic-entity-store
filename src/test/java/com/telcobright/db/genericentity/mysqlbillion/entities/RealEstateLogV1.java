package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateLogV1 implements Serializable {
    private static final long serialVersionUID = 999L;

    private Long id;
    private Byte tinyIntField59;
    private Short smallIntField91;
    private Integer intField31;
    private Long bigIntField47;
    private BigDecimal decimalField52;
    private BigDecimal priceField;
    private Float floatField45;
    private Double doubleField78;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RealEstateLogV1() {}

    public RealEstateLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField59() {
        return tinyIntField59;
    }

    public void setTinyIntField59(Byte tinyIntField59) {
        this.tinyIntField59 = tinyIntField59;
    }

    public Short getSmallIntField91() {
        return smallIntField91;
    }

    public void setSmallIntField91(Short smallIntField91) {
        this.smallIntField91 = smallIntField91;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField47() {
        return bigIntField47;
    }

    public void setBigIntField47(Long bigIntField47) {
        this.bigIntField47 = bigIntField47;
    }

    public BigDecimal getDecimalField52() {
        return decimalField52;
    }

    public void setDecimalField52(BigDecimal decimalField52) {
        this.decimalField52 = decimalField52;
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

    public Double getDoubleField78() {
        return doubleField78;
    }

    public void setDoubleField78(Double doubleField78) {
        this.doubleField78 = doubleField78;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
