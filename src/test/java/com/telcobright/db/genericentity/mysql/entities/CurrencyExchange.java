package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class CurrencyExchange {
    private Long id;
    private BigDecimal amount;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private Double value;
    private byte[] data;
    private String type;

    public CurrencyExchange() {}

    public CurrencyExchange(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
