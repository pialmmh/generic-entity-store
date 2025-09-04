package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaTransactionV1 implements Serializable {
    private static final long serialVersionUID = 858L;

    private Long id;
    private Byte tinyIntField80;
    private Short smallIntField90;
    private Integer intField4;
    private Long bigIntField25;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField96;
    private Double doubleField2;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public MediaTransactionV1() {}

    public MediaTransactionV1(Long id, String code, String name) {
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

    public Short getSmallIntField90() {
        return smallIntField90;
    }

    public void setSmallIntField90(Short smallIntField90) {
        this.smallIntField90 = smallIntField90;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField25() {
        return bigIntField25;
    }

    public void setBigIntField25(Long bigIntField25) {
        this.bigIntField25 = bigIntField25;
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

    public Float getFloatField96() {
        return floatField96;
    }

    public void setFloatField96(Float floatField96) {
        this.floatField96 = floatField96;
    }

    public Double getDoubleField2() {
        return doubleField2;
    }

    public void setDoubleField2(Double doubleField2) {
        this.doubleField2 = doubleField2;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
