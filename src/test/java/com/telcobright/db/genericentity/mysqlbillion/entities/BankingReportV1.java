package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingReportV1 implements Serializable {
    private static final long serialVersionUID = 621L;

    private Long id;
    private Byte tinyIntField26;
    private Short smallIntField67;
    private Integer intField49;
    private Long bigIntField21;
    private BigDecimal decimalField27;
    private BigDecimal priceField;
    private Float floatField90;
    private Double doubleField3;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingReportV1() {}

    public BankingReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField26() {
        return tinyIntField26;
    }

    public void setTinyIntField26(Byte tinyIntField26) {
        this.tinyIntField26 = tinyIntField26;
    }

    public Short getSmallIntField67() {
        return smallIntField67;
    }

    public void setSmallIntField67(Short smallIntField67) {
        this.smallIntField67 = smallIntField67;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField21() {
        return bigIntField21;
    }

    public void setBigIntField21(Long bigIntField21) {
        this.bigIntField21 = bigIntField21;
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

    public Float getFloatField90() {
        return floatField90;
    }

    public void setFloatField90(Float floatField90) {
        this.floatField90 = floatField90;
    }

    public Double getDoubleField3() {
        return doubleField3;
    }

    public void setDoubleField3(Double doubleField3) {
        this.doubleField3 = doubleField3;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
