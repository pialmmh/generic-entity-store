package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationArchiveV1 implements Serializable {
    private static final long serialVersionUID = 351L;

    private Long id;
    private Byte tinyIntField26;
    private Short smallIntField60;
    private Integer intField94;
    private Long bigIntField9;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField79;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EducationArchiveV1() {}

    public EducationArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField26() {
        return tinyIntField26;
    }

    public void setTinyIntField26(Byte tinyIntField26) {
        this.tinyIntField26 = tinyIntField26;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField9() {
        return bigIntField9;
    }

    public void setBigIntField9(Long bigIntField9) {
        this.bigIntField9 = bigIntField9;
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

    public Float getFloatField80() {
        return floatField80;
    }

    public void setFloatField80(Float floatField80) {
        this.floatField80 = floatField80;
    }

    public Double getDoubleField79() {
        return doubleField79;
    }

    public void setDoubleField79(Double doubleField79) {
        this.doubleField79 = doubleField79;
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
