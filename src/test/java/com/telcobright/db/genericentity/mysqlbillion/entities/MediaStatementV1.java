package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaStatementV1 implements Serializable {
    private static final long serialVersionUID = 918L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField90;
    private Integer intField39;
    private Long bigIntField54;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField80;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public MediaStatementV1() {}

    public MediaStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField90() {
        return smallIntField90;
    }

    public void setSmallIntField90(Short smallIntField90) {
        this.smallIntField90 = smallIntField90;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField54() {
        return bigIntField54;
    }

    public void setBigIntField54(Long bigIntField54) {
        this.bigIntField54 = bigIntField54;
    }

    public BigDecimal getDecimalField27() {
        return decimalField27;
    }

    public void setDecimalField27(BigDecimal decimalField27) {
        this.decimalField27 = decimalField27;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField80() {
        return doubleField80;
    }

    public void setDoubleField80(Double doubleField80) {
        this.doubleField80 = doubleField80;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
