package com.telcobright.db.genericentity.core.pool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * High-performance object pool with pre-allocation and recycling
 * Minimizes GC pressure by reusing objects
 */
public class ObjectPool<T> {
    private final ConcurrentLinkedQueue<T> pool;
    private final Supplier<T> factory;
    private final int maxSize;
    private final AtomicInteger currentSize;
    private final AtomicInteger borrowedCount;
    private final Recycler<T> recycler;
    
    public interface Recycler<T> {
        void recycle(T object);
    }
    
    public ObjectPool(int maxSize, Supplier<T> factory, Recycler<T> recycler) {
        this.maxSize = maxSize;
        this.factory = factory;
        this.recycler = recycler;
        this.pool = new ConcurrentLinkedQueue<>();
        this.currentSize = new AtomicInteger(0);
        this.borrowedCount = new AtomicInteger(0);
        
        // Pre-allocate initial capacity (25% of max)
        int initialSize = Math.min(maxSize / 4, 100);
        for (int i = 0; i < initialSize; i++) {
            pool.offer(factory.get());
            currentSize.incrementAndGet();
        }
    }
    
    /**
     * Borrow an object from the pool
     * @return object instance or null if pool is exhausted
     */
    public T borrow() {
        T object = pool.poll();
        
        if (object == null) {
            // Try to create new object if under limit
            if (currentSize.get() < maxSize) {
                int newSize = currentSize.incrementAndGet();
                if (newSize <= maxSize) {
                    object = factory.get();
                } else {
                    currentSize.decrementAndGet();
                    return null; // Pool exhausted
                }
            }
        }
        
        if (object != null) {
            borrowedCount.incrementAndGet();
        }
        
        return object;
    }
    
    /**
     * Release an object back to the pool
     * @param object the object to return
     */
    public void release(T object) {
        if (object == null) return;
        
        // Recycle the object (clear its state)
        recycler.recycle(object);
        
        // Return to pool if not over capacity
        if (pool.size() < maxSize) {
            pool.offer(object);
            borrowedCount.decrementAndGet();
        }
        // If pool is full, let GC collect it
    }
    
    /**
     * Get current pool statistics
     */
    public PoolStatistics getStatistics() {
        return new PoolStatistics(
            currentSize.get(),
            borrowedCount.get(),
            pool.size(),
            maxSize
        );
    }
    
    public static class PoolStatistics {
        public final int totalCreated;
        public final int currentlyBorrowed;
        public final int available;
        public final int maxSize;
        
        public PoolStatistics(int totalCreated, int currentlyBorrowed, 
                             int available, int maxSize) {
            this.totalCreated = totalCreated;
            this.currentlyBorrowed = currentlyBorrowed;
            this.available = available;
            this.maxSize = maxSize;
        }
        
        @Override
        public String toString() {
            return String.format("Pool[created=%d, borrowed=%d, available=%d, max=%d]",
                totalCreated, currentlyBorrowed, available, maxSize);
        }
    }
}