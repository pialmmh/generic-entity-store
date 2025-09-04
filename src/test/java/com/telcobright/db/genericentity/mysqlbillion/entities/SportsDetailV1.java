package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: SportsDetailV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsDetailV1 implements Serializable {
    private static final long serialVersionUID = 1266L;

    private Long id;
    private Byte tinyIntField45;
    private Short smallIntField64;
    private Integer intField41;
    private Long bigIntField62;
    private BigDecimal decimalField86;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField37;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SportsDetailV1() {}

    public SportsDetailV1(Long id, String code, String name) {
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

    public Byte getTinyIntField45() {
        return tinyIntField45;
    }

    public void setTinyIntField45(Byte tinyIntField45) {
        this.tinyIntField45 = tinyIntField45;
    }

    public Short getSmallIntField64() {
        return smallIntField64;
    }

    public void setSmallIntField64(Short smallIntField64) {
        this.smallIntField64 = smallIntField64;
    }

    public Integer getIntField41() {
        return intField41;
    }

    public void setIntField41(Integer intField41) {
        this.intField41 = intField41;
    }

    public Long getBigIntField62() {
        return bigIntField62;
    }

    public void setBigIntField62(Long bigIntField62) {
        this.bigIntField62 = bigIntField62;
    }

    public BigDecimal getDecimalField86() {
        return decimalField86;
    }

    public void setDecimalField86(BigDecimal decimalField86) {
        this.decimalField86 = decimalField86;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField62() {
        return floatField62;
    }

    public void setFloatField62(Float floatField62) {
        this.floatField62 = floatField62;
    }

    public Double getDoubleField37() {
        return doubleField37;
    }

    public void setDoubleField37(Double doubleField37) {
        this.doubleField37 = doubleField37;
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

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
