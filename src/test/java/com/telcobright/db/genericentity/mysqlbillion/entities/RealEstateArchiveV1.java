package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateArchiveV1 implements Serializable {
    private static final long serialVersionUID = 1011L;

    private Long id;
    private Byte tinyIntField48;
    private Short smallIntField72;
    private Integer intField2;
    private Long bigIntField38;
    private BigDecimal decimalField86;
    private BigDecimal priceField;
    private Float floatField81;
    private Double doubleField29;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RealEstateArchiveV1() {}

    public RealEstateArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField48() {
        return tinyIntField48;
    }

    public void setTinyIntField48(Byte tinyIntField48) {
        this.tinyIntField48 = tinyIntField48;
    }

    public Short getSmallIntField72() {
        return smallIntField72;
    }

    public void setSmallIntField72(Short smallIntField72) {
        this.smallIntField72 = smallIntField72;
    }

    public Integer getIntField2() {
        return intField2;
    }

    public void setIntField2(Integer intField2) {
        this.intField2 = intField2;
    }

    public Long getBigIntField38() {
        return bigIntField38;
    }

    public void setBigIntField38(Long bigIntField38) {
        this.bigIntField38 = bigIntField38;
    }

    public BigDecimal getDecimalField86() {
        return decimalField86;
    }

    public void setDecimalField86(BigDecimal decimalField86) {
        this.decimalField86 = decimalField86;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField81() {
        return floatField81;
    }

    public void setFloatField81(Float floatField81) {
        this.floatField81 = floatField81;
    }

    public Double getDoubleField29() {
        return doubleField29;
    }

    public void setDoubleField29(Double doubleField29) {
        this.doubleField29 = doubleField29;
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
