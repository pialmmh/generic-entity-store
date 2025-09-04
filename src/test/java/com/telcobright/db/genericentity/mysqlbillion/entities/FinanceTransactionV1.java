package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceTransactionV1 implements Serializable {
    private static final long serialVersionUID = 0L;

    private Long id;
    private Byte tinyIntField60;
    private Short smallIntField48;
    private Integer intField29;
    private Long bigIntField47;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField53;
    private Double doubleField91;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public FinanceTransactionV1() {}

    public FinanceTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField60() {
        return tinyIntField60;
    }

    public void setTinyIntField60(Byte tinyIntField60) {
        this.tinyIntField60 = tinyIntField60;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField29() {
        return intField29;
    }

    public void setIntField29(Integer intField29) {
        this.intField29 = intField29;
    }

    public Long getBigIntField47() {
        return bigIntField47;
    }

    public void setBigIntField47(Long bigIntField47) {
        this.bigIntField47 = bigIntField47;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField53() {
        return floatField53;
    }

    public void setFloatField53(Float floatField53) {
        this.floatField53 = floatField53;
    }

    public Double getDoubleField91() {
        return doubleField91;
    }

    public void setDoubleField91(Double doubleField91) {
        this.doubleField91 = doubleField91;
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
