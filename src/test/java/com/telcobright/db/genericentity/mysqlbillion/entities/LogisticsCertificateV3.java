package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: LogisticsCertificateV3
 * Variant 3 with specific MySQL data type combinations
 */
public class LogisticsCertificateV3 implements Serializable {
    private static final long serialVersionUID = 311L;

    private Long id;
    private BigDecimal numericField0;
    private Float numericField1;
    private String code;
    private String name;
    private String description;
    private String status;
    private Instant createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;
    private Boolean isDeleted;
    private Integer yearField;
    private String setField;
    private byte[] fileContent;
    private String jsonData;
    private String metadata;
    private String enumField;

    public LogisticsCertificateV3() {}

    public LogisticsCertificateV3(Long id, String code, String name) {
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

    public BigDecimal getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(BigDecimal numericField0) {
        this.numericField0 = numericField0;
    }

    public Float getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(Float numericField1) {
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
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

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getEnumField() {
        return enumField;
    }

    public void setEnumField(String enumField) {
        this.enumField = enumField;
    }

}
