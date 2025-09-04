package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialLogV1 implements Serializable {
    private static final long serialVersionUID = 735L;

    private Long id;
    private Byte tinyIntField78;
    private Short smallIntField63;
    private Integer intField76;
    private Long bigIntField27;
    private BigDecimal decimalField67;
    private BigDecimal priceField;
    private Float floatField30;
    private Double doubleField97;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public SocialLogV1() {}

    public SocialLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField78() {
        return tinyIntField78;
    }

    public void setTinyIntField78(Byte tinyIntField78) {
        this.tinyIntField78 = tinyIntField78;
    }

    public Short getSmallIntField63() {
        return smallIntField63;
    }

    public void setSmallIntField63(Short smallIntField63) {
        this.smallIntField63 = smallIntField63;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField27() {
        return bigIntField27;
    }

    public void setBigIntField27(Long bigIntField27) {
        this.bigIntField27 = bigIntField27;
    }

    public BigDecimal getDecimalField67() {
        return decimalField67;
    }

    public void setDecimalField67(BigDecimal decimalField67) {
        this.decimalField67 = decimalField67;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField30() {
        return floatField30;
    }

    public void setFloatField30(Float floatField30) {
        this.floatField30 = floatField30;
    }

    public Double getDoubleField97() {
        return doubleField97;
    }

    public void setDoubleField97(Double doubleField97) {
        this.doubleField97 = doubleField97;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
