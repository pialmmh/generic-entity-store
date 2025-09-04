package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SocialAuditV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialAuditV1 implements Serializable {
    private static final long serialVersionUID = 750L;

    private Long id;
    private Byte tinyIntField79;
    private Short smallIntField22;
    private Integer intField67;
    private Long bigIntField52;
    private BigDecimal decimalField66;
    private BigDecimal priceField;
    private Float floatField59;
    private Double doubleField41;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public SocialAuditV1() {}

    public SocialAuditV1(Long id, String code, String name) {
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

    public Byte getTinyIntField79() {
        return tinyIntField79;
    }

    public void setTinyIntField79(Byte tinyIntField79) {
        this.tinyIntField79 = tinyIntField79;
    }

    public Short getSmallIntField22() {
        return smallIntField22;
    }

    public void setSmallIntField22(Short smallIntField22) {
        this.smallIntField22 = smallIntField22;
    }

    public Integer getIntField67() {
        return intField67;
    }

    public void setIntField67(Integer intField67) {
        this.intField67 = intField67;
    }

    public Long getBigIntField52() {
        return bigIntField52;
    }

    public void setBigIntField52(Long bigIntField52) {
        this.bigIntField52 = bigIntField52;
    }

    public BigDecimal getDecimalField66() {
        return decimalField66;
    }

    public void setDecimalField66(BigDecimal decimalField66) {
        this.decimalField66 = decimalField66;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField59() {
        return floatField59;
    }

    public void setFloatField59(Float floatField59) {
        this.floatField59 = floatField59;
    }

    public Double getDoubleField41() {
        return doubleField41;
    }

    public void setDoubleField41(Double doubleField41) {
        this.doubleField41 = doubleField41;
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
