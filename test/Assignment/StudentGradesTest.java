package Assignment;

import StudentScoreArray.StudentGrades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradesTest {
    @Test
    public void testTotal(){
        int[][] array = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int  result = 137;
        assertEquals(result, StudentGrades.getTotal(array,0));
    }
    @Test
    public void testT0talOfSubjectEach(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        int  total = 200;
        assertEquals(total,StudentGrades.getTotal(array,1));
    }
    @Test
    public void testAverage(){
        int [][] number = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        double  result = 72.00;
        assertEquals(result,StudentGrades.average(number,1));
    }
    @Test
    public void testAverageOfSubjectEach(){
        int [] [] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        double average = 84.00;
        assertEquals(average,StudentGrades.average(array,0));
    }
    @Test
    public void testMaxInEachSubject(){
        int [][] array = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int  result = 98;
        assertEquals(result,StudentGrades.getMaximum(array));
    }
    @Test
    public void testMinInEachSubject(){
        int [][] array = {{66,98,93,78},{21,62,34,83},{49,56,27,66}};
        int  result = 21;
        assertEquals(result,StudentGrades.getMinimum(array));
    }
    @Test
    public void testSortPosition(){
        int [] [] number = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int  [] result = {67,98,93,78};
        assertArrayEquals(result,StudentGrades.getArrangedScoresAccordingTOSubjects(number,0));
    }
    @Test
    public void testStudentPlace(){
        int [][] array = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int  expect = 1;
        assertEquals(expect,StudentGrades.getStudentIndex(array,StudentGrades.getMaximum(array,1)));
    }
    @Test
    public void testNumberOfPeopleWhoPassInEachSubject(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};;
        int  result = 4;
        assertEquals(result,StudentGrades.getNumberOfPasses(array,0));
    }
    @Test
    public void testNumberOfPeopleWhoFailsInEachSubject(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};;
        int  result = 2;
        assertEquals(result,StudentGrades.getNumberOfFails(array,1));
    }


}