package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.mutation.MutationTest.NumericMutationEntity;
import java.lang.reflect.Method;

public class DebugIdExtraction {
    public static void main(String[] args) {
        NumericMutationEntity entity = new NumericMutationEntity();
        entity.setId(123L);
        
        System.out.println("Entity ID directly: " + entity.getId());
        
        System.out.println("\nChecking methods:");
        for (Method method : entity.getClass().getMethods()) {
            if (method.getName().contains("Id")) {
                System.out.println("  Found method: " + method.getName() + 
                                 " with return type: " + method.getReturnType());
            }
        }
        
        System.out.println("\nTrying to invoke getId:");
        try {
            Method getId = entity.getClass().getMethod("getId");
            Object id = getId.invoke(entity);
            System.out.println("  Successfully invoked getId: " + id);
        } catch (Exception e) {
            System.out.println("  Failed to invoke: " + e.getMessage());
            e.printStackTrace();
        }
    }
}