package chibuzorAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ScoresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] scores = new int[10];
        System.out.println("Enter your score : ");
        int score = scanner.nextInt();
        scores[0] = score;
        int result = scores[0];
        int minimum = scores[0];
        int maximum =scores[0];
        int odd = scores[0];
        String  odds = odd + " ";
        for(int count = 1;count < scores.length;count++){
            System.out.println("Enter your score : ");
            score = scanner.nextInt();
            scores[count] = score;
            result += scores[count];
            if(scores[count] < minimum){
                minimum = scores[count];
            }
            if(scores[count] > maximum){
                maximum = scores[count];
            }
            if(scores[count] % 2 ==1){
               odds += scores[count] + "\t";
            }

        }

        int average = result / scores.length;
        System.out.println(Arrays.toString(scores));
        System.out.println(average);
        System.out.println("the total is :" +result);
        System.out.println("the maximum is :"+maximum);
        System.out.println("the minimum is :"+minimum);
        System.out.println("the odd numbers are : " +odds);
    }
}
