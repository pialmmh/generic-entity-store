package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateAccountV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateAccountV1 implements Serializable {
    private static final long serialVersionUID = 1029L;

    private Long id;
    private Byte tinyIntField50;
    private Short smallIntField83;
    private Integer intField33;
    private Long bigIntField10;
    private BigDecimal decimalField90;
    private BigDecimal priceField;
    private Float floatField97;
    private Double doubleField72;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public RealEstateAccountV1() {}

    public RealEstateAccountV1(Long id, String code, String name) {
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

    public Byte getTinyIntField50() {
        return tinyIntField50;
    }

    public void setTinyIntField50(Byte tinyIntField50) {
        this.tinyIntField50 = tinyIntField50;
    }

    public Short getSmallIntField83() {
        return smallIntField83;
    }

    public void setSmallIntField83(Short smallIntField83) {
        this.smallIntField83 = smallIntField83;
    }

    public Integer getIntField33() {
        return intField33;
    }

    public void setIntField33(Integer intField33) {
        this.intField33 = intField33;
    }

    public Long getBigIntField10() {
        return bigIntField10;
    }

    public void setBigIntField10(Long bigIntField10) {
        this.bigIntField10 = bigIntField10;
    }

    public BigDecimal getDecimalField90() {
        return decimalField90;
    }

    public void setDecimalField90(BigDecimal decimalField90) {
        this.decimalField90 = decimalField90;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField97() {
        return floatField97;
    }

    public void setFloatField97(Float floatField97) {
        this.floatField97 = floatField97;
    }

    public Double getDoubleField72() {
        return doubleField72;
    }

    public void setDoubleField72(Double doubleField72) {
        this.doubleField72 = doubleField72;
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

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
