package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    @Test
    public void testThatCanOnAirConditioner(){
        //given that i have an airConditioner
        Airconditioner ac = new Airconditioner();
        //when it is off i turn it on
        assertFalse(ac.isOn());
        //check
        ac.toggleOn();
        assertTrue(ac.isOn());
    }
    @Test
    public void testThatAirConditionerCanOff(){
        //given that i have an airConditioner
        Airconditioner ac = new Airconditioner();
        // when it is on i can turn it off
        ac.toggleOn();
        // check
         assertTrue(ac.isOn());
         ac.toggleOn();
         assertFalse(ac.isOn());
    }
    @Test
    public void testAirConditionerIncreaseTemperature(){
        //given that i have an ac,it is on and temperature is low
        Airconditioner ac = new Airconditioner();
        ac.toggleOn();
        assertTrue(ac.isOn());
        assertEquals(16, ac.temperature());
        //when
       ac.increaseTemperature();
       assertEquals(17,ac.temperature());
        ac.increaseTemperature();
        assertEquals(18,ac.temperature());
        ac.increaseTemperature();
        assertEquals(19,ac.temperature());
    }
    @Test
    public void testAirConditionerDecreaseTemperature(){
        //given that i have a ac,my ac is on,my ac temperature is too high
        Airconditioner ac = new Airconditioner();
        ac.toggleOn();
        assertTrue(ac.isOn());
        assertEquals(16, ac.temperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(19,ac.temperature());
        ac.decreaseTemperature();
        ac.decreaseTemperature();
        assertEquals(17,ac.temperature());

    }
    @Test
    public void testThatAiConditionerStillRemainIn30(){
        Airconditioner airconditioner = new Airconditioner();
        airconditioner.toggleOn();
        assertTrue(airconditioner.isOn());
        assertEquals(16,airconditioner.temperature());
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        airconditioner.increaseTemperature();
        assertEquals(30,airconditioner.temperature());
        airconditioner.increaseTemperature();
       assertEquals(30,airconditioner.temperature());

        }
        @Test
         public void testThatAirConditionerCantGoBelow30(){
        Airconditioner airConditioner = new Airconditioner();
        airConditioner.toggleOn();
        assertTrue(airConditioner.isOn());
        assertEquals(16,airConditioner.temperature());
         airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.temperature());
        airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.temperature());

        }
    }



