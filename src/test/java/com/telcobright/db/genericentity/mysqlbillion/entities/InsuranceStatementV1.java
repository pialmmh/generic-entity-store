package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceStatementV1 implements Serializable {
    private static final long serialVersionUID = 588L;

    private Long id;
    private Byte tinyIntField83;
    private Short smallIntField48;
    private Integer intField23;
    private Long bigIntField62;
    private BigDecimal decimalField64;
    private BigDecimal priceField;
    private Float floatField70;
    private Double doubleField52;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public InsuranceStatementV1() {}

    public InsuranceStatementV1(Long id, String code, String name) {
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

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField23() {
        return intField23;
    }

    public void setIntField23(Integer intField23) {
        this.intField23 = intField23;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField64() {
        return decimalField64;
    }

    public void setDecimalField64(BigDecimal decimalField64) {
        this.decimalField64 = decimalField64;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField70() {
        return floatField70;
    }

    public void setFloatField70(Float floatField70) {
        this.floatField70 = floatField70;
    }

    public Double getDoubleField52() {
        return doubleField52;
    }

    public void setDoubleField52(Double doubleField52) {
        this.doubleField52 = doubleField52;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
