package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingArchiveV1 implements Serializable {
    private static final long serialVersionUID = 813L;

    private Long id;
    private Byte tinyIntField50;
    private Short smallIntField42;
    private Integer intField84;
    private Long bigIntField37;
    private BigDecimal decimalField83;
    private BigDecimal priceField;
    private Float floatField91;
    private Double doubleField20;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public GamingArchiveV1() {}

    public GamingArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField50() {
        return tinyIntField50;
    }

    public void setTinyIntField50(Byte tinyIntField50) {
        this.tinyIntField50 = tinyIntField50;
    }

    public Short getSmallIntField42() {
        return smallIntField42;
    }

    public void setSmallIntField42(Short smallIntField42) {
        this.smallIntField42 = smallIntField42;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField83() {
        return decimalField83;
    }

    public void setDecimalField83(BigDecimal decimalField83) {
        this.decimalField83 = decimalField83;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField91() {
        return floatField91;
    }

    public void setFloatField91(Float floatField91) {
        this.floatField91 = floatField91;
    }

    public Double getDoubleField20() {
        return doubleField20;
    }

    public void setDoubleField20(Double doubleField20) {
        this.doubleField20 = doubleField20;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
