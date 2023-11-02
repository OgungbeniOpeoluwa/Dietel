package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArrayTest {
    @Test
    public void testFirstTwoList(){
        int [] firstList = {1,3};
        int [] secondList = {2};
        double output = 2.0000;
        assertEquals(output,MedianOfTwoSortedList.medianOfTwoSortedArrrayFunction(firstList,secondList));

    }
    @Test
    public void testMedinOfTwoArrayList(){
        int [] firstList = {1,2};
        int [] secondList = {3,4};
        double output = 2.5000;
        assertEquals(output,MedianOfTwoSortedList.medianOfTwoSortedArrrayFunction(firstList,secondList));

    }

    @Test
    public void testForTheMedianOfTheTwoList(){
        int [] firstList = {7,8};
        int [] secondList = {5,6,9};
        double output = 7.0000;
        assertEquals(output,MedianOfTwoSortedList.medianOfTwoSortedArrrayFunction(firstList,secondList));

    }


}