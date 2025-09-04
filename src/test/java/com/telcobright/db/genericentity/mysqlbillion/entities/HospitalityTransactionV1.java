package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: HospitalityTransactionV1
 * Variant 1 with specific MySQL data type combinations
 */
public class HospitalityTransactionV1 implements Serializable {
    private static final long serialVersionUID = 1188L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField97;
    private Integer intField95;
    private Long bigIntField66;
    private BigDecimal decimalField79;
    private BigDecimal priceField;
    private Float floatField37;
    private Double doubleField4;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public HospitalityTransactionV1() {}

    public HospitalityTransactionV1(Long id, String code, String name) {
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

    public Byte getTinyIntField72() {
        return tinyIntField72;
    }

    public void setTinyIntField72(Byte tinyIntField72) {
        this.tinyIntField72 = tinyIntField72;
    }

    public Short getSmallIntField97() {
        return smallIntField97;
    }

    public void setSmallIntField97(Short smallIntField97) {
        this.smallIntField97 = smallIntField97;
    }

    public Integer getIntField95() {
        return intField95;
    }

    public void setIntField95(Integer intField95) {
        this.intField95 = intField95;
    }

    public Long getBigIntField66() {
        return bigIntField66;
    }

    public void setBigIntField66(Long bigIntField66) {
        this.bigIntField66 = bigIntField66;
    }

    public BigDecimal getDecimalField79() {
        return decimalField79;
    }

    public void setDecimalField79(BigDecimal decimalField79) {
        this.decimalField79 = decimalField79;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField37() {
        return floatField37;
    }

    public void setFloatField37(Float floatField37) {
        this.floatField37 = floatField37;
    }

    public Double getDoubleField4() {
        return doubleField4;
    }

    public void setDoubleField4(Double doubleField4) {
        this.doubleField4 = doubleField4;
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
