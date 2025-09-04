package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationAuditV1 implements Serializable {
    private static final long serialVersionUID = 948L;

    private Long id;
    private Byte tinyIntField41;
    private Short smallIntField49;
    private Integer intField84;
    private Long bigIntField79;
    private BigDecimal decimalField29;
    private BigDecimal priceField;
    private Float floatField94;
    private Double doubleField74;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public TransportationAuditV1() {}

    public TransportationAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField41() {
        return tinyIntField41;
    }

    public void setTinyIntField41(Byte tinyIntField41) {
        this.tinyIntField41 = tinyIntField41;
    }

    public Short getSmallIntField49() {
        return smallIntField49;
    }

    public void setSmallIntField49(Short smallIntField49) {
        this.smallIntField49 = smallIntField49;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField79() {
        return bigIntField79;
    }

    public void setBigIntField79(Long bigIntField79) {
        this.bigIntField79 = bigIntField79;
    }

    public BigDecimal getDecimalField29() {
        return decimalField29;
    }

    public void setDecimalField29(BigDecimal decimalField29) {
        this.decimalField29 = decimalField29;
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

    public Double getDoubleField74() {
        return doubleField74;
    }

    public void setDoubleField74(Double doubleField74) {
        this.doubleField74 = doubleField74;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
