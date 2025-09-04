package com.telcobright.db.genericentity.mutation;

import com.telcobright.db.genericentity.core.impl.ConverterGenerator;
import com.telcobright.db.genericentity.core.EntityConverter;
import com.telcobright.db.genericentity.mutation.MutationTest.NumericMutationEntity;
import java.lang.reflect.Method;

public class DebugConverterGeneration {
    public static void main(String[] args) {
        System.out.println("Testing converter generation for NumericMutationEntity\n");
        
        // Create entity with data
        NumericMutationEntity entity = new NumericMutationEntity();
        entity.setId(123L);
        entity.setIntValue(456);
        entity.setMutationCount(0);
        
        System.out.println("Entity values:");
        System.out.println("  ID: " + entity.getId());
        System.out.println("  IntValue: " + entity.getIntValue());
        System.out.println("  MutationCount: " + entity.getMutationCount());
        
        // Test converter generation
        try {
            ConverterGenerator generator = new ConverterGenerator();
            EntityConverter converter = generator.generateConverter(NumericMutationEntity.class);
            
            System.out.println("\nConverter generated successfully!");
            
            // Test ID extraction
            Long extractedId = converter.extractId(entity);
            System.out.println("\nExtracted ID: " + extractedId);
            
        } catch (Exception e) {
            System.out.println("\nConverter generation failed!");
            e.printStackTrace();
        }
        
        // Check what methods are visible
        System.out.println("\n\nMethods visible via getMethods():");
        for (Method m : NumericMutationEntity.class.getMethods()) {
            if (m.getName().startsWith("get") || m.getName().startsWith("set")) {
                System.out.println("  " + m.getName() + " -> " + m.getReturnType().getSimpleName());
            }
        }
    }
}