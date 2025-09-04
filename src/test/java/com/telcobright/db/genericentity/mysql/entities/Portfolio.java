package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Portfolio {
    private Long id;
    private Integer count;
    private LocalDateTime createdAt;
    private byte[] data;
    private String type;
    private String code;

    public Portfolio() {}

    public Portfolio(Long id, String type, String code) {
        this.id = id;
        this.type = type;
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
