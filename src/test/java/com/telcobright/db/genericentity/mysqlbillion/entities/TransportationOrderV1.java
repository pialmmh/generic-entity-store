package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationOrderV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationOrderV1 implements Serializable {
    private static final long serialVersionUID = 975L;

    private Long id;
    private Byte tinyIntField46;
    private Short smallIntField68;
    private Integer intField76;
    private Long bigIntField27;
    private BigDecimal decimalField33;
    private BigDecimal priceField;
    private Float floatField29;
    private Double doubleField9;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TransportationOrderV1() {}

    public TransportationOrderV1(Long id, String code, String name) {
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

    public Byte getTinyIntField46() {
        return tinyIntField46;
    }

    public void setTinyIntField46(Byte tinyIntField46) {
        this.tinyIntField46 = tinyIntField46;
    }

    public Short getSmallIntField68() {
        return smallIntField68;
    }

    public void setSmallIntField68(Short smallIntField68) {
        this.smallIntField68 = smallIntField68;
    }

    public Integer getIntField76() {
        return intField76;
    }

    public void setIntField76(Integer intField76) {
        this.intField76 = intField76;
    }

    public Long getBigIntField27() {
        return bigIntField27;
    }

    public void setBigIntField27(Long bigIntField27) {
        this.bigIntField27 = bigIntField27;
    }

    public BigDecimal getDecimalField33() {
        return decimalField33;
    }

    public void setDecimalField33(BigDecimal decimalField33) {
        this.decimalField33 = decimalField33;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField29() {
        return floatField29;
    }

    public void setFloatField29(Float floatField29) {
        this.floatField29 = floatField29;
    }

    public Double getDoubleField9() {
        return doubleField9;
    }

    public void setDoubleField9(Double doubleField9) {
        this.doubleField9 = doubleField9;
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
