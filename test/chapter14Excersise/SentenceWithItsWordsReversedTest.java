package chapter14Excersise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceWithItsWordsReversedTest {
    @Test
    public void manniputateStringTest(){
        String word = "I am a girl";
        List<String > reverse = List.of("I","ma","a","lrig");
        assertEquals(reverse,SentenceWithItsWordsReversed.reverseSentence(word));

    }

}