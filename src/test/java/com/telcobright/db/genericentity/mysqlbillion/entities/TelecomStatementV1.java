package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomStatementV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomStatementV1 implements Serializable {
    private static final long serialVersionUID = 522L;

    private Long id;
    private Byte tinyIntField94;
    private Short smallIntField1;
    private Integer intField48;
    private Long bigIntField83;
    private BigDecimal decimalField37;
    private BigDecimal priceField;
    private Float floatField76;
    private Double doubleField30;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private LocalTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TelecomStatementV1() {}

    public TelecomStatementV1(Long id, String code, String name) {
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

    public Byte getTinyIntField94() {
        return tinyIntField94;
    }

    public void setTinyIntField94(Byte tinyIntField94) {
        this.tinyIntField94 = tinyIntField94;
    }

    public Short getSmallIntField1() {
        return smallIntField1;
    }

    public void setSmallIntField1(Short smallIntField1) {
        this.smallIntField1 = smallIntField1;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField83() {
        return bigIntField83;
    }

    public void setBigIntField83(Long bigIntField83) {
        this.bigIntField83 = bigIntField83;
    }

    public BigDecimal getDecimalField37() {
        return decimalField37;
    }

    public void setDecimalField37(BigDecimal decimalField37) {
        this.decimalField37 = decimalField37;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField76() {
        return floatField76;
    }

    public void setFloatField76(Float floatField76) {
        this.floatField76 = floatField76;
    }

    public Double getDoubleField30() {
        return doubleField30;
    }

    public void setDoubleField30(Double doubleField30) {
        this.doubleField30 = doubleField30;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
