package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Metric {
    private Long id;
    private Boolean isActive;
    private Double value;
    private String status;
    private byte[] data;
    private String code;

    public Metric() {}

    public Metric(Long id, String status, String code) {
        this.id = id;
        this.status = status;
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
