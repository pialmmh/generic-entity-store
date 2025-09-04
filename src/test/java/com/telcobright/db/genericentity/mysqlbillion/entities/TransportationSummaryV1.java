package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationSummaryV1 implements Serializable {
    private static final long serialVersionUID = 939L;

    private Long id;
    private Byte tinyIntField26;
    private Short smallIntField80;
    private Integer intField94;
    private Long bigIntField22;
    private BigDecimal decimalField5;
    private BigDecimal priceField;
    private Float floatField6;
    private Double doubleField81;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TransportationSummaryV1() {}

    public TransportationSummaryV1(Long id, String code, String name) {
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

    public Short getSmallIntField80() {
        return smallIntField80;
    }

    public void setSmallIntField80(Short smallIntField80) {
        this.smallIntField80 = smallIntField80;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField22() {
        return bigIntField22;
    }

    public void setBigIntField22(Long bigIntField22) {
        this.bigIntField22 = bigIntField22;
    }

    public BigDecimal getDecimalField5() {
        return decimalField5;
    }

    public void setDecimalField5(BigDecimal decimalField5) {
        this.decimalField5 = decimalField5;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField6() {
        return floatField6;
    }

    public void setFloatField6(Float floatField6) {
        this.floatField6 = floatField6;
    }

    public Double getDoubleField81() {
        return doubleField81;
    }

    public void setDoubleField81(Double doubleField81) {
        this.doubleField81 = doubleField81;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
