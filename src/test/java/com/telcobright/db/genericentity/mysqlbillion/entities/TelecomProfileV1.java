package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomProfileV1 implements Serializable {
    private static final long serialVersionUID = 498L;

    private Long id;
    private Byte tinyIntField41;
    private Short smallIntField62;
    private Integer intField28;
    private Long bigIntField80;
    private BigDecimal decimalField7;
    private BigDecimal priceField;
    private Float floatField10;
    private Double doubleField53;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TelecomProfileV1() {}

    public TelecomProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField41() {
        return tinyIntField41;
    }

    public void setTinyIntField41(Byte tinyIntField41) {
        this.tinyIntField41 = tinyIntField41;
    }

    public Short getSmallIntField62() {
        return smallIntField62;
    }

    public void setSmallIntField62(Short smallIntField62) {
        this.smallIntField62 = smallIntField62;
    }

    public Integer getIntField28() {
        return intField28;
    }

    public void setIntField28(Integer intField28) {
        this.intField28 = intField28;
    }

    public Long getBigIntField80() {
        return bigIntField80;
    }

    public void setBigIntField80(Long bigIntField80) {
        this.bigIntField80 = bigIntField80;
    }

    public BigDecimal getDecimalField7() {
        return decimalField7;
    }

    public void setDecimalField7(BigDecimal decimalField7) {
        this.decimalField7 = decimalField7;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField10() {
        return floatField10;
    }

    public void setFloatField10(Float floatField10) {
        this.floatField10 = floatField10;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
