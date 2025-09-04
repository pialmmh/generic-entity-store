package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: FinanceTransactionV2
 * Variant 2 with specific MySQL data type combinations
 */
public class FinanceTransactionV2 implements Serializable {
    private static final long serialVersionUID = 1L;

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
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private Instant deletedAt;
    private Timestamp startDate;
    private Timestamp endDate;
    private Byte numericField0;
    private Short numericField1;
    private Long numericField2;
    private byte[] serializedObject;

    public FinanceTransactionV2() {}

    public FinanceTransactionV2(Long id, String code, String name) {
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

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Byte getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(Byte numericField0) {
        this.numericField0 = numericField0;
    }

    public Short getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(Short numericField1) {
        this.numericField1 = numericField1;
    }

    public Long getNumericField2() {
        return numericField2;
    }

    public void setNumericField2(Long numericField2) {
        this.numericField2 = numericField2;
    }

    public byte[] getSerializedObject() {
        return serializedObject;
    }

    public void setSerializedObject(byte[] serializedObject) {
        this.serializedObject = serializedObject;
    }

}
