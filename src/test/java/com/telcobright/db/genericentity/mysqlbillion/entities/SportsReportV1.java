package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: SportsReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsReportV1 implements Serializable {
    private static final long serialVersionUID = 1281L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField68;
    private Integer intField4;
    private Long bigIntField2;
    private BigDecimal decimalField42;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField86;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public SportsReportV1() {}

    public SportsReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField4() {
        return intField4;
    }

    public void setIntField4(Integer intField4) {
        this.intField4 = intField4;
    }

    public Long getBigIntField2() {
        return bigIntField2;
    }

    public void setBigIntField2(Long bigIntField2) {
        this.bigIntField2 = bigIntField2;
    }

    public BigDecimal getDecimalField42() {
        return decimalField42;
    }

    public void setDecimalField42(BigDecimal decimalField42) {
        this.decimalField42 = decimalField42;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField86() {
        return doubleField86;
    }

    public void setDoubleField86(Double doubleField86) {
        this.doubleField86 = doubleField86;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
