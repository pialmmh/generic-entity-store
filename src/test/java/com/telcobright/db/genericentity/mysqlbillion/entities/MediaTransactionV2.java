package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Instant;
import java.io.Serializable;

/**
 * MySQL Entity: MediaTransactionV2
 * Variant 2 with specific MySQL data type combinations
 */
public class MediaTransactionV2 implements Serializable {
    private static final long serialVersionUID = 859L;

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
    private LocalTime deletedAt;
    private LocalDate startDate;
    private LocalDateTime endDate;
    private BigDecimal numericField0;
    private Float numericField1;
    private Short numericField2;
    private byte[] compressedData;

    public MediaTransactionV2() {}

    public MediaTransactionV2(Long id, String code, String name) {
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

    public LocalTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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

    public Short getNumericField2() {
        return numericField2;
    }

    public void setNumericField2(Short numericField2) {
        this.numericField2 = numericField2;
    }

    public byte[] getCompressedData() {
        return compressedData;
    }

    public void setCompressedData(byte[] compressedData) {
        this.compressedData = compressedData;
    }

}
