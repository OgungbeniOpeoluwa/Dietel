package Assignment;

import chapter5.StudentGrade;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();
        System.out.println("How Many Student do you have:");
        int students = scanner.nextInt();
        studentGrades.setNumberOfStudent(students);
        System.out.println("How many Subject do they offer : ");
        int subjects = scanner.nextInt();
        studentGrades.setNumberOfSubject(subjects);
        int[][] studentScores = new int[studentGrades.getNumberOfStudent()][studentGrades.getNumberOfSubject()];
        for (int numb = 0; numb < studentScores.length; numb++) {
            for (int result = 0; result < studentScores[numb].length; result++) {
                System.out.println("Entering score for student  " + (numb + 1));
                System.out.println("Enter score for " + (numb + 1));
                int score = scanner.nextInt();
                while (score < 1 || score > 100) {
                    System.out.println("Entering score for student  " + (numb + 1));
                    System.out.println("Enter score for subject " + (numb + 1));
                    score = scanner.nextInt();
                }
                studentScores[numb][result] = score;
            }
        }
            StudentGrades.display("=======================================");
            int [] array= StudentGrades.total(studentScores);
            double [] average = StudentGrades.average(array,studentGrades.getNumberOfSubject());
            int [] sort = StudentGrades.sort(array);
            System.out.print(" STUDENT " + "");
            for(int subject = 0;subject < studentGrades.getNumberOfSubject();subject++){
                System.out.print("Sub " + (subject+1) + " ");
            }
        System.out.println();
        StudentGrades.display("=======================================");

            for(int count = 0;count<studentScores.length;count++){
                System.out.print("Student " +(count + 1) + " ");
                for(int counter = 0; counter < studentScores[count].length;counter++){
                    System.out.print(studentScores[count][counter] + "   ");
                }
                System.out.println(array[count] + "  " + average[count] + " " + sort[count]);
            }
        StudentGrades.display("=======================================");
        System.out.println();
        StudentGrades.display("=======================================");


       StudentGrades.display(" ");
        int [][] subjectsScoresInOneArray = StudentGrades.displaySubject(studentScores,studentGrades.getNumberOfSubject());
            int [] highestScore =StudentGrades.displayMax(subjectsScoresInOneArray,studentGrades.getNumberOfSubject());
            int [] lowestScore = StudentGrades.displayMin(subjectsScoresInOneArray,studentGrades.getNumberOfSubject());
            int [] totalSubject = StudentGrades.total(subjectsScoresInOneArray);
            double [] averageScores = StudentGrades.average(totalSubject,studentGrades.getNumberOfStudent());
            int [] numberOfPasses = StudentGrades.numberOfPasses(subjectsScoresInOneArray,studentGrades.getNumberOfSubject());
            int [] numberOfFails = StudentGrades.numberOfFails(subjectsScoresInOneArray,studentGrades.getNumberOfSubject());
        System.out.println("SUBJECT SUMMARY");
        for(int subject = 0;subject < studentGrades.getNumberOfSubject();subject++) {
            System.out.println("SUBJECT " + (subject + 1) + " ");
            System.out.println("Highest scoring student is : " + " "  +
                    "scoring" + " "+highestScore[subject]);
            System.out.println("lowest scoring student is : " + " " + "scoring" + " "+lowestScore[subject]);
            System.out.println("Total score is : " + " " + totalSubject[subject]);
            System.out.println("Average score is  : " + " " + averageScores[subject]);
            System.out.println("Number of passes : " + " " + numberOfPasses[subject]);
            System.out.println("Number of fail : " + " " + numberOfFails[subject]);
            System.out.println();
        }
        int max= numberOfPasses[0];
        int index = 0;
        for(int number = 1;number < numberOfPasses.length;number++) {
            if (numberOfPasses[number] > max) {
                max = numberOfPasses[number];
                index = number;
            }
        }

        System.out.println("The easiest subject is subject " + (index + 1) +" " +" with "+ numberOfPasses[index]);
    int minimum= numberOfFails[0];
     index = 0;
        for(int number = 1;number < numberOfPasses.length;number++) {
        if (numberOfPasses[number] < max) {
            max = numberOfPasses[number];
            index = number;
        }
    }
        System.out.println("The hardest subject is subject " + (index + 1) +" " + " with "+ numberOfFails[index]);
        StudentGrades.checkMinimum(subjectsScoresInOneArray);
        StudentGrades.checkMaximum(subjectsScoresInOneArray);
        StudentGrades.display("=======================================");
        StudentGrades.display("");
        System.out.println("CLASS SUMMARY");
        System.out.println("==============================================");
        int maximum = StudentGrades.maximum(array);
        int indicies =StudentGrades.indexOfHighestScore(array);
        System.out.println("The best Graduating student is : student " + (indicies + 1) + " scoring  " + maximum);
        StudentGrades.display(" ");
        StudentGrades.display("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        int minimums = StudentGrades.minimum(array);
        int indexes = StudentGrades.indexOfLowestScore(array);
        System.out.println("The worst Graduating student is  " + (indexes + 1) + " scoring " + minimums);
        StudentGrades.display("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        StudentGrades.display(" ");
        int sum = 0;
        for (int numb : array) {
            sum += numb;
        }
        System.out.println("The class Total score is " + sum);
        double classTotal = (double)sum/studentGrades.getNumberOfStudent();
        System.out.println("Class Average is : " + classTotal);
        StudentGrades.display("=======================================");

    }
    }



