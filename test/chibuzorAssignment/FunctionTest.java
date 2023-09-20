package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    public void testThatNumberIsAEvenNumber(){
      boolean result =  Function.evenNumber(2);
       assertTrue(result);
    }
    @Test
    public void testThatNumberIsAOddNumber(){
        boolean result = Function.evenNumber(59);
        assertFalse(result);
    }

    @Test
    public void testIfNumberIsAPrimeNumber(){
        boolean result = Function.checkPrimeNumber(5);
        assertTrue(result);
    }

    @Test
    public void testIfNumberIsNotAPrimeNumber(){
        boolean result = Function.checkPrimeNumber(90);
        assertFalse(result);
    }

    @Test
    public void testIfLesserFirstNUmberMinusSecondNUmberWillGivePositiveResult(){
        int result = Function.subtract(1,7);
        assertEquals(6,result);
    }
    @Test
    public void testIfFirstNumberMinusSecondNumberWillGivePositiveResult(){
        int result = Function.subtract(10,3);
        assertEquals(7,result);
    }
    @Test
    public void testDivisionIfSecondIntegerIsZero(){
         double result = Function.divide(4,0);
         assertEquals(0,result);
    }

    @Test
    public void testFactor(){
        int result = Function.factor(10);
        assertEquals(4,result);
    }


    @Test
    public void testIsSquare(){
        boolean result = Function.square(25);
        assertTrue(result);
    }

    @Test
    public void testNumberIsNotASquare(){
        boolean result = Function.square(5);
        assertFalse(result);
    }

    @Test
    public void  testNumberNotIsAFiveDigit(){
        boolean number = Function.palindrome(112115);
        assertFalse(number);

    }

    @Test
    public void  testNumberIsAPalindrome(){
        boolean number = Function.palindrome(11211);
        assertTrue(number);

    }

    @Test
    public void testThatNumberIsNotAPalindrome(){
        boolean  number = Function.palindrome(12431);
        assertFalse(number);
    }

    @Test
    public void testTheFactorialOf(){
        int number = Function.factorial(5);
        assertEquals(120,number);
    }
















}