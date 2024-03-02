package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareStringsTest {
    @Test
    public void compareWordTest(){
        String sentence = "Happy Birthday";
        String secondWord = "Happy Birthday";
        int start = 0;
        int end = 5;
        assertTrue(CompareStrings.compareStrings(sentence,secondWord,start,end));
    }

}