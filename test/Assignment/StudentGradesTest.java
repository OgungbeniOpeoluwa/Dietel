package Assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradesTest {
    @Test
    public void testNumberOfStudents(){
        StudentGrades studentCalculator = new StudentGrades();
        studentCalculator.setNumberOfStudent(4);
        assertEquals(4,studentCalculator.getNumberOfStudent());

    }
    @Test
    public void testNumberOfSubjectsOffer(){
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.setNumberOfSubject(3);
        assertEquals(3,studentGrades.getNumberOfSubject());
    }
    @Test
    public void testInputsCollectedl() {
        StudentGrades studentGrades = new StudentGrades();
        int[][] array = {{50, 60, 70}, {30, 45, 65}, {98, 78, 75}, {99, 45, 61}};
        int[][] result = {{50, 60, 70}, {30, 45, 65}, {98, 78, 75}, {99, 45, 61}};
        assertArrayEquals(result, StudentGrades.studentScores(array));
    }
    @Test
    public void testTotal(){
        int[][] array = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [] result = {137,216,154,227};
        assertArrayEquals(result,StudentGrades.total(array));
    }
    @Test
    public void testAverage(){
        int [] number =  {137,216,154,227};
        StudentGrades student = new StudentGrades();
        student.setNumberOfStudent(4);
        double [] result = {45.67,72.00,51.33,75.67};
        assertArrayEquals(result,StudentGrades.average(number,student.getNumberOfStudent()));
    }
    @Test
    public void testSortPosition(){
        int [] number = {137,216,154,227};
        int [] position = {4,2,3,1};
        assertArrayEquals(position,StudentGrades.sort(number));
    }
    @Test
    public void testAllScoresInOneCollection(){
        int [][] array = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [][] expect ={{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        assertArrayEquals(expect,StudentGrades.displaySubject(array,3));
    }
    @Test
    public void testMaxInEachSubject(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        StudentGrades student = new StudentGrades();
        student.setNumberOfStudent(4);
        int [] result = {98,83,66};
        assertArrayEquals(result,StudentGrades.displayMax(array,student . getNumberOfStudent()));
    }
    @Test
    public void testMinInEachSubject(){
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.setNumberOfStudent(3);
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        int [] result = {67,21,27};
        assertArrayEquals(result,StudentGrades.displayMin(array,studentGrades.getNumberOfStudent()));
    }
    @Test
    public void testT0talOfSubjectEach(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        int [] total = {336,200,198};
        assertArrayEquals(total,StudentGrades.total(array));
    }
    @Test
    public void testAverageOfSubjectEach(){
        StudentGrades student = new StudentGrades();
        student.setNumberOfStudent(4);
        int [] array ={336,200,198};
        double [] average = {84.00,50.00,49.50};
        assertArrayEquals(average,StudentGrades.average(array,student.getNumberOfStudent()));
    }
    @Test
    public void testNumberOfPeopleWhoPassInEachSubject(){
        int [][] array = {{67,98,93,78},{21,62,34,83},{49,56,27,66}};
        StudentGrades student = new StudentGrades();
        student.setNumberOfStudent(4);
        int [] result = {4,2,2};
        assertArrayEquals(result,StudentGrades.numberOfPasses(array,student.getNumberOfStudent()));
    }


}