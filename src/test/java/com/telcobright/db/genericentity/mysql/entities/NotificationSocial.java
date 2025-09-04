package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class NotificationSocial {
    private Long id;
    private Integer count;
    private Boolean isActive;
    private Double value;
    private String type;
    private LocalDate date;
    private String code;

    public NotificationSocial() {}

    public NotificationSocial(Long id, String type, String code) {
        this.id = id;
        this.type = type;
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
