package com.telcobright.db.genericentity.examples.ecommerce;

import com.telcobright.db.genericentity.api.IEntityTypeSet;

/**
 * Entity types for e-commerce domain
 */
public enum EcommerceEntityTypeSet implements IEntityTypeSet {
    CUSTOMER(1),
    ORDER(2),
    PRODUCT(3),
    CART(4);
    
    private final int typeId;
    
    EcommerceEntityTypeSet(int typeId) {
        this.typeId = typeId;
    }
    
    @Override
    public int getTypeId() {
        return typeId;
    }
}