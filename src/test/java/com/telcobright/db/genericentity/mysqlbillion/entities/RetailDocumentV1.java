package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.io.Serializable;

/**
 * MySQL Entity: RetailDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class RetailDocumentV1 implements Serializable {
    private static final long serialVersionUID = 174L;

    private Long id;
    private Byte tinyIntField62;
    private Short smallIntField86;
    private Integer intField48;
    private Long bigIntField71;
    private BigDecimal decimalField74;
    private BigDecimal priceField;
    private Float floatField48;
    private Double doubleField91;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;

    public RetailDocumentV1() {}

    public RetailDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField62() {
        return tinyIntField62;
    }

    public void setTinyIntField62(Byte tinyIntField62) {
        this.tinyIntField62 = tinyIntField62;
    }

    public Short getSmallIntField86() {
        return smallIntField86;
    }

    public void setSmallIntField86(Short smallIntField86) {
        this.smallIntField86 = smallIntField86;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField71() {
        return bigIntField71;
    }

    public void setBigIntField71(Long bigIntField71) {
        this.bigIntField71 = bigIntField71;
    }

    public BigDecimal getDecimalField74() {
        return decimalField74;
    }

    public void setDecimalField74(BigDecimal decimalField74) {
        this.decimalField74 = decimalField74;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField48() {
        return floatField48;
    }

    public void setFloatField48(Float floatField48) {
        this.floatField48 = floatField48;
    }

    public Double getDoubleField91() {
        return doubleField91;
    }

    public void setDoubleField91(Double doubleField91) {
        this.doubleField91 = doubleField91;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
