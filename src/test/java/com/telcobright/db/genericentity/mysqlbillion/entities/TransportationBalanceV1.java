package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationBalanceV1 implements Serializable {
    private static final long serialVersionUID = 987L;

    private Long id;
    private Byte tinyIntField35;
    private Short smallIntField48;
    private Integer intField48;
    private Long bigIntField19;
    private BigDecimal decimalField19;
    private BigDecimal priceField;
    private Float floatField17;
    private Double doubleField59;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TransportationBalanceV1() {}

    public TransportationBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField35() {
        return tinyIntField35;
    }

    public void setTinyIntField35(Byte tinyIntField35) {
        this.tinyIntField35 = tinyIntField35;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField19() {
        return bigIntField19;
    }

    public void setBigIntField19(Long bigIntField19) {
        this.bigIntField19 = bigIntField19;
    }

    public BigDecimal getDecimalField19() {
        return decimalField19;
    }

    public void setDecimalField19(BigDecimal decimalField19) {
        this.decimalField19 = decimalField19;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField17() {
        return floatField17;
    }

    public void setFloatField17(Float floatField17) {
        this.floatField17 = floatField17;
    }

    public Double getDoubleField59() {
        return doubleField59;
    }

    public void setDoubleField59(Double doubleField59) {
        this.doubleField59 = doubleField59;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
