package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    @Test
    public void testNumbers(){
        int [] array = {1,2,3,4,5};
        assertArrayEquals(new int[]{2, 1, 3, 4, 5}, Swap.numb(array,0,1));
    }

}