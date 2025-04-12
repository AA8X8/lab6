import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(50, calc.add(30, 20));
    }

    @Test
    void dif() {
        assertEquals(7, calc.dif(-1, -8));
    }

    @Test
    void div() {
        assertEquals(22, calc.div(22, 1));
    }

    @Test
    void times() {
        assertEquals(24, calc.times(3, 8));
    }

    @Test
    void solver() {
        assertEquals(56, calc.solver(9, 5));
    }
}