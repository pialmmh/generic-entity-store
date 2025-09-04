package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class LogisticsDocumentV1 implements Serializable {
    private static final long serialVersionUID = 306L;

    private Long id;
    private Byte tinyIntField76;
    private Short smallIntField77;
    private Integer intField92;
    private Long bigIntField16;
    private BigDecimal decimalField55;
    private BigDecimal priceField;
    private Float floatField1;
    private Double doubleField69;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public LogisticsDocumentV1() {}

    public LogisticsDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField76() {
        return tinyIntField76;
    }

    public void setTinyIntField76(Byte tinyIntField76) {
        this.tinyIntField76 = tinyIntField76;
    }

    public Short getSmallIntField77() {
        return smallIntField77;
    }

    public void setSmallIntField77(Short smallIntField77) {
        this.smallIntField77 = smallIntField77;
    }

    public Integer getIntField92() {
        return intField92;
    }

    public void setIntField92(Integer intField92) {
        this.intField92 = intField92;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField55() {
        return decimalField55;
    }

    public void setDecimalField55(BigDecimal decimalField55) {
        this.decimalField55 = decimalField55;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField1() {
        return floatField1;
    }

    public void setFloatField1(Float floatField1) {
        this.floatField1 = floatField1;
    }

    public Double getDoubleField69() {
        return doubleField69;
    }

    public void setDoubleField69(Double doubleField69) {
        this.doubleField69 = doubleField69;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
