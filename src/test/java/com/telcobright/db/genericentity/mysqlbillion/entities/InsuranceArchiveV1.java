package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class InsuranceArchiveV1 implements Serializable {
    private static final long serialVersionUID = 549L;

    private Long id;
    private Byte tinyIntField86;
    private Short smallIntField45;
    private Integer intField85;
    private Long bigIntField11;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField46;
    private Double doubleField47;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public InsuranceArchiveV1() {}

    public InsuranceArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField86() {
        return tinyIntField86;
    }

    public void setTinyIntField86(Byte tinyIntField86) {
        this.tinyIntField86 = tinyIntField86;
    }

    public Short getSmallIntField45() {
        return smallIntField45;
    }

    public void setSmallIntField45(Short smallIntField45) {
        this.smallIntField45 = smallIntField45;
    }

    public Integer getIntField85() {
        return intField85;
    }

    public void setIntField85(Integer intField85) {
        this.intField85 = intField85;
    }

    public Long getBigIntField11() {
        return bigIntField11;
    }

    public void setBigIntField11(Long bigIntField11) {
        this.bigIntField11 = bigIntField11;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
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

    public Double getDoubleField47() {
        return doubleField47;
    }

    public void setDoubleField47(Double doubleField47) {
        this.doubleField47 = doubleField47;
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
