package com.telcobright.db.genericentity.examples.ecommerce;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Example usage of GenericEntityStorage for e-commerce domain
 */
public class EcommerceExample {
    
    public static void main(String[] args) {
        // Initialize storage at startup
        GenericEntityStorage<EcommerceEntityTypeSet> storage = GenericEntityStorage.<EcommerceEntityTypeSet>builder()
            .withEntityTypeSet(EcommerceEntityTypeSet.class)
            .withMaxRecords(10000)
            .registerType(EcommerceEntityTypeSet.ORDER, Order.class)
            .build();
        
        // Create orders
        Order order1 = new Order(
            100L,
            "ORD-2024-001",
            "John Doe",
            new BigDecimal("299.99"),
            LocalDateTime.now()
        );
        order1.setItemCount(3);
        order1.setStatus("PENDING");
        
        Order order2 = new Order(
            101L,
            "ORD-2024-002",
            "Jane Smith",
            new BigDecimal("149.50"),
            LocalDateTime.now().minusDays(1)
        );
        order2.setItemCount(1);
        order2.setStatus("SHIPPED");
        
        // Batch store orders
        storage.putAll(Arrays.asList(order1, order2), EcommerceEntityTypeSet.ORDER);
        
        // Retrieve specific order
        Order retrieved = storage.get(100L, EcommerceEntityTypeSet.ORDER);
        System.out.println("Order: " + retrieved.getOrderNumber() + 
                          " - Amount: $" + retrieved.getTotalAmount());
        
        // Get all orders
        List<Order> allOrders = storage.getAll(EcommerceEntityTypeSet.ORDER);
        for (Order order : allOrders) {
            System.out.println("Order " + order.getOrderNumber() + 
                              " - Status: " + order.getStatus());
        }
        
        // Storage statistics
        System.out.println("Total entities: " + storage.size());
        System.out.println("Total orders: " + storage.size(EcommerceEntityTypeSet.ORDER));
    }
}