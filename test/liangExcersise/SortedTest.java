package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedTest {
    @Test
    public void testIfNumbersAreSorted(){
        int [] array = {2,5,6,7,8,9,7};
        boolean result = Sorted.sortFunction(array);
    }

}