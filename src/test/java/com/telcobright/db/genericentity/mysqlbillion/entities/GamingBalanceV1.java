package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: GamingBalanceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class GamingBalanceV1 implements Serializable {
    private static final long serialVersionUID = 855L;

    private Long id;
    private Byte tinyIntField3;
    private Short smallIntField74;
    private Integer intField48;
    private Long bigIntField80;
    private BigDecimal decimalField62;
    private BigDecimal priceField;
    private Float floatField94;
    private Double doubleField73;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public GamingBalanceV1() {}

    public GamingBalanceV1(Long id, String code, String name) {
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

    public Byte getTinyIntField3() {
        return tinyIntField3;
    }

    public void setTinyIntField3(Byte tinyIntField3) {
        this.tinyIntField3 = tinyIntField3;
    }

    public Short getSmallIntField74() {
        return smallIntField74;
    }

    public void setSmallIntField74(Short smallIntField74) {
        this.smallIntField74 = smallIntField74;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField80() {
        return bigIntField80;
    }

    public void setBigIntField80(Long bigIntField80) {
        this.bigIntField80 = bigIntField80;
    }

    public BigDecimal getDecimalField62() {
        return decimalField62;
    }

    public void setDecimalField62(BigDecimal decimalField62) {
        this.decimalField62 = decimalField62;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField94() {
        return floatField94;
    }

    public void setFloatField94(Float floatField94) {
        this.floatField94 = floatField94;
    }

    public Double getDoubleField73() {
        return doubleField73;
    }

    public void setDoubleField73(Double doubleField73) {
        this.doubleField73 = doubleField73;
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
