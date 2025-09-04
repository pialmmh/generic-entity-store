package com.telcobright.db.genericentity.core.pool;

import com.telcobright.db.genericentity.api.IEntityTypeSet;
import com.telcobright.db.genericentity.core.ProxyIdManager;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Object pool for CompositeKey objects to avoid allocations in hot path.
 * Pre-allocates keys based on expected maxRecords to minimize GC.
 */
public class CompositeKeyPool<T extends IEntityTypeSet> {
    
    private final BlockingQueue<ProxyIdManager.CompositeKey<T>> pool;
    private final int maxSize;
    private final AtomicInteger created = new AtomicInteger(0);
    private final AtomicInteger borrowed = new AtomicInteger(0);
    
    /**
     * Create a pool with initial capacity based on maxRecords
     * @param maxRecords Maximum number of records expected
     */
    public CompositeKeyPool(int maxRecords) {
        // Pool size is 2x maxRecords to handle temporary keys during operations
        this.maxSize = maxRecords * 2;
        this.pool = new LinkedBlockingQueue<>(maxSize);
        
        // Pre-allocate 10% of max capacity upfront
        int preAllocate = Math.min(maxRecords / 10, 10000);
        for (int i = 0; i < preAllocate; i++) {
            ProxyIdManager.CompositeKey<T> key = new ProxyIdManager.CompositeKey<>();
            pool.offer(key);
            created.incrementAndGet();
        }
    }
    
    /**
     * Borrow a CompositeKey from the pool
     * @param entityType The entity type
     * @param originalId The original ID
     * @return A recycled or new CompositeKey
     */
    public ProxyIdManager.CompositeKey<T> borrow(T entityType, Long originalId) {
        ProxyIdManager.CompositeKey<T> key = pool.poll();
        
        if (key == null) {
            // Create new if pool is empty (up to maxSize)
            if (created.get() < maxSize) {
                key = new ProxyIdManager.CompositeKey<>();
                created.incrementAndGet();
            } else {
                // Pool exhausted - fall back to new allocation
                // This should be rare if maxRecords is properly set
                key = new ProxyIdManager.CompositeKey<>();
            }
        }
        
        // Initialize the borrowed key
        key.init(entityType, originalId);
        borrowed.incrementAndGet();
        return key;
    }
    
    /**
     * Return a CompositeKey to the pool
     * @param key The key to return
     */
    public void release(ProxyIdManager.CompositeKey<T> key) {
        if (key != null) {
            // Clear the key before returning to pool
            key.clear();
            
            // Try to return to pool (will fail silently if pool is full)
            if (pool.offer(key)) {
                borrowed.decrementAndGet();
            }
        }
    }
    
    /**
     * Get pool statistics
     */
    public PoolStatistics getStatistics() {
        return new PoolStatistics(
            created.get(),
            borrowed.get(),
            pool.size(),
            maxSize
        );
    }
    
    public static class PoolStatistics {
        public final int created;
        public final int borrowed;
        public final int available;
        public final int maxSize;
        
        public PoolStatistics(int created, int borrowed, int available, int maxSize) {
            this.created = created;
            this.borrowed = borrowed;
            this.available = available;
            this.maxSize = maxSize;
        }
        
        @Override
        public String toString() {
            return String.format("CompositeKeyPool[created=%d, borrowed=%d, available=%d, max=%d]",
                created, borrowed, available, maxSize);
        }
    }
}