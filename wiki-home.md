# GenericEntityStorage Library

## Package: com.telcobright.db.genericentity

A high-performance, reflection-free entity storage library that maps multiple entity types to a generic structure.

### Key Requirements:
• Mandatory `withMaxRecords()` parameter for optimal pool sizing  
• Single builder pattern enforces best practices  
• Zero-allocation design through comprehensive object pooling

## Quick Start

```java
// Define your entity type set enum
// The "Set" suffix indicates this enum defines a collection of related entity types
public enum MyEntityTypeSet implements IEntityTypeSet {
    PERSON(1), ORDER(2);
    
    private final int typeId;
    
    MyEntityTypeSet(int typeId) {
        this.typeId = typeId;
    }
    
    @Override
    public int getTypeId() {
        return typeId;
    }
}

// Build storage with mandatory maxRecords for optimal performance
GenericEntityStorage<MyEntityTypeSet> storage = GenericEntityStorage.builder()
    .withEntityTypeSet(MyEntityTypeSet.class)
    .withMaxRecords(600000)  // MANDATORY: Total capacity across all types
    .registerType(MyEntityTypeSet.PERSON, Person.class, 100000)  // max 100k persons
    .registerType(MyEntityTypeSet.ORDER, Order.class, 500000)    // max 500k orders
    .build();

// Or use auto-sizing for convenience
GenericEntityStorage<MyEntityTypeSet> storage = GenericEntityStorage.builder()
    .withEntityTypeSet(MyEntityTypeSet.class)
    .withMaxRecords(600000)  // MANDATORY: Total capacity
    .withAutoSizing()         // Automatically distributes capacity
    .registerType(MyEntityTypeSet.PERSON, Person.class)
    .registerType(MyEntityTypeSet.ORDER, Order.class)
    .build();  // Each type gets 300k capacity

// Store and retrieve entities
Person person = new Person(1L, "John Doe");
storage.put(person, MyEntityTypeSet.PERSON);
Person retrieved = storage.get(1L, MyEntityTypeSet.PERSON);
```

## Architecture

### Core Design Principles

1. **Reflection-free at runtime:** All reflection happens during initialization
2. **Type-safe:** Enum-based type system ensures compile-time safety
3. **Performance:** Direct method invocations, no runtime overhead
4. **Generic storage:** Single HashMap<Long, GenericEntity> stores all types
5. **Object pooling:** Pre-allocated GenericEntity pool minimizes GC pressure
6. **Proxy ID system:** Prevents ID collisions between different entity types

### Package Structure

- **api/**: Public interfaces and main storage class
  - `GenericEntityStorage`: Main facade for client interaction
  - `IEntityTypeSet`: Marker interface for entity type set enums
  - `StorageBuilder`: Fluent builder with mandatory maxRecords for optimal pooling

- **core/**: Core implementation
  - `GenericEntity`: Universal storage structure
  - `EntityConverter`: Handles entity transformations
  - `ProxyIdManager`: Manages proxy ID generation and mapping
  - **pool/**: Object pooling implementation

### Conversion Process

1. **Startup Phase:** Analyze entity classes via reflection
2. **Generate Converters:** Create optimized converter instances
3. **Runtime:** Use pre-generated converters (no reflection)

## API Documentation

### Storage Initialization

```java
// Manual capacity distribution
GenericEntityStorage<TSet> storage = GenericEntityStorage.builder()
    .withEntityTypeSet(TSet.class)  // TSet implements IEntityTypeSet
    .withMaxRecords(100000)          // MANDATORY: Total max records
    .registerType(enumValue1, EntityClass1.class, 60000)  // 60k capacity
    .registerType(enumValue2, EntityClass2.class, 40000)  // 40k capacity
    .build();

// Auto-sizing for even distribution
GenericEntityStorage<TSet> storage = GenericEntityStorage.builder()
    .withEntityTypeSet(TSet.class)  // TSet implements IEntityTypeSet
    .withMaxRecords(100000)          // MANDATORY: Total max records
    .withAutoSizing()                // Evenly distributes capacity
    .registerType(enumValue1, EntityClass1.class)  // Gets 50k
    .registerType(enumValue2, EntityClass2.class)  // Gets 50k
    .build();
```

### Main Operations

#### Store Entity
```java
void put(Object entity, TSet entityType)
```

#### Retrieve Entity
```java
<E> E get(Long id, TSet entityType)
```

#### Remove Entity
```java
void remove(Long id, TSet entityType)
```

#### Check Existence
```java
boolean exists(Long id, TSet entityType)
```

#### Batch Operations
```java
void putAll(List<?> entities, TSet entityType)
List<E> getAll(TSet entityType)
void removeAll(TSet entityType)
```

## Performance Characteristics

### Core Metrics
- **Initialization:** O(n) where n = number of registered types
- **Put/Get/Remove:** O(1) HashMap operations
- **Memory:** Pre-sized pools based on maxRecords parameter
- **No reflection at runtime:** Direct method calls only
- **Zero allocations in hot path:** All objects borrowed from pools
- **Throughput:** ~650,000+ ops/sec with optimized pooling
- **GC overhead:** <8% under heavy load (3M operations)

### Optimizations with Mandatory maxRecords

- **GenericEntity Pool:** Pre-allocated with 20% buffer (maxRecords * 1.2)
- **CompositeKey Pool:** Sized at 2x maxRecords for lookup operations
- **Pre-allocation:** 10-25% of capacity created upfront
- **Proxy ID System:** Prevents ID collisions between entity types
- **Fast Recycling:** Efficient field clearing for object reuse
- **Auto-sizing:** Optional automatic capacity distribution

## Development Guidelines

### For AI Agents Continuing Development

#### 1. Converter Generation Strategy
- Use MethodHandles for Java 7+
- Consider ByteBuddy for complex mappings
- Cache all reflection metadata at startup

#### 2. Field Mapping Rules
- Simple types: Direct mapping
- Collections: Serialize to byte[] or use reserved list fields
- Complex objects: Flatten or use nested GenericEntity

#### 3. Optimization Opportunities
- Implement field pooling for common values
- Add compression for sparse entities
- Consider memory-mapped storage for large datasets

#### 4. Testing Requirements
- Unit tests for each converter
- Performance benchmarks vs native HashMap
- Thread-safety tests for concurrent access
- Mutation tests with million+ iterations

#### 5. Extension Points
- Custom field mappers
- Pluggable serialization
- Storage backend abstraction

## Thread Safety

The library provides thread-safe operations through:
- ConcurrentHashMap for storage
- Thread-safe object pools
- Atomic operations for counters

## Example: E-commerce Application

```java
public enum EcommerceEntityTypeSet implements IEntityTypeSet {
    CUSTOMER(1), PRODUCT(2), ORDER(3), INVENTORY(4);
    // ... implementation
}

GenericEntityStorage<EcommerceEntityTypeSet> storage = 
    GenericEntityStorage.builder()
        .withEntityTypeSet(EcommerceEntityTypeSet.class)
        .withMaxRecords(1000000)  // 1M total records
        .withAutoSizing()          // Each type gets 250k
        .registerType(EcommerceEntityTypeSet.CUSTOMER, Customer.class)
        .registerType(EcommerceEntityTypeSet.PRODUCT, Product.class)
        .registerType(EcommerceEntityTypeSet.ORDER, Order.class)
        .registerType(EcommerceEntityTypeSet.INVENTORY, Inventory.class)
        .build();
```

## License

Copyright (c) 2024 Telcobright. All rights reserved.