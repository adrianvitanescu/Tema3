package test.java.first;

import main.java.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calc = new Calculator(4, 5);
        int sum = calc.sum();
        assertEquals(sum, 9);
    }

    @Test
    public void testASumNull(){
        Calculator calc = new Calculator(null, 5);
        int sum = calc.sum();
        assertEquals(sum, 5);
    }

    @Test
    public void testBSumNull(){
        Calculator calc = new Calculator(4, null);
        int sum = calc.sum();
        assertEquals(sum, 4);
    }

    @Test
    public void testAandBnullSum(){
        Calculator calc = new Calculator(null, null);
        assertNull(calc.sum());
    }

    @Test
    public void testMin(){
        Calculator calc = new Calculator(7, 5);
        int min = calc.min();
        assertEquals(min, 5);


    }

    @Test(expected = NullPointerException.class)
    public void testMinException() {
        Calculator calc = new Calculator();
        int min = calc.min();
    }

    @Test
    public void testMax(){
        Calculator calc = new Calculator(4, 9);
        int max = calc.max();
        assertEquals(max, 9);
    }

    @Test
    public void testLessThan(){
        Calculator calc = new Calculator(4, 5);
        boolean compare = calc.lessThan(6);
        assertEquals(compare, true);
    }
}
