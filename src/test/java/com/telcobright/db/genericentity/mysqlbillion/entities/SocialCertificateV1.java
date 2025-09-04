package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * MySQL Entity: SocialCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class SocialCertificateV1 implements Serializable {
    private static final long serialVersionUID = 771L;

    private Long id;
    private Byte tinyIntField75;
    private Short smallIntField71;
    private Integer intField12;
    private Long bigIntField77;
    private BigDecimal decimalField24;
    private BigDecimal priceField;
    private Float floatField62;
    private Double doubleField67;
    private String code;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Boolean isActive;

    public SocialCertificateV1() {}

    public SocialCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField75() {
        return tinyIntField75;
    }

    public void setTinyIntField75(Byte tinyIntField75) {
        this.tinyIntField75 = tinyIntField75;
    }

    public Short getSmallIntField71() {
        return smallIntField71;
    }

    public void setSmallIntField71(Short smallIntField71) {
        this.smallIntField71 = smallIntField71;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField77() {
        return bigIntField77;
    }

    public void setBigIntField77(Long bigIntField77) {
        this.bigIntField77 = bigIntField77;
    }

    public BigDecimal getDecimalField24() {
        return decimalField24;
    }

    public void setDecimalField24(BigDecimal decimalField24) {
        this.decimalField24 = decimalField24;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField62() {
        return floatField62;
    }

    public void setFloatField62(Float floatField62) {
        this.floatField62 = floatField62;
    }

    public Double getDoubleField67() {
        return doubleField67;
    }

    public void setDoubleField67(Double doubleField67) {
        this.doubleField67 = doubleField67;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
