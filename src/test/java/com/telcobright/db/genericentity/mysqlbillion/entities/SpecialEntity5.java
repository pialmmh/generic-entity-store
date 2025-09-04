package com.telcobright.db.genericentity.mysqlbillion.entities;

import java.math.BigDecimal;

/**
 * Special Entity 5: High precision decimals
 */
public class SpecialEntity5 {
    private Long id;
    private BigDecimal precision2; // DECIMAL(10,2)
    private BigDecimal precision8; // DECIMAL(20,8)
    private BigDecimal precision18; // DECIMAL(38,18)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrecision2() {
        return precision2;
    }

    public void setPrecision2(BigDecimal precision2) {
        this.precision2 = precision2;
    }

    public BigDecimal getPrecision8() {
        return precision8;
    }

    public void setPrecision8(BigDecimal precision8) {
        this.precision8 = precision8;
    }

    public BigDecimal getPrecision18() {
        return precision18;
    }

    public void setPrecision18(BigDecimal precision18) {
        this.precision18 = precision18;
    }

}
