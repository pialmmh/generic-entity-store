package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomAuditV1 implements Serializable {
    private static final long serialVersionUID = 486L;

    private Long id;
    private Byte tinyIntField52;
    private Short smallIntField82;
    private Integer intField57;
    private Long bigIntField88;
    private BigDecimal decimalField21;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField50;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TelecomAuditV1() {}

    public TelecomAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField52() {
        return tinyIntField52;
    }

    public void setTinyIntField52(Byte tinyIntField52) {
        this.tinyIntField52 = tinyIntField52;
    }

    public Short getSmallIntField82() {
        return smallIntField82;
    }

    public void setSmallIntField82(Short smallIntField82) {
        this.smallIntField82 = smallIntField82;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField88() {
        return bigIntField88;
    }

    public void setBigIntField88(Long bigIntField88) {
        this.bigIntField88 = bigIntField88;
    }

    public BigDecimal getDecimalField21() {
        return decimalField21;
    }

    public void setDecimalField21(BigDecimal decimalField21) {
        this.decimalField21 = decimalField21;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField50() {
        return doubleField50;
    }

    public void setDoubleField50(Double doubleField50) {
        this.doubleField50 = doubleField50;
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
