package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialPaymentV1 implements Serializable {
    private static final long serialVersionUID = 780L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField70;
    private Integer intField58;
    private Long bigIntField29;
    private BigDecimal decimalField20;
    private BigDecimal priceField;
    private Float floatField71;
    private Double doubleField69;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SocialPaymentV1() {}

    public SocialPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField70() {
        return smallIntField70;
    }

    public void setSmallIntField70(Short smallIntField70) {
        this.smallIntField70 = smallIntField70;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField29() {
        return bigIntField29;
    }

    public void setBigIntField29(Long bigIntField29) {
        this.bigIntField29 = bigIntField29;
    }

    public BigDecimal getDecimalField20() {
        return decimalField20;
    }

    public void setDecimalField20(BigDecimal decimalField20) {
        this.decimalField20 = decimalField20;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField71() {
        return floatField71;
    }

    public void setFloatField71(Float floatField71) {
        this.floatField71 = floatField71;
    }

    public Double getDoubleField69() {
        return doubleField69;
    }

    public void setDoubleField69(Double doubleField69) {
        this.doubleField69 = doubleField69;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
