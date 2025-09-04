package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialStatementV1 implements Serializable {
    private static final long serialVersionUID = 786L;

    private Long id;
    private Byte tinyIntField40;
    private Short smallIntField15;
    private Integer intField39;
    private Long bigIntField67;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField52;
    private Double doubleField94;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SocialStatementV1() {}

    public SocialStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField40() {
        return tinyIntField40;
    }

    public void setTinyIntField40(Byte tinyIntField40) {
        this.tinyIntField40 = tinyIntField40;
    }

    public Short getSmallIntField15() {
        return smallIntField15;
    }

    public void setSmallIntField15(Short smallIntField15) {
        this.smallIntField15 = smallIntField15;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField67() {
        return bigIntField67;
    }

    public void setBigIntField67(Long bigIntField67) {
        this.bigIntField67 = bigIntField67;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField52() {
        return floatField52;
    }

    public void setFloatField52(Float floatField52) {
        this.floatField52 = floatField52;
    }

    public Double getDoubleField94() {
        return doubleField94;
    }

    public void setDoubleField94(Double doubleField94) {
        this.doubleField94 = doubleField94;
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
