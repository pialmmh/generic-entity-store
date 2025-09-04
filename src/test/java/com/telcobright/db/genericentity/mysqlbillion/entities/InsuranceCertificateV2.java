package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * MySQL Entity: InsuranceCertificateV2
 * Variant 2 with specific MySQL data type combinations
 */
public class InsuranceCertificateV2 implements Serializable {
    private static final long serialVersionUID = 574L;

    private Long id;
    private String code;
    private String name;
    private String description;
    private String status;
    private String type;
    private String category;
    private String reference;
    private String identifier;
    private String largeText;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private LocalTime deletedAt;
    private LocalDateTime startDate;
    private Timestamp endDate;
    private Short numericField0;
    private Float numericField1;
    private Double numericField2;
    private byte[] serializedObject;

    public InsuranceCertificateV2() {}

    public InsuranceCertificateV2(Long id, String code, String name) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
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

    public LocalTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Short getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(Short numericField0) {
        this.numericField0 = numericField0;
    }

    public Float getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(Float numericField1) {
        this.numericField1 = numericField1;
    }

    public Double getNumericField2() {
        return numericField2;
    }

    public void setNumericField2(Double numericField2) {
        this.numericField2 = numericField2;
    }

    public byte[] getSerializedObject() {
        return serializedObject;
    }

    public void setSerializedObject(byte[] serializedObject) {
        this.serializedObject = serializedObject;
    }

}
