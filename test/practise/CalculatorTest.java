package practise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator2 cal;
    @BeforeEach
    public void setup() {
        cal = new Calculator2();
    }
    @Test
    public void testThatCalculatorCanAdd(){
        int result = 10;
        cal.calculator("2+3+5");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testCalculatorForAdd(){
        int result = 6;
        cal.calculator("-2+3+5");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testForSubtraction(){
        int result = 3;
        cal.calculator("10-5-2");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testForAnotherSubtraction(){
        int result = 3;
        cal.calculator("10-5-2");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testForMultiplication(){
        int result = 6000;
        cal.calculator("120*50");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testForAnotherMultiplication(){
        int result = 15;
        cal.calculator("3*5");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testForMultipleNumber(){
        int result = -47;
        Calculator2 cal = new Calculator2();
        cal.calculator("12-2-4*10+7-10");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testIfArithmeticFunctionContainsSpace(){
        int result = -47;
        Calculator2 cal = new Calculator2();
        cal.calculator("12 - 2 - 4 * 10 + 7 - 10");
        assertEquals(result,cal.getFinalResult());
    }
    @Test
    public void testAnotherArithmeticFunctionContainsSpace(){
        int result = 96;
        Calculator2 cal = new Calculator2();
        cal.calculator("1 + 5 + 10 * 9");
        assertEquals(result,cal.getFinalResult());
    }


}