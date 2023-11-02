package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void testThatStringIsAnagram(){
        String firstLetter = "anagram";
        String secondLetter = "managram";
        String output = "Anagram";
        assertEquals(output,Anagram.isAnagrm(firstLetter,secondLetter));
    }

}