package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    public void testSubtractionPositiveNumbers() {
        int result = MathOperations.subtraction(10, 5);
        assertEquals(5, result, "Subtraction of 10 and 5 should be 5");
    }

    @Test
    public void testSubtractionNegativeNumbers() {
        int result = MathOperations.subtraction(-8, -3);
        assertEquals(-5, result, "Subtraction of -8 and -3 should be -5");
    }

    @Test
    public void testMultiplicationPositiveNumbers() {
        int result = MathOperations.multiplication(6, 4);
        assertEquals(24, result, "Multiplication of 6 and 4 should be 24");
    }

    @Test
    public void testMultiplicationZero() {
        int result = MathOperations.multiplication(0, 100);
        assertEquals(0, result, "Multiplication by 0 should result in 0");
    }
}
