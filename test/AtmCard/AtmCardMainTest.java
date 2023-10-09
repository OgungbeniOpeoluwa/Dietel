package AtmCard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmCardMainTest {
    @Test
    public void testDigit(){
        assertEquals("0", AtmCardMain.setCardDigit("5436757"));
    }
    @Test
    public void testThatNumberIsValid(){
        String number = AtmCardMain.setCardDigit("4388576018410707");
        assertEquals("4388576018410707",number);
    }


    @Test
    public  void testDigitAllowedBetween13And15(){
        assertEquals(0, AtmCardMain.getDigitLength("54367576789789990"));
    }
    @Test
    public void testCardWhichCard(){
       String number = AtmCardMain.checkCardFirstDigitAndName("10558967");
       assertEquals("Invalid Card",number);
    }
    @Test
    public  void testFirstNumberIsValid(){
        String number = AtmCardMain.checkCardFirstDigitAndName("456653");
        assertEquals("VisaCard",number);
    }
    @Test
    public void testIfNumbersAreInvalid(){
        String number = AtmCardMain.validNumber("4388576018402626");
        assertEquals("Invalid",number);
    }
    @Test
    public  void  testIfNumberIsValid(){
        String number = AtmCardMain.validNumber("4388576018410707");
        assertEquals("Valid",number);
    }

}