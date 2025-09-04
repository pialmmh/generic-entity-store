package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class EcommerceDocumentV1 implements Serializable {
    private static final long serialVersionUID = 702L;

    private Long id;
    private Byte tinyIntField35;
    private Short smallIntField91;
    private Integer intField49;
    private Long bigIntField19;
    private BigDecimal decimalField4;
    private BigDecimal priceField;
    private Float floatField9;
    private Double doubleField46;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public EcommerceDocumentV1() {}

    public EcommerceDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField35() {
        return tinyIntField35;
    }

    public void setTinyIntField35(Byte tinyIntField35) {
        this.tinyIntField35 = tinyIntField35;
    }

    public Short getSmallIntField91() {
        return smallIntField91;
    }

    public void setSmallIntField91(Short smallIntField91) {
        this.smallIntField91 = smallIntField91;
    }

    public Integer getIntField49() {
        return intField49;
    }

    public void setIntField49(Integer intField49) {
        this.intField49 = intField49;
    }

    public Long getBigIntField19() {
        return bigIntField19;
    }

    public void setBigIntField19(Long bigIntField19) {
        this.bigIntField19 = bigIntField19;
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

    public Float getFloatField9() {
        return floatField9;
    }

    public void setFloatField9(Float floatField9) {
        this.floatField9 = floatField9;
    }

    public Double getDoubleField46() {
        return doubleField46;
    }

    public void setDoubleField46(Double doubleField46) {
        this.doubleField46 = doubleField46;
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
