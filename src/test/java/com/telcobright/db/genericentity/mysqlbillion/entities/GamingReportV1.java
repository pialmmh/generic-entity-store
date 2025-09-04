package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingReportV1 implements Serializable {
    private static final long serialVersionUID = 819L;

    private Long id;
    private Byte tinyIntField84;
    private Short smallIntField86;
    private Integer intField66;
    private Long bigIntField74;
    private BigDecimal decimalField86;
    private BigDecimal priceField;
    private Float floatField72;
    private Double doubleField45;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public GamingReportV1() {}

    public GamingReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField84() {
        return tinyIntField84;
    }

    public void setTinyIntField84(Byte tinyIntField84) {
        this.tinyIntField84 = tinyIntField84;
    }

    public Short getSmallIntField86() {
        return smallIntField86;
    }

    public void setSmallIntField86(Short smallIntField86) {
        this.smallIntField86 = smallIntField86;
    }

    public Integer getIntField66() {
        return intField66;
    }

    public void setIntField66(Integer intField66) {
        this.intField66 = intField66;
    }

    public Long getBigIntField74() {
        return bigIntField74;
    }

    public void setBigIntField74(Long bigIntField74) {
        this.bigIntField74 = bigIntField74;
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

    public Float getFloatField72() {
        return floatField72;
    }

    public void setFloatField72(Float floatField72) {
        this.floatField72 = floatField72;
    }

    public Double getDoubleField45() {
        return doubleField45;
    }

    public void setDoubleField45(Double doubleField45) {
        this.doubleField45 = doubleField45;
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
