package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    @Test
    public  void testThatClockExist(){
        Clock clock = new Clock(5,20,35);
        assertNotNull(clock);
    }
    @Test
    public  void testHour(){
        Clock clock = new Clock(5,10,35);
        clock.setHour(10);
        assertEquals(10,clock.getHour());
    }
    @Test
    public  void testMinutes(){
        Clock clock = new Clock(5,10,35);
        clock.setMinutes(10);
        assertEquals(10,clock.getMinutes());
    }
    @Test
    public  void testSecond(){
        Clock clock = new Clock(5,10,35);
        clock.setSecond(10);
        assertEquals(10,clock.getSecond());
    }
    @Test
    public void testHourIsMoreThan23(){
        Clock clock = new Clock(10,5,35);
        clock.setHour(25);
        assertEquals(0,clock.getHour());
    }
    @Test
    public void testMinutesIsMoreThan59(){
        Clock clock = new Clock(10,5,35);
        clock.setMinutes(60);
        assertEquals(0,clock.getMinutes());
    }

    @Test
    public void testSecondIsMoreThan59(){
        Clock clock = new Clock(10,5,35);
        clock.setSecond(60);
        assertEquals(0,clock.getSecond());
    }
    @Test
    public void testDisplayTime(){
        Clock clock = new Clock(10,5,35);
        clock.setHour(15);
        clock.setMinutes(30);
        clock.setSecond(45);
        assertEquals("15:30:45",clock.displayClock());
    }








}