package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void testMultiplyPositive() {
        Multiplication m = new Multiplication();
        assertEquals(20, m.multiply(4, 5));
    }

    @Test
    void testMultiplyByZero() {
        Multiplication m = new Multiplication();
        assertEquals(0, m.multiplyByZero(100));
    }

    @Test
    void testMultiplyNegative() {
        Multiplication m = new Multiplication();
        assertEquals(-15, m.multiplyNegative(3, 5));
    }
}
