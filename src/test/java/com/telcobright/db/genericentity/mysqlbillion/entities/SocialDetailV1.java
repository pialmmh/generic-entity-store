package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialDetailV1 implements Serializable {
    private static final long serialVersionUID = 738L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField10;
    private Integer intField39;
    private Long bigIntField66;
    private BigDecimal decimalField56;
    private BigDecimal priceField;
    private Float floatField1;
    private Double doubleField82;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public SocialDetailV1() {}

    public SocialDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField10() {
        return smallIntField10;
    }

    public void setSmallIntField10(Short smallIntField10) {
        this.smallIntField10 = smallIntField10;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField66() {
        return bigIntField66;
    }

    public void setBigIntField66(Long bigIntField66) {
        this.bigIntField66 = bigIntField66;
    }

    public BigDecimal getDecimalField56() {
        return decimalField56;
    }

    public void setDecimalField56(BigDecimal decimalField56) {
        this.decimalField56 = decimalField56;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField1() {
        return floatField1;
    }

    public void setFloatField1(Float floatField1) {
        this.floatField1 = floatField1;
    }

    public Double getDoubleField82() {
        return doubleField82;
    }

    public void setDoubleField82(Double doubleField82) {
        this.doubleField82 = doubleField82;
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
