package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionArrayTest {
    @Test
    public void testLargestNumber(){
        int result = FunctionArray.largestFunction(new int[] {1,2,3,4,5});
        assertEquals(5,result);
    }
//    @Test
//    public void testReverse(){
//        int  result = FunctionArray.reverse(new int[] {1,2,3,4,5,6});
//        assertEquals({6,5,4,3,2,1},result);
//    }

}