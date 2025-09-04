package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceStatementV1 implements Serializable {
    private static final long serialVersionUID = 720L;

    private Long id;
    private Byte tinyIntField97;
    private Short smallIntField39;
    private Integer intField67;
    private Long bigIntField7;
    private BigDecimal decimalField97;
    private BigDecimal priceField;
    private Float floatField23;
    private Double doubleField30;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EcommerceStatementV1() {}

    public EcommerceStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField97() {
        return tinyIntField97;
    }

    public void setTinyIntField97(Byte tinyIntField97) {
        this.tinyIntField97 = tinyIntField97;
    }

    public Short getSmallIntField39() {
        return smallIntField39;
    }

    public void setSmallIntField39(Short smallIntField39) {
        this.smallIntField39 = smallIntField39;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField7() {
        return bigIntField7;
    }

    public void setBigIntField7(Long bigIntField7) {
        this.bigIntField7 = bigIntField7;
    }

    public BigDecimal getDecimalField97() {
        return decimalField97;
    }

    public void setDecimalField97(BigDecimal decimalField97) {
        this.decimalField97 = decimalField97;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField23() {
        return floatField23;
    }

    public void setFloatField23(Float floatField23) {
        this.floatField23 = floatField23;
    }

    public Double getDoubleField30() {
        return doubleField30;
    }

    public void setDoubleField30(Double doubleField30) {
        this.doubleField30 = doubleField30;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
