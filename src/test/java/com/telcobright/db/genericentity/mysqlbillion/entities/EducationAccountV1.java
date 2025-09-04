package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationAccountV1 implements Serializable {
    private static final long serialVersionUID = 369L;

    private Long id;
    private Byte tinyIntField88;
    private Short smallIntField7;
    private Integer intField11;
    private Long bigIntField49;
    private BigDecimal decimalField68;
    private BigDecimal priceField;
    private Float floatField94;
    private Double doubleField63;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public EducationAccountV1() {}

    public EducationAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField88() {
        return tinyIntField88;
    }

    public void setTinyIntField88(Byte tinyIntField88) {
        this.tinyIntField88 = tinyIntField88;
    }

    public Short getSmallIntField7() {
        return smallIntField7;
    }

    public void setSmallIntField7(Short smallIntField7) {
        this.smallIntField7 = smallIntField7;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField49() {
        return bigIntField49;
    }

    public void setBigIntField49(Long bigIntField49) {
        this.bigIntField49 = bigIntField49;
    }

    public BigDecimal getDecimalField68() {
        return decimalField68;
    }

    public void setDecimalField68(BigDecimal decimalField68) {
        this.decimalField68 = decimalField68;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField94() {
        return floatField94;
    }

    public void setFloatField94(Float floatField94) {
        this.floatField94 = floatField94;
    }

    public Double getDoubleField63() {
        return doubleField63;
    }

    public void setDoubleField63(Double doubleField63) {
        this.doubleField63 = doubleField63;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
