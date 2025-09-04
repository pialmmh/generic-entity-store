package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationHistoryV1 implements Serializable {
    private static final long serialVersionUID = 942L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField96;
    private Integer intField2;
    private Long bigIntField67;
    private BigDecimal decimalField70;
    private BigDecimal priceField;
    private Float floatField8;
    private Double doubleField58;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TransportationHistoryV1() {}

    public TransportationHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField96() {
        return smallIntField96;
    }

    public void setSmallIntField96(Short smallIntField96) {
        this.smallIntField96 = smallIntField96;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField67() {
        return bigIntField67;
    }

    public void setBigIntField67(Long bigIntField67) {
        this.bigIntField67 = bigIntField67;
    }

    public BigDecimal getDecimalField70() {
        return decimalField70;
    }

    public void setDecimalField70(BigDecimal decimalField70) {
        this.decimalField70 = decimalField70;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField8() {
        return floatField8;
    }

    public void setFloatField8(Float floatField8) {
        this.floatField8 = floatField8;
    }

    public Double getDoubleField58() {
        return doubleField58;
    }

    public void setDoubleField58(Double doubleField58) {
        this.doubleField58 = doubleField58;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
