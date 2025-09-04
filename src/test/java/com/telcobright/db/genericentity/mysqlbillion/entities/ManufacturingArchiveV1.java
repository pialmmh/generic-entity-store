package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingArchiveV1 implements Serializable {
    private static final long serialVersionUID = 219L;

    private Long id;
    private Byte tinyIntField94;
    private Short smallIntField37;
    private Integer intField94;
    private Long bigIntField22;
    private BigDecimal decimalField23;
    private BigDecimal priceField;
    private Float floatField57;
    private Double doubleField93;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public ManufacturingArchiveV1() {}

    public ManufacturingArchiveV1(Long id, String code, String name) {
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

    public Short getSmallIntField37() {
        return smallIntField37;
    }

    public void setSmallIntField37(Short smallIntField37) {
        this.smallIntField37 = smallIntField37;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField22() {
        return bigIntField22;
    }

    public void setBigIntField22(Long bigIntField22) {
        this.bigIntField22 = bigIntField22;
    }

    public BigDecimal getDecimalField23() {
        return decimalField23;
    }

    public void setDecimalField23(BigDecimal decimalField23) {
        this.decimalField23 = decimalField23;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField57() {
        return floatField57;
    }

    public void setFloatField57(Float floatField57) {
        this.floatField57 = floatField57;
    }

    public Double getDoubleField93() {
        return doubleField93;
    }

    public void setDoubleField93(Double doubleField93) {
        this.doubleField93 = doubleField93;
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

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
