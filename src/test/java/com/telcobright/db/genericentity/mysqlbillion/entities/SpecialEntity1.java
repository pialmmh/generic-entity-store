package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Special Entity 1: All nullable fields for NULL testing
 */
public class SpecialEntity1 {
    private Long id;
    private String nullableString;
    private Integer nullableInt;
    private BigDecimal nullableDecimal;
    private LocalDateTime nullableDateTime;
    private Boolean nullableBoolean;
    private byte[] nullableBytes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNullableString() {
        return nullableString;
    }

    public void setNullableString(String nullableString) {
        this.nullableString = nullableString;
    }

    public Integer getNullableInt() {
        return nullableInt;
    }

    public void setNullableInt(Integer nullableInt) {
        this.nullableInt = nullableInt;
    }

    public BigDecimal getNullableDecimal() {
        return nullableDecimal;
    }

    public void setNullableDecimal(BigDecimal nullableDecimal) {
        this.nullableDecimal = nullableDecimal;
    }

    public LocalDateTime getNullableDateTime() {
        return nullableDateTime;
    }

    public void setNullableDateTime(LocalDateTime nullableDateTime) {
        this.nullableDateTime = nullableDateTime;
    }

    public Boolean getNullableBoolean() {
        return nullableBoolean;
    }

    public void setNullableBoolean(Boolean nullableBoolean) {
        this.nullableBoolean = nullableBoolean;
    }

    public byte[] getNullableBytes() {
        return nullableBytes;
    }

    public void setNullableBytes(byte[] nullableBytes) {
        this.nullableBytes = nullableBytes;
    }

}
