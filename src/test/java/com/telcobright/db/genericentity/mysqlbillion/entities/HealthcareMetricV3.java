package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: HealthcareMetricV3
 * Variant 3 with specific MySQL data type combinations
 */
public class HealthcareMetricV3 implements Serializable {
    private static final long serialVersionUID = 98L;

    private Long id;
    private Float numericField0;
    private Integer numericField1;
    private String code;
    private String name;
    private String description;
    private String status;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;
    private Boolean isDeleted;
    private Integer yearField;
    private String setField;
    private byte[] binaryData;
    private String jsonData;
    private String enumField;

    public HealthcareMetricV3() {}

    public HealthcareMetricV3(Long id, String code, String name) {
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

    public Float getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(Float numericField0) {
        this.numericField0 = numericField0;
    }

    public Integer getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(Integer numericField1) {
        this.numericField1 = numericField1;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getYearField() {
        return yearField;
    }

    public void setYearField(Integer yearField) {
        this.yearField = yearField;
    }

    public String getSetField() {
        return setField;
    }

    public void setSetField(String setField) {
        this.setField = setField;
    }

    public byte[] getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(byte[] binaryData) {
        this.binaryData = binaryData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getEnumField() {
        return enumField;
    }

    public void setEnumField(String enumField) {
        this.enumField = enumField;
    }

}
