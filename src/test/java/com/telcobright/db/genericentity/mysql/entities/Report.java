package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Report {
    private Long id;
    private BigDecimal amount;
    private Boolean isActive;
    private Double value;
    private byte[] data;

    public Report() {}

    public Report(Long id) {
        this.id = id;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }
}
