package studentScore;

import java.util.Scanner;

public class AverageValidScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int total = 0;
        int counter = 0;
        while (count <= 10){
            System.out.println("Enter your Score : ");
            int score = scanner.nextInt();

            if(score <= 100) {
                total += score;
                counter++;
            }
            count++;
        }
        double average = (double)total / counter;
        System.out.println("The average of valid score: " + average);


    }
}
