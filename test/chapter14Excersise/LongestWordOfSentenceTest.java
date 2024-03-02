package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestWordOfSentenceTest {
    @Test
    public void returnLongestWordInSentenceTest(){
        String sentence = "My name is Ope Ogungbeni";
        String output = "Ogungbeni";
        assertEquals(output,LongestWordOfSentence.returnLongestWordInSentence(sentence));
    }

}