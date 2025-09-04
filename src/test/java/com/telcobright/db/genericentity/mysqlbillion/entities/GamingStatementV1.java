package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: GamingStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingStatementV1 implements Serializable {
    private static final long serialVersionUID = 852L;

    private Long id;
    private Byte tinyIntField29;
    private Short smallIntField62;
    private Integer intField67;
    private Long bigIntField46;
    private BigDecimal decimalField1;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField16;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GamingStatementV1() {}

    public GamingStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField29() {
        return tinyIntField29;
    }

    public void setTinyIntField29(Byte tinyIntField29) {
        this.tinyIntField29 = tinyIntField29;
    }

    public Short getSmallIntField62() {
        return smallIntField62;
    }

    public void setSmallIntField62(Short smallIntField62) {
        this.smallIntField62 = smallIntField62;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField46() {
        return bigIntField46;
    }

    public void setBigIntField46(Long bigIntField46) {
        this.bigIntField46 = bigIntField46;
    }

    public BigDecimal getDecimalField1() {
        return decimalField1;
    }

    public void setDecimalField1(BigDecimal decimalField1) {
        this.decimalField1 = decimalField1;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField16() {
        return doubleField16;
    }

    public void setDoubleField16(Double doubleField16) {
        this.doubleField16 = doubleField16;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
