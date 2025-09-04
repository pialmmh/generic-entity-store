package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityRecordV1 implements Serializable {
    private static final long serialVersionUID = 1191L;

    private Long id;
    private Byte tinyIntField47;
    private Short smallIntField9;
    private Integer intField76;
    private Long bigIntField0;
    private BigDecimal decimalField40;
    private BigDecimal priceField;
    private Float floatField86;
    private Double doubleField61;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Instant updatedAt;
    private Boolean isActive;

    public HospitalityRecordV1() {}

    public HospitalityRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField47() {
        return tinyIntField47;
    }

    public void setTinyIntField47(Byte tinyIntField47) {
        this.tinyIntField47 = tinyIntField47;
    }

    public Short getSmallIntField9() {
        return smallIntField9;
    }

    public void setSmallIntField9(Short smallIntField9) {
        this.smallIntField9 = smallIntField9;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField0() {
        return bigIntField0;
    }

    public void setBigIntField0(Long bigIntField0) {
        this.bigIntField0 = bigIntField0;
    }

    public BigDecimal getDecimalField40() {
        return decimalField40;
    }

    public void setDecimalField40(BigDecimal decimalField40) {
        this.decimalField40 = decimalField40;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField86() {
        return floatField86;
    }

    public void setFloatField86(Float floatField86) {
        this.floatField86 = floatField86;
    }

    public Double getDoubleField61() {
        return doubleField61;
    }

    public void setDoubleField61(Double doubleField61) {
        this.doubleField61 = doubleField61;
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
