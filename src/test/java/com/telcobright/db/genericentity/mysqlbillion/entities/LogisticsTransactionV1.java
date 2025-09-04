package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsTransactionV1 implements Serializable {
    private static final long serialVersionUID = 264L;

    private Long id;
    private Byte tinyIntField23;
    private Short smallIntField97;
    private Integer intField28;
    private Long bigIntField73;
    private BigDecimal decimalField76;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField64;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public LogisticsTransactionV1() {}

    public LogisticsTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField23() {
        return tinyIntField23;
    }

    public void setTinyIntField23(Byte tinyIntField23) {
        this.tinyIntField23 = tinyIntField23;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField28() {
        return intField28;
    }

    public void setIntField28(Integer intField28) {
        this.intField28 = intField28;
    }

    public Long getBigIntField73() {
        return bigIntField73;
    }

    public void setBigIntField73(Long bigIntField73) {
        this.bigIntField73 = bigIntField73;
    }

    public BigDecimal getDecimalField76() {
        return decimalField76;
    }

    public void setDecimalField76(BigDecimal decimalField76) {
        this.decimalField76 = decimalField76;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField46() {
        return floatField46;
    }

    public void setFloatField46(Float floatField46) {
        this.floatField46 = floatField46;
    }

    public Double getDoubleField64() {
        return doubleField64;
    }

    public void setDoubleField64(Double doubleField64) {
        this.doubleField64 = doubleField64;
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
