package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaMetricV1 implements Serializable {
    private static final long serialVersionUID = 888L;

    private Long id;
    private Byte tinyIntField49;
    private Short smallIntField49;
    private Integer intField49;
    private Long bigIntField51;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField68;
    private Double doubleField44;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public MediaMetricV1() {}

    public MediaMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField49() {
        return tinyIntField49;
    }

    public void setTinyIntField49(Byte tinyIntField49) {
        this.tinyIntField49 = tinyIntField49;
    }

    public Short getSmallIntField49() {
        return smallIntField49;
    }

    public void setSmallIntField49(Short smallIntField49) {
        this.smallIntField49 = smallIntField49;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField51() {
        return bigIntField51;
    }

    public void setBigIntField51(Long bigIntField51) {
        this.bigIntField51 = bigIntField51;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField68() {
        return floatField68;
    }

    public void setFloatField68(Float floatField68) {
        this.floatField68 = floatField68;
    }

    public Double getDoubleField44() {
        return doubleField44;
    }

    public void setDoubleField44(Double doubleField44) {
        this.doubleField44 = doubleField44;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
