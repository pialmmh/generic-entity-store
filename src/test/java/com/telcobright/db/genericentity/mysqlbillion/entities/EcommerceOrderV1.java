package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceOrderV1 implements Serializable {
    private static final long serialVersionUID = 711L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField71;
    private Integer intField77;
    private Long bigIntField49;
    private BigDecimal decimalField72;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField37;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EcommerceOrderV1() {}

    public EcommerceOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField83() {
        return tinyIntField83;
    }

    public void setTinyIntField83(Byte tinyIntField83) {
        this.tinyIntField83 = tinyIntField83;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField77() {
        return intField77;
    }

    public void setIntField77(Integer intField77) {
        this.intField77 = intField77;
    }

    public Long getBigIntField49() {
        return bigIntField49;
    }

    public void setBigIntField49(Long bigIntField49) {
        this.bigIntField49 = bigIntField49;
    }

    public BigDecimal getDecimalField72() {
        return decimalField72;
    }

    public void setDecimalField72(BigDecimal decimalField72) {
        this.decimalField72 = decimalField72;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField37() {
        return doubleField37;
    }

    public void setDoubleField37(Double doubleField37) {
        this.doubleField37 = doubleField37;
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
