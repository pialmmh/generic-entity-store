package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaReceiptV1 implements Serializable {
    private static final long serialVersionUID = 915L;

    private Long id;
    private Byte tinyIntField96;
    private Short smallIntField74;
    private Integer intField83;
    private Long bigIntField8;
    private BigDecimal decimalField62;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField4;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public MediaReceiptV1() {}

    public MediaReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField96() {
        return tinyIntField96;
    }

    public void setTinyIntField96(Byte tinyIntField96) {
        this.tinyIntField96 = tinyIntField96;
    }

    public Short getSmallIntField74() {
        return smallIntField74;
    }

    public void setSmallIntField74(Short smallIntField74) {
        this.smallIntField74 = smallIntField74;
    }

    public Integer getIntField83() {
        return intField83;
    }

    public void setIntField83(Integer intField83) {
        this.intField83 = intField83;
    }

    public Long getBigIntField8() {
        return bigIntField8;
    }

    public void setBigIntField8(Long bigIntField8) {
        this.bigIntField8 = bigIntField8;
    }

    public BigDecimal getDecimalField62() {
        return decimalField62;
    }

    public void setDecimalField62(BigDecimal decimalField62) {
        this.decimalField62 = decimalField62;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField4() {
        return doubleField4;
    }

    public void setDoubleField4(Double doubleField4) {
        this.doubleField4 = doubleField4;
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
