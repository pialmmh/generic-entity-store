package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationRecordV1 implements Serializable {
    private static final long serialVersionUID = 927L;

    private Long id;
    private Byte tinyIntField2;
    private Short smallIntField85;
    private Integer intField11;
    private Long bigIntField94;
    private BigDecimal decimalField71;
    private BigDecimal priceField;
    private Float floatField79;
    private Double doubleField62;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TransportationRecordV1() {}

    public TransportationRecordV1(Long id, String code, String name) {
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

    public Byte getTinyIntField2() {
        return tinyIntField2;
    }

    public void setTinyIntField2(Byte tinyIntField2) {
        this.tinyIntField2 = tinyIntField2;
    }

    public Short getSmallIntField85() {
        return smallIntField85;
    }

    public void setSmallIntField85(Short smallIntField85) {
        this.smallIntField85 = smallIntField85;
    }

    public Integer getIntField11() {
        return intField11;
    }

    public void setIntField11(Integer intField11) {
        this.intField11 = intField11;
    }

    public Long getBigIntField94() {
        return bigIntField94;
    }

    public void setBigIntField94(Long bigIntField94) {
        this.bigIntField94 = bigIntField94;
    }

    public BigDecimal getDecimalField71() {
        return decimalField71;
    }

    public void setDecimalField71(BigDecimal decimalField71) {
        this.decimalField71 = decimalField71;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField79() {
        return floatField79;
    }

    public void setFloatField79(Float floatField79) {
        this.floatField79 = floatField79;
    }

    public Double getDoubleField62() {
        return doubleField62;
    }

    public void setDoubleField62(Double doubleField62) {
        this.doubleField62 = doubleField62;
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
