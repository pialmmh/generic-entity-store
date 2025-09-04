package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EducationProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationProfileV1 implements Serializable {
    private static final long serialVersionUID = 366L;

    private Long id;
    private Byte tinyIntField27;
    private Short smallIntField71;
    private Integer intField84;
    private Long bigIntField35;
    private BigDecimal decimalField26;
    private BigDecimal priceField;
    private Float floatField9;
    private Double doubleField75;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public EducationProfileV1() {}

    public EducationProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField27() {
        return tinyIntField27;
    }

    public void setTinyIntField27(Byte tinyIntField27) {
        this.tinyIntField27 = tinyIntField27;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField84() {
        return intField84;
    }

    public void setIntField84(Integer intField84) {
        this.intField84 = intField84;
    }

    public Long getBigIntField35() {
        return bigIntField35;
    }

    public void setBigIntField35(Long bigIntField35) {
        this.bigIntField35 = bigIntField35;
    }

    public BigDecimal getDecimalField26() {
        return decimalField26;
    }

    public void setDecimalField26(BigDecimal decimalField26) {
        this.decimalField26 = decimalField26;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField9() {
        return floatField9;
    }

    public void setFloatField9(Float floatField9) {
        this.floatField9 = floatField9;
    }

    public Double getDoubleField75() {
        return doubleField75;
    }

    public void setDoubleField75(Double doubleField75) {
        this.doubleField75 = doubleField75;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
