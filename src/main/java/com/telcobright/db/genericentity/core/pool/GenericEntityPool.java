package com.telcobright.db.genericentity.core.pool;

import com.telcobright.db.genericentity.core.GenericEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Specialized pool for GenericEntity objects with efficient recycling
 */
public class GenericEntityPool extends ObjectPool<GenericEntity> {
    
    private static final Recycler<GenericEntity> ENTITY_RECYCLER = new Recycler<GenericEntity>() {
        @Override
        public void recycle(GenericEntity entity) {
            // Clear all fields efficiently
            entity.setId(null);
            entity.setEntityTypeId(0);
            
            // Clear string fields
            for (int i = 1; i <= 20; i++) {
                setStringField(entity, i, null);
            }
            
            // Clear integer fields
            for (int i = 1; i <= 10; i++) {
                setIntField(entity, i, null);
            }
            
            // Clear long fields
            for (int i = 1; i <= 10; i++) {
                setLongField(entity, i, null);
            }
            
            // Clear double fields
            for (int i = 1; i <= 10; i++) {
                setDoubleField(entity, i, null);
            }
            
            // Clear BigDecimal fields
            for (int i = 1; i <= 10; i++) {
                setDecimalField(entity, i, null);
            }
            
            // Clear LocalDateTime fields
            for (int i = 1; i <= 10; i++) {
                setDateTimeField(entity, i, null);
            }
            
            // Clear boolean fields
            for (int i = 1; i <= 10; i++) {
                setBoolField(entity, i, null);
            }
            
            // Clear byte array fields
            for (int i = 1; i <= 10; i++) {
                setBytesField(entity, i, null);
            }
            
            // Clear collection fields if present
            entity.setListField1(null);
            entity.setListField2(null);
            entity.setListField3(null);
            entity.setListField4(null);
            entity.setListField5(null);
            
            entity.setMapField1(null);
            entity.setMapField2(null);
            entity.setMapField3(null);
            entity.setMapField4(null);
            entity.setMapField5(null);
            
            entity.setSetField1(null);
            entity.setSetField2(null);
            entity.setSetField3(null);
            entity.setSetField4(null);
            entity.setSetField5(null);
        }
        
        private void setStringField(GenericEntity entity, int index, String value) {
            switch(index) {
                case 1: entity.setString1(value); break;
                case 2: entity.setString2(value); break;
                case 3: entity.setString3(value); break;
                case 4: entity.setString4(value); break;
                case 5: entity.setString5(value); break;
                case 6: entity.setString6(value); break;
                case 7: entity.setString7(value); break;
                case 8: entity.setString8(value); break;
                case 9: entity.setString9(value); break;
                case 10: entity.setString10(value); break;
                case 11: entity.setString11(value); break;
                case 12: entity.setString12(value); break;
                case 13: entity.setString13(value); break;
                case 14: entity.setString14(value); break;
                case 15: entity.setString15(value); break;
                case 16: entity.setString16(value); break;
                case 17: entity.setString17(value); break;
                case 18: entity.setString18(value); break;
                case 19: entity.setString19(value); break;
                case 20: entity.setString20(value); break;
            }
        }
        
        private void setIntField(GenericEntity entity, int index, Integer value) {
            switch(index) {
                case 1: entity.setInt1(value); break;
                case 2: entity.setInt2(value); break;
                case 3: entity.setInt3(value); break;
                case 4: entity.setInt4(value); break;
                case 5: entity.setInt5(value); break;
                case 6: entity.setInt6(value); break;
                case 7: entity.setInt7(value); break;
                case 8: entity.setInt8(value); break;
                case 9: entity.setInt9(value); break;
                case 10: entity.setInt10(value); break;
            }
        }
        
        private void setLongField(GenericEntity entity, int index, Long value) {
            switch(index) {
                case 1: entity.setLong1(value); break;
                case 2: entity.setLong2(value); break;
                case 3: entity.setLong3(value); break;
                case 4: entity.setLong4(value); break;
                case 5: entity.setLong5(value); break;
                case 6: entity.setLong6(value); break;
                case 7: entity.setLong7(value); break;
                case 8: entity.setLong8(value); break;
                case 9: entity.setLong9(value); break;
                case 10: entity.setLong10(value); break;
            }
        }
        
        private void setDoubleField(GenericEntity entity, int index, Double value) {
            switch(index) {
                case 1: entity.setDouble1(value); break;
                case 2: entity.setDouble2(value); break;
                case 3: entity.setDouble3(value); break;
                case 4: entity.setDouble4(value); break;
                case 5: entity.setDouble5(value); break;
                case 6: entity.setDouble6(value); break;
                case 7: entity.setDouble7(value); break;
                case 8: entity.setDouble8(value); break;
                case 9: entity.setDouble9(value); break;
                case 10: entity.setDouble10(value); break;
            }
        }
        
        private void setDecimalField(GenericEntity entity, int index, BigDecimal value) {
            switch(index) {
                case 1: entity.setDecimal1(value); break;
                case 2: entity.setDecimal2(value); break;
                case 3: entity.setDecimal3(value); break;
                case 4: entity.setDecimal4(value); break;
                case 5: entity.setDecimal5(value); break;
                case 6: entity.setDecimal6(value); break;
                case 7: entity.setDecimal7(value); break;
                case 8: entity.setDecimal8(value); break;
                case 9: entity.setDecimal9(value); break;
                case 10: entity.setDecimal10(value); break;
            }
        }
        
        private void setDateTimeField(GenericEntity entity, int index, LocalDateTime value) {
            switch(index) {
                case 1: entity.setDatetime1(value); break;
                case 2: entity.setDatetime2(value); break;
                case 3: entity.setDatetime3(value); break;
                case 4: entity.setDatetime4(value); break;
                case 5: entity.setDatetime5(value); break;
                case 6: entity.setDatetime6(value); break;
                case 7: entity.setDatetime7(value); break;
                case 8: entity.setDatetime8(value); break;
                case 9: entity.setDatetime9(value); break;
                case 10: entity.setDatetime10(value); break;
            }
        }
        
        private void setBoolField(GenericEntity entity, int index, Boolean value) {
            switch(index) {
                case 1: entity.setBool1(value); break;
                case 2: entity.setBool2(value); break;
                case 3: entity.setBool3(value); break;
                case 4: entity.setBool4(value); break;
                case 5: entity.setBool5(value); break;
                case 6: entity.setBool6(value); break;
                case 7: entity.setBool7(value); break;
                case 8: entity.setBool8(value); break;
                case 9: entity.setBool9(value); break;
                case 10: entity.setBool10(value); break;
            }
        }
        
        private void setBytesField(GenericEntity entity, int index, byte[] value) {
            switch(index) {
                case 1: entity.setBytes1(value); break;
                case 2: entity.setBytes2(value); break;
                case 3: entity.setBytes3(value); break;
                case 4: entity.setBytes4(value); break;
                case 5: entity.setBytes5(value); break;
                case 6: entity.setBytes6(value); break;
                case 7: entity.setBytes7(value); break;
                case 8: entity.setBytes8(value); break;
                case 9: entity.setBytes9(value); break;
                case 10: entity.setBytes10(value); break;
            }
        }
    };
    
    public GenericEntityPool(int maxSize) {
        super(maxSize, GenericEntity::new, ENTITY_RECYCLER);
    }
}