package com.blogspot.itsmesanish.strategy;

import java.math.BigDecimal;

/**
 * @author Sanish
 */
public class Sum implements Strategy {
    @Override
    public BigDecimal doOperation(BigDecimal var1, BigDecimal var2) {
        return var1.add(var2);
    }
}
