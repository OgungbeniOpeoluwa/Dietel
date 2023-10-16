package StudentScoreArray;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Student do you have:");
        int students = scanner.nextInt();
        System.out.println("How many Subject do they offer : ");
        int subjects = scanner.nextInt();
        displayNow();
        int[][] studentsCummulation = new int[students][subjects];
        studentScores(studentsCummulation, subjects,students);


    }

    public static void studentScores(int[][] students, int subjects, int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        int[] total = new int[students.length];

        String[] allSubjects = subjectName(subjects);
        double[] average = new double[students.length];
        double result = 0;
        for (int count = 0; count < students.length; count++) {
            for (int subject = 0; subject < students[count].length; subject++) {
                System.out.println("Entering score for student  " + (count + 1));
                System.out.println("Enter score for " + allSubjects[subject]);
                int score = scanner.nextInt();
                while (score < 1 || score > 100) {
                    System.out.println("Entering score for student  " + (count + 1));
                    System.out.println("Enter score for " + allSubjects[subject]);
                    score = scanner.nextInt();
                }
                students[count][subject] = score;
                displayNow();
                total[count] += score;
            }
            result = total[count] / (double) subjects;
            String numb = String.format("%.2f", result);
            double averageResult = Double.parseDouble(numb);
            average[count] = averageResult;
        }
        int [] position = sort(total);
        System.out.println(" ===========================================");
        System.out.print("  STUDENT  " + " ");
        for (int n = 0; n < subjects; n++) {
            System.out.print(allSubjects[n] + "    ");
        }
        System.out.println("TOTAL " + "  " + "AVERAGE  " +  " TOTAL ");
        for (int counts = 0; counts < students.length; counts++) {
            System.out.print("Student " + (counts + 1) + "   ");
            for (int count = 0; count < students[0].length; count++) {
                System.out.print(students[counts][count] + "\t\t");
            }
            System.out.println(total[counts] + "    " + average[counts] + "     " + position[counts]);
        }


        System.out.println("""
                ======================================================
                                           
                ======================================================""");
        System.out.println();
        subjectSumarry(allSubjects, students);
        checkMinimum(students, allSubjects);
        checkMaximum(students, allSubjects);
        displayClassSummary(total, numberOfStudents, average);

    }

    public static String[] subjectName(int number) {
        Scanner scanner = new Scanner(System.in);
        String[] subjectNames = new String[number];
        for (int count = 0; count < subjectNames.length; count++) {
            System.out.println("Enter name of subject for subject " + (count + 1));
            String subjectName = scanner.next();
            displayNow();
            String answer = subjectName.toLowerCase();
            subjectNames[count] = answer;
        }
        return subjectNames;
    }

    public static void subjectSumarry(String[] course, int[][] scores) {
        int[] result = new int[scores.length];
        int[] max = new int[course.length];
        int[] min = new int[course.length];
        int total = 0;
        int counts = 0;
        double average = 0;
        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < course.length; subject++) {
            System.out.println(course[subject]);
            for (int score = 0; score < scores.length; score++) {
                total += scores[score][counts];
                result[score] = scores[score][counts];
                if (scores[score][counts] > 50) {
                    max[counts] += 1;
                } else {
                    min[counts] += 1;
                }
            }
            average = (double) total / scores.length;
            displayMax(result);
            displayMin(result);
            System.out.println("Total score : " + total);
            System.out.println("Average score is : " + average);
            System.out.println("number of passes : " + max[counts]);
            System.out.println("number of fail : " + min[counts]);
            System.out.println();
            total -= total;
            counts++;
        }
        System.out.println();
        int maxim = max[0];
        int mini = min[0];
        int index = 0;
        int indexes = 0;
        for (int numb = 1; numb < course.length; numb++) {
            if (max[numb] > maxim) {
                maxim = max[numb];
                index = numb;
            }
        }
        System.out.println("The easiest subject is " + course[index] + " with " + maxim + " passes");
        for (int numb = 1; numb < course.length; numb++) {
            if (min[numb] > mini) {
                mini = min[numb];
                indexes = numb;
            }
        }
        System.out.println("The hardest subject is " + course[indexes] + " with " + mini + " failure");
        System.out.println("======================================");
        System.out.println();
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

    public static int minimum(int[] subjectScores) {
        int min = subjectScores[0];
        for (int count = 0; count < subjectScores.length; count++) {
            if (subjectScores[count] < min) {
                min = subjectScores[count];

            }
        }
        return min;
    }

    public static void checkMaximum(int[][] subject, String[] course) {
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
        System.out.println("The overall Highest Score is scored by  Student  " + (index + 1) + "  in " + course[subjects] + " scoring " + max);

    }

    public static void checkMinimum(int[][] subject, String[] course) {
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
        System.out.println("The overall minimum Score is scored by  Student  " + (index + 1) + "  in " + course[subjects] + " scoring " + min);
    }

    public static void displayClassSummary(int[] total, int studentNumber, double[] average) {
        int result = maximum(total);
        int index = 0;
        System.out.println("CLASS SUMMARY ");
        for (int count = 0; count < studentNumber; count++) {
            if (total[count] == result) {
                index = count;
            }
        }
        System.out.println("==========================================");
        System.out.println("The best Graduating student is : student " + (index + 1) + " scoring  " + result);
        System.out.println("============================================");
        int results = minimum(total);
        int indexes = 0;
        for (int count = 0; count < studentNumber; count++) {
            if (total[count] == results) {
                indexes = count;
            }
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The worst Graduating student is  " + (indexes + 1) + " scoring " + results);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();

        System.out.println("==================================================");
        int sum = 0;
        for (int numb : total) {
            sum += numb;
        }
        double averageOfAll = (double) sum / studentNumber;
        System.out.println("Class total score is : " + sum);
        System.out.println("Class average score : " + averageOfAll);
        System.out.println("================================================");


    }

    public static void displayMax(int[] result) {
        int total = maximum(result);
        int index = 0;
        for (int numb = 0; numb < result.length; numb++) {
            if (result[numb] == total) {
                index = numb;
            }
        }
        System.out.println("Highest scoring student is " + (index + 1) + " Scoring " + total);
    }

    public static void displayMin(int[] result) {
        int total = minimum(result);
        int index = 0;
        for (int numb = 0; numb < result.length; numb++) {
            if (result[numb] == total) {
                index = numb;
            }
        }
        System.out.println("lowest scoring student is " + (index + 1) + " Scoring " + total);
    }

    public static void displayNow() {
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully""");
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

    }








