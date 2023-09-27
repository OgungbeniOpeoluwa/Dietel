package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneKeypadTest {
    @Test
    public void testPhoneKeypad2(){
        int result = PhoneKeypad.phoneKeyPad("a");
        assertEquals(2,result);
    }
    @Test
    public void testPhonesKeypad3(){
        int result = PhoneKeypad.phoneKeyPad("d");
        assertEquals(3,result);
    }
    @Test
    public void testPhoneKeyPad4(){
        int result = PhoneKeypad.phoneKeyPad("g");
        assertEquals(4,result);
    }
    @Test
    public void testPhoneKeyPad5(){
        int result = PhoneKeypad.phoneKeyPad("k");
        assertEquals(5,result);
    }
    @Test
    public void testPhoneKeypad6(){
        int result = PhoneKeypad.phoneKeyPad("m");
        assertEquals(6,result);
    }
    @Test
    public  void testPhoneKeyPad7(){
        int result = PhoneKeypad.phoneKeyPad("p");
        assertEquals(7,result);
    }
    @Test
    public void testPhoneKeyPad8(){
        int result = PhoneKeypad.phoneKeyPad("v");
        assertEquals(8,result);
    }
    @Test
    public void testPhoneKeyPad9(){
        int result = PhoneKeypad.phoneKeyPad("z");
        assertEquals(9,result);
    }
    @Test
    public void testPhoneKeyPadCapitalLetter2(){
        int result = PhoneKeypad.phoneKeyPad("B");
        assertEquals(2,result);
    }
    @Test
    public void testPhoneKeyPadCapitalLetterFor9(){
        int result = PhoneKeypad.phoneKeyPad("Y");
        assertEquals(9,result);
    }

}