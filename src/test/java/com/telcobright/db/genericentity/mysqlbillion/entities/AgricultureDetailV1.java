package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class AgricultureDetailV1 implements Serializable {
    private static final long serialVersionUID = 1134L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField73;
    private Integer intField97;
    private Long bigIntField17;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField61;
    private Double doubleField59;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public AgricultureDetailV1() {}

    public AgricultureDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField73() {
        return smallIntField73;
    }

    public void setSmallIntField73(Short smallIntField73) {
        this.smallIntField73 = smallIntField73;
    }

    public Integer getIntField97() {
        return intField97;
    }

    public void setIntField97(Integer intField97) {
        this.intField97 = intField97;
    }

    public Long getBigIntField17() {
        return bigIntField17;
    }

    public void setBigIntField17(Long bigIntField17) {
        this.bigIntField17 = bigIntField17;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField61() {
        return floatField61;
    }

    public void setFloatField61(Float floatField61) {
        this.floatField61 = floatField61;
    }

    public Double getDoubleField59() {
        return doubleField59;
    }

    public void setDoubleField59(Double doubleField59) {
        this.doubleField59 = doubleField59;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
