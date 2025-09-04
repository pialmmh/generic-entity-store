package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingProfileV1 implements Serializable {
    private static final long serialVersionUID = 630L;

    private Long id;
    private Byte tinyIntField36;
    private Short smallIntField28;
    private Integer intField87;
    private Long bigIntField4;
    private BigDecimal decimalField95;
    private BigDecimal priceField;
    private Float floatField25;
    private Double doubleField57;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingProfileV1() {}

    public BankingProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField36() {
        return tinyIntField36;
    }

    public void setTinyIntField36(Byte tinyIntField36) {
        this.tinyIntField36 = tinyIntField36;
    }

    public Short getSmallIntField28() {
        return smallIntField28;
    }

    public void setSmallIntField28(Short smallIntField28) {
        this.smallIntField28 = smallIntField28;
    }

    public Integer getIntField87() {
        return intField87;
    }

    public void setIntField87(Integer intField87) {
        this.intField87 = intField87;
    }

    public Long getBigIntField4() {
        return bigIntField4;
    }

    public void setBigIntField4(Long bigIntField4) {
        this.bigIntField4 = bigIntField4;
    }

    public BigDecimal getDecimalField95() {
        return decimalField95;
    }

    public void setDecimalField95(BigDecimal decimalField95) {
        this.decimalField95 = decimalField95;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField25() {
        return floatField25;
    }

    public void setFloatField25(Float floatField25) {
        this.floatField25 = floatField25;
    }

    public Double getDoubleField57() {
        return doubleField57;
    }

    public void setDoubleField57(Double doubleField57) {
        this.doubleField57 = doubleField57;
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
