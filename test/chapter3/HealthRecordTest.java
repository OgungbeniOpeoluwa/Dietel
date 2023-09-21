package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthRecordTest {
    @Test
    public void testThatHealthRecordExit() {
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        assertNotNull(healthRecord);
    }
    @Test
    public void testName(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50,65);
       healthRecord.setName("Tolu");
        assertEquals("Tolu",healthRecord.getFirstname());

    }
    @Test
    public  void testLastName(){
            HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50,65);
            healthRecord.setSurname("joseph");
            assertEquals("joseph",healthRecord.getSurname());

        }
    @Test
    public void testYearOfBirth(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50,65);
        healthRecord.setYearOfBirth(1998);
        assertEquals(1998,healthRecord.getYearOfBirth());

    }
    @Test
    public void testHeight(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50,65);
        healthRecord.setHeight(50);
        assertEquals(50,healthRecord.getHeight());

    }
    @Test
    public void testWeight() {
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        healthRecord.setWeight(60);
        assertEquals(60, healthRecord.getWeight());
    }
    @Test
    public void testAge(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        healthRecord.setYearOfBirth(1999);
        int result = healthRecord.ageCaculator(2023);
        assertEquals(24,result);
    }

    @Test
    public void testMaximumHeartRate(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        healthRecord.setYearOfBirth(1999);
         healthRecord.ageCaculator(2023);
         double result = healthRecord.maximumHeartRate();
        assertEquals(196.0,result);
    }
    @Test
    public  void testTargetHeartRate(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        healthRecord.setYearOfBirth(1999);
        healthRecord.ageCaculator(2023);
        healthRecord.maximumHeartRate();
        double result = healthRecord.targetHeart(65);
        assertEquals(127.4,result);

    }
    @Test
    public void  testBodyMassIndex(){
        HealthRecord healthRecord = new HealthRecord("joy", "joseph", "female", 23, "july", 1999, 50, 65);
        healthRecord.setWeight(50);
        healthRecord.setHeight(55);
        double result = healthRecord.bodyMassIndex();
        assertEquals(11.0,result);
    }
    }

