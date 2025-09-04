package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateStatementV1 implements Serializable {
    private static final long serialVersionUID = 1050L;

    private Long id;
    private Byte tinyIntField67;
    private Short smallIntField55;
    private Integer intField49;
    private Long bigIntField78;
    private BigDecimal decimalField15;
    private BigDecimal priceField;
    private Float floatField37;
    private Double doubleField85;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public RealEstateStatementV1() {}

    public RealEstateStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField67() {
        return tinyIntField67;
    }

    public void setTinyIntField67(Byte tinyIntField67) {
        this.tinyIntField67 = tinyIntField67;
    }

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField15() {
        return decimalField15;
    }

    public void setDecimalField15(BigDecimal decimalField15) {
        this.decimalField15 = decimalField15;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField37() {
        return floatField37;
    }

    public void setFloatField37(Float floatField37) {
        this.floatField37 = floatField37;
    }

    public Double getDoubleField85() {
        return doubleField85;
    }

    public void setDoubleField85(Double doubleField85) {
        this.doubleField85 = doubleField85;
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
