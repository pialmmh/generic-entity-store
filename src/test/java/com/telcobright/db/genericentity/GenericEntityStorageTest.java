package com.telcobright.db.genericentity;

import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.api.IEntityTypeSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for GenericEntityStorage
 */
public class GenericEntityStorageTest {
    
    private GenericEntityStorage<TestEntityTypeSet> storage;
    
    enum TestEntityTypeSet implements IEntityTypeSet {
        TEST_ENTITY(1);
        
        private final int typeId;
        
        TestEntityTypeSet(int typeId) {
            this.typeId = typeId;
        }
        
        @Override
        public int getTypeId() {
            return typeId;
        }
    }
    
    public static class TestEntity {
        private Long id;
        private String name;
        private Integer value;
        
        public TestEntity() {}
        
        public TestEntity(Long id, String name, Integer value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public Integer getValue() { return value; }
        public void setValue(Integer value) { this.value = value; }
    }
    
    @BeforeEach
    public void setUp() {
        storage = GenericEntityStorage.<TestEntityTypeSet>builder()
            .withEntityTypeSet(TestEntityTypeSet.class)
            .withMaxRecords(10000)
            .withAutoSizing()  // Enable auto-sizing to distribute capacity
            .registerType(TestEntityTypeSet.TEST_ENTITY, TestEntity.class)
            .build();
    }
    
    @Test
    public void testPutAndGet() {
        TestEntity entity = new TestEntity(1L, "Test", 100);
        storage.put(entity, TestEntityTypeSet.TEST_ENTITY);
        
        TestEntity retrieved = storage.get(1L, TestEntityTypeSet.TEST_ENTITY);
        
        assertNotNull(retrieved);
        assertEquals(1L, retrieved.getId());
        assertEquals("Test", retrieved.getName());
        assertEquals(100, retrieved.getValue());
    }
    
    @Test
    public void testExists() {
        TestEntity entity = new TestEntity(1L, "Test", 100);
        storage.put(entity, TestEntityTypeSet.TEST_ENTITY);
        
        assertTrue(storage.exists(1L, TestEntityTypeSet.TEST_ENTITY));
        assertFalse(storage.exists(2L, TestEntityTypeSet.TEST_ENTITY));
    }
    
    @Test
    public void testRemove() {
        TestEntity entity = new TestEntity(1L, "Test", 100);
        storage.put(entity, TestEntityTypeSet.TEST_ENTITY);
        
        storage.remove(1L, TestEntityTypeSet.TEST_ENTITY);
        
        assertNull(storage.get(1L, TestEntityTypeSet.TEST_ENTITY));
        assertFalse(storage.exists(1L, TestEntityTypeSet.TEST_ENTITY));
    }
    
    @Test
    public void testBatchOperations() {
        List<TestEntity> entities = Arrays.asList(
            new TestEntity(1L, "Test1", 100),
            new TestEntity(2L, "Test2", 200),
            new TestEntity(3L, "Test3", 300)
        );
        
        storage.putAll(entities, TestEntityTypeSet.TEST_ENTITY);
        
        assertEquals(3, storage.size());
        assertEquals(3, storage.size(TestEntityTypeSet.TEST_ENTITY));
        
        List<TestEntity> retrieved = storage.getAll(TestEntityTypeSet.TEST_ENTITY);
        assertEquals(3, retrieved.size());
    }
    
    @Test
    public void testClear() {
        TestEntity entity = new TestEntity(1L, "Test", 100);
        storage.put(entity, TestEntityTypeSet.TEST_ENTITY);
        
        storage.clear();
        
        assertEquals(0, storage.size());
        assertNull(storage.get(1L, TestEntityTypeSet.TEST_ENTITY));
    }
    
    @Test
    public void testRemoveAll() {
        List<TestEntity> entities = Arrays.asList(
            new TestEntity(1L, "Test1", 100),
            new TestEntity(2L, "Test2", 200)
        );
        
        storage.putAll(entities, TestEntityTypeSet.TEST_ENTITY);
        storage.removeAll(TestEntityTypeSet.TEST_ENTITY);
        
        assertEquals(0, storage.size());
    }
}