package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Milestone {
    private Long id;
    private Boolean isActive;
    private Double value;
    private byte[] data;
    private LocalDate date;
    private Integer priority;
    private String code;

    public Milestone() {}

    public Milestone(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public byte[] getData() { return data; }
    public void setData(byte[] data) { this.data = data; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
