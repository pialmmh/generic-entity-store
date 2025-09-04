package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: BankingArchiveV1
 * Variant 1 with specific MySQL data type combinations
 */
public class BankingArchiveV1 implements Serializable {
    private static final long serialVersionUID = 615L;

    private Long id;
    private Byte tinyIntField71;
    private Short smallIntField83;
    private Integer intField59;
    private Long bigIntField67;
    private BigDecimal decimalField96;
    private BigDecimal priceField;
    private Float floatField35;
    private Double doubleField78;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public BankingArchiveV1() {}

    public BankingArchiveV1(Long id, String code, String name) {
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

    public Byte getTinyIntField71() {
        return tinyIntField71;
    }

    public void setTinyIntField71(Byte tinyIntField71) {
        this.tinyIntField71 = tinyIntField71;
    }

    public Short getSmallIntField83() {
        return smallIntField83;
    }

    public void setSmallIntField83(Short smallIntField83) {
        this.smallIntField83 = smallIntField83;
    }

    public Integer getIntField59() {
        return intField59;
    }

    public void setIntField59(Integer intField59) {
        this.intField59 = intField59;
    }

    public Long getBigIntField67() {
        return bigIntField67;
    }

    public void setBigIntField67(Long bigIntField67) {
        this.bigIntField67 = bigIntField67;
    }

    public BigDecimal getDecimalField96() {
        return decimalField96;
    }

    public void setDecimalField96(BigDecimal decimalField96) {
        this.decimalField96 = decimalField96;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField35() {
        return floatField35;
    }

    public void setFloatField35(Float floatField35) {
        this.floatField35 = floatField35;
    }

    public Double getDoubleField78() {
        return doubleField78;
    }

    public void setDoubleField78(Double doubleField78) {
        this.doubleField78 = doubleField78;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
