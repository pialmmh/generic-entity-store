package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SocialTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialTransactionV1 implements Serializable {
    private static final long serialVersionUID = 726L;

    private Long id;
    private Byte tinyIntField48;
    private Short smallIntField15;
    private Integer intField4;
    private Long bigIntField38;
    private BigDecimal decimalField23;
    private BigDecimal priceField;
    private Float floatField73;
    private Double doubleField15;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SocialTransactionV1() {}

    public SocialTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField48() {
        return tinyIntField48;
    }

    public void setTinyIntField48(Byte tinyIntField48) {
        this.tinyIntField48 = tinyIntField48;
    }

    public Short getSmallIntField15() {
        return smallIntField15;
    }

    public void setSmallIntField15(Short smallIntField15) {
        this.smallIntField15 = smallIntField15;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField38() {
        return bigIntField38;
    }

    public void setBigIntField38(Long bigIntField38) {
        this.bigIntField38 = bigIntField38;
    }

    public BigDecimal getDecimalField23() {
        return decimalField23;
    }

    public void setDecimalField23(BigDecimal decimalField23) {
        this.decimalField23 = decimalField23;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField73() {
        return floatField73;
    }

    public void setFloatField73(Float floatField73) {
        this.floatField73 = floatField73;
    }

    public Double getDoubleField15() {
        return doubleField15;
    }

    public void setDoubleField15(Double doubleField15) {
        this.doubleField15 = doubleField15;
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
