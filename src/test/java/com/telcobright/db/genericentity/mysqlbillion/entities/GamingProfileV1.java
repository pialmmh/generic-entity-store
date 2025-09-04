package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: GamingProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingProfileV1 implements Serializable {
    private static final long serialVersionUID = 828L;

    private Long id;
    private Byte tinyIntField16;
    private Short smallIntField38;
    private Integer intField12;
    private Long bigIntField26;
    private BigDecimal decimalField82;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField47;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GamingProfileV1() {}

    public GamingProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField16() {
        return tinyIntField16;
    }

    public void setTinyIntField16(Byte tinyIntField16) {
        this.tinyIntField16 = tinyIntField16;
    }

    public Short getSmallIntField38() {
        return smallIntField38;
    }

    public void setSmallIntField38(Short smallIntField38) {
        this.smallIntField38 = smallIntField38;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField26() {
        return bigIntField26;
    }

    public void setBigIntField26(Long bigIntField26) {
        this.bigIntField26 = bigIntField26;
    }

    public BigDecimal getDecimalField82() {
        return decimalField82;
    }

    public void setDecimalField82(BigDecimal decimalField82) {
        this.decimalField82 = decimalField82;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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
