package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationPaymentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationPaymentV1 implements Serializable {
    private static final long serialVersionUID = 978L;

    private Long id;
    private Byte tinyIntField5;
    private Short smallIntField0;
    private Integer intField76;
    private Long bigIntField78;
    private BigDecimal decimalField22;
    private BigDecimal priceField;
    private Float floatField61;
    private Double doubleField77;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TransportationPaymentV1() {}

    public TransportationPaymentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField5() {
        return tinyIntField5;
    }

    public void setTinyIntField5(Byte tinyIntField5) {
        this.tinyIntField5 = tinyIntField5;
    }

    public Short getSmallIntField0() {
        return smallIntField0;
    }

    public void setSmallIntField0(Short smallIntField0) {
        this.smallIntField0 = smallIntField0;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField78() {
        return bigIntField78;
    }

    public void setBigIntField78(Long bigIntField78) {
        this.bigIntField78 = bigIntField78;
    }

    public BigDecimal getDecimalField22() {
        return decimalField22;
    }

    public void setDecimalField22(BigDecimal decimalField22) {
        this.decimalField22 = decimalField22;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField61() {
        return floatField61;
    }

    public void setFloatField61(Float floatField61) {
        this.floatField61 = floatField61;
    }

    public Double getDoubleField77() {
        return doubleField77;
    }

    public void setDoubleField77(Double doubleField77) {
        this.doubleField77 = doubleField77;
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
