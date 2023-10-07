import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleToArrayTest {
    @Test
    public void test_reverse() {
        int[] result = {10, 20, 30, 40, 50};
        int[] expected = {50, 40, 30, 20, 10};
        assertArrayEquals(expected, TupleToArray.reverseNumber(result));


    }

    @Test
    public void testFirstAndLastElementArray() {
        int[] item = {15, 25, 60, 50, 30, 40, 45, 55};
        int[] result = {55, 15};
        // assertArrayEquals(result,TupleToArray.lastAndFirstElement(item));
    }
}

