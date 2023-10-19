package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    private int numberOfStudent;
    private int numberOfSubject;

    public static double[] average(int[] number, int numberOfSubject) {
        double [] result = new double[number.length];
        for(int numb = 0; numb < number.length;numb++){
            double total  =number[numb]/(double)numberOfSubject;
            String numbs = String.format("%.2f",total);
            Double count = Double.parseDouble(numbs);
            result[numb] = count;
        }
        return result;
    }

    public  void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    public int getNumberOfStudent(){
        return numberOfStudent;
    }

    public void setNumberOfSubject(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }
    public int getNumberOfSubject(){
        return numberOfSubject;
    }

    public static int [][] studentScores(int[][]studentGrades) {
        return studentGrades;
    }
    public static int [] total(int [][] studentsGrades){
        int [] result = new int[studentsGrades.length];
        int results = 0;
        for(int number = 0; number < studentsGrades.length;number++){
            for(int count = 0;count < studentsGrades[number].length;count++) {
                result[number] += studentsGrades[number][count];
            }
        }
        return result;
    }
    public static int[] sort(int[] total) {
        int[] result = new int[total.length];
        for (int numb = 0; numb < total.length; numb++) {
            result[numb] = total[numb];
        }
        int[] position = new int[total.length];
        for (int n = 0; n < total.length; n++) {
            for (int m = 0; m < total.length; m++) {
                if (total[n] > total[m]) {
                    int temp = total[n];
                    total[n] = total[m];
                    total[m] = temp;
                }
            }
        }
        for (int t = 0; t < total.length; t++) {
            for (int n = 0; n < total.length; n++) {
                if (total[t] == result[n]) {
                    position[n] = t + 1;
                }
            }
        }

        return position;
    }
    public static int [] displayMax(int [][] score,int numberOfSubject) {
        int[] maxim = new int[numberOfSubject];
        for (int numb = 0; numb < score.length; numb++) {
            for (int sum = 0; sum < score[numb].length; sum++) {
                if (score[numb][sum] > maxim[numb]) {
                    maxim[numb] = score[numb][sum];
                }
            }
        }
        return maxim;
    }
    public static int [][] displaySubject(int[][] score, int numberOfSubject){
        int [][] array = new int[numberOfSubject][score.length];
        for(int count = 0;count < numberOfSubject;count++) {
            for (int numb = 0; numb < score.length; numb++) {
                array[count][numb] = score[numb][count];

            }
        }
        return array;

    }
    public static int [] displayMin(int [][] score,int numberOfSubject) {
        int[] min = new int[numberOfSubject];
        int max = 0;
        for (int numb = 0; numb < score.length; numb++) {
                max = minimum(score[numb]);
                min[numb] = max;

        }
        return min;
    }
    public static int minimum(int[] subjectScores) {
        int min = subjectScores[0];
        for (int count = 0; count < subjectScores.length; count++) {
            if (subjectScores[count] < min) {
                min = subjectScores[count];

            }
        }
        return min;
    }

    public  static int [] numberOfPasses(int[][]scores,int numberOfSubject) {
        int[] score = new int[numberOfSubject];
        for (int numb = 0; numb < scores.length; numb++) {
            for (int sum = 0; sum < scores[numb].length; sum++) {
                if (scores[numb][sum] > 50) {
                    score[numb] += 1;
                }

            }
        }
        return score;
    }
        public  static int [] numberOfFails(int[][]scores,int numberOfSubject){
            int [] score = new int[numberOfSubject];
            for(int numb = 0;numb< scores.length;numb++) {
                for (int sum = 0; sum < scores[numb].length; sum++) {
                    if (scores[numb][sum] < 50) {
                        score[numb] += 1;
                    }

                }
            }

            return score;
    }
    public static void checkMinimum(int[][] subject) {
        int min = subject[0][0];
        int index = 0;
        int subjects = 0;
        for (int count = 0; count < subject.length; count++) {
            for (int counts = 0; counts < subject[count].length; counts++) {
                if (subject[count][counts] < min) {
                    min = subject[count][counts];
                    subjects = counts;
                    index = count;
                }
            }
        }
        System.out.println("The overall minimum Score is scored by  Student  " + (index + 1) + "  in " + "subject " + subjects + " scoring " + min);
    }
    public static void checkMaximum(int[][] subject) {
        int max = subject[0][0];
        int index = 0;
        int subjects = 0;
        for (int count = 0; count < subject.length; count++) {
            for (int counts = 0; counts < subject[count].length; counts++) {
                if (subject[count][counts] > max) {
                    max = subject[count][counts];
                    subjects = counts;
                    index = count;
                }
            }
        }
        System.out.println("The overall Highest Score is scored by  Student  " + (index + 1) + "  in " + "subject"+ subjects+ " scoring " + max);

    }
    public static int maximum(int[] subjectScores) {
        int max = subjectScores[0];
        for (int count = 1; count < subjectScores.length; count++) {
            if (subjectScores[count] > max) {
                max = subjectScores[count];
            }
        }
        return max;
    }
    public static int indexOfHighestScore(int [] scoresTotal){
        int total = maximum(scoresTotal);
        int index = 0;
        for (int count = 0; count < scoresTotal.length; count++) {
            if (scoresTotal[count] == total) {
                index = count;
            }
        }
        return index;
    }
    public static int indexOfLowestScore(int [] scoresTotal){
        int total = minimum(scoresTotal);
        int index = 0;
        for (int count = 0; count < scoresTotal.length; count++) {
            if (scoresTotal[count] == total) {
                index = count;
            }
        }
        return index;
    }
    public static void display(String input) {
        System.out.println(input);
    }
    public static void displayNow() {
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully""");
    }





}






