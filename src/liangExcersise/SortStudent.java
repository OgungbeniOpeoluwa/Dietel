package liangExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of student : ");
        int number = scanner.nextInt();
        int [] scores = new int[number];
        String [] names = new String[number];
        for(int count = 0;count < scores.length;count++){
            System.out.println("Enter score for student" + (count +1));
            int score = scanner.nextInt();
            scores[count] = score;
            System.out.println("Enter an name of student: ");
            String name = scanner.next();
            names[count] = name;
        }
        System.out.println(Arrays.toString(scores));
        int [] index = new int[number];
        for(int numb = 0;numb < number;numb++){
            index[numb] = scores[numb];
        }
        for(int numb = 0; numb < scores.length;numb ++) {
            for (int counts = 0; counts < scores.length; counts++) {
                if (scores[numb] > scores[counts]) {
                    int temp = scores[numb];
                    scores[numb] = scores[counts];
                    scores[counts] = temp;

                }
            }
        }
            String [] name = new String[number];
        System.out.println(Arrays.toString(scores) + " " + Arrays.toString(index));
            System.out.println(" NAMES " + "  " + " SCORES ");
            for(int count = 0;count < number;count++){
                for(int numb = 0;numb < number;numb++) {
                    if (scores[count] == index[numb]) {
                        System.out.println(names[numb] + "\t\t" + scores[count]);
                    }
                }
            }




    }
}
