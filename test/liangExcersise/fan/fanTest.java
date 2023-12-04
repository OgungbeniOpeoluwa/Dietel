package liangExcersise.fan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static liangExcersise.fan.Speed.FAST;
import static liangExcersise.fan.Speed.MEDIUM;
import static org.junit.jupiter.api.Assertions.*;

class fanTest {
    private Fan fan;
    @BeforeEach
    public void setup(){
        fan = new Fan();
    }

    @Test
    public void testThatFanIsOff(){
        assertFalse(fan.getOn());
    }
    @Test
    public void testThatFanIsOff_WhenISetItOnFanIsOn(){
        assertFalse(fan.getOn());
        fan.isOn();
        assertTrue(fan.getOn());
    }

    @Test
    public void testThatFanDefaultSpeedIsSlow_ValueIsOne_ifIAssignFast_valueIs3(){
        assertEquals(1,fan.getSpeed());
        fan.setSpeed(FAST);
        assertEquals(3,fan.getSpeed());
    }
    @Test
    public void testThatIfTheFanIsOn_itShouldReturnTheSpeed_colourAndRadius(){
        fan.isOn();
        fan.setSpeed(FAST);
        fan.setRadius(10);
        fan.setColour("yellow");
        String expected = "Speed: " + 3 + "  Radius: " + 10.0 + "  Colour:yellow" ;
        assertEquals(expected,fan.toString());
    }
    @Test
    public void testThtWhenFanIsOff_itReturnsTheColour_RadiusAndTheFanIsOff(){
        fan.setSpeed(MEDIUM);
        fan.setRadius(5);
        fan.setColour("blue");
        String expected = "Radius: " + 5.0 + "  Colour:blue" +"  Fan is off" ;
        assertEquals(expected,fan.toString());

    }

}