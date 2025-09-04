package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: RetailHistoryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailHistoryV1 implements Serializable {
    private static final long serialVersionUID = 150L;

    private Long id;
    private Byte tinyIntField31;
    private Short smallIntField79;
    private Integer intField37;
    private Long bigIntField57;
    private BigDecimal decimalField31;
    private BigDecimal priceField;
    private Float floatField14;
    private Double doubleField14;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public RetailHistoryV1() {}

    public RetailHistoryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField31() {
        return tinyIntField31;
    }

    public void setTinyIntField31(Byte tinyIntField31) {
        this.tinyIntField31 = tinyIntField31;
    }

    public Short getSmallIntField79() {
        return smallIntField79;
    }

    public void setSmallIntField79(Short smallIntField79) {
        this.smallIntField79 = smallIntField79;
    }

    public Integer getIntField37() {
        return intField37;
    }

    public void setIntField37(Integer intField37) {
        this.intField37 = intField37;
    }

    public Long getBigIntField57() {
        return bigIntField57;
    }

    public void setBigIntField57(Long bigIntField57) {
        this.bigIntField57 = bigIntField57;
    }

    public BigDecimal getDecimalField31() {
        return decimalField31;
    }

    public void setDecimalField31(BigDecimal decimalField31) {
        this.decimalField31 = decimalField31;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField14() {
        return floatField14;
    }

    public void setFloatField14(Float floatField14) {
        this.floatField14 = floatField14;
    }

    public Double getDoubleField14() {
        return doubleField14;
    }

    public void setDoubleField14(Double doubleField14) {
        this.doubleField14 = doubleField14;
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
