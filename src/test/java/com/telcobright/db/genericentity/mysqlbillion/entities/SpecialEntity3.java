package com.telcobright.db.genericentity.mysqlbillion.entities;

/**
 * Special Entity 3: Minimum size fields
 */
public class SpecialEntity3 {
    private Long id;
    private Byte tinyField;
    private Boolean bitField;
    private String charField; // CHAR(1)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getTinyField() {
        return tinyField;
    }

    public void setTinyField(Byte tinyField) {
        this.tinyField = tinyField;
    }

    public Boolean getBitField() {
        return bitField;
    }

    public void setBitField(Boolean bitField) {
        this.bitField = bitField;
    }

    public String getCharField() {
        return charField;
    }

    public void setCharField(String charField) {
        this.charField = charField;
    }

}
