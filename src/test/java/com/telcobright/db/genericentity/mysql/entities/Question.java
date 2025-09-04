package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Question {
    private Long id;
    private String description;
    private BigDecimal amount;
    private String code;

    public Question() {}

    public Question(Long id, String description, String code) {
        this.id = id;
        this.description = description;
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
