package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceArchiveV1 implements Serializable {
    private static final long serialVersionUID = 681L;

    private Long id;
    private Byte tinyIntField18;
    private Short smallIntField19;
    private Integer intField85;
    private Long bigIntField50;
    private BigDecimal decimalField79;
    private BigDecimal priceField;
    private Float floatField69;
    private Double doubleField34;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EcommerceArchiveV1() {}

    public EcommerceArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField18() {
        return tinyIntField18;
    }

    public void setTinyIntField18(Byte tinyIntField18) {
        this.tinyIntField18 = tinyIntField18;
    }

    public Short getSmallIntField19() {
        return smallIntField19;
    }

    public void setSmallIntField19(Short smallIntField19) {
        this.smallIntField19 = smallIntField19;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField50() {
        return bigIntField50;
    }

    public void setBigIntField50(Long bigIntField50) {
        this.bigIntField50 = bigIntField50;
    }

    public BigDecimal getDecimalField79() {
        return decimalField79;
    }

    public void setDecimalField79(BigDecimal decimalField79) {
        this.decimalField79 = decimalField79;
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

    public Double getDoubleField34() {
        return doubleField34;
    }

    public void setDoubleField34(Double doubleField34) {
        this.doubleField34 = doubleField34;
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
