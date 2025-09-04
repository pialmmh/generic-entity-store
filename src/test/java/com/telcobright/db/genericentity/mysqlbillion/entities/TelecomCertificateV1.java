package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: TelecomCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TelecomCertificateV1 implements Serializable {
    private static final long serialVersionUID = 507L;

    private Long id;
    private Byte tinyIntField71;
    private Short smallIntField58;
    private Integer intField48;
    private Long bigIntField68;
    private BigDecimal decimalField51;
    private BigDecimal priceField;
    private Float floatField67;
    private Double doubleField35;
    private String code;
    private String name;
    private String description;
    private String largeText;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TelecomCertificateV1() {}

    public TelecomCertificateV1(Long id, String code, String name) {
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

    public Short getSmallIntField58() {
        return smallIntField58;
    }

    public void setSmallIntField58(Short smallIntField58) {
        this.smallIntField58 = smallIntField58;
    }

    public Integer getIntField48() {
        return intField48;
    }

    public void setIntField48(Integer intField48) {
        this.intField48 = intField48;
    }

    public Long getBigIntField68() {
        return bigIntField68;
    }

    public void setBigIntField68(Long bigIntField68) {
        this.bigIntField68 = bigIntField68;
    }

    public BigDecimal getDecimalField51() {
        return decimalField51;
    }

    public void setDecimalField51(BigDecimal decimalField51) {
        this.decimalField51 = decimalField51;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField67() {
        return floatField67;
    }

    public void setFloatField67(Float floatField67) {
        this.floatField67 = floatField67;
    }

    public Double getDoubleField35() {
        return doubleField35;
    }

    public void setDoubleField35(Double doubleField35) {
        this.doubleField35 = doubleField35;
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
