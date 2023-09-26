package generalAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitTest {
    @Test
    public void testLengthOfNumbers(){
        int result = SumOfDigit.lengthOfNumber(2345667653L);
        assertEquals(10,result);
    }

    @Test
    public void testTheDifferenceOfNumber(){
        int result = SumOfDigit.differenceOfDigit(1233);
        assertEquals(-7,result);
    }
    @Test
    public void testTheSumOfNumber(){
        long result = SumOfDigit.sumOfDigit(1233554222222L);
        assertEquals(35,result);
    }
    @Test
    public void testMinusOfTwoNumbers(){
        long result = SumOfDigit.differenceOfDigit(5-4);
        assertEquals(1,result);
    }
    @Test
    public void testThatSomething(){
        int result = SumOfDigit.sumOfDigit(-5+4);
        assertEquals(result, -1);
    }

}