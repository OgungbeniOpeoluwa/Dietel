package StudentScoreArray;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        displayStudentGrades();
    }












    private static int [] total(int [][] studentsGrades){
        int [] result = new int[studentsGrades.length];
        for(int number = 0; number < studentsGrades.length;number++){
            for(int count = 0;count < studentsGrades[number].length;count++) {
                result[number] += studentsGrades[number][count];
            }
        }
        return result;
    }
    public static int getTotal(int [][] studentsGrades,int studentId){
        int [] result = total(studentsGrades);
           return result[studentId];
    }
    public static int getTotal(int [][] studentsGrades){
        int [] totals = total(studentsGrades);
        int result = 0;
        for(int count = 0; count < totals.length;count++){
            result+= totals[count];
        }
        return result;
    }
    public static double average(int [][]studentGrades,int studentId){
        return getTotal(studentGrades,studentId)/(double) studentGrades[studentId].length;
    }
    public static double average(int [][]studentGrades){
        return getTotal(studentGrades)/(double) studentGrades.length;
    }

    private static int[] maximum(int[][] studentGrades){
        int[] maxim = new int[studentGrades.length];
        for (int numb = 0; numb < studentGrades.length; numb++) {
            for (int sum = 0; sum < studentGrades[numb].length; sum++) {
                if (studentGrades[numb][sum] > maxim[numb]) {
                    maxim[numb] = studentGrades[numb][sum];
                }
            }
        }
        return maxim;
    }
    public static int getMaximum(int[][]studentGrades,int studentId){
        int []  maximums = maximum(studentGrades);
        return maximums[studentId];
    }

    public static int getMaximum(int[][]studentGrades){
        int []  maximums = maximum(studentGrades);
        int max = maximums[0];
        for(int count = 0;count < maximums.length;count++){
            if(maximums[count] > max){
                max = maximums[count];
            }
        }
        return max;
    }
    public static int getMaximum(int[]studentGrades){
        int max = studentGrades[0];
        for(int count = 0;count < studentGrades.length;count++){
            if(studentGrades[count] > max){
                max = studentGrades[count];
            }
        }
        return max;
    }

    private static int[] minimum (int[][] studentGrades){
        int[] minimum = new int[studentGrades.length];

        for (int numb = 0; numb < studentGrades.length; numb++) {
            int min = studentGrades[numb][0];
            for (int sum = 0; sum < studentGrades[numb].length; sum++) {
                if (studentGrades[numb][sum] < min) {
                    min = studentGrades[numb][sum];
                }
            }
            minimum[numb] = min;
        }
        return minimum;
    }
    public static int getMinimum(int[][]studentGrades,int studentId){
        int []  minimums = minimum(studentGrades);
        return minimums[studentId];
    }

    public static int getMinimum(int[][]studentGrades){
        int []  minimums = minimum(studentGrades);
        int min = minimums[0];
        for(int count = 0;count < minimums.length;count++){
            if(minimums[count] < min){
                min = minimums[count];
            }
        }
        return min;
    }
    public static int getMinimum(int[]studentGrades){
        int min = studentGrades[0];
        for(int count = 0;count < studentGrades.length;count++){
            if(studentGrades[count] < min){
                min = studentGrades[count];
            }
        }
        return min;
    }
    private static int[] sort(int [][] studentsGrade){
        int []  total = total(studentsGrade);
        for (int n = 0; n < studentsGrade.length; n++) {
            for (int m = 0; m < studentsGrade.length; m++) {
                if (total[n] > total[m]) {
                    int temp = total[n];
                    total[n] = total[m];
                    total[m] = temp;
                }
            }
        }
        return total;
    }
    private static int [] arrangedPositions(int[][] studentGrades){
        int [] sorts = sort(studentGrades);
        int [] totals = total(studentGrades);
        int [] result = new int[totals.length];
        int counts = 0;
        for(int count = 0;count < sorts.length;count++){
            for(int counter = 0;counter < totals.length;counter++){
                if(sorts[count] == totals[counter]){
                    counts+=1;
                    result[counter] +=counts;
                }
            }
        }
        return result;
    }
    public static int getPosition(int [][] studentGrades,int studentId){
        int [] result = arrangedPositions(studentGrades);
        return result[studentId];
    }

    private  static int StudentIndex(int [][]studentGrades,int number){
        int total = 0;
        for(int count = 0; count < studentGrades.length;count++){
            for(int counts = 0; counts < studentGrades[count].length;counts++){
                if(studentGrades[count][counts] == number){
                    total = counts+1;
                }
            }
        }
        return total;
    }
    public static  int getStudentIndex(int[][] studentsGrade,int number){
        return StudentIndex(studentsGrade,number);
    }
    private static int [][] sortBySubject(int [][]studentGrades){
        int subjectsCount = studentGrades[0].length;
        int [][] result = new int [subjectsCount][studentGrades.length];
        for(int count = 0; count < subjectsCount;count++){
            for(int numb = 0; numb < studentGrades.length;numb++){
                result[count][numb] = studentGrades[numb][count];
            }
        }
        return result;
    }
    public  static int [] getArrangedScoresAccordingTOSubjects(int [][] studentGrades,int subjectIndex){
        int [][] result = sortBySubject(studentGrades);
        return result[subjectIndex];
    }
    private   static int []  numberOfPasses(int[][]scores) {
        int [] result = new int[scores.length];
        for(int numb = 0; numb < scores.length;numb++) {
            for (int sum = 0; sum < scores[numb].length; sum++) {
                if (scores[numb][sum] > 50) {
                    result[numb] += 1;
                }

            }
        }
        return result;
    }
    public static int getNumberOfPasses(int[][]scores,int subjectOfIndex){
        int [] result = numberOfPasses(scores);
        return result[subjectOfIndex];
    }
    public static int getNumberOfPasses(int[]scores){
       int result = getMaximum(scores);
       int index = 0;
       for(int count = 0;count < scores.length;count++){
           if(scores[count] == result){
               index = count+1;
               break;
           }
       }
       return index;
    }
    private  static int[] numberOfFails(int[][]scores){
        int [] result = new int[scores.length];
        for(int numb = 0; numb < scores.length;numb++) {
            for (int sum = 0; sum < scores[numb].length; sum++) {
                if (scores[numb][sum] < 50) {
                    result[numb] += 1;
                }
            }
        }
            return result;
    }
    public static int getNumberOfFails(int[][] scores,int subjectOfIndex){
        int [] results = numberOfFails(scores);
        return results[subjectOfIndex];
    }
    public static void display(String input) {
        for(int numb = 0;numb < 45 ;numb++){
            System.out.print(input );
        }
        System.out.println();
    }
    public static void displaySubjects(int [][] students) {
        System.out.print(" STUDENT " + " ");
        for(int numb = 0;numb < students[0].length;numb++){
            System.out.print(" SUB " + (numb + 1) + " " );
        }
        System.out.print(" TOT "  + " AVE " + " POS ");
        System.out.println();
    }




    public static void displayStudentGrades(){
        int [][] result = setUp();
        scoreTotal(result);
        subjectSummary(result);
        overallResultOnSubject(result);
        classSummary(result);

    }
    public static int [] [] setUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Student do you have:");
        int numberOfStudents = scanner.nextInt();
        System.out.println("How many Subject do they offer : ");
        int numberOfSubjects = scanner.nextInt();
        return collectingInputs(numberOfStudents,numberOfSubjects);
    }

    public static int [][] collectingInputs(int numberOfStudent,int numberOfSubject){
        Scanner scanner = new Scanner(System.in);
        int [][] studentGrades = new int [numberOfStudent][numberOfSubject];
        for(int count = 0; count < numberOfStudent;count++){
            for(int counts = 0;counts < numberOfSubject;counts ++){
                System.out.println("Entering score for student  " + (count + 1));
                System.out.println("Enter score for subject " + (counts +1) );
                int score = scanner.nextInt();
                studentGrades[count][counts] = score;
                while (score < 1 || score > 100) {
                    System.out.println("Entering score for student  " + (count + 1));
                    System.out.println("Enter score for subject " + (counts +1));
                    score = scanner.nextInt();
                }
            }
        }
        return studentGrades;
    }
    public static void scoreTotal(int [][] studentGrades){
        displaySubjects(studentGrades);
        display("=");
        for(int count = 0;count < studentGrades.length;count++){
            System.out.printf("%5s","Students " + (count + 1) );
            for(int counts = 0;counts< studentGrades[count].length;counts++){
                System.out.printf("%5s" ,studentGrades[count][counts] );
            }
            System.out.printf("%5s%6.2f%4s%n",getTotal(studentGrades,count),average(studentGrades,count), getPosition(studentGrades,count));
            System.out.println();
        }
        display("=");
        display("=");

    }


    public static void subjectSummary(int [][] studentGrades){
        int [][] result =sortBySubject(studentGrades);
        System.out.println("SUBJECT SUMMARY");
        for(int numb = 0; numb < result.length;numb ++){
            System.out.println("SUBJECT " + (numb + 1));
            int maximum = getMaximum(result,numb);
            int minimum = getMinimum(result,numb);
            System.out.println("Highest scoring student is student  " + getStudentIndex(result,maximum) +" " + maximum);
            System.out.println("lowest scoring student is student  " +  getStudentIndex(result,minimum) + " " + minimum );
            System.out.println("Total Score : " + getTotal(result,numb));
            System.out.printf("%s%.2f%n","Average Score : " , average(result,numb));
            System.out.println("number of passes : " + getNumberOfPasses(result,numb));
            System.out.println("number of fail : " + getNumberOfFails(result,numb));
            System.out.println();
        }
         System.out.println();
    }



    public static void overallResultOnSubject(int [] [] studentGrades) {
        int[][] sort = sortBySubject(studentGrades);
        int max = getMaximum(numberOfPasses(sort));
        int min = getMaximum(numberOfFails(sort));
        System.out.println("The hardest subject is subject " + getNumberOfPasses(numberOfFails(sort)) + " with " + min + " failure");
        System.out.println("The easiest subject is subject " + getNumberOfPasses(numberOfPasses(sort)) + " with " + max + " passes");
        System.out.println("The overall Highest Score is scored by  Student  " + getStudentIndex(sort,getMaximum(sort))+ " in " + "subject  "
                + getStudentIndex(sort,getMaximum(sort)) + " scoring " + getMaximum(studentGrades));
        System.out.println("The overall minimum Score is scored by  Student  " + getStudentIndex(sort,getMinimum(sort)) + " in " + "subject "
                + getStudentIndex(sort,getMinimum(sort)) + " scoring " + getMinimum(studentGrades));
        display("=");
    }




    public static void classSummary (int[][] studentGrades){
        System.out.println("CLASS SUMMARY");
        display("=");
        System.out.println("The best Graduating student is : student " + getStudentIndex(studentGrades,getMaximum(studentGrades)) + " scoring  " +
                getMaximum(total(studentGrades)));
        display("=");
        System.out.println();
        display("!");
        System.out.println("The worst Graduating student is  " + getStudentIndex(studentGrades,getMaximum(studentGrades)) + " scoring " +
                getMinimum(total(studentGrades)));
        display("!");
        System.out.println();
        display("=");
        System.out.println("Class total score is : " + getTotal(studentGrades));
        System.out.println("Class average score : " + average(studentGrades));
        display("=");


    }

}






