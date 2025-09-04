package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HealthcareCertificateV1 implements Serializable {
    private static final long serialVersionUID = 111L;

    private Long id;
    private Byte tinyIntField93;
    private Short smallIntField70;
    private Integer intField57;
    private Long bigIntField97;
    private BigDecimal decimalField9;
    private BigDecimal priceField;
    private Float floatField20;
    private Double doubleField84;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public HealthcareCertificateV1() {}

    public HealthcareCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField93() {
        return tinyIntField93;
    }

    public void setTinyIntField93(Byte tinyIntField93) {
        this.tinyIntField93 = tinyIntField93;
    }

    public Short getSmallIntField70() {
        return smallIntField70;
    }

    public void setSmallIntField70(Short smallIntField70) {
        this.smallIntField70 = smallIntField70;
    }

    public Integer getIntField57() {
        return intField57;
    }

    public void setIntField57(Integer intField57) {
        this.intField57 = intField57;
    }

    public Long getBigIntField97() {
        return bigIntField97;
    }

    public void setBigIntField97(Long bigIntField97) {
        this.bigIntField97 = bigIntField97;
    }

    public BigDecimal getDecimalField9() {
        return decimalField9;
    }

    public void setDecimalField9(BigDecimal decimalField9) {
        this.decimalField9 = decimalField9;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField20() {
        return floatField20;
    }

    public void setFloatField20(Float floatField20) {
        this.floatField20 = floatField20;
    }

    public Double getDoubleField84() {
        return doubleField84;
    }

    public void setDoubleField84(Double doubleField84) {
        this.doubleField84 = doubleField84;
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
