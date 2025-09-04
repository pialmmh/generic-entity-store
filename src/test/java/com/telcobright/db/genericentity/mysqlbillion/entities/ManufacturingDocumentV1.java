package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingDocumentV1 implements Serializable {
    private static final long serialVersionUID = 240L;

    private Long id;
    private Byte tinyIntField33;
    private Short smallIntField49;
    private Integer intField19;
    private Long bigIntField8;
    private BigDecimal decimalField29;
    private BigDecimal priceField;
    private Float floatField72;
    private Double doubleField5;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public ManufacturingDocumentV1() {}

    public ManufacturingDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField33() {
        return tinyIntField33;
    }

    public void setTinyIntField33(Byte tinyIntField33) {
        this.tinyIntField33 = tinyIntField33;
    }

    public Short getSmallIntField49() {
        return smallIntField49;
    }

    public void setSmallIntField49(Short smallIntField49) {
        this.smallIntField49 = smallIntField49;
    }

    public Integer getIntField19() {
        return intField19;
    }

    public void setIntField19(Integer intField19) {
        this.intField19 = intField19;
    }

    public Long getBigIntField8() {
        return bigIntField8;
    }

    public void setBigIntField8(Long bigIntField8) {
        this.bigIntField8 = bigIntField8;
    }

    public BigDecimal getDecimalField29() {
        return decimalField29;
    }

    public void setDecimalField29(BigDecimal decimalField29) {
        this.decimalField29 = decimalField29;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField72() {
        return floatField72;
    }

    public void setFloatField72(Float floatField72) {
        this.floatField72 = floatField72;
    }

    public Double getDoubleField5() {
        return doubleField5;
    }

    public void setDoubleField5(Double doubleField5) {
        this.doubleField5 = doubleField5;
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
