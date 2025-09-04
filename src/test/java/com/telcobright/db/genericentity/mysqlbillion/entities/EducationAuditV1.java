package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationAuditV1 implements Serializable {
    private static final long serialVersionUID = 354L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField59;
    private Integer intField57;
    private Long bigIntField49;
    private BigDecimal decimalField17;
    private BigDecimal priceField;
    private Float floatField51;
    private Double doubleField64;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EducationAuditV1() {}

    public EducationAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField59() {
        return smallIntField59;
    }

    public void setSmallIntField59(Short smallIntField59) {
        this.smallIntField59 = smallIntField59;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField49() {
        return bigIntField49;
    }

    public void setBigIntField49(Long bigIntField49) {
        this.bigIntField49 = bigIntField49;
    }

    public BigDecimal getDecimalField17() {
        return decimalField17;
    }

    public void setDecimalField17(BigDecimal decimalField17) {
        this.decimalField17 = decimalField17;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField51() {
        return floatField51;
    }

    public void setFloatField51(Float floatField51) {
        this.floatField51 = floatField51;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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
