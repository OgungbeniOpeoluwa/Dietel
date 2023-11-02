package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testThatCalculatorCanAdd(){
        int result = 10;
        assertEquals(result,Calculator.addition("2 + 3 + 5"));
    }
    @Test
    public void testCalculatorForAdd(){
        int result = 6;
        assertEquals(result,Calculator.addition("-2 + 3 + 5"));
    }
    @Test
    public void testForSubtraction(){
        int result = 3;
        assertEquals(result,Calculator.subtraction("10-5-2"));
    }
    @Test
    public void testForAnotherSubtraction(){
        int result = -16;
        assertEquals(result,Calculator.subtraction("-9-5-2"));
    }
    @Test
    public void testForMultiplication(){
        int result = 6000;
        assertEquals(result,Calculator.multiplication("120*50"));
    }
    @Test
    public void testForAnotherMultiplication(){
        int result = 15;
        assertEquals(result,Calculator.multiplication("3 * 5 "));
    }
    @Test
    public void testForSquare(){
        int result = 25;
        assertEquals(result,Calculator.square("5 ^ 5"));
    }


}