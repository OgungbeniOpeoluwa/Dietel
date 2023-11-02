package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    @Test
    public void testIndexOfSubstring(){
        String input = "abcabcbb";
        int output = 3;
        assertEquals(output,LongestSubstring.longestSubStringFunction(input));
    }

}