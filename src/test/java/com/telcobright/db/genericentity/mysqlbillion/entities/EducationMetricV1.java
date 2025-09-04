package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationMetricV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationMetricV1 implements Serializable {
    private static final long serialVersionUID = 360L;

    private Long id;
    private Byte tinyIntField76;
    private Short smallIntField43;
    private Integer intField47;
    private Long bigIntField3;
    private BigDecimal decimalField48;
    private BigDecimal priceField;
    private Float floatField7;
    private Double doubleField89;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public EducationMetricV1() {}

    public EducationMetricV1(Long id, String code, String name) {
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

    public Byte getTinyIntField76() {
        return tinyIntField76;
    }

    public void setTinyIntField76(Byte tinyIntField76) {
        this.tinyIntField76 = tinyIntField76;
    }

    public Short getSmallIntField43() {
        return smallIntField43;
    }

    public void setSmallIntField43(Short smallIntField43) {
        this.smallIntField43 = smallIntField43;
    }

    public Integer getIntField47() {
        return intField47;
    }

    public void setIntField47(Integer intField47) {
        this.intField47 = intField47;
    }

    public Long getBigIntField3() {
        return bigIntField3;
    }

    public void setBigIntField3(Long bigIntField3) {
        this.bigIntField3 = bigIntField3;
    }

    public BigDecimal getDecimalField48() {
        return decimalField48;
    }

    public void setDecimalField48(BigDecimal decimalField48) {
        this.decimalField48 = decimalField48;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField7() {
        return floatField7;
    }

    public void setFloatField7(Float floatField7) {
        this.floatField7 = floatField7;
    }

    public Double getDoubleField89() {
        return doubleField89;
    }

    public void setDoubleField89(Double doubleField89) {
        this.doubleField89 = doubleField89;
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
