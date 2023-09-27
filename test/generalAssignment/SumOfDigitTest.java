package generalAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitTest {
    @Test
    public void testLengthOfNumbers(){
        int result = SumOfDigit.sumOfDigit(234566765L);
        assertEquals(44,result);
    }

    @Test
    public void testTheDifferenceOfNumber(){
        int result = SumOfDigit.sumOfDigit(1+2+3+3);
        assertEquals(9,result);
    }
    @Test
    public void testTheSumOfNumber(){
        long result = SumOfDigit.sumOfDigit(1233554222222L);
        assertEquals(35,result);
    }
    @Test
    public void testMinusOfTwoNumbers(){
        long result = SumOfDigit.differenceOfDigit(-234);
        assertEquals(5,result);
    }
    @Test
    public void testThatSomething(){
        int result = SumOfDigit.sumOfDigit(-21);
        assertEquals(result, -3);
    }

}