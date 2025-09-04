package com.telcobright.db.genericentity;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;

/**
 * Example demonstrating the optimized builder with mandatory maxRecords
 */
public class OptimizedBuilderExample {
    
    enum MyEntityTypeSet implements IEntityTypeSet {
        USER(1),
        PRODUCT(2),
        ORDER(3);
        
        private final int typeId;
        MyEntityTypeSet(int typeId) { this.typeId = typeId; }
        
        @Override
        public int getTypeId() { return typeId; }
    }
    
    public static class User {
        private Long id;
        private String name;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
    
    public static class Product {
        private Long id;
        private String name;
        private Double price;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public Double getPrice() { return price; }
        public void setPrice(Double price) { this.price = price; }
    }
    
    public static class Order {
        private Long id;
        private Long userId;
        private String status;
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public Long getUserId() { return userId; }
        public void setUserId(Long userId) { this.userId = userId; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }
    
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                    STORAGE BUILDER EXAMPLE");
        System.out.println("================================================================================\n");
        
        // The ONLY way to create storage - with mandatory maxRecords
        System.out.println("1. Mandatory maxRecords Builder:");
        System.out.println("----------------------------------------");
        
        // Option A: Manual distribution
        GenericEntityStorage<MyEntityTypeSet> storage1 = 
            GenericEntityStorage.<MyEntityTypeSet>builder()
                .withEntityTypeSet(MyEntityTypeSet.class)
                .withMaxRecords(100_000)  // MANDATORY - total capacity
                .registerType(MyEntityTypeSet.USER, User.class, 50_000)      // 50k users
                .registerType(MyEntityTypeSet.PRODUCT, Product.class, 10_000) // 10k products
                .registerType(MyEntityTypeSet.ORDER, Order.class, 40_000)     // 40k orders
                .build();
        System.out.println("✓ Created with manual distribution (100,000 total capacity)");
        System.out.println("  - Precise control over each type's capacity");
        System.out.println("  - Optimized pools sized for 100K records");
        System.out.println("  - CompositeKey pooling enabled\n");
        
        // Option B: Auto-sizing
        GenericEntityStorage<MyEntityTypeSet> storage2 = 
            GenericEntityStorage.<MyEntityTypeSet>builder()
                .withEntityTypeSet(MyEntityTypeSet.class)
                .withMaxRecords(100_000)  // MANDATORY - total capacity
                .withAutoSizing()          // Distributes evenly
                .registerType(MyEntityTypeSet.USER, User.class)
                .registerType(MyEntityTypeSet.PRODUCT, Product.class)
                .registerType(MyEntityTypeSet.ORDER, Order.class)
                .build();
        System.out.println("✓ Created with auto-sizing (100,000 total capacity)");
        System.out.println("  - Automatically distributes 33,333 per type");
        System.out.println("  - Simpler configuration");
        System.out.println("  - CompositeKey pooling enabled\n");
        
        // Demonstrate usage
        System.out.println("2. Usage Example:");
        System.out.println("----------------------------------------");
        
        // Test with same IDs across types (proxy ID system handles this)
        User user = new User();
        user.setId(1L);
        user.setName("John");
        
        Product product = new Product();
        product.setId(1L);  // Same ID as user!
        product.setName("Laptop");
        product.setPrice(999.99);
        
        Order order = new Order();
        order.setId(1L);  // Same ID as user and product!
        order.setUserId(1L);
        order.setStatus("PENDING");
        
        // Store all with same ID
        storage1.put(user, MyEntityTypeSet.USER);
        storage1.put(product, MyEntityTypeSet.PRODUCT);
        storage1.put(order, MyEntityTypeSet.ORDER);
        
        // Retrieve and verify
        User retrievedUser = storage1.get(1L, MyEntityTypeSet.USER);
        Product retrievedProduct = storage1.get(1L, MyEntityTypeSet.PRODUCT);
        Order retrievedOrder = storage1.get(1L, MyEntityTypeSet.ORDER);
        
        System.out.println("✓ Stored 3 entities with same ID (1) without collision");
        System.out.println("  User: " + retrievedUser.getName());
        System.out.println("  Product: " + retrievedProduct.getName());
        System.out.println("  Order Status: " + retrievedOrder.getStatus());
        
        // Show capacity info
        System.out.println("\n3. Capacity Information:");
        System.out.println("----------------------------------------");
        System.out.println(storage1.getCapacityInfo(MyEntityTypeSet.USER));
        System.out.println(storage1.getCapacityInfo(MyEntityTypeSet.PRODUCT));
        System.out.println(storage1.getCapacityInfo(MyEntityTypeSet.ORDER));
        
        System.out.println("\n================================================================================");
        System.out.println("KEY FEATURES:");
        System.out.println("  1. Mandatory maxRecords ensures proper pool sizing");
        System.out.println("  2. Pooled CompositeKeys eliminate GC in hot path");
        System.out.println("  3. 20% buffer added for temporary objects");
        System.out.println("  4. Auto-sizing option for convenience");
        System.out.println("  5. Proxy ID system prevents ID collisions");
        System.out.println("  6. Single builder syntax - library cannot be used otherwise");
        System.out.println("================================================================================");
    }
}