package practise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    calculator2 cal;
    @BeforeEach
    public void setup() {
        cal = new calculator2();
    }
    @Test
    public void testThatCalculatorCanAdd(){
        int result = 10;
        cal.calculator("2+3+5");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testCalculatorForAdd(){
        int result = 6;
        cal.calculator("-2+3+5");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testForSubtraction(){
        int result = 3;
        cal.calculator("10-5-2");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testForAnotherSubtraction(){
        int result = 3;
        cal.calculator("10-5-2");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testForMultiplication(){
        int result = 6000;
        cal.calculator("120*50");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testForAnotherMultiplication(){
        int result = 15;
        cal.calculator("3*5");
        assertEquals(result,cal.getResult());
    }
    @Test
    public void testForMultipleNumber(){
        int result = -46;
        calculator2 cal = new calculator2();
        cal.calculator("12-2-4*10+7-9");
        assertEquals(result,cal.getResult());
    }


}