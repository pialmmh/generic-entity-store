package com.telcobright.db.genericentity.examples.ecommerce;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Example entity for orders
 */
public class Order {
    private Long id;
    private String orderNumber;
    private String customerName;
    private BigDecimal totalAmount;
    private LocalDateTime orderDate;
    private Integer itemCount;
    private String status;
    
    public Order() {}
    
    public Order(Long id, String orderNumber, String customerName, 
                 BigDecimal totalAmount, LocalDateTime orderDate) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    
    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
    
    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
    
    public Integer getItemCount() { return itemCount; }
    public void setItemCount(Integer itemCount) { this.itemCount = itemCount; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}