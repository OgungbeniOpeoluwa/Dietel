package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFunctionTest {

    @Test
    public void testThatNumberIsAEvenNumber(){
      boolean result =  EvenFunction.evenNumber(2);
       assertTrue(result);
    }
    @Test
    public void testThatNumberIsAOddNumber(){
        boolean result = EvenFunction.evenNumber(59);
        assertFalse(result);
    }

    @Test
    public void testIfNumberIsAPrimeNumber(){
        boolean result = EvenFunction.checkPrimeNumber(5);
        assertTrue(result);
    }

    @Test
    public void testIfNumberIsNotAPrimeNumber(){
        boolean result = EvenFunction.checkPrimeNumber(90);
        assertFalse(result);
    }

    @Test
    public void testIfLesserFirstNUmberMinusSecondNUmberWillGivePositiveResult(){
        int result = EvenFunction.subtract(1,7);
        assertEquals(6,result);
    }
    @Test
    public void testIfFirstNumberMinusSecondNumberWillGivePositiveResult(){
        int result = EvenFunction.subtract(10,3);
        assertEquals(7,result);
    }
    @Test
    public void testDivisionIfSecondIntegerIsZero(){
         double result = EvenFunction.divide(4,0);
         assertEquals(0,result);
    }

    @Test
    public void testFactor(){
        int result = EvenFunction.factor(10);
        assertEquals(4,result);
    }


    @Test
    public void testIsSquare(){
        boolean result = EvenFunction.square(25);
        assertTrue(result);
    }

    @Test
    public void testNumberIsNotASquare(){
        boolean result = EvenFunction.square(5);
        assertFalse(result);
    }

    @Test
    public void  testNumberNotIsAFiveDigit(){
        boolean number = EvenFunction.palindrome(112115);
        assertFalse(number);

    }

    @Test
    public void  testNumberIsAPalindrome(){
        boolean number = EvenFunction.palindrome(11211);
        assertTrue(number);

    }

    @Test
    public void testThatNumberIsNotAPalindrome(){
        boolean  number = EvenFunction.palindrome(12431);
        assertFalse(number);
    }

    @Test
    public void testTheFactorialOf(){
        int number = EvenFunction.factorial(5);
        assertEquals(120,number);
    }
















}