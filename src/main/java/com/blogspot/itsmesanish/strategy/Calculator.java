package com.blogspot.itsmesanish.strategy;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class Calculator {

    public static final Logger LOG = Logger.getLogger(Calculator.class.getSimpleName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOG.info("Enter 1st number");
        int firstNumber = scanner.nextInt();

        LOG.info("Enter 2nd number");
        int secondNumber = scanner.nextInt();

        Context context = new Context(new Sum());
        BigDecimal sum = context.calculate(new BigDecimal(firstNumber), new BigDecimal(secondNumber));
        LOG.info("Adding two values:" + sum);
    }
}
