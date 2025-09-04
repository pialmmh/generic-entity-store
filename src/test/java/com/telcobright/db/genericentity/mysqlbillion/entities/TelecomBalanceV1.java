package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomBalanceV1 implements Serializable {
    private static final long serialVersionUID = 525L;

    private Long id;
    private Byte tinyIntField73;
    private Short smallIntField21;
    private Integer intField30;
    private Long bigIntField91;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField82;
    private Double doubleField78;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TelecomBalanceV1() {}

    public TelecomBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField73() {
        return tinyIntField73;
    }

    public void setTinyIntField73(Byte tinyIntField73) {
        this.tinyIntField73 = tinyIntField73;
    }

    public Short getSmallIntField21() {
        return smallIntField21;
    }

    public void setSmallIntField21(Short smallIntField21) {
        this.smallIntField21 = smallIntField21;
    }

    public Integer getIntField30() {
        return intField30;
    }

    public void setIntField30(Integer intField30) {
        this.intField30 = intField30;
    }

    public Long getBigIntField91() {
        return bigIntField91;
    }

    public void setBigIntField91(Long bigIntField91) {
        this.bigIntField91 = bigIntField91;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField82() {
        return floatField82;
    }

    public void setFloatField82(Float floatField82) {
        this.floatField82 = floatField82;
    }

    public Double getDoubleField78() {
        return doubleField78;
    }

    public void setDoubleField78(Double doubleField78) {
        this.doubleField78 = doubleField78;
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
