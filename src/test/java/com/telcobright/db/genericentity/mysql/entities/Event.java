package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private Long id;
    private String description;
    private Integer count;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private Double value;
    private Long parentId;

    public Event() {}

    public Event(Long id, String description, Long parentId) {
        this.id = id;
        this.description = description;
        this.parentId = parentId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public Long getParentId() { return parentId; }
    public void setParentId(Long parentId) { this.parentId = parentId; }
}
