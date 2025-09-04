package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationReceiptV1 implements Serializable {
    private static final long serialVersionUID = 981L;

    private Long id;
    private Byte tinyIntField84;
    private Short smallIntField20;
    private Integer intField58;
    private Long bigIntField87;
    private BigDecimal decimalField40;
    private BigDecimal priceField;
    private Float floatField15;
    private Double doubleField26;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;

    public TransportationReceiptV1() {}

    public TransportationReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField84() {
        return tinyIntField84;
    }

    public void setTinyIntField84(Byte tinyIntField84) {
        this.tinyIntField84 = tinyIntField84;
    }

    public Short getSmallIntField20() {
        return smallIntField20;
    }

    public void setSmallIntField20(Short smallIntField20) {
        this.smallIntField20 = smallIntField20;
    }

    public Integer getIntField58() {
        return intField58;
    }

    public void setIntField58(Integer intField58) {
        this.intField58 = intField58;
    }

    public Long getBigIntField87() {
        return bigIntField87;
    }

    public void setBigIntField87(Long bigIntField87) {
        this.bigIntField87 = bigIntField87;
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

    public Float getFloatField15() {
        return floatField15;
    }

    public void setFloatField15(Float floatField15) {
        this.floatField15 = floatField15;
    }

    public Double getDoubleField26() {
        return doubleField26;
    }

    public void setDoubleField26(Double doubleField26) {
        this.doubleField26 = doubleField26;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
