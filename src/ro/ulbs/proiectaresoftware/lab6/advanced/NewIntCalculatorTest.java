package ro.ulbs.proiectaresoftware.lab6.advanced;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewIntCalculatorTest {

    @Test
    public void testAddPositive() {
        NewIntCalculator calculator = new NewIntCalculator().init();

        calculator.add(5);

        assertEquals(5, calculator.result());
    }

    @Test
    void testAddNegatives() {
        NewIntCalculator calculator = new NewIntCalculator().init();

        calculator.add(-5);

        assertEquals(-5, calculator.result());
    }

    @Test
    void testSubtractPositives() {
        NewIntCalculator calculator = new NewIntCalculator().init();

        calculator.subtract(3);

        assertEquals(-3, calculator.result());
    }

    @Test
    void testSubtractNegatives() {
        NewIntCalculator calculator = new NewIntCalculator().init();

        calculator.subtract(-3);

        assertEquals(3, calculator.result());
    }

    @Test
    void testMultiplyPositives() {
        NewIntCalculator calculator = new NewIntCalculator().init();
        calculator.add(4);

        calculator.multiply(3);

        assertEquals(12, calculator.result());
    }

    @Test
    void testMultiplyNegatives() {
        NewIntCalculator calculator = new NewIntCalculator().init();
        calculator.add(-4);

        calculator.multiply(-3);

        assertEquals(12, calculator.result());
    }

    @Test
    void testMultiplyBy0() {
        NewIntCalculator calculator = new NewIntCalculator().init();
        calculator.add(5);

        calculator.multiply(0);

        assertEquals(0, calculator.result());
    }

    @Test
    void testDividePositives() {
        NewIntCalculator calculator = new NewIntCalculator().init();
        calculator.add(10);

        calculator.divide(2);

        assertEquals(5, calculator.result());
    }

    @Test
    void testDivideNegatives() {
        NewIntCalculator calculator = new NewIntCalculator().init();
        calculator.add(-10);

        calculator.divide(-2);

        assertEquals(5, calculator.result());
    }
}