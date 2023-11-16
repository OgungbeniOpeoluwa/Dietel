package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class uniqueBinarySearchTest {
    @Test
    public void testThatUniqueBinaryNumberExitInList() {
        String [] numbers = {"01", "10"};
        String expected = "11";
        System.out.println(uniqueBinarySearch.binarySearchFunction(numbers));
        assertEquals(expected,uniqueBinarySearch.binarySearchFunction(numbers));
    }


}