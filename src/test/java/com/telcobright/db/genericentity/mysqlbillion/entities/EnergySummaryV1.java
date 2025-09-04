package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EnergySummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EnergySummaryV1 implements Serializable {
    private static final long serialVersionUID = 1071L;

    private Long id;
    private Byte tinyIntField21;
    private Short smallIntField46;
    private Integer intField4;
    private Long bigIntField47;
    private BigDecimal decimalField45;
    private BigDecimal priceField;
    private Float floatField21;
    private Double doubleField85;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EnergySummaryV1() {}

    public EnergySummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField21() {
        return tinyIntField21;
    }

    public void setTinyIntField21(Byte tinyIntField21) {
        this.tinyIntField21 = tinyIntField21;
    }

    public Short getSmallIntField46() {
        return smallIntField46;
    }

    public void setSmallIntField46(Short smallIntField46) {
        this.smallIntField46 = smallIntField46;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField47() {
        return bigIntField47;
    }

    public void setBigIntField47(Long bigIntField47) {
        this.bigIntField47 = bigIntField47;
    }

    public BigDecimal getDecimalField45() {
        return decimalField45;
    }

    public void setDecimalField45(BigDecimal decimalField45) {
        this.decimalField45 = decimalField45;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField21() {
        return floatField21;
    }

    public void setFloatField21(Float floatField21) {
        this.floatField21 = floatField21;
    }

    public Double getDoubleField85() {
        return doubleField85;
    }

    public void setDoubleField85(Double doubleField85) {
        this.doubleField85 = doubleField85;
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
