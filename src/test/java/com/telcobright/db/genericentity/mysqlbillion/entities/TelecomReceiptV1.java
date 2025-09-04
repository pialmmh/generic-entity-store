package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomReceiptV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomReceiptV1 implements Serializable {
    private static final long serialVersionUID = 519L;

    private Long id;
    private Byte tinyIntField18;
    private Short smallIntField85;
    private Integer intField40;
    private Long bigIntField37;
    private BigDecimal decimalField72;
    private BigDecimal priceField;
    private Float floatField74;
    private Double doubleField53;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public TelecomReceiptV1() {}

    public TelecomReceiptV1(Long id, String code, String name) {
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

    public Byte getTinyIntField18() {
        return tinyIntField18;
    }

    public void setTinyIntField18(Byte tinyIntField18) {
        this.tinyIntField18 = tinyIntField18;
    }

    public Short getSmallIntField85() {
        return smallIntField85;
    }

    public void setSmallIntField85(Short smallIntField85) {
        this.smallIntField85 = smallIntField85;
    }

    public Integer getIntField40() {
        return intField40;
    }

    public void setIntField40(Integer intField40) {
        this.intField40 = intField40;
    }

    public Long getBigIntField37() {
        return bigIntField37;
    }

    public void setBigIntField37(Long bigIntField37) {
        this.bigIntField37 = bigIntField37;
    }

    public BigDecimal getDecimalField72() {
        return decimalField72;
    }

    public void setDecimalField72(BigDecimal decimalField72) {
        this.decimalField72 = decimalField72;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField74() {
        return floatField74;
    }

    public void setFloatField74(Float floatField74) {
        this.floatField74 = floatField74;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
