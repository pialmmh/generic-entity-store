import com.telcobright.db.genericentity.api.GenericEntityStorage;
import com.telcobright.db.genericentity.mysqlbillion.*;
import com.telcobright.db.genericentity.mysqlbillion.entities.*;

public class SimpleTest {
    public static void main(String[] args) {
        var storage = GenericEntityStorage.<MySQLBillionEntityType>builder()
            .withEntityTypeSet(MySQLBillionEntityType.class)
            .withMaxRecords(10000)
            .registerType(MySQLBillionEntityType.SPECIAL_ENTITY_1, SpecialEntity1.class, 10)
            .build();
        
        SpecialEntity1 original = new SpecialEntity1();
        original.setId(1L);
        original.setNullableString("TEST_DATA");
        original.setNullableInt(42);
        
        System.out.println("Storing: ID=" + original.getId() + ", String=" + original.getNullableString() + ", Int=" + original.getNullableInt());
        storage.put(original, MySQLBillionEntityType.SPECIAL_ENTITY_1);
        
        SpecialEntity1 retrieved = storage.get(1L, MySQLBillionEntityType.SPECIAL_ENTITY_1);
        System.out.println("Retrieved: ID=" + retrieved.getId() + ", String=" + retrieved.getNullableString() + ", Int=" + retrieved.getNullableInt());
        
        if ("TEST_DATA".equals(retrieved.getNullableString()) && Integer.valueOf(42).equals(retrieved.getNullableInt())) {
            System.out.println("✅ SUCCESS: Data retrieved correctly!");
        } else {
            System.out.println("❌ FAIL: Data not preserved!");
        }
    }
}
