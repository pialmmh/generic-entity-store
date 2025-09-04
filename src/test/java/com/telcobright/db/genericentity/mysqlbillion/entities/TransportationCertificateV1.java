package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationCertificateV1 implements Serializable {
    private static final long serialVersionUID = 969L;

    private Long id;
    private Byte tinyIntField95;
    private Short smallIntField40;
    private Integer intField39;
    private Long bigIntField95;
    private BigDecimal decimalField7;
    private BigDecimal priceField;
    private Float floatField78;
    private Double doubleField23;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public TransportationCertificateV1() {}

    public TransportationCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField95() {
        return tinyIntField95;
    }

    public void setTinyIntField95(Byte tinyIntField95) {
        this.tinyIntField95 = tinyIntField95;
    }

    public Short getSmallIntField40() {
        return smallIntField40;
    }

    public void setSmallIntField40(Short smallIntField40) {
        this.smallIntField40 = smallIntField40;
    }

    public Integer getIntField39() {
        return intField39;
    }

    public void setIntField39(Integer intField39) {
        this.intField39 = intField39;
    }

    public Long getBigIntField95() {
        return bigIntField95;
    }

    public void setBigIntField95(Long bigIntField95) {
        this.bigIntField95 = bigIntField95;
    }

    public BigDecimal getDecimalField7() {
        return decimalField7;
    }

    public void setDecimalField7(BigDecimal decimalField7) {
        this.decimalField7 = decimalField7;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField78() {
        return floatField78;
    }

    public void setFloatField78(Float floatField78) {
        this.floatField78 = floatField78;
    }

    public Double getDoubleField23() {
        return doubleField23;
    }

    public void setDoubleField23(Double doubleField23) {
        this.doubleField23 = doubleField23;
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
