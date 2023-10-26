package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionFunctionTest {
    @Test
    public void testNumberIsDivisibleBy5(){
        int  number = 25;
        assertTrue(DivisionFunction.isDivisible(number));
    }
    @Test
    public void testNumberIsNotDivisibleBy5(){
        int  number = 4;
        assertFalse(DivisionFunction.isDivisible(number));
    }
}