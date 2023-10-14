package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourConsecutiveNumberTest {
    @Test
    public void testIfNumberHaveConsecutiveNumberAndAreEqual(){
        int [] array = {2,1,4,5,4,6,4,6,4};
        boolean result = FourConsecutiveNumber.consecutiveNumber(array);
        assertTrue(result);
    }
    @Test
    public void testIfNumberHaveConsecutiveOfZeroAndAreEqual(){
        int [] array = {2,1,4,5,1,6,1,6,1};
        boolean result = FourConsecutiveNumber.consecutiveNumber(array);
        assertTrue(result);
    }

}