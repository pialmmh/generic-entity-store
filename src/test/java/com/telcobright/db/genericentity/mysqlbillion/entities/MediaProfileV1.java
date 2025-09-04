package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaProfileV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaProfileV1 implements Serializable {
    private static final long serialVersionUID = 894L;

    private Long id;
    private Byte tinyIntField0;
    private Short smallIntField25;
    private Integer intField86;
    private Long bigIntField31;
    private BigDecimal decimalField4;
    private BigDecimal priceField;
    private Float floatField18;
    private Double doubleField30;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public MediaProfileV1() {}

    public MediaProfileV1(Long id, String code, String name) {
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

    public Byte getTinyIntField0() {
        return tinyIntField0;
    }

    public void setTinyIntField0(Byte tinyIntField0) {
        this.tinyIntField0 = tinyIntField0;
    }

    public Short getSmallIntField25() {
        return smallIntField25;
    }

    public void setSmallIntField25(Short smallIntField25) {
        this.smallIntField25 = smallIntField25;
    }

    public Integer getIntField86() {
        return intField86;
    }

    public void setIntField86(Integer intField86) {
        this.intField86 = intField86;
    }

    public Long getBigIntField31() {
        return bigIntField31;
    }

    public void setBigIntField31(Long bigIntField31) {
        this.bigIntField31 = bigIntField31;
    }

    public BigDecimal getDecimalField4() {
        return decimalField4;
    }

    public void setDecimalField4(BigDecimal decimalField4) {
        this.decimalField4 = decimalField4;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField18() {
        return floatField18;
    }

    public void setFloatField18(Float floatField18) {
        this.floatField18 = floatField18;
    }

    public Double getDoubleField30() {
        return doubleField30;
    }

    public void setDoubleField30(Double doubleField30) {
        this.doubleField30 = doubleField30;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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
