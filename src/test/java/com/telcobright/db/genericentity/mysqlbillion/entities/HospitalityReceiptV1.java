package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityReceiptV1 implements Serializable {
    private static final long serialVersionUID = 1245L;

    private Long id;
    private Byte tinyIntField11;
    private Short smallIntField60;
    private Integer intField68;
    private Long bigIntField51;
    private BigDecimal decimalField85;
    private BigDecimal priceField;
    private Float floatField52;
    private Double doubleField16;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public HospitalityReceiptV1() {}

    public HospitalityReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField11() {
        return tinyIntField11;
    }

    public void setTinyIntField11(Byte tinyIntField11) {
        this.tinyIntField11 = tinyIntField11;
    }

    public Short getSmallIntField60() {
        return smallIntField60;
    }

    public void setSmallIntField60(Short smallIntField60) {
        this.smallIntField60 = smallIntField60;
    }

    public Integer getIntField68() {
        return intField68;
    }

    public void setIntField68(Integer intField68) {
        this.intField68 = intField68;
    }

    public Long getBigIntField51() {
        return bigIntField51;
    }

    public void setBigIntField51(Long bigIntField51) {
        this.bigIntField51 = bigIntField51;
    }

    public BigDecimal getDecimalField85() {
        return decimalField85;
    }

    public void setDecimalField85(BigDecimal decimalField85) {
        this.decimalField85 = decimalField85;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField52() {
        return floatField52;
    }

    public void setFloatField52(Float floatField52) {
        this.floatField52 = floatField52;
    }

    public Double getDoubleField16() {
        return doubleField16;
    }

    public void setDoubleField16(Double doubleField16) {
        this.doubleField16 = doubleField16;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
