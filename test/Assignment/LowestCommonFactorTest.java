package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonFactorTest {
    @Test
    public void testArrayOfLowestCommonFactor(){
        int [] array = {2,2};
        assertArrayEquals(array, HighestCommonFactor.commonFactor(8,36));
    }
    @Test
    public void testMaximumNumber(){
        int expected = 50;
        assertEquals(expected, HighestCommonFactor.maximum(6,36,3,8,50));
    }
    @Test
    public void testHighestCommonFactorForAnotherNumber(){
        int [] array = {2};
        assertArrayEquals(array, HighestCommonFactor.commonFactor(246,36));
    }




}