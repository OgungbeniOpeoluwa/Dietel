package chibuzorAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class UberScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];
        int largest = 0;
        for (int number = 0; number < 10; number++) {
            System.out.println("Enter your score :");
            int score = scanner.nextInt();
            scores[number] = score;
            if (scores[number] > largest){
                largest = score;
            }

        }
        System.out.println(Arrays.toString(scores));
        System.out.println("The largest number is "+largest);


    }
}


