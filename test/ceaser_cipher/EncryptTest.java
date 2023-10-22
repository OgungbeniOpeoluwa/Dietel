 package ceaser_cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
    public void testEncryptingAllLetters(){
        int key = 5;
        String [] expected = {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"};
        assertArrayEquals(expected,Encrypt.encryptFunction(key));
    }
    @Test
    public void testEncryptLetter(){
        String letter = "A";
        int key = 3;
        String  expected = "X";
        assertEquals(expected,Encrypt.encryptedLetter(letter,key));
    }
    @Test
    public void testEncryptWord(){
        String letter = "hello";
        int key = 3;
        String  expected = "EBIIL";
        assertEquals(expected,Encrypt.encryptedLetter(letter,key));
    }
    @Test
    public void testDecryptLetter(){
        String letter = "X";
        int key = 3;
        String  expected = "A";
        assertEquals(expected,Encrypt.decryptLetter(letter,key));
    } @Test
    public void testDecryptWord(){
        String letter = "EBIIL";
        int key = 3;
        String  expected = "HELLO";
        assertEquals(expected,Encrypt.decryptLetter(letter,key));
    }

}