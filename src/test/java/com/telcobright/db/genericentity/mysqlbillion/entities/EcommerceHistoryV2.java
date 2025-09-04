package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: EcommerceHistoryV2
 * Variant 2 with specific MySQL data type combinations
 */
public class EcommerceHistoryV2 implements Serializable {
    private static final long serialVersionUID = 679L;

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
    private LocalDateTime createdAt;
    private LocalTime updatedAt;
    private LocalDateTime deletedAt;
    private Instant startDate;
    private Timestamp endDate;
    private Double numericField0;
    private Float numericField1;
    private Double numericField2;
    private byte[] binaryData;

    public EcommerceHistoryV2() {}

    public EcommerceHistoryV2(Long id, String code, String name) {
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Double getNumericField0() {
        return numericField0;
    }

    public void setNumericField0(Double numericField0) {
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

    public byte[] getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(byte[] binaryData) {
        this.binaryData = binaryData;
    }

}
