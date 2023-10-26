package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticFunctionsTest {
    @Test
    public void testForAddition(){
        int number = 10;
        assertEquals(number,ArithmeticFunctions.addition(5,5));
    }

    @Test
    public void testForSubtraction(){
        int number = 25;
        assertEquals(number,ArithmeticFunctions.subtraction(30,5));
    }
    @Test
    public void testForDivison(){
        int number = 5;
        assertEquals(number,ArithmeticFunctions.division(10,2));
    }

}