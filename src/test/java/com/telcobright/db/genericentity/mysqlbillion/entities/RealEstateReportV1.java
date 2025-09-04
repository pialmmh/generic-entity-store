package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: RealEstateReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RealEstateReportV1 implements Serializable {
    private static final long serialVersionUID = 1017L;

    private Long id;
    private Byte tinyIntField4;
    private Short smallIntField7;
    private Integer intField92;
    private Long bigIntField92;
    private BigDecimal decimalField69;
    private BigDecimal priceField;
    private Float floatField89;
    private Double doubleField53;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RealEstateReportV1() {}

    public RealEstateReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField4() {
        return tinyIntField4;
    }

    public void setTinyIntField4(Byte tinyIntField4) {
        this.tinyIntField4 = tinyIntField4;
    }

    public Short getSmallIntField7() {
        return smallIntField7;
    }

    public void setSmallIntField7(Short smallIntField7) {
        this.smallIntField7 = smallIntField7;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField92() {
        return bigIntField92;
    }

    public void setBigIntField92(Long bigIntField92) {
        this.bigIntField92 = bigIntField92;
    }

    public BigDecimal getDecimalField69() {
        return decimalField69;
    }

    public void setDecimalField69(BigDecimal decimalField69) {
        this.decimalField69 = decimalField69;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField89() {
        return floatField89;
    }

    public void setFloatField89(Float floatField89) {
        this.floatField89 = floatField89;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
