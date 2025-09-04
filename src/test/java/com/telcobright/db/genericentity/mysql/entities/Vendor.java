package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Vendor {
    private Long id;
    private Integer count;
    private LocalDateTime createdAt;
    private Double value;
    private byte[] data;
    private Integer priority;

    public Vendor() {}

    public Vendor(Long id) {
        this.id = id;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }
}
