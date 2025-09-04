package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationInvoiceV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationInvoiceV1 implements Serializable {
    private static final long serialVersionUID = 972L;

    private Long id;
    private Byte tinyIntField72;
    private Short smallIntField56;
    private Integer intField94;
    private Long bigIntField93;
    private BigDecimal decimalField20;
    private BigDecimal priceField;
    private Float floatField80;
    private Double doubleField52;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TransportationInvoiceV1() {}

    public TransportationInvoiceV1(Long id, String code, String name) {
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

    public Short getSmallIntField56() {
        return smallIntField56;
    }

    public void setSmallIntField56(Short smallIntField56) {
        this.smallIntField56 = smallIntField56;
    }

    public Integer getIntField94() {
        return intField94;
    }

    public void setIntField94(Integer intField94) {
        this.intField94 = intField94;
    }

    public Long getBigIntField93() {
        return bigIntField93;
    }

    public void setBigIntField93(Long bigIntField93) {
        this.bigIntField93 = bigIntField93;
    }

    public BigDecimal getDecimalField20() {
        return decimalField20;
    }

    public void setDecimalField20(BigDecimal decimalField20) {
        this.decimalField20 = decimalField20;
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

    public Double getDoubleField52() {
        return doubleField52;
    }

    public void setDoubleField52(Double doubleField52) {
        this.doubleField52 = doubleField52;
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
