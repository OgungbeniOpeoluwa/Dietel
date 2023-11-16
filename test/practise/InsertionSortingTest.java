package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortingTest {
    @Test
    public void testNumberSorted(){
        int [] number = {4,7,1,8,3,5,9,1};
        int [] expected = {1,1,3,4,5,7,8,9};
        assertArrayEquals(expected,InsertionSorting.sortingFunction(number));

    }
    @Test
    public void testAnotherNumberSorted(){
        int [] number = {9,7,1,8,2,5,18,1,2};
        int [] expected = {1,1,2,2,5,7,8,9,18 };
        assertArrayEquals(expected,InsertionSorting.sortingFunction(number));

    }

}