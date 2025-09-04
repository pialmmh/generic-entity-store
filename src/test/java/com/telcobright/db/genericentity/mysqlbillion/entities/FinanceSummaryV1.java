package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceSummaryV1
 * Variant 1 with specific MySQL data type combinations
 */
public class FinanceSummaryV1 implements Serializable {
    private static final long serialVersionUID = 15L;

    private Long id;
    private Byte tinyIntField41;
    private Short smallIntField72;
    private Integer intField38;
    private Long bigIntField67;
    private BigDecimal decimalField85;
    private BigDecimal priceField;
    private Float floatField60;
    private Double doubleField59;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public FinanceSummaryV1() {}

    public FinanceSummaryV1(Long id, String code, String name) {
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

    public Byte getTinyIntField41() {
        return tinyIntField41;
    }

    public void setTinyIntField41(Byte tinyIntField41) {
        this.tinyIntField41 = tinyIntField41;
    }

    public Short getSmallIntField72() {
        return smallIntField72;
    }

    public void setSmallIntField72(Short smallIntField72) {
        this.smallIntField72 = smallIntField72;
    }

    public Integer getIntField38() {
        return intField38;
    }

    public void setIntField38(Integer intField38) {
        this.intField38 = intField38;
    }

    public Long getBigIntField67() {
        return bigIntField67;
    }

    public void setBigIntField67(Long bigIntField67) {
        this.bigIntField67 = bigIntField67;
    }

    public BigDecimal getDecimalField85() {
        return decimalField85;
    }

    public void setDecimalField85(BigDecimal decimalField85) {
        this.decimalField85 = decimalField85;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField60() {
        return floatField60;
    }

    public void setFloatField60(Float floatField60) {
        this.floatField60 = floatField60;
    }

    public Double getDoubleField59() {
        return doubleField59;
    }

    public void setDoubleField59(Double doubleField59) {
        this.doubleField59 = doubleField59;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
