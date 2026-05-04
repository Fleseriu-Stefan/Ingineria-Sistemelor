package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleCalculatorTest {

    @Test
    public void testAddPositive() {
        DoubleCalculator calculator = new DoubleCalculator().init();

        calculator.add(5.5);

        assertEquals(5.5, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        DoubleCalculator calculator = new DoubleCalculator().init();

        calculator.add(-5.5);

        assertEquals(-5.5, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        DoubleCalculator calculator = new DoubleCalculator().init();

        calculator.subtract(3.5);

        assertEquals(-3.5, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        DoubleCalculator calculator = new DoubleCalculator().init();

        calculator.subtract(-3.5);

        assertEquals(3.5, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(4.0);

        calculator.multiply(3.0);

        assertEquals(12.0, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(-4.0);

        calculator.multiply(-3.0);

        assertEquals(12.0, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(5.5);

        calculator.multiply(0.0);

        assertEquals(0.0, calculator.result());
    }

    @Test
    public void testDividePositives() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(10.0);

        calculator.divide(2.0);

        assertEquals(5.0, calculator.result());
    }

    @Test
    public void testDivideNegatives() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(-10.0);

        calculator.divide(-2.0);

        assertEquals(5.0, calculator.result());
    }

    @Test
    public void testDivideBy0() {
        DoubleCalculator calculator = new DoubleCalculator().init();
        calculator.add(10.0);

        calculator.divide(0.0);

        assertEquals(Double.POSITIVE_INFINITY, calculator.result());
    }
}