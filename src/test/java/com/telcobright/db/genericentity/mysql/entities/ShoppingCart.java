package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ShoppingCart {
    private Long id;
    private Integer count;
    private Double value;
    private String status;

    public ShoppingCart() {}

    public ShoppingCart(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
