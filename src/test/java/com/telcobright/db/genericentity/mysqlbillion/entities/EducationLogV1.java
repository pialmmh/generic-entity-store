package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: EducationLogV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EducationLogV1 implements Serializable {
    private static final long serialVersionUID = 339L;

    private Long id;
    private Byte tinyIntField20;
    private Short smallIntField48;
    private Integer intField66;
    private Long bigIntField76;
    private BigDecimal decimalField18;
    private BigDecimal priceField;
    private Float floatField22;
    private Double doubleField21;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public EducationLogV1() {}

    public EducationLogV1(Long id, String code, String name) {
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

    public Byte getTinyIntField20() {
        return tinyIntField20;
    }

    public void setTinyIntField20(Byte tinyIntField20) {
        this.tinyIntField20 = tinyIntField20;
    }

    public Short getSmallIntField48() {
        return smallIntField48;
    }

    public void setSmallIntField48(Short smallIntField48) {
        this.smallIntField48 = smallIntField48;
    }

    public Integer getIntField66() {
        return intField66;
    }

    public void setIntField66(Integer intField66) {
        this.intField66 = intField66;
    }

    public Long getBigIntField76() {
        return bigIntField76;
    }

    public void setBigIntField76(Long bigIntField76) {
        this.bigIntField76 = bigIntField76;
    }

    public BigDecimal getDecimalField18() {
        return decimalField18;
    }

    public void setDecimalField18(BigDecimal decimalField18) {
        this.decimalField18 = decimalField18;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField22() {
        return floatField22;
    }

    public void setFloatField22(Float floatField22) {
        this.floatField22 = floatField22;
    }

    public Double getDoubleField21() {
        return doubleField21;
    }

    public void setDoubleField21(Double doubleField21) {
        this.doubleField21 = doubleField21;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
