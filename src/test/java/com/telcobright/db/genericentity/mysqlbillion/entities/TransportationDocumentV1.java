package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: TransportationDocumentV1
 * Variant 1 with specific MySQL data type combinations
 */
public class TransportationDocumentV1 implements Serializable {
    private static final long serialVersionUID = 966L;

    private Long id;
    private Byte tinyIntField16;
    private Short smallIntField72;
    private Integer intField56;
    private Long bigIntField39;
    private BigDecimal decimalField89;
    private BigDecimal priceField;
    private Float floatField24;
    private Double doubleField27;
    private String code;
    private String name;
    private String description;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public TransportationDocumentV1() {}

    public TransportationDocumentV1(Long id, String code, String name) {
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

    public Byte getTinyIntField16() {
        return tinyIntField16;
    }

    public void setTinyIntField16(Byte tinyIntField16) {
        this.tinyIntField16 = tinyIntField16;
    }

    public Short getSmallIntField72() {
        return smallIntField72;
    }

    public void setSmallIntField72(Short smallIntField72) {
        this.smallIntField72 = smallIntField72;
    }

    public Integer getIntField56() {
        return intField56;
    }

    public void setIntField56(Integer intField56) {
        this.intField56 = intField56;
    }

    public Long getBigIntField39() {
        return bigIntField39;
    }

    public void setBigIntField39(Long bigIntField39) {
        this.bigIntField39 = bigIntField39;
    }

    public BigDecimal getDecimalField89() {
        return decimalField89;
    }

    public void setDecimalField89(BigDecimal decimalField89) {
        this.decimalField89 = decimalField89;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField24() {
        return floatField24;
    }

    public void setFloatField24(Float floatField24) {
        this.floatField24 = floatField24;
    }

    public Double getDoubleField27() {
        return doubleField27;
    }

    public void setDoubleField27(Double doubleField27) {
        this.doubleField27 = doubleField27;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
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
