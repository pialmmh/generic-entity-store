package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingDocumentV1 implements Serializable {
    private static final long serialVersionUID = 834L;

    private Long id;
    private Byte tinyIntField84;
    private Short smallIntField97;
    private Integer intField57;
    private Long bigIntField0;
    private BigDecimal decimalField32;
    private BigDecimal priceField;
    private Float floatField1;
    private Double doubleField41;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public GamingDocumentV1() {}

    public GamingDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField84() {
        return tinyIntField84;
    }

    public void setTinyIntField84(Byte tinyIntField84) {
        this.tinyIntField84 = tinyIntField84;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField0() {
        return bigIntField0;
    }

    public void setBigIntField0(Long bigIntField0) {
        this.bigIntField0 = bigIntField0;
    }

    public BigDecimal getDecimalField32() {
        return decimalField32;
    }

    public void setDecimalField32(BigDecimal decimalField32) {
        this.decimalField32 = decimalField32;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField1() {
        return floatField1;
    }

    public void setFloatField1(Float floatField1) {
        this.floatField1 = floatField1;
    }

    public Double getDoubleField41() {
        return doubleField41;
    }

    public void setDoubleField41(Double doubleField41) {
        this.doubleField41 = doubleField41;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
