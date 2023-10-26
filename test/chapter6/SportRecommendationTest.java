package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportRecommendationTest {
    @Test
    public void testIfWeatherIsGoodForSport(){
        int numb = 25;
        assertTrue(SportRecommendation.isWeather(numb));
    }
    @Test
    public void testIfWeatherIsBadForSport(){
        int numb = 35;
        assertFalse(SportRecommendation.isWeather(numb));
    }

}