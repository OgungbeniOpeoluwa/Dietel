package practise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoSumTest {
    @Test
    public void testTwoSumAndReturnTheSumAsALinkedList(){
        int [] arrayOne = {2,4,3};
        int [] arrayTwo = {5,6,4};
        int [] expected = {7,0,8};
        assertArrayEquals(expected,AddTwoSum.twoSumFunctionArray(arrayOne,arrayTwo));
    }

    @Test
    public void testReverseArray(){
        int [] arrayOne = {2,4,3};
        int [] expected = {3,4,2};
        assertArrayEquals(expected,AddTwoSum.reverseNumber(arrayOne));
    }
    @Test
    public  void testAnotherArraysOfNumber(){
        int [] arrayOne = {0};
        int [] arrayTwo = {0};
        int [] expected = {0};
        assertArrayEquals(expected,AddTwoSum.twoSumFunctionArray(arrayOne,arrayTwo));
    }

    @Test
    public  void testAnotherArraysOfNumbers(){
        int [] arrayOne = {9,9,9,9,9,9,9};
        int [] arrayTwo = {9,9,9,9};
        int [] expected = {8,9,9,9,0,0,0,1};
        assertArrayEquals(expected,AddTwoSum.twoSumFunctionArray(arrayOne,arrayTwo));
    }

}