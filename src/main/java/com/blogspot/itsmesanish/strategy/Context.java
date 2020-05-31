package com.blogspot.itsmesanish.strategy;

import java.math.BigDecimal;

/**
 * @author Sanish
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculate(BigDecimal var1, BigDecimal var2) {
        return strategy.doOperation(var1, var2);
    }
}
