package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceTest {
    @Test
    public void testForFirstOccurrenceInAString(){
        String hayStack ="sadbutsad";
        String needle = "sad";
        int expected = 0;
        assertEquals(expected,FirstOccurrence.firstOccurrenceFunction(hayStack,needle));
    }
    @Test
    public void testForAnotherFirstOccurrenceInAString(){
        String hayStack ="sadbutsad";
        String needle = "but";
        int expected = 3;
        assertEquals(expected,FirstOccurrence.firstOccurrenceFunction(hayStack,needle));
    }
    @Test
    public void testForNotFirstOccurrenceInAString(){
        String hayStack ="leetcode";
        String needle = "leeto";
        int expected = -1;
        assertEquals(expected,FirstOccurrence.firstOccurrenceFunction(hayStack,needle));
    }


}