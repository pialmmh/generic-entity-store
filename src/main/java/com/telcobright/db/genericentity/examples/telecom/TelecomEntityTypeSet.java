package com.telcobright.db.genericentity.examples.telecom;

import com.telcobright.db.genericentity.api.IEntityTypeSet;

/**
 * Entity types for telecom domain
 */
public enum TelecomEntityTypeSet implements IEntityTypeSet {
    PHONE_CALL_LOG(1),
    SMS_LOG(2),
    DATA_USAGE(3),
    SUBSCRIBER(4);
    
    private final int typeId;
    
    TelecomEntityTypeSet(int typeId) {
        this.typeId = typeId;
    }
    
    @Override
    public int getTypeId() {
        return typeId;
    }
}