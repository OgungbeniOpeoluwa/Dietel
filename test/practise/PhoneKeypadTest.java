package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneKeypadTest {
    @Test
    public void testPhoneKeypad2(){
        String result = PhoneKeypad.phoneKeyPad("a");
        assertEquals("The Corresponding Number is 2",result);
    }
    @Test
    public void testPhonesKeypad3(){
        String result = PhoneKeypad.phoneKeyPad("d");
        assertEquals("The Corresponding Number is 3",result);
    }
    @Test
    public void testPhoneKeyPad4(){
        String result = PhoneKeypad.phoneKeyPad("g");
        assertEquals("The Corresponding Number is 4",result);
    }
    @Test
    public void testPhoneKeyPad5(){
        String result = PhoneKeypad.phoneKeyPad("k");
        assertEquals("The Corresponding Number is 5",result);
    }
    @Test
    public void testPhoneKeypad6(){
        String result = PhoneKeypad.phoneKeyPad("m");
        assertEquals("The Corresponding Number is 6",result);
    }
    @Test
    public  void testPhoneKeyPad7(){
        String result = PhoneKeypad.phoneKeyPad("p");
        assertEquals("The Corresponding Number is 7",result);
    }
    @Test
    public void testPhoneKeyPad8(){
        String result = PhoneKeypad.phoneKeyPad("v");
        assertEquals("The Corresponding Number is 8",result);
    }
    @Test
    public void testPhoneKeyPad9(){
        String result = PhoneKeypad.phoneKeyPad("z");
        assertEquals("The Corresponding Number is 9",result);
    }
    @Test
    public void testPhoneKeyPadCapitalLetter2(){
        String result = PhoneKeypad.phoneKeyPad("B");
        assertEquals("The Corresponding Number is 2",result);
    }
    @Test
    public void testPhoneKeyPadCapitalLetterFor9(){
        String result = PhoneKeypad.phoneKeyPad("0");
        assertEquals("0 is an invalid input",result);
    }

}