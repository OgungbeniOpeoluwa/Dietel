package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeTest {
    @Test
    public void testThatWordIsEncryptedIntoMorseCode(){
        String word="Hello world";
      String output=".... . .-.. .-.. ---    .-- --- .-. .-.. -..";
        assertEquals(output,MorseCode.encrptyWord(word));
    }
    @Test
    public void testThatHello_WorldEncryptedVersionCanBeDecrypt(){
        String word=".... . .-.. .-.. ---    .-- --- .-. .-.. -..";
        String output = "HELLO   WORLD";
        assertEquals(output,MorseCode.decryptWord(word));

    }

}