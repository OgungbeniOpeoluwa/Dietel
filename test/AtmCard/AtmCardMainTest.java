package AtmCard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmCardMainTest {
    @Test
    public void testDigit(){
        assertEquals("5436757", AtmCardMain.setCardDigit("5436757"));
    }
    @Test
    public  void testDigitAllowedBetween13And15(){
        assertEquals("54367576789789990", AtmCardMain.setCardDigit("54367576789789990"));
    }
    @Test
    public void testCardWhichCard(){
//       String number = AtmCardMain.CheckCardFirstDigitAndName("Visa",4);

    }

}