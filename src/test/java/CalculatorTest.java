import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = Calculator.getInstance();

    @Test
    void add() {
        assertEquals(50, calc.plus(30, 20));
    }

    @Test
    void dif() {
        assertEquals(7, calc.dif(-1, -8));
    }

    @Test
    void div() {
        assertEquals(22, calc.div(22, 0));
    }

    @Test
    void times() {
        assertEquals(24, calc.multiply(3, 8));
    }

    @Test
    void solver() {
        assertEquals(56, calc.calculateExpression(9, 5));
    }
}