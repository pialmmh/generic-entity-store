package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsBalanceV1 implements Serializable {
    private static final long serialVersionUID = 327L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField68;
    private Integer intField46;
    private Long bigIntField84;
    private BigDecimal decimalField32;
    private BigDecimal priceField;
    private Float floatField33;
    private Double doubleField18;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public LogisticsBalanceV1() {}

    public LogisticsBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField46() {
        return intField46;
    }

    public void setIntField46(Integer intField46) {
        this.intField46 = intField46;
    }

    public Long getBigIntField84() {
        return bigIntField84;
    }

    public void setBigIntField84(Long bigIntField84) {
        this.bigIntField84 = bigIntField84;
    }

    public BigDecimal getDecimalField32() {
        return decimalField32;
    }

    public void setDecimalField32(BigDecimal decimalField32) {
        this.decimalField32 = decimalField32;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField33() {
        return floatField33;
    }

    public void setFloatField33(Float floatField33) {
        this.floatField33 = floatField33;
    }

    public Double getDoubleField18() {
        return doubleField18;
    }

    public void setDoubleField18(Double doubleField18) {
        this.doubleField18 = doubleField18;
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

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
