package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsHistoryV1 implements Serializable {
    private static final long serialVersionUID = 1272L;

    private Long id;
    private Byte tinyIntField1;
    private Short smallIntField0;
    private Integer intField31;
    private Long bigIntField16;
    private BigDecimal decimalField17;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField62;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SportsHistoryV1() {}

    public SportsHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField1() {
        return tinyIntField1;
    }

    public void setTinyIntField1(Byte tinyIntField1) {
        this.tinyIntField1 = tinyIntField1;
    }

    public Short getSmallIntField0() {
        return smallIntField0;
    }

    public void setSmallIntField0(Short smallIntField0) {
        this.smallIntField0 = smallIntField0;
    }

    public Integer getIntField31() {
        return intField31;
    }

    public void setIntField31(Integer intField31) {
        this.intField31 = intField31;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField17() {
        return decimalField17;
    }

    public void setDecimalField17(BigDecimal decimalField17) {
        this.decimalField17 = decimalField17;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField18() {
        return floatField18;
    }

    public void setFloatField18(Float floatField18) {
        this.floatField18 = floatField18;
    }

    public Double getDoubleField62() {
        return doubleField62;
    }

    public void setDoubleField62(Double doubleField62) {
        this.doubleField62 = doubleField62;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
