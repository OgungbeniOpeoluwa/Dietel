package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    @Test
    public void testThatBikeisOn() {
        AutomaticBike bike = new AutomaticBike();
        assertFalse(bike.isOn());
        bike.setOn();
        assertTrue(bike.isOn());

    }

    @Test
    public void testThatBikeIsOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        bike.setOn();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeIsInGear1() {
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(4, bike.checkSpeed());

    }

    @Test
    public void testThatBikeIsOnGear2() {
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for (int gear1 = 1; gear1 <= 20; gear1++) {
            bike.accelerate();
        }
        assertEquals(20, bike.checkSpeed());
        for (int gear2 = 1; gear2 <= 4; gear2++) {
            bike.accelerate();
        }
        assertEquals(28, bike.checkSpeed());

    }

    @Test
    public void testThatBikeIsOnGear3() {
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for (int gear1 = 1; gear1 <= 20; gear1++) {
            bike.accelerate();
        }
            assertEquals(20, bike.checkSpeed());
            for(int gear2 = 1; gear2 <= 5;gear2++){
                bike.accelerate();
        }
            assertEquals(30,bike.checkSpeed());
            for(int gear3 = 1 ;gear3 <= 3;gear3++){
                bike.accelerate();
            }
            assertEquals(38,bike.checkSpeed());

    }
    @Test
    public void testThatBikeIsOnGear4(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for(int gear1 = 1;gear1<=20;gear1++){
            bike.accelerate();
        }
        assertEquals(20,bike.checkSpeed());
        for(int gear2 = 1; gear2 <=5; gear2++){
            bike.accelerate();
        }
        assertEquals(30,bike.checkSpeed());
        for(int gear3 = 1; gear3 <= 4; gear3++){
            bike.accelerate();
        }
        assertEquals(41,bike.checkSpeed());
        for(int gear4 = 1; gear4 <= 3;gear4++){
            bike.accelerate();
        }
        assertEquals(53,bike.checkSpeed());
    }
    @Test
    public void testThatSpeedDecelerateBy1(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for(int gear1 = 1; gear1 <= 15; gear1++){
            bike.accelerate();
        }
        assertEquals(15,bike.checkSpeed());
        for(int gear1 = 1;gear1 <= 5;gear1++){
            bike.decelerate();
        }
        assertEquals(10,bike.checkSpeed());
    }
    @Test
    public void testThatBikeDecelerateBy2(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for(int gear1 = 1; gear1 <= 20; gear1++){
            bike.accelerate();
        }
        assertEquals(20,bike.checkSpeed());
        for(int gear2 = 1;gear2 <= 5;gear2++){
            bike.accelerate();
        }
        assertEquals(30,bike.checkSpeed());
        for(int gear2 = 1; gear2 <= 3;gear2++){
            bike.decelerate();
        }
        assertEquals(24,bike.checkSpeed());
    }
    @Test
    public void testThatBikeDecelerateBy3(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for(int gear1 = 1; gear1 <= 20;gear1++){
            bike.accelerate();
        }
        assertEquals(20,bike.checkSpeed());
        for(int gear2 = 1;gear2 <= 5;gear2++){
            bike.accelerate();
        }
        assertEquals(30,bike.checkSpeed());
        for(int gear2 = 1; gear2 <= 3;gear2++){
            bike.accelerate();
        }
        assertEquals(38,bike.checkSpeed());
        for(int gear3 = 1;gear3<=2;gear3++){
            bike.decelerate();
        }
        assertEquals(32,bike.checkSpeed());
    }

    @Test
    public void testThatBikeDecelerateBy4(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        assertTrue(bike.isOn());
        for(int gear1 = 1; gear1 <= 20;gear1++){
            bike.accelerate();
        }
        assertEquals(20,bike.checkSpeed());
        for(int gear2 = 1;gear2 <= 5;gear2++){
            bike.accelerate();
        }
        assertEquals(30,bike.checkSpeed());
        for(int gear2 = 1; gear2 <= 4;gear2++){
            bike.accelerate();
        }
        assertEquals(41,bike.checkSpeed());
        for(int gear4 = 1;gear4 <= 3;gear4++){
            bike.accelerate();
        }
        assertEquals(53,bike.checkSpeed());
        for(int gear4 = 1;gear4 <= 2; gear4++){
            bike.decelerate();
        }
        assertEquals(45,bike.checkSpeed());
    }

    @Test
    public void testThatItCantDecelerateWithoutIncrease(){
        AutomaticBike bike = new AutomaticBike();
        bike.setOn();
        bike.decelerate();
        assertEquals(0,bike.checkSpeed());
    }
    }





