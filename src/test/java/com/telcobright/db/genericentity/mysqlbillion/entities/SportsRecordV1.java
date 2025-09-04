package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: SportsRecordV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SportsRecordV1 implements Serializable {
    private static final long serialVersionUID = 1257L;

    private Long id;
    private Byte tinyIntField35;
    private Short smallIntField55;
    private Integer intField51;
    private Long bigIntField79;
    private BigDecimal decimalField18;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField83;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SportsRecordV1() {}

    public SportsRecordV1(Long id, String code, String name) {
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

    public Short getSmallIntField55() {
        return smallIntField55;
    }

    public void setSmallIntField55(Short smallIntField55) {
        this.smallIntField55 = smallIntField55;
    }

    public Integer getIntField51() {
        return intField51;
    }

    public void setIntField51(Integer intField51) {
        this.intField51 = intField51;
    }

    public Long getBigIntField79() {
        return bigIntField79;
    }

    public void setBigIntField79(Long bigIntField79) {
        this.bigIntField79 = bigIntField79;
    }

    public BigDecimal getDecimalField18() {
        return decimalField18;
    }

    public void setDecimalField18(BigDecimal decimalField18) {
        this.decimalField18 = decimalField18;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField80() {
        return floatField80;
    }

    public void setFloatField80(Float floatField80) {
        this.floatField80 = floatField80;
    }

    public Double getDoubleField83() {
        return doubleField83;
    }

    public void setDoubleField83(Double doubleField83) {
        this.doubleField83 = doubleField83;
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
