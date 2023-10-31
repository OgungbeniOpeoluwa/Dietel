package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testThatTheSumTwoNumberInArrayIsEqualToTheTargetProvided(){
        int [] array = {2,7,11,15};
        int [] expected = {0,1};
        assertArrayEquals(expected,TwoSum.twoSumFunction(array,9));
    }
    @Test
    public void testForAnotherNumber(){
        int [] array = {3,2,4};
        int [] expected = {1,2};
        assertArrayEquals(expected,TwoSum.twoSumFunction(array,6));
    }

    @Test
    public void testForTwoNumbers(){
        int []array = {3,3};
        int [] expected = {0,1};
        assertArrayEquals(expected,TwoSum.twoSumFunction(array,6));
    }

}