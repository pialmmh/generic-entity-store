package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: MediaCertificateV1
 * Variant 1 with specific MySQL data type combinations
 */
public class MediaCertificateV1 implements Serializable {
    private static final long serialVersionUID = 903L;

    private Long id;
    private Byte tinyIntField7;
    private Short smallIntField45;
    private Integer intField12;
    private Long bigIntField16;
    private BigDecimal decimalField28;
    private BigDecimal priceField;
    private Float floatField84;
    private Double doubleField53;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public MediaCertificateV1() {}

    public MediaCertificateV1(Long id, String code, String name) {
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

    public Byte getTinyIntField7() {
        return tinyIntField7;
    }

    public void setTinyIntField7(Byte tinyIntField7) {
        this.tinyIntField7 = tinyIntField7;
    }

    public Short getSmallIntField45() {
        return smallIntField45;
    }

    public void setSmallIntField45(Short smallIntField45) {
        this.smallIntField45 = smallIntField45;
    }

    public Integer getIntField12() {
        return intField12;
    }

    public void setIntField12(Integer intField12) {
        this.intField12 = intField12;
    }

    public Long getBigIntField16() {
        return bigIntField16;
    }

    public void setBigIntField16(Long bigIntField16) {
        this.bigIntField16 = bigIntField16;
    }

    public BigDecimal getDecimalField28() {
        return decimalField28;
    }

    public void setDecimalField28(BigDecimal decimalField28) {
        this.decimalField28 = decimalField28;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField84() {
        return floatField84;
    }

    public void setFloatField84(Float floatField84) {
        this.floatField84 = floatField84;
    }

    public Double getDoubleField53() {
        return doubleField53;
    }

    public void setDoubleField53(Double doubleField53) {
        this.doubleField53 = doubleField53;
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
