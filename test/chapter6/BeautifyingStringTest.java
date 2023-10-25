package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifyingStringTest {

    @Test
    public void testLastWordHasFullStop(){
        String name = "philip.";
        assertEquals(name,BeautifyingString.endsWithFullStop("philip"));
    }
    @Test
    public void testThatWordThatHasFullStopDoesNotDouble(){
        String name = "philip.";
        assertEquals(name,BeautifyingString.endsWithFullStop("philip."));
    }
    @Test
    public void testFirstLetterStartWithCapitalLetter(){
        String name = "Philip";
        assertEquals(name,BeautifyingString.firstLetterStartWithCapitalLetter("philip"));
    }
    @Test
    public void testAllFunctionalityInASentence(){
        String sentence = "I am a girl.";
        assertEquals(sentence,BeautifyingString.beutifiedString("i am a girl"));
    }

}