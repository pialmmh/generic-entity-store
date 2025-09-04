package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaHistoryV1 implements Serializable {
    private static final long serialVersionUID = 876L;

    private Long id;
    private Byte tinyIntField60;
    private Short smallIntField68;
    private Integer intField77;
    private Long bigIntField59;
    private BigDecimal decimalField44;
    private BigDecimal priceField;
    private Float floatField31;
    private Double doubleField94;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public MediaHistoryV1() {}

    public MediaHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField60() {
        return tinyIntField60;
    }

    public void setTinyIntField60(Byte tinyIntField60) {
        this.tinyIntField60 = tinyIntField60;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField59() {
        return bigIntField59;
    }

    public void setBigIntField59(Long bigIntField59) {
        this.bigIntField59 = bigIntField59;
    }

    public BigDecimal getDecimalField44() {
        return decimalField44;
    }

    public void setDecimalField44(BigDecimal decimalField44) {
        this.decimalField44 = decimalField44;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField31() {
        return floatField31;
    }

    public void setFloatField31(Float floatField31) {
        this.floatField31 = floatField31;
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
