package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureEntryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureEntryV1 implements Serializable {
    private static final long serialVersionUID = 1128L;

    private Long id;
    private Byte tinyIntField80;
    private Short smallIntField97;
    private Integer intField59;
    private Long bigIntField37;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField73;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public AgricultureEntryV1() {}

    public AgricultureEntryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField80() {
        return tinyIntField80;
    }

    public void setTinyIntField80(Byte tinyIntField80) {
        this.tinyIntField80 = tinyIntField80;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField27() {
        return decimalField27;
    }

    public void setDecimalField27(BigDecimal decimalField27) {
        this.decimalField27 = decimalField27;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField73() {
        return doubleField73;
    }

    public void setDoubleField73(Double doubleField73) {
        this.doubleField73 = doubleField73;
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

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
