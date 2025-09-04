package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.time.LocalTime;
import java.io.Serializable;

/**
 * MySQL Entity: AgricultureReportV3
 * Variant 3 with specific MySQL data type combinations
 */
public class AgricultureReportV3 implements Serializable {
    private static final long serialVersionUID = 1151L;

    private Long id;
    private Byte numericField0;
    private Long numericField1;
    private String code;
    private String name;
    private String description;
    private String status;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private Boolean isActive;
    private Boolean isDeleted;
    private byte[] compressedData;
    private String jsonData;
    private String enumField;

    public AgricultureReportV3() {}

    public AgricultureReportV3(Long id, String code, String name) {
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

    public Byte getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(Byte numericField0) {
        this.numericField0 = numericField0;
    }

    public Long getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(Long numericField1) {
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
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

    public byte[] getCompressedData() {
        return compressedData;
    }

    public void setCompressedData(byte[] compressedData) {
        this.compressedData = compressedData;
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
