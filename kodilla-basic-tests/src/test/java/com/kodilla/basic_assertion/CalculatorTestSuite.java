package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(8, sumResult);

        int subtractResult = calculator.subtract(a, b);
        assertEquals(-8, subtractResult);

        if (a > 0) {
            int squaredResult = calculator.squared(a);
            assertEquals(25, squaredResult);
        } else if (a == 0) {
            System.out.println("ERROR. 'a' can not be equal 0");
        }
        else{System.out.println("ERROR. 'a' can not be less than 0");
        }
    }
}