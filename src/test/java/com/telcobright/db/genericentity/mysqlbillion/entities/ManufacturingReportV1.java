package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: ManufacturingReportV1
 * Variant 1 with specific MySQL data type combinations
 */
public class ManufacturingReportV1 implements Serializable {
    private static final long serialVersionUID = 225L;

    private Long id;
    private Byte tinyIntField67;
    private Short smallIntField4;
    private Integer intField40;
    private Long bigIntField19;
    private BigDecimal decimalField78;
    private BigDecimal priceField;
    private Float floatField82;
    private Double doubleField26;
    private String code;
    private String name;
    private String description;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;

    public ManufacturingReportV1() {}

    public ManufacturingReportV1(Long id, String code, String name) {
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

    public Byte getTinyIntField67() {
        return tinyIntField67;
    }

    public void setTinyIntField67(Byte tinyIntField67) {
        this.tinyIntField67 = tinyIntField67;
    }

    public Short getSmallIntField4() {
        return smallIntField4;
    }

    public void setSmallIntField4(Short smallIntField4) {
        this.smallIntField4 = smallIntField4;
    }

    public Integer getIntField40() {
        return intField40;
    }

    public void setIntField40(Integer intField40) {
        this.intField40 = intField40;
    }

    public Long getBigIntField19() {
        return bigIntField19;
    }

    public void setBigIntField19(Long bigIntField19) {
        this.bigIntField19 = bigIntField19;
    }

    public BigDecimal getDecimalField78() {
        return decimalField78;
    }

    public void setDecimalField78(BigDecimal decimalField78) {
        this.decimalField78 = decimalField78;
    }

    public BigDecimal getPriceField() {
        return priceField;
    }

    public void setPriceField(BigDecimal priceField) {
        this.priceField = priceField;
    }

    public Float getFloatField82() {
        return floatField82;
    }

    public void setFloatField82(Float floatField82) {
        this.floatField82 = floatField82;
    }

    public Double getDoubleField26() {
        return doubleField26;
    }

    public void setDoubleField26(Double doubleField26) {
        this.doubleField26 = doubleField26;
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
