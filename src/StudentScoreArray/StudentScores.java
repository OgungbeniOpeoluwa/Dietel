package StudentScoreArray;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Student do you have:");
        int students = scanner.nextInt();
        System.out.println("How many Subject do they offer : ");
        int subjects = scanner.nextInt();
        int [][] studentsCummulation = new int [students][subjects];
        studentScores(studentsCummulation,subjects);



    }

    public static void studentScores(int [][]students,int subjects){
        Scanner scanner = new Scanner(System.in);
        int [] total = new int[students.length];
        String [] allSubjects =subjectName(subjects);
        double [] average = new double[students.length];
        double result = 0;
        for(int count = 0;count < students.length;count++){
            for(int subject = 0;subject < students[count].length;subject++ ){
                System.out.println("Entering score for student  " + (count +1) );
                System.out.println("Enter score for " + allSubjects[subject]);
                int score = scanner.nextInt();
                students[count][subject] = score;
                total[count] += score;
            }
           result = total[count] /(double)subjects;
            String numb = String.format("%.2f",result);
            double averageResult = Double.parseDouble(numb);
            average[count] = averageResult;
        }
        System.out.println(" ===========================================");
        System.out.print("  STUDENT  " +   " ");
        for(int n = 0; n < subjects; n++){
            System.out.print(allSubjects[n] + "    ");
        }
        System.out.println("TOTAL " + "  " + "AVERAGE  ");
        for(int counts = 0;counts < students.length;counts++){
            System.out.print("Student " + (counts +1) + "   ");
            for(int count = 0;count < students[0].length;count++){
                System.out.print( students[counts][count] + "\t\t");
            }
            System.out.println(total[counts] + "    " +average[counts]);
        }
        System.out.println("""
                           ======================================================
                           
                           ======================================================""");

    }
    public static int[] sort(int [] numbers){
        for(int numb = 0;numb < numbers.length;numb++){
            for(int count = 0;count < numbers.length;count++){
                if(numbers[numb] > numbers[count]){
                    int temp = numbers[numb];
                    numbers[numb] = numbers[count];
                    numbers[count] = temp;
                }
            }

        }
        return numbers;
    }
    public static String [] subjectName(int number){
        Scanner scanner = new Scanner(System.in);
        String [] subjectNames = new String[number];
        for(int count = 0;count < subjectNames.length;count++) {
            System.out.println("Enter name of subject for subject " + (count +1));
            String subjectName = scanner.next();
            String answer = subjectName.toLowerCase();
            subjectNames[count] = answer;
        }
        return subjectNames;
    }


}

