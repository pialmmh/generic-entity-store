package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaAccountV1 implements Serializable {
    private static final long serialVersionUID = 897L;

    private Long id;
    private Byte tinyIntField55;
    private Short smallIntField17;
    private Integer intField74;
    private Long bigIntField85;
    private BigDecimal decimalField2;
    private BigDecimal priceField;
    private Float floatField34;
    private Double doubleField68;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public MediaAccountV1() {}

    public MediaAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField55() {
        return tinyIntField55;
    }

    public void setTinyIntField55(Byte tinyIntField55) {
        this.tinyIntField55 = tinyIntField55;
    }

    public Short getSmallIntField17() {
        return smallIntField17;
    }

    public void setSmallIntField17(Short smallIntField17) {
        this.smallIntField17 = smallIntField17;
    }

    public Integer getIntField74() {
        return intField74;
    }

    public void setIntField74(Integer intField74) {
        this.intField74 = intField74;
    }

    public Long getBigIntField85() {
        return bigIntField85;
    }

    public void setBigIntField85(Long bigIntField85) {
        this.bigIntField85 = bigIntField85;
    }

    public BigDecimal getDecimalField2() {
        return decimalField2;
    }

    public void setDecimalField2(BigDecimal decimalField2) {
        this.decimalField2 = decimalField2;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField34() {
        return floatField34;
    }

    public void setFloatField34(Float floatField34) {
        this.floatField34 = floatField34;
    }

    public Double getDoubleField68() {
        return doubleField68;
    }

    public void setDoubleField68(Double doubleField68) {
        this.doubleField68 = doubleField68;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
