package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;

/**
 * Special Entity 2: Maximum size fields
 */
public class SpecialEntity2 {
    private Long id;
    private String longText; // LONGTEXT equivalent
    private byte[] largeBinary; // LONGBLOB equivalent
    private BigDecimal maxDecimal; // DECIMAL(65,30)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongText() {
        return longText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }

    public byte[] getLargeBinary() {
        return largeBinary;
    }

    public void setLargeBinary(byte[] largeBinary) {
        this.largeBinary = largeBinary;
    }

    public BigDecimal getMaxDecimal() {
        return maxDecimal;
    }

    public void setMaxDecimal(BigDecimal maxDecimal) {
        this.maxDecimal = maxDecimal;
    }

}
