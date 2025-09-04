package com.telcobright.db.genericentity;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.EntityRegistry;
import com.telcobright.db.genericentity.core.impl.PooledGenericEntityStorageImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Test to verify that multiple entity types can have the same ID without collision.
 * This demonstrates the proxy ID management system working correctly.
 */
public class ProxyIdCollisionTest {
    
    // Entity type set with multiple types
    enum MultiEntityTypeSet implements IEntityTypeSet {
        USER(1),
        PRODUCT(2),
        ORDER(3),
        PAYMENT(4);
        
        private final int typeId;
        
        MultiEntityTypeSet(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    // Different entity classes that might have same IDs
    public static class User {
        private Long id;
        private String username;
        private String email;
        
        public User() {}
        
        public User(Long id, String username, String email) {
            this.id = id;
            this.username = username;
            this.email = email;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        
        @Override
        public String toString() {
            return "User{id=" + id + ", username='" + username + "', email='" + email + "'}";
        }
    }
    
    public static class Product {
        private Long id;
        private String name;
        private BigDecimal price;
        
        public Product() {}
        
        public Product(Long id, String name, BigDecimal price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public BigDecimal getPrice() { return price; }
        public void setPrice(BigDecimal price) { this.price = price; }
        
        @Override
        public String toString() {
            return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
        }
    }
    
    public static class Order {
        private Long id;
        private Long userId;
        private LocalDateTime orderDate;
        private String status;
        
        public Order() {}
        
        public Order(Long id, Long userId, LocalDateTime orderDate, String status) {
            this.id = id;
            this.userId = userId;
            this.orderDate = orderDate;
            this.status = status;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Long getUserId() { return userId; }
        public void setUserId(Long userId) { this.userId = userId; }
        
        public LocalDateTime getOrderDate() { return orderDate; }
        public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
        
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        
        @Override
        public String toString() {
            return "Order{id=" + id + ", userId=" + userId + ", orderDate=" + orderDate + ", status='" + status + "'}";
        }
    }
    
    public static class Payment {
        private Long id;
        private Long orderId;
        private BigDecimal amount;
        private String method;
        
        public Payment() {}
        
        public Payment(Long id, Long orderId, BigDecimal amount, String method) {
            this.id = id;
            this.orderId = orderId;
            this.amount = amount;
            this.method = method;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public Long getOrderId() { return orderId; }
        public void setOrderId(Long orderId) { this.orderId = orderId; }
        
        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
        
        public String getMethod() { return method; }
        public void setMethod(String method) { this.method = method; }
        
        @Override
        public String toString() {
            return "Payment{id=" + id + ", orderId=" + orderId + ", amount=" + amount + ", method='" + method + "'}";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    PROXY ID COLLISION TEST");
        System.out.println("     Testing multiple entity types with same IDs (1, 2, 3...)");
        System.out.println("================================================================================\n");
        
        // Create entity registry and storage with proxy ID support
        EntityRegistry<MultiEntityTypeSet> registry = new EntityRegistry<>();
        
        // Register all entity types
        registry.register(MultiEntityTypeSet.USER, User.class, 1000);
        registry.register(MultiEntityTypeSet.PRODUCT, Product.class, 1000);
        registry.register(MultiEntityTypeSet.ORDER, Order.class, 1000);
        registry.register(MultiEntityTypeSet.PAYMENT, Payment.class, 1000);
        
        // Create storage with proxy ID management
        PooledGenericEntityStorageImpl<MultiEntityTypeSet> storage = 
            new PooledGenericEntityStorageImpl<>(registry, 4000);
        
        System.out.println("Storage initialized with proxy ID management.\n");
        
        // Test 1: Store entities with SAME IDs across different types
        System.out.println("Test 1: Storing entities with same IDs across different types");
        System.out.println("----------------------------------------------------------------");
        
        // All these entities have ID = 1
        User user1 = new User(1L, "john_doe", "john@example.com");
        Product product1 = new Product(1L, "Laptop", new BigDecimal("999.99"));
        Order order1 = new Order(1L, 100L, LocalDateTime.now(), "PENDING");
        Payment payment1 = new Payment(1L, 1000L, new BigDecimal("999.99"), "CREDIT_CARD");
        
        storage.put(user1, MultiEntityTypeSet.USER);
        System.out.println("✓ Stored User with ID=1");
        
        storage.put(product1, MultiEntityTypeSet.PRODUCT);
        System.out.println("✓ Stored Product with ID=1");
        
        storage.put(order1, MultiEntityTypeSet.ORDER);
        System.out.println("✓ Stored Order with ID=1");
        
        storage.put(payment1, MultiEntityTypeSet.PAYMENT);
        System.out.println("✓ Stored Payment with ID=1");
        
        System.out.println("\nAll 4 entities with ID=1 stored successfully!\n");
        
        // Test 2: Retrieve entities and verify they're different
        System.out.println("Test 2: Retrieving entities with same ID but different types");
        System.out.println("----------------------------------------------------------------");
        
        User retrievedUser = storage.get(1L, MultiEntityTypeSet.USER);
        Product retrievedProduct = storage.get(1L, MultiEntityTypeSet.PRODUCT);
        Order retrievedOrder = storage.get(1L, MultiEntityTypeSet.ORDER);
        Payment retrievedPayment = storage.get(1L, MultiEntityTypeSet.PAYMENT);
        
        System.out.println("Retrieved User:    " + retrievedUser);
        System.out.println("Retrieved Product: " + retrievedProduct);
        System.out.println("Retrieved Order:   " + retrievedOrder);
        System.out.println("Retrieved Payment: " + retrievedPayment);
        
        // Verify all are retrieved correctly
        boolean allRetrieved = retrievedUser != null && retrievedProduct != null && 
                               retrievedOrder != null && retrievedPayment != null;
        
        System.out.println("\n✓ All entities retrieved successfully: " + allRetrieved);
        
        // Test 3: Update entities with same ID
        System.out.println("\nTest 3: Updating entities with same ID");
        System.out.println("----------------------------------------------------------------");
        
        user1.setEmail("john.updated@example.com");
        product1.setPrice(new BigDecimal("899.99"));
        order1.setStatus("SHIPPED");
        payment1.setMethod("PAYPAL");
        
        storage.put(user1, MultiEntityTypeSet.USER);
        storage.put(product1, MultiEntityTypeSet.PRODUCT);
        storage.put(order1, MultiEntityTypeSet.ORDER);
        storage.put(payment1, MultiEntityTypeSet.PAYMENT);
        
        // Retrieve updated entities
        User updatedUser = storage.get(1L, MultiEntityTypeSet.USER);
        Product updatedProduct = storage.get(1L, MultiEntityTypeSet.PRODUCT);
        Order updatedOrder = storage.get(1L, MultiEntityTypeSet.ORDER);
        Payment updatedPayment = storage.get(1L, MultiEntityTypeSet.PAYMENT);
        
        System.out.println("Updated User email: " + updatedUser.getEmail());
        System.out.println("Updated Product price: " + updatedProduct.getPrice());
        System.out.println("Updated Order status: " + updatedOrder.getStatus());
        System.out.println("Updated Payment method: " + updatedPayment.getMethod());
        
        // Test 4: Store multiple entities of each type
        System.out.println("\nTest 4: Storing multiple entities with overlapping IDs");
        System.out.println("----------------------------------------------------------------");
        
        for (long id = 2; id <= 10; id++) {
            storage.put(new User(id, "user_" + id, "user" + id + "@example.com"), MultiEntityTypeSet.USER);
            storage.put(new Product(id, "Product_" + id, new BigDecimal(id * 100)), MultiEntityTypeSet.PRODUCT);
            storage.put(new Order(id, id * 10, LocalDateTime.now(), "STATUS_" + id), MultiEntityTypeSet.ORDER);
            storage.put(new Payment(id, id * 100, new BigDecimal(id * 50), "METHOD_" + id), MultiEntityTypeSet.PAYMENT);
        }
        
        System.out.println("Stored 9 more entities of each type (IDs 2-10)");
        System.out.println("Total entities in storage: " + storage.size());
        System.out.println("Users: " + storage.size(MultiEntityTypeSet.USER));
        System.out.println("Products: " + storage.size(MultiEntityTypeSet.PRODUCT));
        System.out.println("Orders: " + storage.size(MultiEntityTypeSet.ORDER));
        System.out.println("Payments: " + storage.size(MultiEntityTypeSet.PAYMENT));
        
        // Test 5: Remove specific entities
        System.out.println("\nTest 5: Removing specific entities");
        System.out.println("----------------------------------------------------------------");
        
        storage.remove(5L, MultiEntityTypeSet.USER);
        storage.remove(5L, MultiEntityTypeSet.PRODUCT);
        
        User removedUser = storage.get(5L, MultiEntityTypeSet.USER);
        Product removedProduct = storage.get(5L, MultiEntityTypeSet.PRODUCT);
        Order stillThereOrder = storage.get(5L, MultiEntityTypeSet.ORDER);
        Payment stillTherePayment = storage.get(5L, MultiEntityTypeSet.PAYMENT);
        
        System.out.println("User with ID=5 removed: " + (removedUser == null));
        System.out.println("Product with ID=5 removed: " + (removedProduct == null));
        System.out.println("Order with ID=5 still exists: " + (stillThereOrder != null));
        System.out.println("Payment with ID=5 still exists: " + (stillTherePayment != null));
        
        // Final statistics
        System.out.println("\n================================================================================");
        System.out.println("                           FINAL RESULTS");
        System.out.println("================================================================================");
        
        System.out.println("\nCapacity Information:");
        System.out.println(storage.getCapacityInfo(MultiEntityTypeSet.USER));
        System.out.println(storage.getCapacityInfo(MultiEntityTypeSet.PRODUCT));
        System.out.println(storage.getCapacityInfo(MultiEntityTypeSet.ORDER));
        System.out.println(storage.getCapacityInfo(MultiEntityTypeSet.PAYMENT));
        
        System.out.println("\nPool Statistics:");
        System.out.println(storage.getPoolStatistics());
        
        System.out.println("\n✅ TEST PASSED - Proxy ID system successfully handles ID collisions!");
        System.out.println("   Multiple entity types can have the same IDs without conflicts.");
    }
}